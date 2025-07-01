
package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author aguilera
 */
public class JPanelImagen extends JPanel implements Serializable {

    private PropiedadesImagen propiedadesImagen; // v.PROPIEDADES;
    private boolean ratonPresionado;
    private Point puntoPresion;
    private ArrastreListener arrastreListener;
    
    public JPanelImagen() {
        //System.out.println("CONSTRUCTOR");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Point posicionActual=e.getPoint();
                if (Math.abs(puntoPresion.x-posicionActual.x)>50) {
                    arrastreListener.arrastre();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ratonPresionado=true;
                puntoPresion=e.getPoint();
            }
            
        });
    }

    public void addArrastreListener(ArrastreListener arrastreListener) {
        this.arrastreListener=arrastreListener;
    }
    
    public void removeArrastreListener() {
        this.arrastreListener=null;
    }
    
    public PropiedadesImagen getPropiedadesImagen() {
        return propiedadesImagen;
    }

    public void setPropiedadesImagen(PropiedadesImagen propiedadesImagen) {
        this.propiedadesImagen = propiedadesImagen;
        repaint();
    }
 

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        if (propiedadesImagen!=null)
            if (propiedadesImagen.getRutaImagen()!=null && propiedadesImagen.getRutaImagen().exists())
            {
                System.out.println("ESTOY PINTANDO");
                Graphics2D g2d=(Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,propiedadesImagen.getOpacidad()));
                ImageIcon imagen=new ImageIcon(propiedadesImagen.getRutaImagen().getAbsolutePath());
                g.drawImage(imagen.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1));
            }
      
    }
    
}
