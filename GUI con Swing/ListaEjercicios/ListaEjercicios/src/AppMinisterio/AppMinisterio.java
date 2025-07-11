package AppMinisterio;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AppMinisterio extends javax.swing.JFrame {

    private Formulario form;
    private About about;
    private final JFileChooser JFC = new JFileChooser();

    public AppMinisterio() {
        initComponents();
        setLocationRelativeTo(null);
        inicializarTabla();
    }

    private void inicializarTabla() {
        // Crear un renderizador para centrar las celdas de datos
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        // Aplicar el renderizador a todas las columnas de la tabla
        int columnCount = jTableDatos.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            jTableDatos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Crear un renderizador para centrar las cabeceras de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTableDatos.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);

        // Aplicar el renderizador al header de la tabla
        JTableHeader header = jTableDatos.getTableHeader();
        header.setDefaultRenderer(headerRenderer);
    }

    private void actualizarTabla(ArrayList<String[]> dataList) {
        DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
        model.setRowCount(0);  // Limpia la tabla

        for (String[] rowData : dataList) {
            model.addRow(rowData);
        }
    }

    public void añadirPersona(Persona p) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableDatos.getModel();
        modeloTabla.addRow(p.toArrayString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jMenuBarOpciones = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEncuesta = new javax.swing.JMenu();
        jMenuItemRealizarEncuesta = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenuFichero = new javax.swing.JMenu();
        jMenuItemLeer = new javax.swing.JMenuItem();
        jMenuItemEscribir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profesión", "Nº Hermanos", "Edad", "Sexo", "Deporte", "Compras", "Televisión", "Cine"
            }
        ));
        jTableDatos.setShowHorizontalLines(true);
        jTableDatos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setResizable(false);
            jTableDatos.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableDatos.getColumnModel().getColumn(1).setResizable(false);
            jTableDatos.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableDatos.getColumnModel().getColumn(2).setResizable(false);
            jTableDatos.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTableDatos.getColumnModel().getColumn(3).setResizable(false);
            jTableDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableDatos.getColumnModel().getColumn(4).setResizable(false);
            jTableDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableDatos.getColumnModel().getColumn(5).setResizable(false);
            jTableDatos.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableDatos.getColumnModel().getColumn(6).setResizable(false);
            jTableDatos.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableDatos.getColumnModel().getColumn(7).setResizable(false);
            jTableDatos.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jMenuArchivo.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.setToolTipText("Sale del programa");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarOpciones.add(jMenuArchivo);

        jMenuEncuesta.setText("Encuesta");

        jMenuItemRealizarEncuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRealizarEncuesta.setText("Realizar Encuesta");
        jMenuItemRealizarEncuesta.setToolTipText("Abre el formulario para hacer la encuesta");
        jMenuItemRealizarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarEncuestaActionPerformed(evt);
            }
        });
        jMenuEncuesta.add(jMenuItemRealizarEncuesta);

        jMenuBarOpciones.add(jMenuEncuesta);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAyuda.setText("Acerca de...");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBarOpciones.add(jMenuAyuda);

        jMenuFichero.setText("Fichero");

        jMenuItemLeer.setText("Leer");
        jMenuItemLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLeerActionPerformed(evt);
            }
        });
        jMenuFichero.add(jMenuItemLeer);

        jMenuItemEscribir.setText("Escribir");
        jMenuItemEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEscribirActionPerformed(evt);
            }
        });
        jMenuFichero.add(jMenuItemEscribir);

        jMenuBarOpciones.add(jMenuFichero);

        setJMenuBar(jMenuBarOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemRealizarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarEncuestaActionPerformed
        form = new Formulario(this, true);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItemRealizarEncuestaActionPerformed

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
        this.about = new About(this, true);
        this.about.setVisible(true);
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    private void jMenuItemLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLeerActionPerformed
        JFC.setMultiSelectionEnabled(true);
        int returnValue = JFC.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = JFC.getSelectedFiles();
            for (File file : selectedFiles) {
                cargarDatosDesdeArchivo(file);
            }
        }
    }//GEN-LAST:event_jMenuItemLeerActionPerformed

    private void cargarDatosDesdeArchivo(File file) {
        ArrayList<String[]> dataList = new ArrayList<>();  // ArrayList para almacenar los datos

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Suponiendo que los datos están separados por comas (CSV)
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        // Aquí actualizamos la tabla con los datos leídos
        actualizarTabla(dataList);
    }

    private void jMenuItemEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEscribirActionPerformed
        int returnValue = JFC.showSaveDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = JFC.getSelectedFile();
            guardarDatosEnArchivo(selectedFile);
        }
    }//GEN-LAST:event_jMenuItemEscribirActionPerformed

    private void guardarDatosEnArchivo(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();

            for (int row = 0; row < model.getRowCount(); row++) {

                StringBuilder rowData = new StringBuilder();

                for (int col = 0; col < model.getColumnCount(); col++) {

                    rowData.append(model.getValueAt(row, col).toString());

                    if (col < model.getColumnCount() - 1) {
                        rowData.append(",");
                    }
                }

                bw.write(rowData.toString());
                bw.newLine();

            }
        } catch (IOException e) {
            System.err.println("\nERROR: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMinisterio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new AppMinisterio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBarOpciones;
    private javax.swing.JMenu jMenuEncuesta;
    private javax.swing.JMenu jMenuFichero;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemEscribir;
    private javax.swing.JMenuItem jMenuItemLeer;
    private javax.swing.JMenuItem jMenuItemRealizarEncuesta;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
