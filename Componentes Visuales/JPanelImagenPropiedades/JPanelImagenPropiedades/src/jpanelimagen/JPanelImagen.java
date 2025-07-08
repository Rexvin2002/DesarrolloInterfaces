package jpanelimagen;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable {

    private PropiedadesImagen propiedadesImagen;
    private Point puntoPresion;
    private ArrastreListener arrastreListener;
    private Dimension tamañoOriginal;

    public JPanelImagen() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Point posicionActual = e.getPoint();
                if (puntoPresion != null && Math.abs(puntoPresion.x - posicionActual.x) > 50) {
                    if (arrastreListener != null) {
                        arrastreListener.arrastre();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                puntoPresion = e.getPoint();
            }
        });
    }

    public void addArrastreListener(ArrastreListener arrastreListener) {
        this.arrastreListener = arrastreListener;
    }

    public void removeArrastreListener() {
        this.arrastreListener = null;
    }

    public PropiedadesImagen getPropiedadesImagen() {
        return propiedadesImagen;
    }

    public void setPropiedadesImagen(PropiedadesImagen propiedadesImagen) {
        this.propiedadesImagen = propiedadesImagen;
        if (propiedadesImagen != null && propiedadesImagen.getRutaImagen() != null) {
            ImageIcon imagen = new ImageIcon(propiedadesImagen.getRutaImagen().getAbsolutePath());
            tamañoOriginal = new Dimension(imagen.getIconWidth(), imagen.getIconHeight());
            actualizarTamañoPreferido();
        }
        repaint();
    }

    private void actualizarTamañoPreferido() {
        if (propiedadesImagen != null && !propiedadesImagen.isAjustarTamaño() && tamañoOriginal != null) {
            setPreferredSize(tamañoOriginal);
        } else {
            setPreferredSize(null); // Vuelve al tamaño del layout
        }
        revalidate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (propiedadesImagen != null && propiedadesImagen.getRutaImagen() != null
                && propiedadesImagen.getRutaImagen().exists()) {

            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, propiedadesImagen.getOpacidad()));

            ImageIcon imagen = new ImageIcon(propiedadesImagen.getRutaImagen().getAbsolutePath());

            if (propiedadesImagen.isAjustarTamaño()) {
                // Ajustar al tamaño del panel
                g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            } else {
                // Mostrar tamaño original (centrado)
                int x = (getWidth() - imagen.getIconWidth()) / 2;
                int y = (getHeight() - imagen.getIconHeight()) / 2;
                g.drawImage(imagen.getImage(), x, y, this);
            }

            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
        }
    }
}
