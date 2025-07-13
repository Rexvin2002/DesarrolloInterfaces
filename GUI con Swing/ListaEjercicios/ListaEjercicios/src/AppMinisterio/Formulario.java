package AppMinisterio;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JDialog {

    private final AppMinisterio APPMINISTERIO;

    public Formulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        APPMINISTERIO = (AppMinisterio) parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelProfesion = new javax.swing.JLabel();
        jTextFieldProfesion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelHermanos = new javax.swing.JLabel();
        jSpinnerHermanos = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabelEdad = new javax.swing.JLabel();
        jComboBoxEdad = new javax.swing.JComboBox<>();
        jPanelSexo = new javax.swing.JPanel();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jCheckBoxDeporte = new javax.swing.JCheckBox();
        jPanelCual = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDeportes = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelCompras = new javax.swing.JLabel();
        jSliderCompras = new javax.swing.JSlider();
        jPanel8 = new javax.swing.JPanel();
        jLabelTV = new javax.swing.JLabel();
        jSliderTV = new javax.swing.JSlider();
        jPanel9 = new javax.swing.JPanel();
        jLabelCine = new javax.swing.JLabel();
        jSliderCine = new javax.swing.JSlider();
        jPanel10 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(460, 700));
        setMinimumSize(new java.awt.Dimension(460, 700));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 690));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 690));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 690));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jPanel2.setMaximumSize(new java.awt.Dimension(410, 25));
        jPanel2.setMinimumSize(new java.awt.Dimension(410, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(410, 25));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jLabelProfesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelProfesion.setText("Profesión:");
        jPanel2.add(jLabelProfesion);

        jTextFieldProfesion.setToolTipText("Escriba su profesión");
        jTextFieldProfesion.setMaximumSize(new java.awt.Dimension(330, 22));
        jTextFieldProfesion.setMinimumSize(new java.awt.Dimension(330, 22));
        jTextFieldProfesion.setPreferredSize(new java.awt.Dimension(330, 22));
        jPanel2.add(jTextFieldProfesion);

        jPanel1.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(410, 25));
        jPanel3.setMinimumSize(new java.awt.Dimension(410, 25));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 25));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel4.setMaximumSize(new java.awt.Dimension(205, 25));
        jPanel4.setMinimumSize(new java.awt.Dimension(205, 25));
        jPanel4.setPreferredSize(new java.awt.Dimension(205, 25));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jLabelHermanos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelHermanos.setText("Nº Hermanos:");
        jPanel4.add(jLabelHermanos);

        jSpinnerHermanos.setToolTipText("Indique la cantidad de hermanos");
        jPanel4.add(jSpinnerHermanos);

        jPanel3.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(205, 25));
        jPanel5.setMinimumSize(new java.awt.Dimension(205, 25));
        jPanel5.setPreferredSize(new java.awt.Dimension(205, 25));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jLabelEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEdad.setText("Edad:");
        jPanel5.add(jLabelEdad);

        jComboBoxEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 65", "Mayor de 65" }));
        jComboBoxEdad.setToolTipText("Seleccione su rango de edad");
        jComboBoxEdad.setMaximumSize(new java.awt.Dimension(121, 25));
        jComboBoxEdad.setMinimumSize(new java.awt.Dimension(121, 25));
        jComboBoxEdad.setPreferredSize(new java.awt.Dimension(121, 25));
        jPanel5.add(jComboBoxEdad);

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3);

        jPanelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanelSexo.setMaximumSize(new java.awt.Dimension(410, 60));
        jPanelSexo.setMinimumSize(new java.awt.Dimension(410, 60));
        jPanelSexo.setPreferredSize(new java.awt.Dimension(410, 60));
        jPanelSexo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 50, 0));

        buttonGroup.add(jRadioButtonHombre);
        jRadioButtonHombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonHombre.setText("Hombre");
        jPanelSexo.add(jRadioButtonHombre);

        buttonGroup.add(jRadioButtonMujer);
        jRadioButtonMujer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMujer.setText("Mujer");
        jPanelSexo.add(jRadioButtonMujer);

        jPanel1.add(jPanelSexo);

        jPanel6.setMaximumSize(new java.awt.Dimension(410, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(410, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(410, 100));

        jCheckBoxDeporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxDeporte.setText("¿Práctica algún deporte?");
        jCheckBoxDeporte.setToolTipText("Indique si practica actualmente deporte");
        jPanel6.add(jCheckBoxDeporte);

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

        jPanel6.add(jPanelCual);

        jPanel1.add(jPanel6);

        jSeparator1.setMaximumSize(new java.awt.Dimension(410, 3));
        jSeparator1.setMinimumSize(new java.awt.Dimension(410, 3));
        jSeparator1.setPreferredSize(new java.awt.Dimension(410, 3));
        jPanel1.add(jSeparator1);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setText("Marque del 1 al 10 su grado de afición a:");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(410, 25));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(410, 25));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(410, 25));
        jPanel1.add(jLabelTitulo);

        jPanel7.setMaximumSize(new java.awt.Dimension(410, 60));
        jPanel7.setMinimumSize(new java.awt.Dimension(410, 60));
        jPanel7.setPreferredSize(new java.awt.Dimension(410, 60));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabelCompras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCompras.setText("Compras:");
        jLabelCompras.setMaximumSize(new java.awt.Dimension(90, 50));
        jLabelCompras.setMinimumSize(new java.awt.Dimension(90, 50));
        jLabelCompras.setPreferredSize(new java.awt.Dimension(90, 50));
        jPanel7.add(jLabelCompras);

        jSliderCompras.setMajorTickSpacing(1);
        jSliderCompras.setMaximum(10);
        jSliderCompras.setMinorTickSpacing(1);
        jSliderCompras.setPaintLabels(true);
        jSliderCompras.setPaintTicks(true);
        jSliderCompras.setSnapToTicks(true);
        jSliderCompras.setToolTipText("Grado de affición a las compras");
        jSliderCompras.setValue(0);
        jSliderCompras.setMaximumSize(new java.awt.Dimension(250, 50));
        jSliderCompras.setMinimumSize(new java.awt.Dimension(250, 50));
        jSliderCompras.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel7.add(jSliderCompras);

        jPanel1.add(jPanel7);

        jPanel8.setMaximumSize(new java.awt.Dimension(410, 60));
        jPanel8.setMinimumSize(new java.awt.Dimension(410, 60));
        jPanel8.setPreferredSize(new java.awt.Dimension(410, 60));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabelTV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTV.setText("Ver television:");
        jLabelTV.setMaximumSize(new java.awt.Dimension(90, 50));
        jLabelTV.setMinimumSize(new java.awt.Dimension(90, 50));
        jLabelTV.setPreferredSize(new java.awt.Dimension(90, 50));
        jPanel8.add(jLabelTV);

        jSliderTV.setMajorTickSpacing(1);
        jSliderTV.setMaximum(10);
        jSliderTV.setMinorTickSpacing(1);
        jSliderTV.setPaintLabels(true);
        jSliderTV.setPaintTicks(true);
        jSliderTV.setSnapToTicks(true);
        jSliderTV.setToolTipText("Grado de aficción a la televisión ");
        jSliderTV.setValue(0);
        jSliderTV.setMaximumSize(new java.awt.Dimension(250, 50));
        jSliderTV.setMinimumSize(new java.awt.Dimension(250, 50));
        jSliderTV.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel8.add(jSliderTV);

        jPanel1.add(jPanel8);

        jPanel9.setMaximumSize(new java.awt.Dimension(410, 60));
        jPanel9.setMinimumSize(new java.awt.Dimension(410, 60));
        jPanel9.setPreferredSize(new java.awt.Dimension(410, 60));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabelCine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCine.setText("Ir al cine:");
        jLabelCine.setMaximumSize(new java.awt.Dimension(90, 50));
        jLabelCine.setMinimumSize(new java.awt.Dimension(90, 50));
        jLabelCine.setPreferredSize(new java.awt.Dimension(90, 50));
        jPanel9.add(jLabelCine);

        jSliderCine.setMajorTickSpacing(1);
        jSliderCine.setMaximum(10);
        jSliderCine.setMinorTickSpacing(1);
        jSliderCine.setPaintLabels(true);
        jSliderCine.setPaintTicks(true);
        jSliderCine.setSnapToTicks(true);
        jSliderCine.setToolTipText("Grado de aficción al cine");
        jSliderCine.setValue(0);
        jSliderCine.setMaximumSize(new java.awt.Dimension(250, 50));
        jSliderCine.setMinimumSize(new java.awt.Dimension(250, 50));
        jSliderCine.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel9.add(jSliderCine);

        jPanel1.add(jPanel9);

        jPanel10.setMaximumSize(new java.awt.Dimension(410, 50));
        jPanel10.setMinimumSize(new java.awt.Dimension(410, 50));
        jPanel10.setPreferredSize(new java.awt.Dimension(410, 50));

        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonAceptar);

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonCancelar);

        jPanel1.add(jPanel10);

        getContentPane().add(jPanel1);

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

            APPMINISTERIO.añadirPersona(p);
            APPMINISTERIO.setVisible(true);
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
