
package Unidad01.Ejemplo04.EjemploCorregido;

import java.awt.Dimension;

/**
 *
 * @author kgv17
 */
public class Dialogo1 extends javax.swing.JDialog {

    private int n = 0;
    private Dialogo2 d2;
    private Principal p;
    
    /**
     * Creates new form Dialogo1
     */
    public Dialogo1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        p = (Principal) parent;
        initComponents();
        setLocationRelativeTo(parent); // Establece el diálogo en el centro respecto al padre
        setLocation(getX() + 405, getY()); // Ajusta la posición con el desplazamiento
        setPreferredSize(new Dimension(200, 200));
    }

    public void actualizarLabel(){
        n++;
        jLabelNumero.setText(Integer.toString(n));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jButtonDialogo2 = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("DIALOGO 1");

        jLabelNumero.setText("0");

        jButtonDialogo2.setText("DIALOGO 2");
        jButtonDialogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDialogo2ActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addGap(51, 51, 51)
                .addComponent(jButtonDialogo2)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDialogo2)
                    .addComponent(jButtonCerrar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDialogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDialogo2ActionPerformed
        d2 = new Dialogo2(p, true);
        d2.setVisible(true);
    }//GEN-LAST:event_jButtonDialogo2ActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonDialogo2;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
