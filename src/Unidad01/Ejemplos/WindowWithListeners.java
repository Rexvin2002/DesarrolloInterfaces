package Unidad01.Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowWithListeners {

    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Ventana con Listeners");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());  // Usar GridBagLayout para centrar los elementos
        frame.setResizable(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);  // Añadir márgenes entre los elementos
        gbc.anchor = GridBagConstraints.CENTER;

        // Crear una etiqueta con tamaño 200x100 y color de fondo sólido
        JLabel label = new JLabel("Etiqueta", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300, 100));
        label.setHorizontalAlignment(SwingConstants.CENTER);  // Alinear horizontalmente al centro
        label.setVerticalAlignment(SwingConstants.CENTER);    // Alinear verticalmente al centro
        label.setOpaque(true);
        label.setBackground(Color.CYAN);
        frame.add(label, gbc);

        // Crear un botón con el texto "Pincha aquí"
        gbc.gridy = 1;  // Cambiar la posición vertical
        JButton button = new JButton("Pincha aquí");
        button.setPreferredSize(new Dimension(300, 50));
        frame.add(button, gbc);

        // Crear un área de texto
        gbc.gridy = 2;  // Cambiar la posición vertical
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(300, 150));
        textArea.setEditable(false);
        frame.add(textArea, gbc);

        // Añadir Listener para el evento de entrada del ratón en la etiqueta
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                textArea.setText("Evento: Entrada en la etiqueta\n" + textArea.getText());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textArea.setText("Evento: Salida de la etiqueta\n" + textArea.getText());
            }
        });

        // Añadir Listener para el evento del botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Evento: Botón presionado\n" + textArea.getText());
            }
        });

        // Hacer la ventana visible
        frame.setVisible(true);
    }
}
