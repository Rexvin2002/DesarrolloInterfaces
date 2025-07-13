package crudof;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JOptionPane;

public class AñadirModificar extends javax.swing.JDialog {

    private final VentanaPrincipal VENTANAPRINCIPAL;

    public AñadirModificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.VENTANAPRINCIPAL = (VentanaPrincipal) parent;
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelMes = new javax.swing.JLabel();
        jTextFieldMes = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabelMembresia = new javax.swing.JLabel();
        jTextFieldMembresia = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel5.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Añadir / Modificar Socio");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel5.add(jLabelTitulo);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 45));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 45));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 45));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabelNombre.setText("Nombre:");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(70, 25));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(70, 25));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel1.add(jLabelNombre);

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(jTextFieldNombre);

        jPanel5.add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 45));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 45));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 45));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabelEdad.setText("Edad:");
        jLabelEdad.setMaximumSize(new java.awt.Dimension(70, 25));
        jLabelEdad.setMinimumSize(new java.awt.Dimension(70, 25));
        jLabelEdad.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel2.add(jLabelEdad);

        jTextFieldEdad.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextFieldEdad.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextFieldEdad.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel2.add(jTextFieldEdad);

        jPanel5.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(500, 45));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 45));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 45));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabelMes.setText("Mes:");
        jLabelMes.setMaximumSize(new java.awt.Dimension(70, 25));
        jLabelMes.setMinimumSize(new java.awt.Dimension(70, 25));
        jLabelMes.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel3.add(jLabelMes);

        jTextFieldMes.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextFieldMes.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextFieldMes.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel3.add(jTextFieldMes);

        jPanel5.add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(500, 45));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 45));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 45));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jLabelMembresia.setText("Membresia:");
        jLabelMembresia.setMaximumSize(new java.awt.Dimension(70, 25));
        jLabelMembresia.setMinimumSize(new java.awt.Dimension(70, 25));
        jLabelMembresia.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel4.add(jLabelMembresia);

        jTextFieldMembresia.setMaximumSize(new java.awt.Dimension(200, 25));
        jTextFieldMembresia.setMinimumSize(new java.awt.Dimension(200, 25));
        jTextFieldMembresia.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel4.add(jTextFieldMembresia);

        jPanel5.add(jPanel4);

        jPanel6.setMaximumSize(new java.awt.Dimension(500, 45));
        jPanel6.setMinimumSize(new java.awt.Dimension(500, 45));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 45));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 10));

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(120, 25));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(120, 25));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonCancelar);

        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setMaximumSize(new java.awt.Dimension(120, 25));
        jButtonAceptar.setMinimumSize(new java.awt.Dimension(120, 25));
        jButtonAceptar.setPreferredSize(new java.awt.Dimension(120, 25));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonAceptar);

        jPanel5.add(jPanel6);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.jTextFieldNombre.setText("");
        this.jTextFieldEdad.setText("");
        this.jTextFieldMes.setText("");
        this.jTextFieldMembresia.setText("");
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        if ("Añadir Socio".equals(this.getTitle())) {

            // Verificar si algún campo está vacío
            if (jTextFieldNombre.getText().isEmpty() || jTextFieldEdad.getText().isEmpty()
                    || jTextFieldMes.getText().isEmpty() || jTextFieldMembresia.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.WARNING_MESSAGE);
                return; // Salir del método si algún campo está vacío

            }

            this.VENTANAPRINCIPAL.addSocio(this.jTextFieldNombre.getText(), Integer.parseInt(this.jTextFieldEdad.getText()), Double.parseDouble(jTextFieldMes.getText()), jTextFieldMembresia.getText());

        } else {

            // En el caso de "update", rellenar los campos vacíos con los valores actuales
            if (jTextFieldNombre.getText().isEmpty()) {

                jTextFieldNombre.setText(VENTANAPRINCIPAL.getSelectedSocioName()); // obtener nombre actual del socio

            }
            if (jTextFieldEdad.getText().isEmpty()) {

                jTextFieldEdad.setText(String.valueOf(VENTANAPRINCIPAL.getSelectedSocioAge())); // obtener edad actual del socio

            }
            if (jTextFieldMes.getText().isEmpty()) {

                jTextFieldMes.setText(String.valueOf(VENTANAPRINCIPAL.getSelectedSocioMensualidad())); // obtener mes actual del socio

            }
            if (jTextFieldMembresia.getText().isEmpty()) {

                jTextFieldMembresia.setText(VENTANAPRINCIPAL.getSelectedSocioTipoMembresia()); // obtener membresía actual del socio

            }

            this.VENTANAPRINCIPAL.updateSocio(this.jTextFieldNombre.getText(), Integer.parseInt(this.jTextFieldEdad.getText()), Double.parseDouble(jTextFieldMes.getText()), jTextFieldMembresia.getText());

        }

        this.VENTANAPRINCIPAL.storeOriginalData();
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
            java.util.logging.Logger.getLogger(AñadirModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            AñadirModificar dialog = new AñadirModificar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelMembresia;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldMembresia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
