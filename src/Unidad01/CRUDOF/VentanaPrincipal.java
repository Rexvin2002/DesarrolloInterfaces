package Unidad01.CRUDOF;

import java.util.Comparator;
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
    private final Vector<Vector> originalData = new Vector<>();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        initTableModel();
        this.am = new AñadirModificar(this, false);
    }

    // INICIALIZA EL MODELO DE LA TABLA
    private void initTableModel() {
        this.model = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Mensualidad", "Membresía"}, 0);
        this.jTableSocios.setModel(this.model);
        cargarDatosIniciales();
        storeOriginalData();
    }

    // AÑADE FILAS A LA TABLA CON SOCIOS DE EJEMPLO
    private void cargarDatosIniciales() {
        // Ejemplo de datos iniciales
        this.model.addRow(new Object[]{"Alice", 25, 50.0, "Gold"});
        this.model.addRow(new Object[]{"Bob", 30, 60.0, "Silver"});
        this.model.addRow(new Object[]{"Charlie", 28, 70.0, "Bronze"});
        this.model.addRow(new Object[]{"Diana", 22, 80.0, "Platinum"});
    }

    // ALMACENA LOS DATOS ORIGINALES EN EL VECTOR GLOBAL
    public void storeOriginalData() {
        this.originalData.clear();
        for (int i = 0; i < this.model.getRowCount(); i++) {
            this.originalData.add((Vector) this.model.getDataVector().get(i));
        }
    }

    // COMPRUEBA SI HAY SOCIO SELECCIONADO
    private boolean isSelected(int selectedRow) {
        boolean b = false;
        if (selectedRow != -1) {
            b = true;
            return b;
        } else {
            return b;
        }
    }

    // AÑADE UN SOCIO A LA TABLA
    public void addSocio(String nombre, int edad, double mensualidad, String membershipType) {
        this.model.addRow(new Object[]{nombre, edad, mensualidad, membershipType});
    }

    // ACTUALIZA SOCIO SELECCIONADO
    public void updateSocio(String nombre, int edad, double mensualidad, String membershipType) {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            this.model.setValueAt(nombre, selectedRow, 0);
            this.model.setValueAt(edad, selectedRow, 1);
            this.model.setValueAt(mensualidad, selectedRow, 2);
            this.model.setValueAt(membershipType, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    // ELIMINA SOCIO SELECCIONADO
    private void deleteSocio() {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            this.model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

    /**
     * // Método para consultar los datos de un socio private void viewSocio()
     * { int selectedRow = jTableSocios.getSelectedRow(); if (selectedRow != -1)
     * { String nombre = (String) model.getValueAt(selectedRow, 0); int edad =
     * (int) model.getValueAt(selectedRow, 1); double mensualidad = (double)
     * model.getValueAt(selectedRow, 2); String membershipType = (String)
     * model.getValueAt(selectedRow, 3);
     *
     * JOptionPane.showMessageDialog(this, "Socio Details:\n" + "Nombre: " +
     * nombre + "\nEdad: " + edad + "\nMensualidad: " + mensualidad + "\nTipo de
     * membresía: " + membershipType); } else {
     * JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para
     * ver."); } }
     *
     * @return
     */
    // OBTIENE EL NOMBRE DEL SOCIO SELECCIONADO
    public String getSelectedSocioName() {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            return (String) this.model.getValueAt(selectedRow, 0);
        }
        return null;
    }

    // OBTIENE LA EDAD DEL SOCIO SELECCIONADO
    public Integer getSelectedSocioAge() {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            return (Integer) this.model.getValueAt(selectedRow, 1);
        }
        return null;
    }

    // OBTIENE LE CUOTA MENSUAL DEL SOCIO SELECCIONADO
    public Double getSelectedSocioMensualidad() {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            return (Double) this.model.getValueAt(selectedRow, 2);
        }
        return null;
    }

    // OBTIENE EL TIPO DE MEMBRESÍA DEL SOCIO SELECCIONADO
    public String getSelectedSocioTipoMembresia() {
        int selectedRow = this.jTableSocios.getSelectedRow();
        if (isSelected(selectedRow)) {
            return (String) this.model.getValueAt(selectedRow, 3);
        }
        return null;
    }

    // ORDENA LAS FILAS SEGÚN LA SELECCIÓN DE LOS COMBOBOX
    private void ordenarFilas() {
        Vector<Vector> data = this.model.getDataVector();

        switch (this.campo) {
            case "Nombre" -> {
                if ("Alfabeticamente".equals(this.orden)) {
                    data.sort(Comparator.comparing(o -> ((String) o.get(0)).toLowerCase()));
                }
            }
            case "Edad" -> {
                if ("De Mayor a Menor".equals(this.orden)) {
                    data.sort((o1, o2) -> Integer.compare((Integer) o2.get(1), (Integer) o1.get(1)));
                } else if ("De Menor a Mayor".equals(this.orden)) {
                    data.sort(Comparator.comparingInt(o -> (Integer) o.get(1)));
                }
            }
            case "Mensualidad" -> {
                if ("De Mayor a Menor".equals(this.orden)) {
                    data.sort((o1, o2) -> Double.compare((Double) o2.get(2), (Double) o1.get(2)));
                } else if ("De Menor a Mayor".equals(this.orden)) {
                    data.sort(Comparator.comparingDouble(o -> (Double) o.get(2)));
                }
            }
            case "Membresía" -> {
                if ("Alfabeticamente".equals(this.orden)) {
                    data.sort(Comparator.comparing(o -> ((String) o.get(3)).toLowerCase()));
                }
            }
            default -> {
                System.out.println("F");
            }
                
        }

        this.model.fireTableDataChanged(); // Notifica a la tabla que los datos han cambiado
    }

    // FILTRA LA TABLA
    private void filterTable() {
        String filter = this.jTextFieldFiltro.getText().toLowerCase(); // Obtener el texto del filtro
        String selectedField = this.jComboBoxCampo.getSelectedItem().toString(); // Campo seleccionado para filtrar

        // Crear una lista de los datos filtrados
        Vector<Vector> filteredData = new Vector<>();

        // Si el filtro está vacío, restauramos los datos originales
        if (filter.isEmpty()) {
            filteredData = this.originalData; // Asignar los datos originales
        } else {
            // Si no está vacío, proceder con el filtrado
            for (int i = 0; i < this.model.getRowCount(); i++) {
                String value = "";

                // Determinar el valor de la columna seleccionada para cada fila
                switch (selectedField) {
                    case "Nombre" ->
                        value = (String) this.model.getValueAt(i, 0);
                    case "Edad" ->
                        value = String.valueOf(this.model.getValueAt(i, 1));
                    case "Mensualidad" ->
                        value = String.valueOf(this.model.getValueAt(i, 2));
                    case "Membresía" ->
                        value = (String) this.model.getValueAt(i, 3);
                }

                // Si el valor contiene el texto del filtro, lo agregamos a la lista filtrada
                if (value.toLowerCase().contains(filter)) {
                    filteredData.add((Vector) this.model.getDataVector().get(i));
                }
            }
        }

        // Actualizar la tabla con los datos filtrados
        // Convierte el Vector<Vector> a un Object[][]
        Object[][] data = new Object[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            data[i] = filteredData.get(i).toArray();
        }

        // Llama a setDataVector con el arreglo bidimensional
        // Y un Vector de nombres de columnas
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Nombre");
        columnNames.add("Edad");
        columnNames.add("Mensualidad");
        columnNames.add("Membresía");

        // Usamos la segunda sobrecarga de setDataVector
        this.model.setDataVector(filteredData, columnNames);
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

        jComboBoxCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Edad", "Mensualidad", "Membresía" }));
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
            System.out.println("Fila seleccionada: " + selectedRow);

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
