
package Unidad01.ListaEjercicios.Ejercicio10;

import Unidad01.ListaEjercicios.Ejercicio04.Mezclador;
import Unidad01.ListaEjercicios.Ejercicio05.AppMinisterio;
import Unidad01.ListaEjercicios.Ejercicio06.AccesoDeportivo;
import Unidad01.ListaEjercicios.Ejercicio09.Imitador;
import javax.swing.JFrame;

/**
 *
 * @author kgv17
 */
public class Seleccion extends javax.swing.JFrame {

    private Mezclador mn;
    private AccesoDeportivo ad;
    private AppMinisterio am;
    private Imitador i;
    
    /**
     * Creates new form Seleccion
     */
    public Seleccion() {
        initComponents();
        setLocationRelativeTo(null);
        am = new AppMinisterio();
        ad = new AccesoDeportivo();
        mn = new Mezclador();
        i = new Imitador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMezclador = new javax.swing.JButton();
        jLabelMezclador = new javax.swing.JLabel();
        jLabelMinisterio = new javax.swing.JLabel();
        jButtonMinisterio = new javax.swing.JButton();
        jButtonDeportivo = new javax.swing.JButton();
        jLabelDeportivo = new javax.swing.JLabel();
        jLabelImitador = new javax.swing.JLabel();
        jButtonImitador = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos para uno y uno para todos");

        jButtonMezclador.setText("ACCEDER");
        jButtonMezclador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezcladorActionPerformed(evt);
            }
        });

        jLabelMezclador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMezclador.setText("Mezclador de Nombres");

        jLabelMinisterio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMinisterio.setText("App Ministerio");

        jButtonMinisterio.setText("ACCEDER");
        jButtonMinisterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinisterioActionPerformed(evt);
            }
        });

        jButtonDeportivo.setText("ACCEDER");
        jButtonDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeportivoActionPerformed(evt);
            }
        });

        jLabelDeportivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDeportivo.setText("Registro deportivo");

        jLabelImitador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelImitador.setText("Imitador");

        jButtonImitador.setText("ACCEDER");
        jButtonImitador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImitadorActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelApellidos.setText("Apellidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMezclador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMinisterio)
                            .addComponent(jLabelDeportivo)
                            .addComponent(jLabelImitador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellidos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonImitador)
                                .addComponent(jButtonDeportivo)
                                .addComponent(jButtonMinisterio)
                                .addComponent(jButtonMezclador))
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMezclador)
                    .addComponent(jLabelMezclador))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMinisterio)
                    .addComponent(jLabelMinisterio))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeportivo)
                    .addComponent(jLabelDeportivo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonImitador)
                    .addComponent(jLabelImitador))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinisterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinisterioActionPerformed
        abrirVentana(am, "App Ministerio");
    }//GEN-LAST:event_jButtonMinisterioActionPerformed

    private void jButtonDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeportivoActionPerformed
        abrirVentana(ad, "Acceso Deportivo");
    }//GEN-LAST:event_jButtonDeportivoActionPerformed

    private void jButtonMezcladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezcladorActionPerformed
        abrirVentana(mn, "Mezclador de Nombres");
    }//GEN-LAST:event_jButtonMezcladorActionPerformed

    private void jButtonImitadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImitadorActionPerformed
        abrirVentana(i, "Imitador");
    }//GEN-LAST:event_jButtonImitadorActionPerformed

    private void abrirVentana(JFrame ventana, String tituloBase) {
        setTitle(getTitle() + ": " + ventana.getTitle());
        ventana.setTitle(tituloBase);

        String nombre = jTextFieldNombre.getText().trim();
        String apellidos = jTextFieldApellidos.getText().trim();

        if (!nombre.isEmpty() || !apellidos.isEmpty()) {
            ventana.setTitle(nombre + " " + apellidos + ": " + ventana.getTitle());
        }

        ventana.setVisible(true);
        dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
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
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}