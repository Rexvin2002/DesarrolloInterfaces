
package Unidad01.CRUDOF;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kgv17
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        initTableModel();
    }
    
    
    private void initTableModel() {
        // Define el modelo de la tabla con columnas para los datos de socios
        model = new DefaultTableModel(new Object[]{"Name", "Age", "Monthly Fee", "Membership Type"}, 0);
        jTable1.setModel(model);
    }

    // Método para añadir un nuevo socio a la tabla
    private void addSocio(String name, int age, double monthlyFee, String membershipType) {
        model.addRow(new Object[]{name, age, monthlyFee, membershipType});
    }

    // Método para eliminar el socio seleccionado
    private void deleteSocio() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

    // Método para actualizar el socio seleccionado
    private void updateSocio(String name, int age, double monthlyFee, String membershipType) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            model.setValueAt(name, selectedRow, 0);
            model.setValueAt(age, selectedRow, 1);
            model.setValueAt(monthlyFee, selectedRow, 2);
            model.setValueAt(membershipType, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    // Método para consultar los datos de un socio
    private void viewSocio() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String name = (String) model.getValueAt(selectedRow, 0);
            int age = (int) model.getValueAt(selectedRow, 1);
            double monthlyFee = (double) model.getValueAt(selectedRow, 2);
            String membershipType = (String) model.getValueAt(selectedRow, 3);

            JOptionPane.showMessageDialog(this, "Socio Details:\n" +
                    "Name: " + name + "\nAge: " + age + "\nMonthly Fee: " + monthlyFee + "\nMembership Type: " + membershipType);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
        }
    }

    // Método para ordenar los datos por nombre
    private void sortSociosByName() {
        model.getDataVector().sort((o1, o2) -> ((String) ((Vector<?>) o1).get(0)).compareToIgnoreCase((String) ((Vector<?>) o2).get(0)));
        model.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemOrdenarPorNombre = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuEliminarSocio = new javax.swing.JMenuItem();
        jMenuItemEditarSocio = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuVerSocio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jMenuArchivo.setText("Archivo");

        jMenuItemOrdenarPorNombre.setText("Ordenar por Nombre");
        jMenuItemOrdenarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOrdenarPorNombreActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemOrdenarPorNombre);

        jMenuBar1.add(jMenuArchivo);

        jMenuEditar.setText("Editar");

        jMenuItem1.setText("Añadir Socio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItem1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOrdenarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOrdenarPorNombreActionPerformed
        sortSociosByName();
    }//GEN-LAST:event_jMenuItemOrdenarPorNombreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        addSocio("Kevin", 22, 2.0, "pro");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuEliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarSocioActionPerformed
        deleteSocio();
    }//GEN-LAST:event_jMenuEliminarSocioActionPerformed

    private void jMenuItemEditarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarSocioActionPerformed
        updateSocio("Kevin", 22, 2.0, "Pro");
    }//GEN-LAST:event_jMenuItemEditarSocioActionPerformed

    private void jMenuVerSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerSocioActionPerformed
        viewSocio();
    }//GEN-LAST:event_jMenuVerSocioActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuEliminarSocio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemEditarSocio;
    private javax.swing.JMenuItem jMenuItemOrdenarPorNombre;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JMenuItem jMenuVerSocio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
