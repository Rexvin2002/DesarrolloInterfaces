package com.mycompany.clientselector;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFReportGenerator {

    public static void generateReport(int idCliente) {
        try {
            // Obtener información del cliente
            ResultSet rs = DatabaseConnection.getClienteById(idCliente);
            if (rs.next()) {
                // Crear el archivo PDF
                String fileName = "src\\main\\java\\com\\mycompany\\clientselector\\pdf\\" + idCliente + ".pdf";
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(fileName));

                // Abrir el documento para escribir
                document.open();

                // Título del informe
                document.add(new Paragraph("Informe del Cliente"));
                document.add(Chunk.NEWLINE); // Salto de línea

                // Agregar información del cliente al informe
                document.add(new Paragraph("Nombre: " + rs.getString("Nombre")));
                document.add(new Paragraph("Apellidos: " + rs.getString("Apellidos")));
                document.add(new Paragraph("Fecha de Nacimiento: " + rs.getString("FechaNac")));
                document.add(new Paragraph("Sexo: " + rs.getString("Sexo")));
                document.add(new Paragraph("Casado: " + (rs.getBoolean("Casado") ? "Sí" : "No")));

                // Cerrar el documento
                document.close();

                System.out.println("Informe generado con éxito: " + fileName);
            } else {
                System.err.println("No se encontró el cliente con ID: " + idCliente);
            }
        } catch (SQLException e) {
            System.err.println("Error al acceder a la base de datos: " + e.getMessage());
        } catch (DocumentException e) {
            System.err.println("Error al generar el informe: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Error al encontrar el informe: " + e.getMessage());
        }
    }
}
