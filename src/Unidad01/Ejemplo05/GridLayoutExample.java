package Unidad01.Ejemplo05;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kgv17
 */
public class GridLayoutExample {

    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500, 500));

        // Crear un diseño de tipo GridLayout con 0 filas y 2 columnas
        GridLayout experimentLayout = new GridLayout(0, 2);
        frame.setLayout(experimentLayout);

        // Añadir botones a la ventana
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Ajustar la operación de cierre y hacer la ventana visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
