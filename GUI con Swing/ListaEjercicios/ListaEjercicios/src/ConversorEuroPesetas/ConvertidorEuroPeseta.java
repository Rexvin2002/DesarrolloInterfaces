package ConversorEuroPesetas;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class ConvertidorEuroPeseta extends javax.swing.JFrame {

    private IngresarCantidad INGRESARCANTIDAD;

    public ConvertidorEuroPeseta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonIngresarCantidad = new javax.swing.JButton();
        jLabelPesetas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Euros a Pesetas");
        setMaximumSize(new java.awt.Dimension(350, 350));
        setMinimumSize(new java.awt.Dimension(350, 350));
        setSize(new java.awt.Dimension(350, 300));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(350, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CONVERSOR DE EUROS A PESETAS");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel1.add(jLabelTitulo);

        jButtonIngresarCantidad.setText("INGRESA CANTIDAD");
        jButtonIngresarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIngresarCantidad);

        jLabelPesetas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPesetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesetas.setText("  ");
        jLabelPesetas.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabelPesetas.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabelPesetas.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel1.add(jLabelPesetas);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarCantidadActionPerformed
        INGRESARCANTIDAD = new IngresarCantidad(this, true);
        INGRESARCANTIDAD.setVisible(true);
        jLabelPesetas.setText(String.valueOf(INGRESARCANTIDAD.resultado) + " Pesetas");
    }//GEN-LAST:event_jButtonIngresarCantidadActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorEuroPeseta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ConvertidorEuroPeseta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresarCantidad;
    private javax.swing.JLabel jLabelPesetas;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
