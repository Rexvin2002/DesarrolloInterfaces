package jpanelimagen;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.io.File;
import java.io.Serializable;

public class PropiedadesImagen implements Serializable {

    private File rutaImagen;
    private Float opacidad;
    private boolean ajustarTamaño = true; // Valor por defecto

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

    public boolean isAjustarTamaño() {
        return ajustarTamaño;
    }

    public void setAjustarTamaño(boolean ajustarTamaño) {
        this.ajustarTamaño = ajustarTamaño;
    }
}
