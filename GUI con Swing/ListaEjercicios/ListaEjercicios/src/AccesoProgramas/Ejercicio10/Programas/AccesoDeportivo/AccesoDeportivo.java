package AccesoProgramas.Ejercicio10.Programas.AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import AccesoProgramas.Ejercicio10.Menu;
import java.awt.BorderLayout;

public class AccesoDeportivo extends javax.swing.JFrame {

    private Error e;
    private final String USUARIO = "user";
    private final String CONTRASEÑA = "passwd";
    private Registro r;

    public AccesoDeportivo() {
        initComponents();
        setLocationRelativeTo(null);

        Menu m = new Menu(this);
        m.setSize(340, 50);
        
        jPanelMenuDeportivo.removeAll();
        jPanelMenuDeportivo.add(m, BorderLayout.CENTER);
        jPanelMenuDeportivo.revalidate();
        jPanelMenuDeportivo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuDeportivo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jToggleButtonAcceder = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso Deportivo");
        setMaximumSize(new java.awt.Dimension(340, 300));
        setMinimumSize(new java.awt.Dimension(340, 300));
        setPreferredSize(new java.awt.Dimension(340, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(340, 300));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanelMenuDeportivo.setMaximumSize(new java.awt.Dimension(340, 50));
        jPanelMenuDeportivo.setMinimumSize(new java.awt.Dimension(340, 50));
        jPanelMenuDeportivo.setPreferredSize(new java.awt.Dimension(340, 50));

        javax.swing.GroupLayout jPanelMenuDeportivoLayout = new javax.swing.GroupLayout(jPanelMenuDeportivo);
        jPanelMenuDeportivo.setLayout(jPanelMenuDeportivoLayout);
        jPanelMenuDeportivoLayout.setHorizontalGroup(
            jPanelMenuDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanelMenuDeportivoLayout.setVerticalGroup(
            jPanelMenuDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMenuDeportivo);

        jPanel4.setMaximumSize(new java.awt.Dimension(340, 60));
        jPanel4.setMinimumSize(new java.awt.Dimension(340, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("ACCESO DEPORTIVO");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(340, 60));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(340, 60));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanel4.add(jLabelTitulo);

        getContentPane().add(jPanel4);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(310, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(310, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(310, 100));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jPanel2.setMaximumSize(new java.awt.Dimension(290, 32));
        jPanel2.setMinimumSize(new java.awt.Dimension(290, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 32));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jLabelUsuario.setText("Nombre Usuario:");
        jLabelUsuario.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelUsuario.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelUsuario.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel2.add(jLabelUsuario);

        jTextFieldUsuario.setMaximumSize(new java.awt.Dimension(180, 22));
        jTextFieldUsuario.setMinimumSize(new java.awt.Dimension(180, 22));
        jTextFieldUsuario.setPreferredSize(new java.awt.Dimension(180, 22));
        jPanel2.add(jTextFieldUsuario);

        jPanel1.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(290, 32));
        jPanel3.setMinimumSize(new java.awt.Dimension(290, 32));
        jPanel3.setPreferredSize(new java.awt.Dimension(290, 32));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jLabelContraseña.setText("Contraseña:");
        jLabelContraseña.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabelContraseña.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabelContraseña.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel3.add(jLabelContraseña);

        jPasswordFieldContraseña.setMaximumSize(new java.awt.Dimension(180, 22));
        jPasswordFieldContraseña.setMinimumSize(new java.awt.Dimension(180, 22));
        jPasswordFieldContraseña.setPreferredSize(new java.awt.Dimension(180, 22));
        jPanel3.add(jPasswordFieldContraseña);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1);

        jPanel5.setMaximumSize(new java.awt.Dimension(340, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(340, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(340, 50));

        jToggleButtonAcceder.setText("Acceder");
        jToggleButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButtonAcceder)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButtonAcceder)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAccederActionPerformed
        char[] passwordIngresada = this.jPasswordFieldContraseña.getPassword();
        String contraseñaIngresada = new String(passwordIngresada);

        if (this.jTextFieldUsuario.getText().isEmpty()
                || this.jPasswordFieldContraseña.getPassword().length == 0
                || !this.jTextFieldUsuario.getText().equals(this.USUARIO)
                || !contraseñaIngresada.equals(this.CONTRASEÑA)) {

            e = new Error(this, true, "El usuario o la contraseña son incorrectos.");
            e.setVisible(true);

        } else {
            dispose();
            r = new Registro(this, true);
            r.setVisible(true);
        }

    }//GEN-LAST:event_jToggleButtonAccederActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new AccesoDeportivo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelMenuDeportivo;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JToggleButton jToggleButtonAcceder;
    // End of variables declaration//GEN-END:variables
}
