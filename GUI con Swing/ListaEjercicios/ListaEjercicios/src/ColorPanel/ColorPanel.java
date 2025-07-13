package ColorPanel;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Color;
import javax.swing.JOptionPane;

public class ColorPanel extends javax.swing.JFrame {

    private boolean isPanelBotonesColored = false;
    private boolean isPanelMainColored = false;
    private boolean isPanelListadoColored = false;

    public ColorPanel() {
        initComponents();
        setLocationRelativeTo(null);
        jButtonRestablecer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonRojo = new javax.swing.JButton();
        jButtonAzul = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonRosa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(150, 35), new java.awt.Dimension(150, 35), new java.awt.Dimension(150, 35));
        jPanelListado = new javax.swing.JPanel();
        jLabelListado = new javax.swing.JLabel();
        jRadioButtonRejilla = new javax.swing.JRadioButton();
        jRadioButtonFondo = new javax.swing.JRadioButton();
        jRadioButtonListado = new javax.swing.JRadioButton();
        jButtonRestablecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));

        jPanelMain.setMaximumSize(new java.awt.Dimension(550, 300));
        jPanelMain.setMinimumSize(new java.awt.Dimension(550, 300));
        jPanelMain.setPreferredSize(new java.awt.Dimension(550, 300));
        jPanelMain.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 30));

        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBotones.setForeground(new java.awt.Color(0, 0, 0));
        jPanelBotones.setMaximumSize(new java.awt.Dimension(325, 225));
        jPanelBotones.setMinimumSize(new java.awt.Dimension(325, 225));
        jPanelBotones.setPreferredSize(new java.awt.Dimension(325, 225));
        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 7));

        jButtonRojo.setText("Rojo");
        jButtonRojo.setMaximumSize(new java.awt.Dimension(150, 100));
        jButtonRojo.setMinimumSize(new java.awt.Dimension(150, 100));
        jButtonRojo.setPreferredSize(new java.awt.Dimension(150, 100));
        jButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRojoActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonRojo);

        jButtonAzul.setText("Azul");
        jButtonAzul.setMaximumSize(new java.awt.Dimension(150, 100));
        jButtonAzul.setMinimumSize(new java.awt.Dimension(150, 100));
        jButtonAzul.setPreferredSize(new java.awt.Dimension(150, 100));
        jButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzulActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAzul);

        jButtonVerde.setText("Verde");
        jButtonVerde.setMaximumSize(new java.awt.Dimension(150, 100));
        jButtonVerde.setMinimumSize(new java.awt.Dimension(150, 100));
        jButtonVerde.setPreferredSize(new java.awt.Dimension(150, 100));
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonVerde);

        jButtonRosa.setText("Rosa");
        jButtonRosa.setMaximumSize(new java.awt.Dimension(150, 100));
        jButtonRosa.setMinimumSize(new java.awt.Dimension(150, 100));
        jButtonRosa.setPreferredSize(new java.awt.Dimension(150, 100));
        jButtonRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRosaActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonRosa);

        jPanelMain.add(jPanelBotones);

        jPanel1.setMaximumSize(new java.awt.Dimension(150, 225));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 225));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 225));
        jPanel1.add(filler1);

        jPanelListado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelListado.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jPanelListado.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanelListado.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanelListado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        jLabelListado.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabelListado.setText("LISTADO");
        jLabelListado.setMaximumSize(new java.awt.Dimension(150, 21));
        jLabelListado.setMinimumSize(new java.awt.Dimension(150, 21));
        jLabelListado.setPreferredSize(new java.awt.Dimension(150, 21));
        jPanelListado.add(jLabelListado);

        buttonGroup1.add(jRadioButtonRejilla);
        jRadioButtonRejilla.setText("Rejilla");
        jRadioButtonRejilla.setMaximumSize(new java.awt.Dimension(150, 21));
        jRadioButtonRejilla.setMinimumSize(new java.awt.Dimension(150, 21));
        jRadioButtonRejilla.setPreferredSize(new java.awt.Dimension(150, 21));
        jPanelListado.add(jRadioButtonRejilla);

        buttonGroup1.add(jRadioButtonFondo);
        jRadioButtonFondo.setText("Fondo");
        jRadioButtonFondo.setMaximumSize(new java.awt.Dimension(150, 21));
        jRadioButtonFondo.setMinimumSize(new java.awt.Dimension(150, 21));
        jRadioButtonFondo.setPreferredSize(new java.awt.Dimension(150, 21));
        jPanelListado.add(jRadioButtonFondo);

        buttonGroup1.add(jRadioButtonListado);
        jRadioButtonListado.setText("Listado");
        jRadioButtonListado.setMaximumSize(new java.awt.Dimension(150, 21));
        jRadioButtonListado.setMinimumSize(new java.awt.Dimension(150, 21));
        jRadioButtonListado.setPreferredSize(new java.awt.Dimension(150, 21));
        jPanelListado.add(jRadioButtonListado);

        jPanel1.add(jPanelListado);

        jButtonRestablecer.setText("Restablecer");
        jButtonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRestablecer);

        jPanelMain.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColor(Color color) {
        if (jRadioButtonRejilla.isSelected()) {
            jPanelBotones.setBackground(color);
            isPanelBotonesColored = true;  // Marcamos que este panel ha sido coloreado
        } else if (jRadioButtonFondo.isSelected()) {
            jPanelMain.setBackground(color);
            isPanelMainColored = true;  // Marcamos que este panel ha sido coloreado
        } else if (jRadioButtonListado.isSelected()) {
            jPanelListado.setBackground(color);
            isPanelListadoColored = true;  // Marcamos que este panel ha sido coloreado
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una opción", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        if (isPanelBotonesColored && isPanelMainColored && isPanelListadoColored) {
            jButtonRestablecer.setVisible(true);
        }
    }

    private void jButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzulActionPerformed
        setColor(Color.blue);
    }//GEN-LAST:event_jButtonAzulActionPerformed

    private void jButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRojoActionPerformed
        setColor(Color.red);
    }//GEN-LAST:event_jButtonRojoActionPerformed

    private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
        setColor(Color.green);
    }//GEN-LAST:event_jButtonVerdeActionPerformed

    private void jButtonRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRosaActionPerformed
        setColor(Color.pink);
    }//GEN-LAST:event_jButtonRosaActionPerformed

    private void jButtonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestablecerActionPerformed
        jPanelMain.setBackground(Color.decode("#d6d9df"));
        jPanelBotones.setBackground(Color.decode("#d6d9df"));
        jPanelListado.setBackground(Color.decode("#d6d9df"));
        buttonGroup1.clearSelection();
        jButtonRestablecer.setVisible(false);
    }//GEN-LAST:event_jButtonRestablecerActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ColorPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonAzul;
    private javax.swing.JButton jButtonRestablecer;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JButton jButtonRosa;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabelListado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelListado;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButton jRadioButtonFondo;
    private javax.swing.JRadioButton jRadioButtonListado;
    private javax.swing.JRadioButton jRadioButtonRejilla;
    // End of variables declaration//GEN-END:variables
}
