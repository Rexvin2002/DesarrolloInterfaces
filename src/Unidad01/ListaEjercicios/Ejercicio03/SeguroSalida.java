
package Unidad01.ListaEjercicios.Ejercicio03;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.LineBorder;

/**
 *
 * @author kgv17
 */
public class SeguroSalida extends javax.swing.JDialog {

    /**
     * Creates new form SeguroSalida
     * @param parent
     * @param modal
     */
    public SeguroSalida(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jButtonVolver.setBorder(new LineBorder(Color.BLACK, 1, false));
        jButtonSalir.setBorder(new LineBorder(Color.BLACK, 1, false));
        jButtonVolver.setContentAreaFilled(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonVolver.setOpaque(true);
        jButtonSalir.setOpaque(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMensaje = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Seguro Salida");
        setResizable(false);

        jLabelMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMensaje.setText("¿Está seguro que desea salir?");

        jButtonVolver.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setBorder(null);
        jButtonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonVolverMousePressed(evt);
            }
        });
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSalirMousePressed(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelMensaje)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseEntered
        
        jButtonVolver.setBackground(Color.LIGHT_GRAY); // Cambiar color al pasar el ratón
        jButtonVolver.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambiar el cursor al pasar el ratón
        
    }//GEN-LAST:event_jButtonVolverMouseEntered

    private void jButtonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseExited
        
        jButtonVolver.setBackground(Color.WHITE); // Restaurar color cuando el ratón sale
        jButtonVolver.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Restaurar el cursor cuando el ratón sale
        
    }//GEN-LAST:event_jButtonVolverMouseExited

    private void jButtonVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMousePressed
        
        jButtonVolver.setBackground(Color.GRAY); // Cambiar color al presionar el botón
        
    }//GEN-LAST:event_jButtonVolverMousePressed

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        
        jButtonSalir.setBackground(new Color(150, 0, 0)); // Cambiar color al pasar el ratón
        jButtonSalir.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambiar el cursor al pasar el ratón
        
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        
        jButtonSalir.setBackground(new Color(204, 0, 0)); // Restaurar color cuando el ratón sale
        jButtonSalir.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Restaurar el cursor cuando el ratón sale
        
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButtonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMousePressed
        
        jButtonSalir.setBackground(new Color(100, 0, 0)); // Restaurar color cuando el ratón sale
        
    }//GEN-LAST:event_jButtonSalirMousePressed

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
            java.util.logging.Logger.getLogger(SeguroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            SeguroSalida dialog = new SeguroSalida(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelMensaje;
    // End of variables declaration//GEN-END:variables
}
