package AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Error extends javax.swing.JDialog {

    public Error(java.awt.Frame parent, boolean modal, String mensaje) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jLabelMensaje.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jToggleButtonVolver = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 200));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("ERROR");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(jLabelTitulo);

        jLabelMensaje.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setText("Se produjo algún tipo de error");
        jLabelMensaje.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelMensaje.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabelMensaje.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(jLabelMensaje);

        jToggleButtonVolver.setText("VOLVER");
        jToggleButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonVolver);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButtonVolverActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Error dialog = new Error(new javax.swing.JFrame(), true, "");
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
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JToggleButton jToggleButtonVolver;
    // End of variables declaration//GEN-END:variables
}
