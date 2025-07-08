package main;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class PruebaBoton extends javax.swing.JFrame {

    private int count = 0;

    public PruebaBoton() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colorChangingButton1 = new botoncambiante.ColorChangingButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PruebaBoton");
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setPreferredSize(new java.awt.Dimension(500, 250));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 250));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 150));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 150));
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 150));
        jPanel1.add(jLabel1);

        colorChangingButton1.setBackground(new java.awt.Color(51, 51, 51));
        colorChangingButton1.setForeground(new java.awt.Color(255, 255, 255));
        colorChangingButton1.setText("PÚLSAME");
        colorChangingButton1.setDefaultColor(new java.awt.Color(51, 51, 51));
        colorChangingButton1.setMaximumSize(new java.awt.Dimension(450, 23));
        colorChangingButton1.setMinimumSize(new java.awt.Dimension(450, 23));
        colorChangingButton1.setPreferredSize(new java.awt.Dimension(450, 23));
        colorChangingButton1.setSecondaryColor(new java.awt.Color(0, 51, 102));
        colorChangingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChangingButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(colorChangingButton1);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorChangingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChangingButton1ActionPerformed
        count++;
        this.jLabel1.setText(String.valueOf(count));
    }//GEN-LAST:event_colorChangingButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PruebaBoton().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private botoncambiante.ColorChangingButton colorChangingButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
