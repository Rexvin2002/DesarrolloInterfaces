package jpanelimagen;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.io.File;
import javax.swing.JFileChooser;

public class PropiedadesImagenPanel extends javax.swing.JPanel {

    public PropiedadesImagenPanel() {
        initComponents();
        jCheckBoxAjustar.setSelected(true);
    }

    public PropiedadesImagen getSelectdValue() {
        File f = new File(jTextFieldRutaImagen.getText());
        Float opacidad = jSliderOpacidad.getValue() / 100f;
        boolean ajustar = jCheckBoxAjustar.isSelected();

        PropiedadesImagen propiedades = new PropiedadesImagen(f, opacidad);
        propiedades.setAjustarTamaño(ajustar);
        return propiedades;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldRutaImagen = new javax.swing.JTextField();
        jButtonRutaImagen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSliderOpacidad = new javax.swing.JSlider();
        jCheckBoxAjustar = new javax.swing.JCheckBox();

        jLabel1.setText("Ruta Imagen:");

        jTextFieldRutaImagen.setText("- elija ruta de la imagen -");

        jButtonRutaImagen.setText("...");
        jButtonRutaImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRutaImagenActionPerformed(evt);
            }
        });

        jLabel2.setText("Opacidad:");

        jCheckBoxAjustar.setText("Ajustar Imagen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAjustar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRutaImagen)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRutaImagen))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAjustar)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRutaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRutaImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        File f;
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();
            jTextFieldRutaImagen.setText(f.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonRutaImagenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRutaImagen;
    private javax.swing.JCheckBox jCheckBoxAjustar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSliderOpacidad;
    private javax.swing.JTextField jTextFieldRutaImagen;
    // End of variables declaration//GEN-END:variables
}
