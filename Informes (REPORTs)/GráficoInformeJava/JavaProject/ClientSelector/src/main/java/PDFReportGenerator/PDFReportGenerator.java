package PDFReportGenerator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class PDFReportGenerator {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // 1. Establecer conexión a la base de datos
            System.out.println("Estableciendo conexión a la base de datos...");
            conn = DatabaseConnection.connect();
            if (conn == null || conn.isClosed()) {
                throw new Exception("No se pudo establecer conexión a la base de datos");
            }
            System.out.println("Conexión exitosa\n");

            // 2. Configurar rutas de directorios
            Path projectDir = Paths.get(System.getProperty("user.dir"));
            Path reportsDir = projectDir.resolve("src/main/java/Reports");
            Path pdfDir = projectDir.resolve("src/main/java/PDF");

            // 3. Asegurar que los directorios existen
            createDirectoriesIfNotExist(pdfDir);
            System.out.println("Directorios configurados:");
            System.out.println(" - Reportes: " + reportsDir);
            System.out.println(" - PDFs: " + pdfDir + "\n");

            // 4. Compilar subreportes en memoria
            System.out.println("Compilando subreportes...");
            JasperReport empleadosReport = compileReport(reportsDir, "Empleados.jrxml");
            JasperReport trabajosReport = compileReport(reportsDir, "Trabajos.jrxml");
            JasperReport graficoReport = compileReport(reportsDir, "Grafico.jrxml");
            System.out.println("Todos los subreportes compilados correctamente\n");

            // 5. Configurar mapas de subreportes
            System.out.println("Configurando subreportes...");
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("EmpleadosSubreport", empleadosReport);
            parameters.put("TrabajosSubreport", trabajosReport);
            parameters.put("GraficoSubreport", graficoReport);

            // 6. Compilar informe principal
            System.out.println("Compilando informe principal...");
            JasperReport informeReport = compileReport(reportsDir, "Informe.jrxml");

            // Obtener IDCliente de los argumentos o usar valor por defecto
            Integer idCliente = args.length > 0 ? Integer.valueOf(args[0]) : 1;
            parameters.put("IDCliente", idCliente);

            // 7. Generar informe
            System.out.println("Generando informe para cliente ID: " + idCliente);
            JasperPrint jasperPrint = JasperFillManager.fillReport(informeReport, parameters, conn);

            // 8. Exportar a PDF
            String pdfPath = pdfDir + "/Informe_Cliente_" + idCliente + ".pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, pdfPath);
            
            System.out.println("\n¡Informe generado con éxito!");
            System.out.println("Ubicación del PDF: " + pdfPath);

        } catch (NumberFormatException e) {
            System.err.println("\nError: El IDCliente debe ser un número válido");
        } catch (JRException e) {
            System.err.println("\nError JRException al generar el informe: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nError inesperado: " + e.getMessage());
        } finally {
            if (conn != null) {
                try { conn.close(); } catch (SQLException e) { /* Ignorar */ }
            }
        }
    }

    private static void createDirectoriesIfNotExist(Path directory) throws Exception {
        if (!directory.toFile().exists() && !directory.toFile().mkdirs()) {
            throw new Exception("No se pudo crear el directorio: " + directory);
        }
    }

    private static JasperReport compileReport(Path baseDir, String sourceName) throws JRException {
        System.out.println("Compilando " + sourceName + "...");
        Path sourcePath = baseDir.resolve(sourceName);
        return JasperCompileManager.compileReport(sourcePath.toString());
    }
}