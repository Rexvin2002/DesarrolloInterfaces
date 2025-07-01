package Unidad01.ListaEjercicios.Ejercicio10_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopPaneExample extends JFrame {

    private JDesktopPane desktopPane;

    public DesktopPaneExample() {
        // Configuración del JFrame principal
        setTitle("JDesktopPane with Menu Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el JDesktopPane
        desktopPane = new JDesktopPane();
        add(desktopPane);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear el menú "File"
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Crear el ítem de menú "New Window"
        JMenuItem newWindowItem = new JMenuItem("New Window");
        fileMenu.add(newWindowItem);

        // Acción para abrir una nueva ventana interna
        newWindowItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createInternalFrame();
            }
        });

        // Añadir la barra de menú al JFrame
        setJMenuBar(menuBar);
    }

    private void createInternalFrame() {
        // Crear un JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);

        // Añadir el JInternalFrame al JDesktopPane
        desktopPane.add(internalFrame);

        try {
            internalFrame.setSelected(true); // Selecciona la nueva ventana
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DesktopPaneExample example = new DesktopPaneExample();
            example.setVisible(true);
        });
    }
}
