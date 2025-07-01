package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author aguilera
 */
public class PropiedadesImagen implements Serializable {
    private File rutaImagen;    // v.PROPIEDADES File para fichero
    private Float opacidad;

    public PropiedadesImagen(File rutaImagen, Float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }
    
    
}
