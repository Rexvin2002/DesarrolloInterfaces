package AccesoProgramas.Ejercicio10_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ShadowPanel extends JPanel {
    private static final int SHADOW_SIZE = 10; // Tamaño de la sombra

    public ShadowPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(300, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Crear la sombra
        BufferedImage shadowImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2dShadow = shadowImage.createGraphics();
        
        // Establecer el color de la sombra
        g2dShadow.setColor(new Color(0, 0, 0, 50)); // Color negro con 50 de opacidad
        g2dShadow.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja la sombra a la derecha
        g2d.drawImage(shadowImage, SHADOW_SIZE, 0, null);

        // Limpia el Graphics2D para dibujar el contenido del panel
        g2dShadow.dispose();
        
        // Dibuja el contenido normal del panel
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shadow Panel Example");
        ShadowPanel shadowPanel = new ShadowPanel();
        frame.add(shadowPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

