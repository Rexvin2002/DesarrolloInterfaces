package AccesoProgramas.Ejercicio10_2;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import AccesoProgramas.Ejercicio10_2.Programas.AccesoDeportivo.AccesoDeportivo;
import AccesoProgramas.Ejercicio10_2.Programas.AppMinisterio.AppMinisterio;
import AccesoProgramas.Ejercicio10_2.Programas.Imitador.Imitador;
import AccesoProgramas.Ejercicio10_2.Programas.MezcladorNombres.Mezclador;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class VentanaPrincipal extends javax.swing.JFrame {

    private final Mezclador mn;
    private final AccesoDeportivo ad;
    private final AppMinisterio am;
    private final Imitador i;

    public VentanaPrincipal() {

        initComponents();
        setLocationRelativeTo(null);

        am = new AppMinisterio();
        ad = new AccesoDeportivo();
        mn = new Mezclador();
        i = new Imitador();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 45), new java.awt.Dimension(400, 45), new java.awt.Dimension(400, 45));
        jLabelTitulo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(400, 45), new java.awt.Dimension(400, 45), new java.awt.Dimension(400, 45));
        jLabelTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        jLabelNombre = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        jTextFieldNombre = new javax.swing.JTextField();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jPanel8 = new javax.swing.JPanel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        jLabelApellidos = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jTextFieldApellidos = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelOpciones = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonMezclador = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabelMezclador = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonMinisterio = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabelMinisterio = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonImitador = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabelImitador = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonRegistro = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabelRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selector de ventanas");
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setMaximumSize(new java.awt.Dimension(400, 32767));
        jPanel10.setMinimumSize(new java.awt.Dimension(400, 700));
        jPanel10.setPreferredSize(new java.awt.Dimension(400, 700));
        jPanel10.add(filler4);

        jLabelTitulo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("SELECCIÓN DE APLICACIÓN");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(400, 100));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(400, 100));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel10.add(jLabelTitulo);
        jPanel10.add(filler1);

        jLabelTexto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        jLabelTexto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTexto.setText("        Por favor, introduzca nombre y apellidos:");
        jLabelTexto.setMaximumSize(new java.awt.Dimension(400, 40));
        jLabelTexto.setMinimumSize(new java.awt.Dimension(400, 40));
        jLabelTexto.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel10.add(jLabelTexto);

        jPanel2.setMaximumSize(new java.awt.Dimension(400, 105));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 105));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 105));

        jPanel7.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel7.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));
        jPanel7.add(filler18);

        jLabelNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre ");
        jPanel7.add(jLabelNombre);
        jPanel7.add(filler13);

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(235, 31));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(235, 31));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(235, 31));
        jPanel7.add(jTextFieldNombre);
        jPanel7.add(filler16);

        jPanel2.add(jPanel7);

        jPanel8.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel8.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));
        jPanel8.add(filler19);

        jLabelApellidos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Apellidos");
        jPanel8.add(jLabelApellidos);
        jPanel8.add(filler17);

        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(235, 31));
        jTextFieldApellidos.setMinimumSize(new java.awt.Dimension(235, 31));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(235, 31));
        jPanel8.add(jTextFieldApellidos);

        jPanel2.add(jPanel8);

        jPanel10.add(jPanel2);

        getContentPane().add(jPanel10);

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(700, 700));

        jPanel11.setMaximumSize(new java.awt.Dimension(700, 444444444));
        jPanel11.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(700, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 250));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 250));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jLabelOpciones.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOpciones.setText("     Opciones");
        jLabelOpciones.setMaximumSize(new java.awt.Dimension(400, 16));
        jLabelOpciones.setMinimumSize(new java.awt.Dimension(400, 16));
        jLabelOpciones.setPreferredSize(new java.awt.Dimension(400, 20));
        jPanel1.add(jLabelOpciones);

        jPanel5.setMaximumSize(new java.awt.Dimension(350, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(350, 50));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jButtonMezclador.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jButtonMezclador.setText("ACCEDER");
        jButtonMezclador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezcladorActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonMezclador);
        jPanel5.add(filler7);

        jLabelMezclador.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelMezclador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMezclador.setText("Mezclador de Nombres");
        jPanel5.add(jLabelMezclador);

        jPanel1.add(jPanel5);

        jPanel4.setMaximumSize(new java.awt.Dimension(350, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(350, 50));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jButtonMinisterio.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jButtonMinisterio.setText("ACCEDER");
        jButtonMinisterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinisterioActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonMinisterio);
        jPanel4.add(filler8);

        jLabelMinisterio.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelMinisterio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinisterio.setText("App Ministerio");
        jPanel4.add(jLabelMinisterio);

        jPanel1.add(jPanel4);

        jPanel6.setMaximumSize(new java.awt.Dimension(350, 50));
        jPanel6.setMinimumSize(new java.awt.Dimension(350, 50));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jButtonImitador.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jButtonImitador.setText("ACCEDER");
        jButtonImitador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImitadorActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonImitador);
        jPanel6.add(filler10);

        jLabelImitador.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelImitador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImitador.setText("Imitador");
        jPanel6.add(jLabelImitador);

        jPanel1.add(jPanel6);

        jPanel3.setMaximumSize(new java.awt.Dimension(350, 50));
        jPanel3.setMinimumSize(new java.awt.Dimension(350, 50));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 50));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jButtonRegistro.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jButtonRegistro.setText("ACCEDER");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRegistro);
        jPanel3.add(filler9);

        jLabelRegistro.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setText("Registro Deportivo");
        jPanel3.add(jLabelRegistro);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMezcladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezcladorActionPerformed
        abrirVentana(mn, "Mezclador de Nombres");
    }//GEN-LAST:event_jButtonMezcladorActionPerformed

    private void jButtonMinisterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinisterioActionPerformed
        abrirVentana(am, "App Ministerio");
    }//GEN-LAST:event_jButtonMinisterioActionPerformed

    private void jButtonImitadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImitadorActionPerformed
        abrirVentana(i, "Imitador");
    }//GEN-LAST:event_jButtonImitadorActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        abrirVentana(ad, "Acceso Deportivo");
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    // Método para abrir un JInternalFrame dentro del jDesktopPane1 y centrarlo
    private void abrirVentana(JFrame frame, String titulo) {
        // Verificar si ya existe un JInternalFrame con el mismo título
        for (JInternalFrame existingFrame : jDesktopPane1.getAllFrames()) {
            if (existingFrame.getTitle().equals(titulo)) {
                try {
                    // Restaurar la ventana si está minimizada
                    if (existingFrame.isIcon()) {
                        existingFrame.setIcon(false);
                    }
                    // Seleccionar la ventana existente
                    existingFrame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    System.err.println("Error: " + e.getMessage());
                }
                return; // Salir del método para evitar abrir una nueva ventana
            }
        }

        // Crear un nuevo JInternalFrame si no existe uno con el mismo título
        JInternalFrame internalFrame = new JInternalFrame(titulo, true, true, true, true);
        internalFrame.setSize(frame.getWidth(), frame.getHeight());

        // Calcular posición para centrar el JInternalFrame
        int x = (jDesktopPane1.getWidth() - internalFrame.getWidth()) / 2;
        int y = (jDesktopPane1.getHeight() - internalFrame.getHeight()) / 2;
        internalFrame.setLocation(x, y);

        // Agregar el contenido de JFrame al JInternalFrame
        internalFrame.setContentPane(frame.getContentPane());

        // Agregar el JMenuBar del JFrame al JInternalFrame
        if (frame.getJMenuBar() != null) {
            internalFrame.setJMenuBar(frame.getJMenuBar());
        }

        internalFrame.setVisible(true);

        // Añadir el JInternalFrame al jDesktopPane1
        jDesktopPane1.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            System.err.println("Error: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButtonImitador;
    private javax.swing.JButton jButtonMezclador;
    private javax.swing.JButton jButtonMinisterio;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelImitador;
    private javax.swing.JLabel jLabelMezclador;
    private javax.swing.JLabel jLabelMinisterio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelOpciones;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
