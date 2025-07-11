package AccesoProgramas.Ejercicio10.Programas.AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Frame;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JDialog {

    private Exito ex;
    private final Error ER;
    private AñadirHijo ah;
    public static LogicaPersonas logicaPersonas = new LogicaPersonas();
    private AccesoDeportivo ad;

    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        refrescarTabla();

        ER = new Error((Frame) this.getParent(), true, "Por favor complete todos los campos.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelSeleccionDeporte = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelDeporte = new javax.swing.JLabel();
        jComboBoxDeportes = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabelNivel = new javax.swing.JLabel();
        jSpinnerNivel = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabelTurno = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabelRenovación = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButtonTarde = new javax.swing.JRadioButton();
        jRadioButtonMañana = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jCheckBoxTrimestral = new javax.swing.JCheckBox();
        jCheckBoxAnual = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelHijos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonVerOcultaTabla = new javax.swing.JButton();
        jButtonAñadirHijo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jButtonMatricular = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Deportivo");
        setMaximumSize(new java.awt.Dimension(500, 680));
        setMinimumSize(new java.awt.Dimension(500, 680));
        setPreferredSize(new java.awt.Dimension(500, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 680));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO DEPORTIVO");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(480, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(480, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(480, 50));
        getContentPane().add(jLabelTitulo);

        jPanelSeleccionDeporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección deporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanelSeleccionDeporte.setMaximumSize(new java.awt.Dimension(480, 99999));
        jPanelSeleccionDeporte.setMinimumSize(new java.awt.Dimension(480, 500));
        jPanelSeleccionDeporte.setPreferredSize(new java.awt.Dimension(480, 500));
        jPanelSeleccionDeporte.setLayout(new javax.swing.BoxLayout(jPanelSeleccionDeporte, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 32));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 32));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 32));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel6.setMaximumSize(new java.awt.Dimension(225, 32));
        jPanel6.setMinimumSize(new java.awt.Dimension(225, 32));
        jPanel6.setPreferredSize(new java.awt.Dimension(225, 32));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelDeporte.setText("Deporte");
        jPanel6.add(jLabelDeporte);

        jComboBoxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Padel", "Squash" }));
        jComboBoxDeportes.setMaximumSize(new java.awt.Dimension(150, 22));
        jComboBoxDeportes.setMinimumSize(new java.awt.Dimension(150, 22));
        jComboBoxDeportes.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel6.add(jComboBoxDeportes);

        jPanel1.add(jPanel6);

        jPanel7.setMaximumSize(new java.awt.Dimension(225, 32));
        jPanel7.setMinimumSize(new java.awt.Dimension(225, 32));
        jPanel7.setPreferredSize(new java.awt.Dimension(225, 32));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelNivel.setText("Nivel");
        jPanel7.add(jLabelNivel);

        jSpinnerNivel.setModel(new javax.swing.SpinnerListModel(new String[] {"Inicial", "Medio", "Avanzado", "Profesional"}));
        jSpinnerNivel.setMaximumSize(new java.awt.Dimension(150, 22));
        jSpinnerNivel.setMinimumSize(new java.awt.Dimension(150, 22));
        jSpinnerNivel.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel7.add(jSpinnerNivel);

        jPanel1.add(jPanel7);

        jPanelSeleccionDeporte.add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(450, 85));
        jPanel2.setMinimumSize(new java.awt.Dimension(450, 85));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 85));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel4.setMaximumSize(new java.awt.Dimension(450, 32));
        jPanel4.setMinimumSize(new java.awt.Dimension(450, 32));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 32));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel11.setMaximumSize(new java.awt.Dimension(225, 32));
        jPanel11.setMinimumSize(new java.awt.Dimension(225, 32));
        jPanel11.setPreferredSize(new java.awt.Dimension(225, 32));

        jLabelTurno.setText(" Turno");
        jLabelTurno.setMaximumSize(new java.awt.Dimension(225, 25));
        jLabelTurno.setMinimumSize(new java.awt.Dimension(225, 25));
        jLabelTurno.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel11.add(jLabelTurno);

        jPanel4.add(jPanel11);

        jPanel12.setMaximumSize(new java.awt.Dimension(225, 32));
        jPanel12.setMinimumSize(new java.awt.Dimension(225, 32));
        jPanel12.setPreferredSize(new java.awt.Dimension(225, 32));

        jLabelRenovación.setText(" Renovación");
        jLabelRenovación.setMaximumSize(new java.awt.Dimension(225, 25));
        jLabelRenovación.setMinimumSize(new java.awt.Dimension(225, 25));
        jLabelRenovación.setPreferredSize(new java.awt.Dimension(225, 25));
        jPanel12.add(jLabelRenovación);

        jPanel4.add(jPanel12);

        jPanel2.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(450, 65));
        jPanel5.setMinimumSize(new java.awt.Dimension(450, 65));
        jPanel5.setPreferredSize(new java.awt.Dimension(450, 65));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel8.setMaximumSize(new java.awt.Dimension(225, 65));
        jPanel8.setMinimumSize(new java.awt.Dimension(225, 65));
        jPanel8.setPreferredSize(new java.awt.Dimension(225, 65));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        buttonGroup1.add(jRadioButtonTarde);
        jRadioButtonTarde.setText("Tarde");
        jRadioButtonTarde.setMaximumSize(new java.awt.Dimension(180, 21));
        jRadioButtonTarde.setMinimumSize(new java.awt.Dimension(180, 21));
        jRadioButtonTarde.setPreferredSize(new java.awt.Dimension(180, 21));
        jPanel8.add(jRadioButtonTarde);

        buttonGroup1.add(jRadioButtonMañana);
        jRadioButtonMañana.setText("Mañana");
        jRadioButtonMañana.setMaximumSize(new java.awt.Dimension(180, 21));
        jRadioButtonMañana.setMinimumSize(new java.awt.Dimension(180, 21));
        jRadioButtonMañana.setPreferredSize(new java.awt.Dimension(180, 21));
        jPanel8.add(jRadioButtonMañana);

        jPanel5.add(jPanel8);

        jPanel9.setMaximumSize(new java.awt.Dimension(225, 65));
        jPanel9.setMinimumSize(new java.awt.Dimension(225, 65));
        jPanel9.setPreferredSize(new java.awt.Dimension(225, 65));

        jCheckBoxTrimestral.setText("Trimestral");
        jCheckBoxTrimestral.setMaximumSize(new java.awt.Dimension(180, 21));
        jCheckBoxTrimestral.setMinimumSize(new java.awt.Dimension(180, 21));
        jCheckBoxTrimestral.setPreferredSize(new java.awt.Dimension(180, 21));
        jPanel9.add(jCheckBoxTrimestral);

        jCheckBoxAnual.setText("Anual");
        jCheckBoxAnual.setMaximumSize(new java.awt.Dimension(180, 21));
        jCheckBoxAnual.setMinimumSize(new java.awt.Dimension(180, 21));
        jCheckBoxAnual.setPreferredSize(new java.awt.Dimension(180, 21));
        jPanel9.add(jCheckBoxAnual);

        jPanel5.add(jPanel9);

        jPanel2.add(jPanel5);

        jPanelSeleccionDeporte.add(jPanel2);

        jPanel10.setMaximumSize(new java.awt.Dimension(450, 23));
        jPanel10.setMinimumSize(new java.awt.Dimension(450, 23));
        jPanel10.setPreferredSize(new java.awt.Dimension(450, 23));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jSeparator1.setMaximumSize(new java.awt.Dimension(450, 3));
        jSeparator1.setMinimumSize(new java.awt.Dimension(450, 3));
        jSeparator1.setPreferredSize(new java.awt.Dimension(450, 3));
        jPanel10.add(jSeparator1);

        jPanelSeleccionDeporte.add(jPanel10);

        jPanelHijos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hijos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanelHijos.setMaximumSize(new java.awt.Dimension(450, 99999));
        jPanelHijos.setMinimumSize(new java.awt.Dimension(450, 200));
        jPanelHijos.setPreferredSize(new java.awt.Dimension(450, 200));

        jPanel3.setMaximumSize(new java.awt.Dimension(428, 23));
        jPanel3.setMinimumSize(new java.awt.Dimension(428, 23));
        jPanel3.setPreferredSize(new java.awt.Dimension(428, 23));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 200, 0));

        jButtonVerOcultaTabla.setText("Ver tabla");
        jButtonVerOcultaTabla.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonVerOcultaTabla.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonVerOcultaTabla.setPreferredSize(new java.awt.Dimension(100, 23));
        jButtonVerOcultaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerOcultaTablaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonVerOcultaTabla);

        jButtonAñadirHijo.setText("Añadir Hijo");
        jButtonAñadirHijo.setMaximumSize(new java.awt.Dimension(100, 23));
        jButtonAñadirHijo.setMinimumSize(new java.awt.Dimension(100, 23));
        jButtonAñadirHijo.setPreferredSize(new java.awt.Dimension(100, 23));
        jButtonAñadirHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirHijoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAñadirHijo);

        jPanelHijos.add(jPanel3);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(430, 250));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(430, 250));
        jScrollPane2.setRequestFocusEnabled(false);

        jTableTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTabla.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jTableTabla.setMinimumSize(new java.awt.Dimension(430, 250));
        jTableTabla.setPreferredSize(new java.awt.Dimension(430, 250));
        jTableTabla.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(jTableTabla);

        jPanelHijos.add(jScrollPane2);

        jPanelSeleccionDeporte.add(jPanelHijos);

        getContentPane().add(jPanelSeleccionDeporte);

        jButtonMatricular.setText("MATRICULAR");
        jButtonMatricular.setMaximumSize(new java.awt.Dimension(480, 23));
        jButtonMatricular.setMinimumSize(new java.awt.Dimension(480, 23));
        jButtonMatricular.setPreferredSize(new java.awt.Dimension(480, 23));
        jButtonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatricularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMatricular);

        jButtonVolver.setText("VOLVER");
        jButtonVolver.setMaximumSize(new java.awt.Dimension(480, 23));
        jButtonVolver.setMinimumSize(new java.awt.Dimension(480, 23));
        jButtonVolver.setPreferredSize(new java.awt.Dimension(480, 23));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refrescarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{"Nombre", "Apellidos", "Fecha", "Deporte", "Nivel"});
        jTableTabla.setModel(modeloTabla);

        // Coje la lista de la clase LogicaNegocio y añade los clientes a la tabla
        List<Persona> listaPersonas = logicaPersonas.getListaPersonas();
        for (Persona persona : listaPersonas) {
            modeloTabla.addRow(persona.toArrayString());
        }

        jTableTabla.setVisible(false);
        jScrollPane2.setVisible(false);
        this.revalidate();
        this.repaint();

    }

    private void jButtonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatricularActionPerformed

        if (buttonGroup1.getSelection() == null) {
            ER.setVisible(true);

        } else if (!jCheckBoxAnual.isSelected() && !jCheckBoxTrimestral.isSelected()) {
            ER.setVisible(true);

        } else {
            ex = new Exito((Frame) this.getParent(), true);
            ex.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jButtonMatricularActionPerformed

    private void jButtonVerOcultaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerOcultaTablaActionPerformed

        // Verifica si la tabla está actualmente visible
        if (jScrollPane2.isVisible()) {
            // Si es visible, ocúltala
            jScrollPane2.setVisible(false);
            jTableTabla.setVisible(false);
            jButtonVerOcultaTabla.setText("Ver tabla"); // Cambia el texto del botón
        } else {
            // Si no es visible, muéstrala
            jScrollPane2.setVisible(true);
            jTableTabla.setVisible(true);
            jButtonVerOcultaTabla.setText("Ocultar tabla"); // Cambia el texto del botón
        }

        // Actualiza el layout para reflejar los cambios
        revalidate();
        repaint();
    }//GEN-LAST:event_jButtonVerOcultaTablaActionPerformed

    private void jButtonAñadirHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirHijoActionPerformed
        // dispose();
        ah = new AñadirHijo((Frame) getParent(), true);
        ah.setVisible(true);
        refrescarTabla();
    }//GEN-LAST:event_jButtonAñadirHijoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
        ad = new AccesoDeportivo();
        ad.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Registro dialog = new Registro(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAñadirHijo;
    private javax.swing.JButton jButtonMatricular;
    private javax.swing.JButton jButtonVerOcultaTabla;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxAnual;
    private javax.swing.JCheckBox jCheckBoxTrimestral;
    private javax.swing.JComboBox<String> jComboBoxDeportes;
    private javax.swing.JLabel jLabelDeporte;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelRenovación;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTurno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelHijos;
    private javax.swing.JPanel jPanelSeleccionDeporte;
    private javax.swing.JRadioButton jRadioButtonMañana;
    private javax.swing.JRadioButton jRadioButtonTarde;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerNivel;
    private javax.swing.JTable jTableTabla;
    // End of variables declaration//GEN-END:variables
}
