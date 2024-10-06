
package Unidad01.Ejemplos;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        // Creamos una ventana y recuperamos su contenedor
        JFrame frame = new JFrame("Centered Button");

        // Alternativa a crearnos nuestro JPanel, usar el contenedor por defecto del JFrame
        Container container = frame.getContentPane();

        // Asociamos al contenedor un GridBagLayout
        container.setLayout(new GridBagLayout());

        // Creamos restricciones para colocar el botón en el centro
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        // Creamos un botón y lo añadimos al contenedor con las restricciones
        JButton button = new JButton("Click Me");
        container.add(button, gbc);
        
        // Añadimos un evento de acción al botón que muestra una alerta
        button.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Button clicked!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        });
        
        // Configuramos el tamaño de la ventana
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


