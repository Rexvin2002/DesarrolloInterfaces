package AccesoProgramas.Ejercicio10_2;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    private final JFrame VENTANA;

    public Menu(JFrame VENTANA) {
        initComponents();
        this.VENTANA = VENTANA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 50));
        setMinimumSize(new java.awt.Dimension(1000, 50));
        setPreferredSize(new java.awt.Dimension(1000, 50));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(1000, 50));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(1000, 50));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1000, 50));
        jPanelMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 10));

        jButtonMenu.setText("Menu Principal");
        jButtonMenu.setMaximumSize(new java.awt.Dimension(110, 30));
        jButtonMenu.setMinimumSize(new java.awt.Dimension(110, 30));
        jButtonMenu.setPreferredSize(new java.awt.Dimension(110, 30));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonMenu);

        add(jPanelMenu);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // Mostrar el siguiente diálogo si es necesario
        VENTANA.dispose();
    }//GEN-LAST:event_jButtonMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
