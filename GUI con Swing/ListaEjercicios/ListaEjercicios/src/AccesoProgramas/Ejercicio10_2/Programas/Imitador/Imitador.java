package AccesoProgramas.Ejercicio10_2.Programas.Imitador;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Imitador extends javax.swing.JFrame {

    public Imitador() {
        initComponents();
        setLocationRelativeTo(null);

        jPanelMenuImitador.removeAll();
        jPanelMenuImitador.revalidate();
        jPanelMenuImitador.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelMenuImitador = new javax.swing.JPanel();
        jLabelOriginal = new javax.swing.JLabel();
        jPanelOriginal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonOpcion1Original = new javax.swing.JRadioButton();
        jRadioButtonOpcion2Original = new javax.swing.JRadioButton();
        jRadioButtonOpcion3Original = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxOriginal = new javax.swing.JComboBox<>();
        jSpinnerOriginal = new javax.swing.JSpinner();
        jTextFieldNombreOriginal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jCheckBoxOpcion5Original = new javax.swing.JCheckBox();
        jCheckBoxOpcion4Original = new javax.swing.JCheckBox();
        jCheckBoxOpcion6Original = new javax.swing.JCheckBox();
        jSeparatorOriginalEspejo = new javax.swing.JSeparator();
        jLabelEspejo = new javax.swing.JLabel();
        jPanelEspejo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonOpcion1Espejo = new javax.swing.JRadioButton();
        jRadioButtonOpcion2Espejo = new javax.swing.JRadioButton();
        jRadioButtonOpcion3Espejo = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldNombreEspejo = new javax.swing.JTextField();
        jComboBoxEspejo = new javax.swing.JComboBox<>();
        jSpinnerEspejo = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jCheckBoxOpcion6Espejo = new javax.swing.JCheckBox();
        jCheckBoxOpcion5Espejo = new javax.swing.JCheckBox();
        jCheckBoxOpcion4Espejo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imitador");
        setMinimumSize(new java.awt.Dimension(500, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanelMenuImitador.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jPanelMenuImitador.setMinimumSize(new java.awt.Dimension(500, 40));
        jPanelMenuImitador.setPreferredSize(new java.awt.Dimension(500, 40));

        javax.swing.GroupLayout jPanelMenuImitadorLayout = new javax.swing.GroupLayout(jPanelMenuImitador);
        jPanelMenuImitador.setLayout(jPanelMenuImitadorLayout);
        jPanelMenuImitadorLayout.setHorizontalGroup(
            jPanelMenuImitadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMenuImitadorLayout.setVerticalGroup(
            jPanelMenuImitadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabelOriginal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelOriginal.setText("Original");
        jLabelOriginal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jLabelOriginal.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jLabelOriginal.setMinimumSize(new java.awt.Dimension(500, 16));
        jLabelOriginal.setPreferredSize(new java.awt.Dimension(500, 16));

        jPanelOriginal.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jPanelOriginal.setMinimumSize(new java.awt.Dimension(500, 110));
        jPanelOriginal.setPreferredSize(new java.awt.Dimension(500, 110));
        jPanelOriginal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jPanel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 100));

        buttonGroup1.add(jRadioButtonOpcion1Original);
        jRadioButtonOpcion1Original.setText("Opcion 1");
        jRadioButtonOpcion1Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonOpcion1OriginalStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOpcion2Original);
        jRadioButtonOpcion2Original.setText("Opcion 2");
        jRadioButtonOpcion2Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonOpcion2OriginalStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOpcion3Original);
        jRadioButtonOpcion3Original.setText("Opcion 3");
        jRadioButtonOpcion3Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonOpcion3OriginalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonOpcion1Original)
                    .addComponent(jRadioButtonOpcion2Original)
                    .addComponent(jRadioButtonOpcion3Original)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion1Original)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion2Original)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion3Original))
        );

        jPanelOriginal.add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 100));

        jComboBoxOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxOriginal.setMaximumSize(new java.awt.Dimension(100, 22));
        jComboBoxOriginal.setMinimumSize(new java.awt.Dimension(100, 22));
        jComboBoxOriginal.setPreferredSize(new java.awt.Dimension(100, 22));
        jComboBoxOriginal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOriginalItemStateChanged(evt);
            }
        });

        jSpinnerOriginal.setMaximumSize(new java.awt.Dimension(100, 22));
        jSpinnerOriginal.setMinimumSize(new java.awt.Dimension(100, 22));
        jSpinnerOriginal.setPreferredSize(new java.awt.Dimension(100, 22));
        jSpinnerOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerOriginalStateChanged(evt);
            }
        });

        jTextFieldNombreOriginal.setMaximumSize(new java.awt.Dimension(100, 22));
        jTextFieldNombreOriginal.setMinimumSize(new java.awt.Dimension(100, 22));
        jTextFieldNombreOriginal.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldNombreOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreOriginalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jComboBoxOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSpinnerOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jTextFieldNombreOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelOriginal.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 100));

        jCheckBoxOpcion5Original.setText("Opcion 5");
        jCheckBoxOpcion5Original.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion5Original.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion5Original.setPreferredSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion5Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxOpcion5OriginalStateChanged(evt);
            }
        });

        jCheckBoxOpcion4Original.setText("Opcion 4");
        jCheckBoxOpcion4Original.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion4Original.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion4Original.setPreferredSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion4Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxOpcion4OriginalStateChanged(evt);
            }
        });

        jCheckBoxOpcion6Original.setText("Opcion 6");
        jCheckBoxOpcion6Original.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion6Original.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion6Original.setPreferredSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion6Original.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxOpcion6OriginalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxOpcion5Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxOpcion4Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxOpcion6Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion5Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion4Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion6Original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelOriginal.add(jPanel5);

        jSeparatorOriginalEspejo.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jSeparatorOriginalEspejo.setMinimumSize(new java.awt.Dimension(500, 3));
        jSeparatorOriginalEspejo.setPreferredSize(new java.awt.Dimension(500, 3));

        jLabelEspejo.setText("Espejo");
        jLabelEspejo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jLabelEspejo.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jLabelEspejo.setMinimumSize(new java.awt.Dimension(500, 16));
        jLabelEspejo.setPreferredSize(new java.awt.Dimension(500, 16));

        jPanelEspejo.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jPanelEspejo.setMinimumSize(new java.awt.Dimension(500, 110));
        jPanelEspejo.setPreferredSize(new java.awt.Dimension(500, 110));
        jPanelEspejo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jRadioButtonOpcion1Espejo.setText("Opcion 1");
        jRadioButtonOpcion1Espejo.setEnabled(false);

        jRadioButtonOpcion2Espejo.setText("Opcion 2");
        jRadioButtonOpcion2Espejo.setEnabled(false);

        jRadioButtonOpcion3Espejo.setText("Opcion 3");
        jRadioButtonOpcion3Espejo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonOpcion1Espejo)
                    .addComponent(jRadioButtonOpcion2Espejo)
                    .addComponent(jRadioButtonOpcion3Espejo)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion1Espejo)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion2Espejo)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonOpcion3Espejo))
        );

        jPanelEspejo.add(jPanel1);

        jPanel6.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));

        jTextFieldNombreEspejo.setEnabled(false);
        jTextFieldNombreEspejo.setMaximumSize(new java.awt.Dimension(100, 22));
        jTextFieldNombreEspejo.setMinimumSize(new java.awt.Dimension(100, 22));
        jTextFieldNombreEspejo.setPreferredSize(new java.awt.Dimension(100, 22));

        jComboBoxEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEspejo.setEnabled(false);
        jComboBoxEspejo.setMaximumSize(new java.awt.Dimension(100, 22));
        jComboBoxEspejo.setMinimumSize(new java.awt.Dimension(100, 22));
        jComboBoxEspejo.setPreferredSize(new java.awt.Dimension(100, 22));

        jSpinnerEspejo.setEnabled(false);
        jSpinnerEspejo.setMaximumSize(new java.awt.Dimension(100, 22));
        jSpinnerEspejo.setMinimumSize(new java.awt.Dimension(100, 22));
        jSpinnerEspejo.setPreferredSize(new java.awt.Dimension(100, 22));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldNombreEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jComboBoxEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSpinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextFieldNombreEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jComboBoxEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSpinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelEspejo.add(jPanel6);

        jPanel7.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));

        jCheckBoxOpcion6Espejo.setText("Opcion 6");
        jCheckBoxOpcion6Espejo.setEnabled(false);
        jCheckBoxOpcion6Espejo.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion6Espejo.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion6Espejo.setPreferredSize(new java.awt.Dimension(100, 20));

        jCheckBoxOpcion5Espejo.setText("Opcion 5");
        jCheckBoxOpcion5Espejo.setEnabled(false);
        jCheckBoxOpcion5Espejo.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion5Espejo.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion5Espejo.setPreferredSize(new java.awt.Dimension(100, 20));

        jCheckBoxOpcion4Espejo.setText("Opcion 4");
        jCheckBoxOpcion4Espejo.setEnabled(false);
        jCheckBoxOpcion4Espejo.setMaximumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion4Espejo.setMinimumSize(new java.awt.Dimension(100, 20));
        jCheckBoxOpcion4Espejo.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxOpcion6Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBoxOpcion5Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCheckBoxOpcion4Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion6Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion5Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxOpcion4Espejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelEspejo.add(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenuImitador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorOriginalEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelMenuImitador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparatorOriginalEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanelEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOpcion1OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion1OriginalStateChanged
        jRadioButtonOpcion1Espejo.setSelected(jRadioButtonOpcion1Original.isSelected());
    }//GEN-LAST:event_jRadioButtonOpcion1OriginalStateChanged

    private void jRadioButtonOpcion2OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion2OriginalStateChanged
        jRadioButtonOpcion2Espejo.setSelected(jRadioButtonOpcion2Original.isSelected());
    }//GEN-LAST:event_jRadioButtonOpcion2OriginalStateChanged

    private void jRadioButtonOpcion3OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion3OriginalStateChanged
        jRadioButtonOpcion3Espejo.setSelected(jRadioButtonOpcion3Original.isSelected());
    }//GEN-LAST:event_jRadioButtonOpcion3OriginalStateChanged

    private void jCheckBoxOpcion4OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion4OriginalStateChanged
        jCheckBoxOpcion4Espejo.setSelected(jCheckBoxOpcion4Original.isSelected());
    }//GEN-LAST:event_jCheckBoxOpcion4OriginalStateChanged

    private void jCheckBoxOpcion5OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion5OriginalStateChanged
        jCheckBoxOpcion5Espejo.setSelected(jCheckBoxOpcion5Original.isSelected());
    }//GEN-LAST:event_jCheckBoxOpcion5OriginalStateChanged

    private void jCheckBoxOpcion6OriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion6OriginalStateChanged
        jCheckBoxOpcion6Espejo.setSelected(jCheckBoxOpcion6Original.isSelected());
    }//GEN-LAST:event_jCheckBoxOpcion6OriginalStateChanged

    private void jTextFieldNombreOriginalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreOriginalKeyPressed
        jTextFieldNombreEspejo.setText(jTextFieldNombreOriginal.getText());
    }//GEN-LAST:event_jTextFieldNombreOriginalKeyPressed

    private void jComboBoxOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOriginalItemStateChanged
        jComboBoxEspejo.setSelectedItem(jComboBoxOriginal.getSelectedItem());
    }//GEN-LAST:event_jComboBoxOriginalItemStateChanged

    private void jSpinnerOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerOriginalStateChanged
        jSpinnerEspejo.setValue(jSpinnerOriginal.getValue());
    }//GEN-LAST:event_jSpinnerOriginalStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // s.setTitle("Todos para uno y uno para todos");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        dispose();
    }//GEN-LAST:event_formWindowDeactivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Imitador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBoxOpcion4Espejo;
    private javax.swing.JCheckBox jCheckBoxOpcion4Original;
    private javax.swing.JCheckBox jCheckBoxOpcion5Espejo;
    private javax.swing.JCheckBox jCheckBoxOpcion5Original;
    private javax.swing.JCheckBox jCheckBoxOpcion6Espejo;
    private javax.swing.JCheckBox jCheckBoxOpcion6Original;
    private javax.swing.JComboBox<String> jComboBoxEspejo;
    private javax.swing.JComboBox<String> jComboBoxOriginal;
    private javax.swing.JLabel jLabelEspejo;
    private javax.swing.JLabel jLabelOriginal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelEspejo;
    private javax.swing.JPanel jPanelMenuImitador;
    private javax.swing.JPanel jPanelOriginal;
    private javax.swing.JRadioButton jRadioButtonOpcion1Espejo;
    private javax.swing.JRadioButton jRadioButtonOpcion1Original;
    private javax.swing.JRadioButton jRadioButtonOpcion2Espejo;
    private javax.swing.JRadioButton jRadioButtonOpcion2Original;
    private javax.swing.JRadioButton jRadioButtonOpcion3Espejo;
    private javax.swing.JRadioButton jRadioButtonOpcion3Original;
    private javax.swing.JSeparator jSeparatorOriginalEspejo;
    private javax.swing.JSpinner jSpinnerEspejo;
    private javax.swing.JSpinner jSpinnerOriginal;
    private javax.swing.JTextField jTextFieldNombreEspejo;
    private javax.swing.JTextField jTextFieldNombreOriginal;
    // End of variables declaration//GEN-END:variables
}
