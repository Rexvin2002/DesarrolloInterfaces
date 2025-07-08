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
        setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setMaximumSize(new java.awt.Dimension(390, 150));
        jLabel1.setMinimumSize(new java.awt.Dimension(390, 150));
        jLabel1.setPreferredSize(new java.awt.Dimension(390, 150));
        jPanel1.add(jLabel1);

        colorChangingButton1.setText("PÚLSAME");
        colorChangingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChangingButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(colorChangingButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
