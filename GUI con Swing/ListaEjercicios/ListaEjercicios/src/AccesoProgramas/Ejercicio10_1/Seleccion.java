package AccesoProgramas.Ejercicio10_1;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Seleccion extends javax.swing.JFrame {

    public Seleccion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonDeportivo = new javax.swing.JButton();
        jLabelDeportivo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonMinisterio = new javax.swing.JButton();
        jLabelMinisterio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonImitador = new javax.swing.JButton();
        jLabelImitador = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonMezclador = new javax.swing.JButton();
        jLabelMezclador = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos para uno y uno para todos");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jButtonDeportivo.setText("ACCEDER");
        jButtonDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeportivoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDeportivo);

        jLabelDeportivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDeportivo.setText("Registro deportivo");
        jLabelDeportivo.setMaximumSize(new java.awt.Dimension(250, 50));
        jLabelDeportivo.setMinimumSize(new java.awt.Dimension(250, 50));
        jLabelDeportivo.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel2.add(jLabelDeportivo);

        jPanel1.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jButtonMinisterio.setText("ACCEDER");
        jButtonMinisterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinisterioActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonMinisterio);

        jLabelMinisterio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMinisterio.setText("App Ministerio");
        jLabelMinisterio.setMaximumSize(new java.awt.Dimension(250, 50));
        jLabelMinisterio.setMinimumSize(new java.awt.Dimension(250, 50));
        jLabelMinisterio.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel3.add(jLabelMinisterio);

        jPanel1.add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jButtonImitador.setText("ACCEDER");
        jButtonImitador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImitadorActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonImitador);

        jLabelImitador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelImitador.setText("Imitador");
        jLabelImitador.setMaximumSize(new java.awt.Dimension(250, 50));
        jLabelImitador.setMinimumSize(new java.awt.Dimension(250, 50));
        jLabelImitador.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel4.add(jLabelImitador);

        jPanel1.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel5.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jButtonMezclador.setText("ACCEDER");
        jButtonMezclador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezcladorActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonMezclador);

        jLabelMezclador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMezclador.setText("Mezclador de Nombres");
        jLabelMezclador.setMaximumSize(new java.awt.Dimension(250, 50));
        jLabelMezclador.setMinimumSize(new java.awt.Dimension(250, 50));
        jLabelMezclador.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel5.add(jLabelMezclador);

        jPanel1.add(jPanel5);

        jPanel6.setMaximumSize(new java.awt.Dimension(500, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(500, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 40));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(100, 40));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(100, 40));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel6.add(jLabelNombre);

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(250, 22));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(250, 22));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel6.add(jTextFieldNombre);

        jPanel1.add(jPanel6);

        jPanel7.setMaximumSize(new java.awt.Dimension(500, 40));
        jPanel7.setMinimumSize(new java.awt.Dimension(500, 40));
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabelApellidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelApellidos.setText("Apellidos:");
        jLabelApellidos.setMaximumSize(new java.awt.Dimension(100, 40));
        jLabelApellidos.setMinimumSize(new java.awt.Dimension(100, 40));
        jLabelApellidos.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel7.add(jLabelApellidos);

        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(250, 22));
        jTextFieldApellidos.setMinimumSize(new java.awt.Dimension(250, 22));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel7.add(jTextFieldApellidos);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinisterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinisterioActionPerformed
        ejecutarJar("src\\AccesoProgramas\\Ejercicio10_1\\Programas\\AppMinisterio.jar");
    }//GEN-LAST:event_jButtonMinisterioActionPerformed

    private void jButtonDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeportivoActionPerformed
        ejecutarJar("src\\AccesoProgramas\\Ejercicio10_1\\Programas\\AccesoDeportivo.jar");
    }//GEN-LAST:event_jButtonDeportivoActionPerformed

    private void jButtonMezcladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezcladorActionPerformed
        ejecutarJar("src\\AccesoProgramas\\Ejercicio10_1\\Programas\\MezcladorNombres.jar");
    }//GEN-LAST:event_jButtonMezcladorActionPerformed

    private void jButtonImitadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImitadorActionPerformed
        ejecutarJar("src\\AccesoProgramas\\Ejercicio10_1\\Programas\\Imitador.jar");
    }//GEN-LAST:event_jButtonImitadorActionPerformed

    private void ejecutarJar(String nombreJar) {
        String nombre = jTextFieldNombre.getText().trim();
        String apellidos = jTextFieldApellidos.getText().trim();

        // Verify JAR exists
        File jarFile = new File(nombreJar);
        if (!jarFile.exists()) {
            JOptionPane.showMessageDialog(this,
                    "El archivo " + nombreJar + " no se encuentra",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Build command safely
        List<String> command = new ArrayList<>();
        command.add("java");
        command.add("-jar");
        command.add(nombreJar);

        if (!nombre.isEmpty()) {
            command.add(nombre);
        }
        if (!apellidos.isEmpty()) {
            command.add(apellidos);
        }

        try {
            new ProcessBuilder(command).start();
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al ejecutar: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Seleccion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeportivo;
    private javax.swing.JButton jButtonImitador;
    private javax.swing.JButton jButtonMezclador;
    private javax.swing.JButton jButtonMinisterio;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDeportivo;
    private javax.swing.JLabel jLabelImitador;
    private javax.swing.JLabel jLabelMezclador;
    private javax.swing.JLabel jLabelMinisterio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
