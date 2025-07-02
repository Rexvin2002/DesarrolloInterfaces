package com.mycompany.clientselector;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 * Generador de informes con JasperReports.
 * 
 * @author kgv17
 */
public class ClientSelector {
    public static void main(String[] args) {
        try {
            // Establecer la conexión a la base de datos
            Connection conn = DatabaseConnection.connect();

            // Crear directorio de salida si no existe
            String outputDir = "output";
            new File(outputDir).mkdirs();

            // Directorio base para subinformes (relativo al directorio de trabajo)
            String baseDir = "src/main/java/com/mycompany/clientselector/Ejercicio02/";

            /* 
                // Compilar subinformes
                System.out.println("\nBaseDir: " + baseDir);
                System.out.println("Compilando Trabajos.jrxml...\n");
                JasperCompileManager.compileReportToFile(baseDir + "Trabajos.jrxml", baseDir + "Trabajos.jasper");

                System.out.println("Compilando Empleados.jrxml...\n");
                JasperCompileManager.compileReportToFile(baseDir + "Empleados.jrxml", baseDir + "Empleados.jasper");

                
                // Verificar la existencia de los subinformes compilados
                if (!new File(baseDir + "Trabajos.jasper").exists()) {
                    System.err.println("Error: Trabajos.jasper no se generó correctamente.");
                    return;
                }
                if (!new File(baseDir + "Empleados.jasper").exists()) {
                    System.err.println("Error: Empleados.jasper no se generó correctamente.");
                    return;
                }
            */

            // Compilar informe principal
            JasperReport jasperReport = JasperCompileManager.compileReport(baseDir + "Grafico.jrxml");

            // Configurar parámetros para subinformes
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("SUBREPORT_DIR", baseDir);

            // Llenar el informe principal
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            // Exportar informe a PDF en el directorio de salida
            String outputPath = outputDir + "/ClientReport.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPath);

            System.out.println("Informe generado correctamente: " + outputPath);
        } catch (JRException e) {
            System.err.println("Error al generar el informe: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
