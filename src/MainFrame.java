

/**
 *
 * @author kgv17
 */
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Ejemplo de JDesktopPane y JInternalFrame");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el JDesktopPane
        JDesktopPane desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        // Crear un JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Ventana Interna", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);

        // Añadir el JInternalFrame al JDesktopPane
        desktopPane.add(internalFrame);
    }
dsd
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
