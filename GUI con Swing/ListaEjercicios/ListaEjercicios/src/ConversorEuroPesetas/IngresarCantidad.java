package ConversorEuroPesetas;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JOptionPane;

public class IngresarCantidad extends javax.swing.JDialog {

    public double resultado;

    public IngresarCantidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldEuros = new javax.swing.JTextField();
        jButtonConvertirAPesetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Convertidor de Pesetas");
        setMaximumSize(new java.awt.Dimension(250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setPreferredSize(new java.awt.Dimension(250, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("INGRESAR CANTIDAD");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(180, 25));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(180, 25));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(180, 25));
        getContentPane().add(jLabelTitulo);

        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad.setText("Cantidad en euros:");
        jLabelCantidad.setMaximumSize(new java.awt.Dimension(180, 25));
        jLabelCantidad.setMinimumSize(new java.awt.Dimension(180, 25));
        jLabelCantidad.setPreferredSize(new java.awt.Dimension(180, 25));
        getContentPane().add(jLabelCantidad);

        jTextFieldEuros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEuros.setMaximumSize(new java.awt.Dimension(180, 30));
        jTextFieldEuros.setMinimumSize(new java.awt.Dimension(180, 30));
        jTextFieldEuros.setPreferredSize(new java.awt.Dimension(180, 30));
        getContentPane().add(jTextFieldEuros);

        jButtonConvertirAPesetas.setText("CONVERTIR A PESETAS");
        jButtonConvertirAPesetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirAPesetasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConvertirAPesetas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirAPesetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirAPesetasActionPerformed
        try {
            double euros = Double.parseDouble(jTextFieldEuros.getText());
            resultado = euros * 166.386;
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConvertirAPesetasActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCantidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            IngresarCantidad dialog = new IngresarCantidad(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonConvertirAPesetas;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldEuros;
    // End of variables declaration//GEN-END:variables
}
