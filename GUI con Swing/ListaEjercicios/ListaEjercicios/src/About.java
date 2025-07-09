


/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class About extends javax.swing.JDialog {

    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagen = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelVendor = new javax.swing.JLabel();
        jLabelHomepage = new javax.swing.JLabel();
        jLabelURL = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();
        jLabelVersionValue = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad01/ListaEjercicios/Ejercicio04/Imagen.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setText("Ejemplo de aplicación de escritorio");

        jLabelVersion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVersion.setText("Product Version: ");

        jLabelVendor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVendor.setText("Vendor:");

        jLabelHomepage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelHomepage.setText("Homepage");

        jLabelURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelURL.setText("http://www.educacion.gob.es");

        jLabelVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVendedor.setText("Ministerio de Educación");

        jLabelTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTexto.setText("<html>Aplicacion sencilla basada en swing que se compone de los <br>\nformularios que aparecen por defecto más un diálogo nuevo.</html>");

        jLabelVersionValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVersionValue.setText("1.0");

        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCerrar.setText("CERRAR");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelVersion)
                                    .addComponent(jLabelVendor)
                                    .addComponent(jLabelHomepage))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelVendedor)
                                    .addComponent(jLabelVersionValue)
                                    .addComponent(jLabelURL)))
                            .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerrar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelVersion)
                                    .addComponent(jLabelVersionValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelVendedor)
                                    .addComponent(jLabelVendor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelHomepage)
                                    .addComponent(jLabelURL))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCerrar))))
                    .addComponent(jLabelImagen))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            About dialog = new About(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelHomepage;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelURL;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JLabel jLabelVersionValue;
    // End of variables declaration//GEN-END:variables
}
