package SalidaSegura;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.LineBorder;

public class SeguroSalida extends javax.swing.JDialog {

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Seguro Salida");
        setMaximumSize(new java.awt.Dimension(230, 140));
        setMinimumSize(new java.awt.Dimension(230, 140));
        setPreferredSize(new java.awt.Dimension(230, 140));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(230, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(230, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jLabelMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setText("¿Está seguro que desea salir?");
        jLabelMensaje.setMaximumSize(new java.awt.Dimension(230, 40));
        jLabelMensaje.setMinimumSize(new java.awt.Dimension(230, 40));
        jLabelMensaje.setPreferredSize(new java.awt.Dimension(230, 40));
        jPanel2.add(jLabelMensaje);

        getContentPane().add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(230, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(230, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 50));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jButtonVolver.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setBorder(null);
        jButtonVolver.setMaximumSize(new java.awt.Dimension(60, 20));
        jButtonVolver.setMinimumSize(new java.awt.Dimension(60, 20));
        jButtonVolver.setPreferredSize(new java.awt.Dimension(60, 20));
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
        jPanel1.add(jButtonVolver);

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.setMaximumSize(new java.awt.Dimension(60, 20));
        jButtonSalir.setMinimumSize(new java.awt.Dimension(60, 20));
        jButtonSalir.setPreferredSize(new java.awt.Dimension(60, 20));
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
        jPanel1.add(jButtonSalir);

        getContentPane().add(jPanel1);

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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
