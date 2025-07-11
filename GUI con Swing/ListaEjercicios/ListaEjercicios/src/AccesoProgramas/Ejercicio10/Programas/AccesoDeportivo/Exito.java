package AccesoProgramas.Ejercicio10.Programas.AccesoDeportivo;

import accesodeportivo.Exito;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Exito extends javax.swing.JDialog {

    public Exito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("ÉXITO");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(jLabelTitulo);

        jLabelMensaje.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setText("Se realizó la matrícula correctamente");
        jLabelMensaje.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelMensaje.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabelMensaje.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(jLabelMensaje);

        jButtonTerminar.setText("TERMINAR");
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTerminar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonTerminarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Exito dialog = new Exito(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
