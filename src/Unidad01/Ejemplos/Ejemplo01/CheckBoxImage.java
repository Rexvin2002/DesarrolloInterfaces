
package Unidad01.Ejemplos.Ejemplo01;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author kgv17
 */
public class CheckBoxImage extends javax.swing.JFrame {
    private int i = 0;
    private final String[] images = { 
    "C:/Users/kgv17/Documents/NetBeansProjects/DesarrolloInterfaces/src/Unidad01/Ejemplos/Ejemplo06/JavaIcon.png",
    "C:/Users/kgv17/Documents/NetBeansProjects/DesarrolloInterfaces/src/Unidad01/Ejemplos/Ejemplo06/PythonIcon.png",
    "C:/Users/kgv17/Documents/NetBeansProjects/DesarrolloInterfaces/src/Unidad01/Ejemplos/Ejemplo06/JavaScriptIcon.png",
    "C:/Users/kgv17/Documents/NetBeansProjects/DesarrolloInterfaces/src/Unidad01/Ejemplos/Ejemplo06/HtmlIcon.png"
};
    
    /**
     * Creates new form CheckBoxImage
     */
    public CheckBoxImage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonJava = new javax.swing.JRadioButton();
        jRadioButtonPython = new javax.swing.JRadioButton();
        jRadioButtonJavaScript = new javax.swing.JRadioButton();
        jRadioButtonHTML = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 380));

        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel1.setText("Escoja una imagen:");

        buttonGroup1.add(jRadioButtonJava);
        jRadioButtonJava.setText("Java");
        jRadioButtonJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJavaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPython);
        jRadioButtonPython.setText("Python");
        jRadioButtonPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPythonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonJavaScript);
        jRadioButtonJavaScript.setText("JavaScript");
        jRadioButtonJavaScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJavaScriptActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonHTML);
        jRadioButtonHTML.setText("HTML");
        jRadioButtonHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHTMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButtonJava)
                    .addComponent(jRadioButtonPython)
                    .addComponent(jRadioButtonJavaScript)
                    .addComponent(jRadioButtonHTML))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonJava)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonPython)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonJavaScript)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonHTML)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Image scaledImage;
    // Leer la imagen desde el archivo
    private BufferedImage originalImage;
    
    private void jRadioButtonJavaScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJavaScriptActionPerformed
        try {
            originalImage = ImageIO.read(new File(images[2]));
            // Leer la imagen desde el archivo
            BufferedImage originalImage = ImageIO.read(new File(images[2]));
            // Redimensionar la imagen al tamaño del JLabel
            scaledImage = originalImage.getScaledInstance(350, 180, Image.SCALE_SMOOTH);
            // Crear un ImageIcon con la imagen redimensionada y establecerlo jLabelImage.getWidth()en el JLabel
            jLabelImage.setIcon(new ImageIcon(scaledImage));
            i++;
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonJavaScriptActionPerformed

    private void jRadioButtonJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJavaActionPerformed
        try {
            originalImage = ImageIO.read(new File(images[0]));
            // Leer la imagen desde el archivo
            BufferedImage originalImage = ImageIO.read(new File(images[0]));
            // Redimensionar la imagen al tamaño del JLabel
            scaledImage = originalImage.getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
            // Crear un ImageIcon con la imagen redimensionada y establecerlo en el JLabel
            jLabelImage.setIcon(new ImageIcon(scaledImage));
            i++;
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonJavaActionPerformed

    private void jRadioButtonPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPythonActionPerformed
        try {
            originalImage = ImageIO.read(new File(images[1]));
            // Leer la imagen desde el archivo
            BufferedImage originalImage = ImageIO.read(new File(images[1]));
            // Redimensionar la imagen al tamaño del JLabel
            scaledImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            // Crear un ImageIcon con la imagen redimensionada y establecerlo en el JLabel
            jLabelImage.setIcon(new ImageIcon(scaledImage));
            i++;
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonPythonActionPerformed

    private void jRadioButtonHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHTMLActionPerformed
        try {
            originalImage = ImageIO.read(new File(images[3]));
            // Leer la imagen desde el archivo
            BufferedImage originalImage = ImageIO.read(new File(images[3]));
            // Redimensionar la imagen al tamaño del JLabel
            scaledImage = originalImage.getScaledInstance(230, 200, Image.SCALE_SMOOTH);
            // Crear un ImageIcon con la imagen redimensionada y establecerlo en el JLabel
            jLabelImage.setIcon(new ImageIcon(scaledImage));
            i++;
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonHTMLActionPerformed

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
            java.util.logging.Logger.getLogger(CheckBoxImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBoxImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBoxImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBoxImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBoxImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JRadioButton jRadioButtonHTML;
    private javax.swing.JRadioButton jRadioButtonJava;
    private javax.swing.JRadioButton jRadioButtonJavaScript;
    private javax.swing.JRadioButton jRadioButtonPython;
    // End of variables declaration//GEN-END:variables
}
