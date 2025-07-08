package main;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class PruebaImagenPanel extends javax.swing.JFrame {
    
    public PruebaImagenPanel() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImagen1 = new jpanelimagen.JPanelImagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanelImagen1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanelImagen1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanelImagen1.setPropiedadesImagen(new jpanelimagen.PropiedadesImagen(new java.io.File("C:\\Users\\kgv17\\OneDrive\\Documents\\GitHub\\DesarrolloInterfaces\\Componentes Visuales\\PruebaComponentes\\src\\src\\image.jpeg"), 0.5f));

        javax.swing.GroupLayout jPanelImagen1Layout = new javax.swing.GroupLayout(jPanelImagen1);
        jPanelImagen1.setLayout(jPanelImagen1Layout);
        jPanelImagen1Layout.setHorizontalGroup(
            jPanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanelImagen1Layout.setVerticalGroup(
            jPanelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelImagen1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaImagenPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaImagenPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jpanelimagen.JPanelImagen jPanelImagen1;
    // End of variables declaration//GEN-END:variables
}
