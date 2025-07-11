package MezcladorNombres;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JScrollPane;

public class Error extends javax.swing.JDialog {

    public Error(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        // Si jTextAreaMensaje ya está dentro de un JScrollPane, configúralo así:
        JScrollPane scrollPane = (JScrollPane) jTextAreaMensaje.getParent().getParent();

        // Eliminar las barras de desplazamiento
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMensaje = new javax.swing.JTextArea();
        jButtonVolver = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERROR");
        setMaximumSize(new java.awt.Dimension(460, 220));
        setMinimumSize(new java.awt.Dimension(460, 220));
        setPreferredSize(new java.awt.Dimension(460, 220));
        setSize(new java.awt.Dimension(450, 220));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(460, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(460, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 220));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(410, 100));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(410, 100));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(410, 100));

        jTextAreaMensaje.setEditable(false);
        jTextAreaMensaje.setColumns(20);
        jTextAreaMensaje.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextAreaMensaje.setLineWrap(true);
        jTextAreaMensaje.setRows(5);
        jTextAreaMensaje.setText("Los nombres de la pareja deben contener como mínimo 4 letras, sino, no habrá amor");
        jTextAreaMensaje.setMaximumSize(new java.awt.Dimension(410, 100));
        jTextAreaMensaje.setMinimumSize(new java.awt.Dimension(410, 100));
        jTextAreaMensaje.setPreferredSize(new java.awt.Dimension(410, 100));
        jScrollPane2.setViewportView(jTextAreaMensaje);

        jPanel1.add(jScrollPane2);

        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Error dialog = new Error(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaMensaje;
    // End of variables declaration//GEN-END:variables
}
