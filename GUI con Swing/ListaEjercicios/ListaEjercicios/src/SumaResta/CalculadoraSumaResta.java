package SumaResta;

import javax.swing.JOptionPane;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class CalculadoraSumaResta extends javax.swing.JFrame {

    public CalculadoraSumaResta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldN1 = new javax.swing.JTextField();
        jTextFieldN2 = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSumar.setText("SUMAR");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jButtonRestar.setText("RESTAR");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        jLabelResultado.setText("El resultado de la operación es: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSumar)
                            .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRestar)))
                    .addComponent(jLabelResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSumar)
                    .addComponent(jButtonRestar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelResultado)
                .addContainerGap(15, Short.MAX_VALUE))
        );

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
    private javax.swing.JTextField jTextFieldN1;
    private javax.swing.JTextField jTextFieldN2;
    // End of variables declaration//GEN-END:variables
}
