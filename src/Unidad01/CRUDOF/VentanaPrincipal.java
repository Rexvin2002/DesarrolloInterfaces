package Unidad01.CRUDOF;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kgv17
 */
public final class VentanaPrincipal extends javax.swing.JFrame {

    public DefaultTableModel model;
    private final AñadirModificar am;
    private Datos datos;
    private String campo;
    private String orden;
    private final List<List<Object>> originalData = new ArrayList<>();

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        initTableModel();
        this.am = new AñadirModificar(this, false);
    }

    private void initTableModel() {
        this.model = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Mensualidad", "Membresía"}, 0);
        this.jTableSocios.setModel(this.model);
        cargarDatosIniciales();
        storeOriginalData();
    }

    private void cargarDatosIniciales() {
        model.addRow(new Object[]{"Alice", 25, 50.0, "Gold"});
        model.addRow(new Object[]{"Bob", 30, 60.0, "Silver"});
        model.addRow(new Object[]{"Charlie", 28, 70.0, "Bronze"});
        model.addRow(new Object[]{"Diana", 22, 80.0, "Platinum"});
    }

    public void storeOriginalData() {
        this.originalData.clear();
        for (int i = 0; i < model.getRowCount(); i++) {
            originalData.add((Vector) model.getDataVector().get(i));
        }
    }

    private boolean isSelected(int selectedRow) {
        return selectedRow != -1;
    }

    public void addSocio(String nombre, int edad, double mensualidad, String membershipType) {
        model.addRow(new Object[]{nombre, edad, mensualidad, membershipType});
    }

    public void updateSocio(String nombre, int edad, double mensualidad, String membershipType) {
        int selectedRow = jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            model.setValueAt(nombre, selectedRow, 0);
            model.setValueAt(edad, selectedRow, 1);
            model.setValueAt(mensualidad, selectedRow, 2);
            model.setValueAt(membershipType, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    private void deleteSocio() {
        int selectedRow = jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

    public String getSelectedSocioName() {
        int selectedRow = jTableSocios.getSelectedRow();
        return isSelected(selectedRow) ? (String) model.getValueAt(selectedRow, 0) : null;
    }

    public Integer getSelectedSocioAge() {
        int selectedRow = jTableSocios.getSelectedRow();
        return isSelected(selectedRow) ? (Integer) model.getValueAt(selectedRow, 1) : null;
    }

    public Double getSelectedSocioMensualidad() {
        int selectedRow = jTableSocios.getSelectedRow();
        return isSelected(selectedRow) ? (Double) model.getValueAt(selectedRow, 2) : null;
    }

    public String getSelectedSocioTipoMembresia() {
        int selectedRow = jTableSocios.getSelectedRow();
        return isSelected(selectedRow) ? (String) model.getValueAt(selectedRow, 3) : null;
    }

    private void ordenarFilas() {
        try {
            if (model == null) {
                return;
            }

            // Valores por defecto
            if (campo == null || campo.isEmpty()) {
                campo = "Nombre";
            }
            if (orden == null || orden.isEmpty()) {
                orden = "Alfabeticamente";
            }

            Vector<Vector> data = model.getDataVector();
            switch (campo) {
                case "Nombre" -> {
                    if ("Alfabeticamente".equals(orden)) {
                        data.sort((o1, o2) -> compareStrings((String) o1.get(0), (String) o2.get(0)));
                    }
                }
                case "Edad" -> {
                    if (!"Alfabeticamente".equals(orden)) {
                        data.sort((o1, o2) -> compareIntegers((Integer) o1.get(1), (Integer) o2.get(1), orden.equals("De Mayor a Menor")));
                    }
                }
                case "Mensualidad" -> {
                    if (!"Alfabeticamente".equals(orden)) {
                        data.sort((o1, o2) -> compareDoubles((Double) o1.get(2), (Double) o2.get(2), orden.equals("De Mayor a Menor")));
                    }
                }
                case "Membresia" -> {
                    if ("Alfabeticamente".equals(orden)) {
                        data.sort((o1, o2) -> compareStrings((String) o1.get(3), (String) o2.get(3)));
                    }
                }
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            logError("Error al ordenar", e);
        }
    }

    private int compareStrings(String s1, String s2) {
        return (s1 == null ? "" : s1).compareToIgnoreCase(s2 == null ? "" : s2);
    }

    private int compareIntegers(Integer n1, Integer n2, boolean descending) {
        if (n1 == null || n2 == null) {
            return 0;
        }
        return descending ? n2.compareTo(n1) : n1.compareTo(n2);
    }

    private int compareDoubles(Double d1, Double d2, boolean descending) {
        if (d1 == null || d2 == null) {
            return 0;
        }
        return descending ? d2.compareTo(d1) : d1.compareTo(d2);
    }

    private void logError(String mensaje, Exception e) {
        System.err.println(mensaje);
        if (e != null) {
        }
    }

    private void filterTable() {
        try {
            if (jTextFieldFiltro == null || jComboBoxCampo == null || model == null) {
                return;
            }

            String filter = jTextFieldFiltro.getText().toLowerCase().trim();
            String selectedField = jComboBoxCampo.getSelectedItem().toString();
            List<List<Object>> filteredData = new ArrayList<>();

            if (filter.isEmpty()) {
                filteredData = new ArrayList<>(originalData);
            } else {
                for (int i = 0; i < model.getRowCount(); i++) {
                    String value = getValueAsString(i, selectedField);
                    if (value.toLowerCase().contains(filter)) {
                        filteredData.add(getRowAsList(i));
                    }
                }
            }
            updateModelWithFilteredData(filteredData);
        } catch (Exception e) {
            logError("Error al filtrar", e);
            restoreOriginalData();
        }
    }

    private String getValueAsString(int row, String selectedField) {
        int columnIndex = switch (selectedField) {
            case "Nombre" ->
                0;
            case "Edad" ->
                1;
            case "Mensualidad" ->
                2;
            case "Membresía" ->
                3;
            default ->
                -1;
        };
        return columnIndex != -1 ? String.valueOf(model.getValueAt(row, columnIndex)) : "";
    }

    private List<Object> getRowAsList(int row) {
        List<Object> rowList = new ArrayList<>();
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowList.add(model.getValueAt(row, j));
        }
        return rowList;
    }

    private void updateModelWithFilteredData(List<List<Object>> filteredData) {
        model.setRowCount(0);
        filteredData.forEach(row -> model.addRow(row.toArray()));
        model.fireTableDataChanged();
    }

    private void restoreOriginalData() {
        updateModelWithFilteredData(new ArrayList<>(originalData));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCampo = new javax.swing.JComboBox<>();
        jComboBoxOrden = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonMostrarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSocios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemAñadirSocio = new javax.swing.JMenuItem();
        jMenuEliminarSocio = new javax.swing.JMenuItem();
        jMenuItemEditarSocio = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuVerSocio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Socios del Club");

        jComboBoxCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Edad", "Mensualidad", "Membresia" }));
        jComboBoxCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCampoActionPerformed(evt);
            }
        });

        jComboBoxOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alfabeticamente", "De Menor a Mayor", "De Mayor a Menor" }));
        jComboBoxOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenActionPerformed(evt);
            }
        });

        jTextFieldFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltroActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro:");

        jButtonMostrarDatos.setText("Mostrar Datos");
        jButtonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDatosActionPerformed(evt);
            }
        });

        jTableSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableSocios);

        jMenuEditar.setText("Editar");

        jMenuItemAñadirSocio.setText("Añadir Socio");
        jMenuItemAñadirSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAñadirSocioActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemAñadirSocio);

        jMenuEliminarSocio.setText("Eliminar Socio");
        jMenuEliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarSocioActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuEliminarSocio);

        jMenuItemEditarSocio.setText("Editar Socio");
        jMenuItemEditarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarSocioActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemEditarSocio);

        jMenuBar1.add(jMenuEditar);

        jMenuVer.setText("Ver");

        jMenuVerSocio.setText("Ver  Socio");
        jMenuVerSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerSocioActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuVerSocio);

        jMenuBar1.add(jMenuVer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 204, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMostrarDatos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMostrarDatos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAñadirSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAñadirSocioActionPerformed
        this.am.setTitle("Añadir Socio");
        this.am.jLabelTitulo.setText("Añadir Socio");
        this.am.setVisible(true);
    }//GEN-LAST:event_jMenuItemAñadirSocioActionPerformed

    private void jMenuEliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarSocioActionPerformed
        deleteSocio();
    }//GEN-LAST:event_jMenuEliminarSocioActionPerformed

    private void jMenuItemEditarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarSocioActionPerformed
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            this.am.setTitle("Editar Socio");
            this.am.jLabelTitulo.setText("Editar Socio");
            this.am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para actualizar.");
        }

    }//GEN-LAST:event_jMenuItemEditarSocioActionPerformed

    private void jMenuVerSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerSocioActionPerformed

        int selectedRow = this.jTableSocios.getSelectedRow();
        String nombre = (String) this.jTableSocios.getValueAt(selectedRow, 0);
        this.datos = new Datos(this, false, nombre);

        if (isSelected(selectedRow)) {

            this.datos.setTitle("Datos: " + nombre);
            this.datos.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila para ver los datos.");
        }
    }//GEN-LAST:event_jMenuVerSocioActionPerformed

    private void jComboBoxCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCampoActionPerformed
        this.campo = this.jComboBoxCampo.getSelectedItem().toString();
        ordenarFilas();
    }//GEN-LAST:event_jComboBoxCampoActionPerformed

    private void jComboBoxOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenActionPerformed
        this.orden = this.jComboBoxOrden.getSelectedItem().toString();
        ordenarFilas();
    }//GEN-LAST:event_jComboBoxOrdenActionPerformed

    private void jTextFieldFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltroActionPerformed
        filterTable();
    }//GEN-LAST:event_jTextFieldFiltroActionPerformed

    private void jButtonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDatosActionPerformed
        int selectedRow = this.jTableSocios.getSelectedRow();

        // Validar si hay una fila seleccionada
        if (isSelected(selectedRow)) {
            String nombre = (String) this.jTableSocios.getValueAt(selectedRow, 0);

            this.datos = new Datos(this, false, nombre);
            this.datos.setTitle("Datos: " + nombre);
            this.datos.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila para ver los datos.");
        }

    }//GEN-LAST:event_jButtonMostrarDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMostrarDatos;
    private javax.swing.JComboBox<String> jComboBoxCampo;
    private javax.swing.JComboBox<String> jComboBoxOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuEliminarSocio;
    private javax.swing.JMenuItem jMenuItemAñadirSocio;
    private javax.swing.JMenuItem jMenuItemEditarSocio;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JMenuItem jMenuVerSocio;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableSocios;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
