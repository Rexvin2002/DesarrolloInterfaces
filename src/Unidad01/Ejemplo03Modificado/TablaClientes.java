
package Unidad01.Ejemplo03Modificado;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * SOLUCIONAR
 * 
 * @author kgv17
 */
public class TablaClientes extends javax.swing.JFrame {

    private VentanaAlta va;
    public static LogicaNegocio logicaNegocio = new LogicaNegocio();
    
    public TablaClientes() {
        initComponents();
        refrescarTabla();
    }

    private void refrescarTabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[] {"Apellidos", "Nombre", "F.Nacimiento","Ciudad"});
        jTablaClientes.setModel(modeloTabla);
        
        // Coje la lista de la clase LogicaNegocio y añade los clientes a la tabla
        List<Cliente> listaClientes = logicaNegocio.getListaClientes();
        for (Cliente cliente : listaClientes) {
            modeloTabla.addRow(cliente.toArrayString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTítulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemAlta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTítulo.setBackground(new java.awt.Color(255, 255, 0));
        jLabelTítulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTítulo.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("C L I E N T E S");
        jLabelTítulo.setOpaque(true);

        jTablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item 1", "Item 2", "Item 3", "Item 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaClientes);

        jMenuClientes.setText("Clientes");

        jMenuItemAlta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemAlta.setText("Alta...");
        jMenuItemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltaActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemAlta);

        jMenuBar1.add(jMenuClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelTítulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltaActionPerformed
        va = new VentanaAlta(this, true);
        va.setVisible(true);
        refrescarTabla();
    }//GEN-LAST:event_jMenuItemAltaActionPerformed
    
    /*
    public void añadirCliente(Cliente c){
        DefaultTableModel modeloTabla = (DefaultTableModel) jTablaClientes.getModel();
        modeloTabla.addRow(c.toArrayString());
    }
    */
    
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
            java.util.logging.Logger.getLogger(TablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItemAlta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaClientes;
    // End of variables declaration//GEN-END:variables
}
