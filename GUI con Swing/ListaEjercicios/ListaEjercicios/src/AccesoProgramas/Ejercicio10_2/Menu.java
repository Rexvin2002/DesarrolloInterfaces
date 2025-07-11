package AccesoProgramas.Ejercicio10_2;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author kgv17
 */
public class Menu extends javax.swing.JPanel {

    private VentanaPrincipal s;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        // Establecer el borde inferior
        int borderThickness = 2; // Grosor del borde
        setBorder(BorderFactory.createMatteBorder(0, 0, borderThickness, 0, Color.BLACK));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(32767, 0), new java.awt.Dimension(32767, 0));
        jButtonMenu = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        setBackground(new java.awt.Color(57, 93, 122));
        setMaximumSize(new java.awt.Dimension(32767, 35));
        setMinimumSize(new java.awt.Dimension(330, 35));
        setPreferredSize(new java.awt.Dimension(330, 35));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler1);

        jButtonMenu.setText("Menu Principal");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        add(jButtonMenu);
        add(filler2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);
        if (window instanceof javax.swing.JFrame jFrame) {
            jFrame.dispose();
        }
        // Mostrar el siguiente diálogo si es necesario
        s = new VentanaPrincipal();
        s.setVisible(true);
        
    }//GEN-LAST:event_jButtonMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButtonMenu;
    // End of variables declaration//GEN-END:variables
}
