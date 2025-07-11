package AccesoProgramas.Ejercicio10.Programas.AppMinisterio;

import appministerio.About;

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
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTexto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelVersionValue = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelVendor = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelHomepage = new javax.swing.JLabel();
        jLabelURL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 300));
        setMinimumSize(new java.awt.Dimension(850, 300));
        setPreferredSize(new java.awt.Dimension(850, 300));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppMinisterio/img/Imagen.png"))); // NOI18N
        jLabelImagen.setMaximumSize(new java.awt.Dimension(150, 200));
        jLabelImagen.setMinimumSize(new java.awt.Dimension(150, 200));
        jLabelImagen.setPreferredSize(new java.awt.Dimension(150, 200));
        getContentPane().add(jLabelImagen);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 220));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 3));

        jPanel8.setMaximumSize(new java.awt.Dimension(600, 35));
        jPanel8.setMinimumSize(new java.awt.Dimension(600, 35));
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 35));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitulo.setText("Ejemplo de aplicación de escritorio");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(600, 25));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(600, 25));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(600, 25));
        jPanel8.add(jLabelTitulo);

        jPanel1.add(jPanel8);

        jPanel3.setMaximumSize(new java.awt.Dimension(600, 50));
        jPanel3.setMinimumSize(new java.awt.Dimension(600, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 50));

        jLabelTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTexto.setText("<html>Aplicacion sencilla basada en swing que se compone de los <br>\nformularios que aparecen por defecto más un diálogo nuevo.</html>");
        jLabelTexto.setMaximumSize(new java.awt.Dimension(400, 40));
        jLabelTexto.setMinimumSize(new java.awt.Dimension(400, 40));
        jLabelTexto.setPreferredSize(new java.awt.Dimension(400, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(600, 25));
        jPanel4.setMinimumSize(new java.awt.Dimension(600, 25));
        jPanel4.setPreferredSize(new java.awt.Dimension(600, 25));

        jLabelVersion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVersion.setText("Product Version: ");

        jLabelVersionValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVersionValue.setText("1.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelVersion)
                .addGap(6, 6, 6)
                .addComponent(jLabelVersionValue, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVersion)
                    .addComponent(jLabelVersionValue))
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel4);

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel5.setMaximumSize(new java.awt.Dimension(600, 25));
        jPanel5.setMinimumSize(new java.awt.Dimension(600, 25));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 25));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabelVendor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVendor.setText("Vendor:");
        jLabelVendor.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabelVendor.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabelVendor.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel5.add(jLabelVendor);

        jLabelVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVendedor.setText("Ministerio de Educación");
        jPanel5.add(jLabelVendedor);

        jPanel2.add(jPanel5);

        jPanel6.setMaximumSize(new java.awt.Dimension(600, 25));
        jPanel6.setMinimumSize(new java.awt.Dimension(600, 25));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 25));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jLabelHomepage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelHomepage.setText("Homepage:");
        jLabelHomepage.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabelHomepage.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabelHomepage.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel6.add(jLabelHomepage);

        jLabelURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelURL.setText("http://www.educacion.gob.es");
        jPanel6.add(jLabelURL);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2);

        jPanel7.setMaximumSize(new java.awt.Dimension(600, 30));
        jPanel7.setMinimumSize(new java.awt.Dimension(600, 30));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCerrar.setText("CERRAR");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonCerrar);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
