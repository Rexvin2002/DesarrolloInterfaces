package component;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JTextField;

public class LimitedTextProperties extends javax.swing.JPanel {

    public LimitedTextProperties() {
        initComponents();
        establecerValoresPorDefecto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonForegroundSinSuperarLimite = new javax.swing.JButton();
        jButtonBackgroundSuperandoLimite = new javax.swing.JButton();
        jButtonBackgroundSinSuperarLimite = new javax.swing.JButton();
        jButtonForegroundSuperandoLimite = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();
        jLabelForeground = new javax.swing.JLabel();
        jLabelSinSuperarLimite = new javax.swing.JLabel();
        jTextFieldForegroundSinSuperarLimite = new javax.swing.JTextField();
        jLabelSuperandoLimite = new javax.swing.JLabel();
        jTextFieldBackgroundSinSuperarLimite = new javax.swing.JTextField();
        jTextFieldBackgroundSuperandoLimite = new javax.swing.JTextField();
        jTextFieldForegroundSuperandoLimite = new javax.swing.JTextField();
        jLabelLimiteTexto = new javax.swing.JLabel();
        jTextFieldLimiteTexto = new javax.swing.JTextField();

        jButtonForegroundSinSuperarLimite.setText("Elegir");
        jButtonForegroundSinSuperarLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForegroundSinSuperarLimiteActionPerformed(evt);
            }
        });

        jButtonBackgroundSuperandoLimite.setText("Elegir");
        jButtonBackgroundSuperandoLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackgroundSuperandoLimiteActionPerformed(evt);
            }
        });

        jButtonBackgroundSinSuperarLimite.setText("Elegir");
        jButtonBackgroundSinSuperarLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackgroundSinSuperarLimiteActionPerformed(evt);
            }
        });

        jButtonForegroundSuperandoLimite.setText("Elegir");
        jButtonForegroundSuperandoLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForegroundSuperandoLimiteActionPerformed(evt);
            }
        });

        jLabelBackground.setText("Background");

        jLabelForeground.setText("Foreground");

        jLabelSinSuperarLimite.setText("Colores sin superar limite:");

        jTextFieldForegroundSinSuperarLimite.setEditable(false);
        jTextFieldForegroundSinSuperarLimite.setEnabled(false);

        jLabelSuperandoLimite.setText("Colores superando el limite:");

        jTextFieldBackgroundSinSuperarLimite.setEditable(false);
        jTextFieldBackgroundSinSuperarLimite.setEnabled(false);

        jTextFieldBackgroundSuperandoLimite.setEditable(false);
        jTextFieldBackgroundSuperandoLimite.setEnabled(false);

        jTextFieldForegroundSuperandoLimite.setEditable(false);
        jTextFieldForegroundSuperandoLimite.setEnabled(false);

        jLabelLimiteTexto.setText("Limite de texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelForeground)
                    .addComponent(jLabelBackground)
                    .addComponent(jLabelLimiteTexto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldForegroundSinSuperarLimite, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBackgroundSinSuperarLimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonForegroundSinSuperarLimite)
                                    .addComponent(jButtonBackgroundSinSuperarLimite)))
                            .addComponent(jLabelSinSuperarLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldForegroundSuperandoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonForegroundSuperandoLimite))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBackgroundSuperandoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBackgroundSuperandoLimite))
                            .addComponent(jLabelSuperandoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldLimiteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSinSuperarLimite)
                    .addComponent(jLabelSuperandoLimite))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldForegroundSinSuperarLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonForegroundSinSuperarLimite)
                    .addComponent(jTextFieldForegroundSuperandoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonForegroundSuperandoLimite)
                    .addComponent(jLabelForeground))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBackgroundSinSuperarLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBackgroundSuperandoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBackgroundSinSuperarLimite)
                    .addComponent(jButtonBackgroundSuperandoLimite)
                    .addComponent(jLabelBackground))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLimiteTexto)
                    .addComponent(jTextFieldLimiteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void establecerValoresPorDefecto() {
        jTextFieldForegroundSinSuperarLimite.setBackground(Color.WHITE);
        jTextFieldBackgroundSinSuperarLimite.setBackground(Color.BLACK);
        jTextFieldForegroundSuperandoLimite.setBackground(Color.BLACK);
        jTextFieldBackgroundSuperandoLimite.setBackground(Color.WHITE);
    }

    // Method to handle color selection for any button and text field
    private void handleColorSelection(JTextField textField, Color defaultColor) {
        Color color = JColorChooser.showDialog(this, "Choose a Color", defaultColor);
        if (color != null) {
            textField.setBackground(color); // Or setForeground, depending on your needs
        }
    }

    private void jButtonForegroundSinSuperarLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForegroundSinSuperarLimiteActionPerformed
        handleColorSelection(jTextFieldForegroundSinSuperarLimite, Color.BLACK);
    }//GEN-LAST:event_jButtonForegroundSinSuperarLimiteActionPerformed

    private void jButtonBackgroundSinSuperarLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackgroundSinSuperarLimiteActionPerformed
        handleColorSelection(jTextFieldBackgroundSinSuperarLimite, Color.WHITE);
    }//GEN-LAST:event_jButtonBackgroundSinSuperarLimiteActionPerformed

    private void jButtonForegroundSuperandoLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForegroundSuperandoLimiteActionPerformed
        handleColorSelection(jTextFieldForegroundSuperandoLimite, Color.WHITE);
    }//GEN-LAST:event_jButtonForegroundSuperandoLimiteActionPerformed

    private void jButtonBackgroundSuperandoLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackgroundSuperandoLimiteActionPerformed
        handleColorSelection(jTextFieldBackgroundSuperandoLimite, Color.BLACK);
    }//GEN-LAST:event_jButtonBackgroundSuperandoLimiteActionPerformed

    public LimitedText getSelectedValue() {

        Color colorForegroundSinSuperarLimite = jTextFieldForegroundSinSuperarLimite.getBackground();
        Color colorBackgroundSinSuperarLimite = jTextFieldBackgroundSinSuperarLimite.getBackground();
        Color colorForegroundSuperandoLimite = jTextFieldForegroundSuperandoLimite.getBackground();
        Color colorBackgroundSuperandoLimite = jTextFieldBackgroundSuperandoLimite.getBackground();

        int textLimit;
        if (jTextFieldLimiteTexto.getText().trim().isEmpty()) {
            textLimit = 5; // Valor por defecto
            jTextFieldLimiteTexto.setText(String.valueOf(textLimit));
        } else {
            try {
                textLimit = Integer.parseInt(jTextFieldLimiteTexto.getText().trim());
            } catch (NumberFormatException e) {
                // Manejar la excepción, por ejemplo mostrando un mensaje al usuario
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Por favor ingresa un número válido.",
                        "Formato de número inválido",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                textLimit = 5; // Valor por defecto en caso de error
            }
        }

        return new LimitedText(colorForegroundSinSuperarLimite, colorBackgroundSinSuperarLimite, colorForegroundSuperandoLimite, colorBackgroundSuperandoLimite, textLimit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackgroundSinSuperarLimite;
    private javax.swing.JButton jButtonBackgroundSuperandoLimite;
    private javax.swing.JButton jButtonForegroundSinSuperarLimite;
    private javax.swing.JButton jButtonForegroundSuperandoLimite;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelForeground;
    private javax.swing.JLabel jLabelLimiteTexto;
    private javax.swing.JLabel jLabelSinSuperarLimite;
    private javax.swing.JLabel jLabelSuperandoLimite;
    private javax.swing.JTextField jTextFieldBackgroundSinSuperarLimite;
    private javax.swing.JTextField jTextFieldBackgroundSuperandoLimite;
    private javax.swing.JTextField jTextFieldForegroundSinSuperarLimite;
    private javax.swing.JTextField jTextFieldForegroundSuperandoLimite;
    private javax.swing.JTextField jTextFieldLimiteTexto;
    // End of variables declaration//GEN-END:variables
}
