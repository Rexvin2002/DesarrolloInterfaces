
package Unidad01.ListaEjercicios.Ejercicio04;

import Unidad01.ListaEjercicios.Ejercicio05.Error;
import Unidad01.ListaEjercicios.Ejercicio10_2.Menu;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author kgv17
 */
public class Mezclador extends javax.swing.JFrame {

    private Error e;
    
    /**
     * Creates new form MezcladorNombre
     */
    public Mezclador() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        // Si jTextAreaMensaje ya está dentro de un JScrollPane, configúralo así:
        JScrollPane scrollPane = (JScrollPane) jTextPaneNombresMezclados.getParent().getParent();

        // Eliminar las barras de desplazamiento
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        Menu m = new Menu();
        m.setSize(427, 40);

        jPanelMezclador.removeAll();
        jPanelMezclador.add(m, BorderLayout.CENTER);
        jPanelMezclador.revalidate();
        jPanelMezclador.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jPanelMezclador = new javax.swing.JPanel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mezclador de Nombres");

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

        jPanelMezclador.setBackground(new java.awt.Color(57, 93, 122));
        jPanelMezclador.setMaximumSize(new java.awt.Dimension(427, 40));
        jPanelMezclador.setMinimumSize(new java.awt.Dimension(427, 40));
        jPanelMezclador.setPreferredSize(new java.awt.Dimension(427, 40));

        javax.swing.GroupLayout jPanelMezcladorLayout = new javax.swing.GroupLayout(jPanelMezclador);
        jPanelMezclador.setLayout(jPanelMezcladorLayout);
        jPanelMezcladorLayout.setHorizontalGroup(
            jPanelMezcladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMezcladorLayout.setVerticalGroup(
            jPanelMezcladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

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
            .addComponent(jPanelMezclador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMezclador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMezclarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMezclarActionPerformed
        if (jTextFieldPrimerNombre.getText().length() < 4 || jTextFieldSegundoNombre.getText().length() < 4) {
            e = new Error(this, true);
            e.setVisible(true);
            jTextFieldPrimerNombre.setText("");
            jTextFieldSegundoNombre.setText("");
        }else{
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

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonReiniciarActionPerformed
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mezclador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mezclador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mezclador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mezclador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mezclador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMezclar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelNombresMezclados;
    private javax.swing.JLabel jLabelPrimerNombre;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelMezclador;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextFieldPrimerNombre;
    public javax.swing.JTextField jTextFieldSegundoNombre;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPaneNombresMezclados;
    // End of variables declaration//GEN-END:variables
}
