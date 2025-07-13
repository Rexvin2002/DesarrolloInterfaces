package SumaResta;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JOptionPane;

public class CalculadoraSumaResta extends javax.swing.JFrame {

    public CalculadoraSumaResta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldN1 = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldN2 = new javax.swing.JTextField();
        jButtonRestar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 200));
        setMinimumSize(new java.awt.Dimension(440, 200));
        setPreferredSize(new java.awt.Dimension(440, 200));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(420, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(420, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(420, 100));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        jPanel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 10));

        jTextFieldN1.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldN1.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldN1.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel1.add(jTextFieldN1);

        jButtonSumar.setText("SUMAR");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSumar);

        jPanel3.add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        jTextFieldN2.setMaximumSize(new java.awt.Dimension(200, 22));
        jTextFieldN2.setMinimumSize(new java.awt.Dimension(200, 22));
        jTextFieldN2.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel2.add(jTextFieldN2);

        jButtonRestar.setText("RESTAR");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRestar);

        jPanel3.add(jPanel2);

        getContentPane().add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelResultado.setText("El resultado de la operación es: ");
        jLabelResultado.setMaximumSize(new java.awt.Dimension(400, 50));
        jLabelResultado.setMinimumSize(new java.awt.Dimension(400, 50));
        jLabelResultado.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel4.add(jLabelResultado);

        getContentPane().add(jPanel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        try {
            double n1 = Double.parseDouble(jTextFieldN1.getText());
            double n2 = Double.parseDouble(jTextFieldN2.getText());
            double resultado = n1 + n2;
            if (resultado % 1 == 0) {
                jLabelResultado.setText("El resultado de la operación es: " + (int) resultado);
            } else {
                jLabelResultado.setText("El resultado de la operación es: " + resultado);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldN1.setText("");
            jTextFieldN2.setText("");
        }
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        try {
            double n1 = Double.parseDouble(jTextFieldN1.getText());
            double n2 = Double.parseDouble(jTextFieldN2.getText());
            double resultado = n1 - n2;
            if (resultado % 1 == 0) {
                jLabelResultado.setText("El resultado de la operación es: " + (int) resultado);
            } else {
                jLabelResultado.setText("El resultado de la operación es: " + resultado);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldN1.setText("");
            jTextFieldN2.setText("");
        }
    }//GEN-LAST:event_jButtonRestarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSumaResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraSumaResta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldN1;
    private javax.swing.JTextField jTextFieldN2;
    // End of variables declaration//GEN-END:variables
}
