package RegistroPersonas;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JDialog {

    private final MainFrame MF;

    public Formulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        MF = (MainFrame) parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelProfesion = new javax.swing.JLabel();
        jTextFieldProfesion = new javax.swing.JTextField();
        jLabelHermanos = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jSpinnerHermanos = new javax.swing.JSpinner();
        jComboBoxEdad = new javax.swing.JComboBox<>();
        jCheckBoxDeporte = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCompras = new javax.swing.JLabel();
        jLabelTV = new javax.swing.JLabel();
        jLabelCine = new javax.swing.JLabel();
        jSliderTV = new javax.swing.JSlider();
        jSliderCompras = new javax.swing.JSlider();
        jSliderCine = new javax.swing.JSlider();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jPanelSexo = new javax.swing.JPanel();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jPanelCual = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDeportes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelProfesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelProfesion.setText("Profesión:");

        jTextFieldProfesion.setToolTipText("Escriba su profesión");

        jLabelHermanos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelHermanos.setText("Nº Hermanos:");

        jLabelEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEdad.setText("Edad:");

        jSpinnerHermanos.setToolTipText("Indique la cantidad de hermanos");

        jComboBoxEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 65", "Mayor de 65" }));
        jComboBoxEdad.setToolTipText("Seleccione su rango de edad");

        jCheckBoxDeporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxDeporte.setText("¿Práctica algún deporte?");
        jCheckBoxDeporte.setToolTipText("Indique si practica actualmente deporte");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setText("Marque del 1 al 10 su grado de afición a:");

        jLabelCompras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCompras.setText("Compras:");

        jLabelTV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTV.setText("Ver television:");

        jLabelCine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCine.setText("Ir al cine:");

        jSliderTV.setMajorTickSpacing(1);
        jSliderTV.setMaximum(10);
        jSliderTV.setMinorTickSpacing(1);
        jSliderTV.setPaintLabels(true);
        jSliderTV.setPaintTicks(true);
        jSliderTV.setSnapToTicks(true);
        jSliderTV.setToolTipText("Grado de aficción a la televisión ");
        jSliderTV.setValue(0);

        jSliderCompras.setMajorTickSpacing(1);
        jSliderCompras.setMaximum(10);
        jSliderCompras.setMinorTickSpacing(1);
        jSliderCompras.setPaintLabels(true);
        jSliderCompras.setPaintTicks(true);
        jSliderCompras.setSnapToTicks(true);
        jSliderCompras.setToolTipText("Grado de affición a las compras");
        jSliderCompras.setValue(0);

        jSliderCine.setMajorTickSpacing(1);
        jSliderCine.setMaximum(10);
        jSliderCine.setMinorTickSpacing(1);
        jSliderCine.setPaintLabels(true);
        jSliderCine.setPaintTicks(true);
        jSliderCine.setSnapToTicks(true);
        jSliderCine.setToolTipText("Grado de aficción al cine");
        jSliderCine.setValue(0);

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jPanelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        buttonGroup.add(jRadioButtonHombre);
        jRadioButtonHombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonHombre.setText("Hombre");

        buttonGroup.add(jRadioButtonMujer);
        jRadioButtonMujer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMujer.setText("Mujer");

        javax.swing.GroupLayout jPanelSexoLayout = new javax.swing.GroupLayout(jPanelSexo);
        jPanelSexo.setLayout(jPanelSexoLayout);
        jPanelSexoLayout.setHorizontalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexoLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jRadioButtonHombre)
                .addGap(107, 107, 107)
                .addComponent(jRadioButtonMujer)
                .addGap(32, 32, 32))
        );
        jPanelSexoLayout.setVerticalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexoLayout.createSequentialGroup()
                .addGroup(jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHombre)
                    .addComponent(jRadioButtonMujer))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanelCual.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Cual?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jListDeportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListDeportes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tenis", "Fútbol", "Atletismo", "Natación", "Baloncesto" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListDeportes.setToolTipText("Indicar el deporte que se practica");
        jScrollPane2.setViewportView(jListDeportes);

        javax.swing.GroupLayout jPanelCualLayout = new javax.swing.GroupLayout(jPanelCual);
        jPanelCual.setLayout(jPanelCualLayout);
        jPanelCualLayout.setHorizontalGroup(
            jPanelCualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCualLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCualLayout.setVerticalGroup(
            jPanelCualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelProfesion)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldProfesion))
                        .addComponent(jPanelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelHermanos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinnerHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jLabelEdad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelCual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addGap(85, 85, 85))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTitulo)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelCine)
                                        .addComponent(jLabelTV)
                                        .addComponent(jLabelCompras))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSliderTV, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSliderCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSliderCine, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfesion)
                    .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHermanos)
                    .addComponent(jLabelEdad)
                    .addComponent(jSpinnerHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxDeporte))
                    .addComponent(jPanelCual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCompras)
                            .addComponent(jSliderCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSliderTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTV))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelCine))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSliderCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if ("".equals(jTextFieldProfesion.getText())) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese su profesión.",
                    "Campo obligatorio",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String profesion = jTextFieldProfesion.getText();
            Object hermanos = jSpinnerHermanos.getValue();
            Object edad = jComboBoxEdad.getSelectedItem();
            String sexo = "";
            if (jRadioButtonHombre.isSelected()) {
                sexo = jRadioButtonHombre.getText();
            } else if (jRadioButtonMujer.isSelected()) {
                sexo = jRadioButtonMujer.getText();
            } else {
                sexo = "No especificado";
            }

            String deporte = " ";
            if (jCheckBoxDeporte.isSelected()) {
                if (jListDeportes.isSelectionEmpty()) {
                    deporte = "No especificado";
                } else {
                    deporte = jListDeportes.getSelectedValue();
                }
            }

            int compras = jSliderCompras.getValue();
            int television = jSliderTV.getValue();
            int cine = jSliderCine.getValue();

            Persona p = new Persona(profesion, hermanos, edad, sexo, deporte, compras, television, cine);

            MF.añadirPersona(p);
            MF.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Formulario dialog = new Formulario(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxDeporte;
    private javax.swing.JComboBox<String> jComboBoxEdad;
    private javax.swing.JLabel jLabelCine;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelHermanos;
    private javax.swing.JLabel jLabelProfesion;
    private javax.swing.JLabel jLabelTV;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListDeportes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCual;
    private javax.swing.JPanel jPanelSexo;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSliderCine;
    private javax.swing.JSlider jSliderCompras;
    private javax.swing.JSlider jSliderTV;
    private javax.swing.JSpinner jSpinnerHermanos;
    private javax.swing.JTextField jTextFieldProfesion;
    // End of variables declaration//GEN-END:variables
}
