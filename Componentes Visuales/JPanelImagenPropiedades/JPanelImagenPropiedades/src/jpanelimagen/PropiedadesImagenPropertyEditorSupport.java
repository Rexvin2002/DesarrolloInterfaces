package jpanelimagen;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Component;
import java.beans.PropertyEditorSupport;

public class PropiedadesImagenPropertyEditorSupport extends PropertyEditorSupport {

    private PropiedadesImagenPanel pIP = new PropiedadesImagenPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return pIP;
    }

    @Override
    public String getJavaInitializationString() {
        PropiedadesImagen pImagen = pIP.getSelectdValue();
        String ruta = pImagen.getRutaImagen() != null
                ? pImagen.getRutaImagen().getAbsolutePath().replace("\\", "\\\\") : "";

        return "new jpanelimagen.PropiedadesImagen(new java.io.File(\"" + ruta + "\"), "
                + pImagen.getOpacidad() + "f)";
    }

    @Override
    public Object getValue() {
        return pIP.getSelectdValue();
    }
}
