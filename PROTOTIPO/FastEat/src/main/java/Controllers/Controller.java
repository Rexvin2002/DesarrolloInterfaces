package Controllers;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Controller {

    // Método para escalar imagen a un tamaño fijo de 200x200
    public static ImageIcon escalarImagen(String ruta) {
        ImageIcon originalIcon = new ImageIcon(ruta);
        Image scaledImage = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    // Método para escalar imagen a un tamaño fijo de 70x70
    public static ImageIcon escalarImagenTabla(ImageIcon icono) {
        Image scaledImage = icono.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    // Método para escalar imagen en un JLabel al tamaño del componente
    public static void escalarEstablecerImagen(JLabel etiqueta, String ruta) {
        ImageIcon originalIcon = new ImageIcon(ruta);
        Image scaledImage = originalIcon.getImage().getScaledInstance(
                etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH);
        etiqueta.setIcon(new ImageIcon(scaledImage));
    }

    // Método para escalar imagen en un JButton al tamaño del componente
    public static void escalarImagenBoton(JButton boton, String ruta) {
        SwingUtilities.invokeLater(() -> {
            ImageIcon originalIcon = new ImageIcon(ruta);
            Image scaledImage = originalIcon.getImage().getScaledInstance(
                    boton.getWidth()+8, boton.getHeight(), Image.SCALE_SMOOTH);
            boton.setIcon(new ImageIcon(scaledImage));
        });
    }

    // Método para simular clic de botón al presionar Enter
    public static void funcionBoton(KeyEvent evt, JButton boton) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boton.doClick();
        }
    }
}
