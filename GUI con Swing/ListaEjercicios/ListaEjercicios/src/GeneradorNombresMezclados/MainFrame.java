package GeneradorNombresMezclados;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JScrollPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class MainFrame extends javax.swing.JFrame {

    private Error e;

    public MainFrame() {
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelPrimerNombre = new javax.swing.JLabel();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jLabelNombresMezclados = new javax.swing.JLabel();
        jTextFieldPrimerNombre = new javax.swing.JTextField();
        jTextFieldSegundoNombre = new javax.swing.JTextField();
        jButtonMezclar = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneNombresMezclados = new javax.swing.JTextPane();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mezclador de nombres");

        jLabelTitulo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelTitulo.setText("MEZCLADORA DE NOMBRES DE PAREJA");

        jLabelPrimerNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrimerNombre.setText("Ingresa el primer nombre:");

        jLabelSegundoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSegundoNombre.setText("Ingresa el segundo nombre:");

        jLabelNombresMezclados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombresMezclados.setText("Estos son posibles nombres mezclados:");

        jButtonMezclar.setText("MEZCLAR");
        jButtonMezclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarActionPerformed(evt);
            }
        });

        jButtonReiniciar.setText("REINICIAR");
        jButtonReiniciar.setEnabled(false);
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jTextPaneNombresMezclados.setEditable(false);
        jTextPaneNombresMezclados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextPaneNombresMezclados.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane3.setViewportView(jTextPaneNombresMezclados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSegundoNombre)
                                .addComponent(jLabelPrimerNombre)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonMezclar)
                                    .addComponent(jLabelNombresMezclados)))
                            .addGap(157, 157, 157))
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonReiniciar)
                        .addGap(154, 154, 154)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrimerNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSegundoNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMezclar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombresMezclados)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReiniciar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMezclar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelNombresMezclados;
    private javax.swing.JLabel jLabelPrimerNombre;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldPrimerNombre;
    public javax.swing.JTextField jTextFieldSegundoNombre;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPaneNombresMezclados;
    // End of variables declaration//GEN-END:variables
}
