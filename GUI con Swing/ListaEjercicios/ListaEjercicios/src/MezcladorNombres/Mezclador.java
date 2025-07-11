package MezcladorNombres;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JScrollPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Mezclador extends javax.swing.JFrame {

    private Error e;

    public Mezclador() {
        initComponents();
        setLocationRelativeTo(null);

        // Si jTextAreaMensaje ya está dentro de un JScrollPane, configúralo así:
        JScrollPane scrollPane = (JScrollPane) jTextPaneNombresMezclados.getParent().getParent();

        // Eliminar las barras de desplazamiento
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPrimerNombre = new javax.swing.JLabel();
        jTextFieldPrimerNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jTextFieldSegundoNombre = new javax.swing.JTextField();
        jButtonMezclar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelNombresMezclados = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneNombresMezclados = new javax.swing.JTextPane();
        jButtonReiniciar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mezclador de nombres");
        setMaximumSize(new java.awt.Dimension(450, 500));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(450, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 500));

        jLabelTitulo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("MEZCLADORA DE NOMBRES DE PAREJA");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(450, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(450, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(jLabelTitulo);

        jPanel2.setMaximumSize(new java.awt.Dimension(400, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jLabelPrimerNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrimerNombre.setText("Ingresa el primer nombre:");
        jLabelPrimerNombre.setMaximumSize(new java.awt.Dimension(400, 25));
        jLabelPrimerNombre.setMinimumSize(new java.awt.Dimension(400, 25));
        jLabelPrimerNombre.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel2.add(jLabelPrimerNombre);

        jTextFieldPrimerNombre.setMaximumSize(new java.awt.Dimension(400, 25));
        jTextFieldPrimerNombre.setMinimumSize(new java.awt.Dimension(400, 25));
        jTextFieldPrimerNombre.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel2.add(jTextFieldPrimerNombre);

        jPanel1.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(400, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jLabelSegundoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSegundoNombre.setText("Ingresa el segundo nombre:");
        jLabelSegundoNombre.setMaximumSize(new java.awt.Dimension(400, 25));
        jLabelSegundoNombre.setMinimumSize(new java.awt.Dimension(400, 25));
        jLabelSegundoNombre.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel3.add(jLabelSegundoNombre);

        jTextFieldSegundoNombre.setMaximumSize(new java.awt.Dimension(400, 25));
        jTextFieldSegundoNombre.setMinimumSize(new java.awt.Dimension(400, 25));
        jTextFieldSegundoNombre.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel3.add(jTextFieldSegundoNombre);

        jPanel1.add(jPanel3);

        jButtonMezclar.setText("MEZCLAR");
        jButtonMezclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMezclar);

        jPanel4.setMaximumSize(new java.awt.Dimension(400, 150));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 150));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jLabelNombresMezclados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombresMezclados.setText("Estos son posibles nombres mezclados:");
        jLabelNombresMezclados.setMaximumSize(new java.awt.Dimension(400, 25));
        jLabelNombresMezclados.setMinimumSize(new java.awt.Dimension(400, 25));
        jLabelNombresMezclados.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel4.add(jLabelNombresMezclados);

        jScrollPane3.setMaximumSize(new java.awt.Dimension(400, 90));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(400, 90));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(400, 90));

        jTextPaneNombresMezclados.setEditable(false);
        jTextPaneNombresMezclados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextPaneNombresMezclados.setForeground(new java.awt.Color(0, 0, 204));
        jTextPaneNombresMezclados.setMaximumSize(new java.awt.Dimension(400, 90));
        jTextPaneNombresMezclados.setMinimumSize(new java.awt.Dimension(400, 90));
        jTextPaneNombresMezclados.setPreferredSize(new java.awt.Dimension(400, 90));
        jScrollPane3.setViewportView(jTextPaneNombresMezclados);

        jPanel4.add(jScrollPane3);

        jPanel1.add(jPanel4);

        jButtonReiniciar.setText("REINICIAR");
        jButtonReiniciar.setEnabled(false);
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReiniciar);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMezclarActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldPrimerNombre.getText().length() < 4 || jTextFieldSegundoNombre.getText().length() < 4) {
            e = new Error(this, true);
            e.setVisible(true);
            jTextFieldPrimerNombre.setText("");
            jTextFieldSegundoNombre.setText("");
        } else {
            jTextFieldPrimerNombre.setEnabled(false);
            jTextFieldSegundoNombre.setEnabled(false);
            jButtonMezclar.setFocusPainted(false);
            jButtonMezclar.setEnabled(false);
            jTextPaneNombresMezclados.setEnabled(true);
            jButtonReiniciar.setEnabled(true);

            // Alinear el texto al centro
            StyledDocument doc = jTextPaneNombresMezclados.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);

            MixedNames mn = new MixedNames(jTextFieldPrimerNombre.getText(), jTextFieldSegundoNombre.getText());

            jTextPaneNombresMezclados.setText(mn.generateMixedNames());
        }
    }

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldPrimerNombre.setEnabled(true);
        jTextFieldSegundoNombre.setEnabled(true);
        jButtonMezclar.setEnabled(true);
        jButtonMezclar.setFocusPainted(true);
        jButtonReiniciar.setEnabled(false);
        jTextPaneNombresMezclados.removeAll();
        jTextPaneNombresMezclados.setEnabled(false);
        jTextFieldPrimerNombre.setText("");
        jTextFieldSegundoNombre.setText("");
        jTextPaneNombresMezclados.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mezclador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Mezclador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMezclar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelNombresMezclados;
    private javax.swing.JLabel jLabelPrimerNombre;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldPrimerNombre;
    public javax.swing.JTextField jTextFieldSegundoNombre;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPaneNombresMezclados;
    // End of variables declaration//GEN-END:variables
}
