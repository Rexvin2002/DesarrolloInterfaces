package com.mycompany.clientselector;

import java.io.File;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class ClientSelector {

    public static void main(String[] args) {
        try {
            // 1. Establecer conexión a la base de datos
            System.out.println("Estableciendo conexión a la base de datos...");
            Connection conn = DatabaseConnection.connect();
            System.out.println("Conexión exitosa\n");

            // 2. Configurar rutas de directorios
            String projectDir = System.getProperty("user.dir");
            String baseDir = Paths.get(projectDir, "src", "main", "java", "com", "mycompany", "clientselector", "reports").toString() + File.separator;
            String pdfDir = Paths.get(projectDir, "src", "main", "java", "com", "mycompany", "clientselector", "pdf").toString() + File.separator;

            // 3. Asegurar que los directorios existen
            new File(pdfDir).mkdirs();
            System.out.println("Directorio base: " + projectDir);
            System.out.println("Directorio de reportes: " + baseDir);
            System.out.println("Directorio de PDFs: " + pdfDir + "\n");

            // 4. Compilar subreportes en orden correcto (primero los más anidados)
            System.out.println("Iniciando compilación de subreportes...");
            
            // Empleados.jrxml (el más anidado)
            System.out.println("Compilando Empleados.jrxml...");
            String empleadosJrxml = Paths.get(baseDir, "Empleados.jrxml").toString();
            String empleadosJasper = Paths.get(baseDir, "Empleados.jasper").toString();
            JasperCompileManager.compileReportToFile(empleadosJrxml, empleadosJasper);
            System.out.println("Empleados.jasper generado correctamente\n");

            // Trabajos.jrxml (depende de Empleados)
            System.out.println("Compilando Trabajos.jrxml...");
            String trabajosJrxml = Paths.get(baseDir, "Trabajos.jrxml").toString();
            String trabajosJasper = Paths.get(baseDir, "Trabajos.jasper").toString();
            JasperCompileManager.compileReportToFile(trabajosJrxml, trabajosJasper);
            System.out.println("Trabajos.jasper generado correctamente\n");

            // Gráfico.jrxml (independiente)
            System.out.println("Compilando Grafico.jrxml...");
            String graficoJrxml = Paths.get(baseDir, "Grafico.jrxml").toString();
            String graficoJasper = Paths.get(baseDir, "Grafico.jasper").toString();
            JasperCompileManager.compileReportToFile(graficoJrxml, graficoJasper);
            System.out.println("Grafico.jasper generado correctamente\n");

            // 5. Verificar existencia de archivos compilados
            System.out.println("Verificando archivos compilados...");
            if (!checkFileExists(empleadosJasper, "Empleados.jasper") || 
                !checkFileExists(trabajosJasper, "Trabajos.jasper") ||
                !checkFileExists(graficoJasper, "Grafico.jasper")) {
                return; // Salir si hay error
            }
            System.out.println("Todos los subreportes compilados correctamente\n");

            // 6. Cargar reportes compilados
            System.out.println("Cargando reportes compilados...");
            JasperReport empleadosReport = (JasperReport) JRLoader.loadObject(new File(empleadosJasper));
            JasperReport trabajosReport = (JasperReport) JRLoader.loadObject(new File(trabajosJasper));
            JasperReport graficoReport = (JasperReport) JRLoader.loadObject(new File(graficoJasper));
            System.out.println("Reportes cargados en memoria\n");

            // 7. Compilar informe principal
            System.out.println("Compilando informe principal...");
            String informeJrxml = Paths.get(baseDir, "Informe.jrxml").toString();
            JasperReport informeReport = JasperCompileManager.compileReport(informeJrxml);
            System.out.println("Informe principal compilado\n");

            // 8. Configurar parámetros
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("SUBREPORT_DIR", baseDir);
            parameters.put("TrabajosSubreport", trabajosReport);
            parameters.put("EmpleadosSubreport", empleadosReport);
            parameters.put("GraficoSubreport", graficoReport);

            // 9. Generar informe
            System.out.println("Generando informe completo...");
            JasperPrint jasperPrint = JasperFillManager.fillReport(informeReport, parameters, conn);

            // 10. Exportar a PDF con nombre incremental
            String outputPath = generateOutputPath(pdfDir);
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPath);
            System.out.println("\nInforme generado correctamente en: " + outputPath);

        } catch (JRException e) {
            System.err.println("\nError JRException al generar el informe: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nError inesperado: " + e.getMessage());
        }
    }

    private static boolean checkFileExists(String filePath, String fileName) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("Error: " + fileName + " no se generó correctamente en: " + filePath);
            return false;
        }
        return true;
    }

    private static String generateOutputPath(String pdfDir) {
        int count = 1;
        File outputFile;
        do {
            outputFile = new File(pdfDir + "ClientReport" + count + ".pdf");
            count++;
        } while (outputFile.exists());
        return outputFile.getAbsolutePath();
    }
}