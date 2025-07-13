package com.mycompany.clientselector;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ClienteSelectionGUI {

    public static void main(String[] args) throws JRException {
        DatabaseConnection.connect();

        String archivo = "src\\main\\java\\com\\mycompany\\clientselector\\Ejercicio02\\Grafico.jrxml";
        JasperReport jr = JasperCompileManager.compileReport(archivo);
        JasperPrint jp = JasperFillManager.fillReport(jr, null);
        JasperViewer.viewReport(jp);
    }
    /*
     * public static void main(String[] args) {
     * JFrame frame = new JFrame("Seleccionar Cliente");
     * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * frame.setSize(400, 200);
     * 
     * // Obtener los clientes de la base de datos
     * ResultSet rs = DatabaseConnection.getClientes();
     * DefaultListModel<String> model = new DefaultListModel<>();
     * try {
     * while (rs.next()) {
     * String clienteInfo = rs.getString("Nombre") + " " +
     * rs.getString("Apellidos");
     * model.addElement(clienteInfo);
     * }
     * } catch (SQLException e) {
     * e.printStackTrace();
     * }
     * 
     * JList<String> list = new JList<>(model);
     * JScrollPane scrollPane = new JScrollPane(list);
     * frame.add(scrollPane);
     * 
     * // Botón para generar informe
     * JButton generateButton = new JButton("Generar Informe");
     * generateButton.addActionListener((ActionEvent e) -> {
     * int selectedIndex = list.getSelectedIndex();
     * if (selectedIndex != -1) {
     * try {
     * // Obtener el ID del cliente seleccionado
     * rs.absolute(selectedIndex + 1);
     * int idCliente = rs.getInt("IDCliente");
     * 
     * // Generar el informe PDF
     * PDFReportGenerator.generateReport(idCliente);
     * } catch (SQLException ex) {
     * ex.printStackTrace();
     * }
     * }
     * });
     * 
     * frame.add(generateButton, "South");
     * 
     * frame.setVisible(true);
     * }
     */
}
