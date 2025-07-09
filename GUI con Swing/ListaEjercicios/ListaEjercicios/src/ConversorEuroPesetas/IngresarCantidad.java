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

        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldEuros = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonConvertirAPesetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCantidad.setText("Cantidad en euros:");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTitulo.setText("INGRESAR CANTIDAD");

        jButtonConvertirAPesetas.setText("CONVERTIR A PESETAS");
        jButtonConvertirAPesetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirAPesetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConvertirAPesetas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCantidad)
                        .addComponent(jTextFieldEuros)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(25, 25, 25)
                .addComponent(jLabelCantidad)
                .addGap(20, 20, 20)
                .addComponent(jTextFieldEuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButtonConvertirAPesetas)
                .addContainerGap(30, Short.MAX_VALUE))
        );

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
