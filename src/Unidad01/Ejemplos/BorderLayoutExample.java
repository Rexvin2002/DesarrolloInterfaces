package Unidad01.Ejemplos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kgv17
 */
public class BorderLayoutExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un JFrame para la ventana
        JFrame frame = new JFrame("BorderLayout Example");

        // Creamos el layout con gap de 5 píxeles en ambos lados
        BorderLayout layout = new BorderLayout(5, 5);

        // Asociamos el layout al JFrame actual
        frame.setLayout(layout);

        // Añadimos el botón al JFrame, en la posición Norte
        JButton button1 = new JButton("NORTH");
        frame.add(button1, BorderLayout.NORTH);
        JButton button2 = new JButton("SOUTH");
        frame.add(button2, BorderLayout.SOUTH);
        JButton button3 = new JButton("WEST");
        frame.add(button3, BorderLayout.WEST);
        JButton button4 = new JButton("EAST");
        frame.add(button4, BorderLayout.EAST);
        
        // Añadimos un evento de acción al botón que muestra una alerta
        button1.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Button NORTH clicked!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        });
        // Añadimos un evento de acción al botón que muestra una alerta
        button2.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "ButtonSOUTH clicked!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        });
        // Añadimos un evento de acción al botón que muestra una alerta
        button3.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Button WEST clicked!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        });
        // Añadimos un evento de acción al botón que muestra una alerta
        button4.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Button EAST clicked!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        });

        // Configuramos el tamaño, el cierre y la visibilidad del JFrame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
