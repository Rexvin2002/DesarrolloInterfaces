
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author aguilera
 */
public class PropiedadesImagenPropertyEditorSupport extends PropertyEditorSupport {

    private PropiedadesImagenPanel pIP=new PropiedadesImagenPanel();
    
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
        PropiedadesImagen pImagen=pIP.getSelectdValue();
        
        return "new jpanelimagen.PropiedadesImagen(new java.io.File(\""+pImagen.getRutaImagen().getAbsolutePath()+"\"),"+pImagen.getOpacidad()+"f)";
    }

    @Override
    public Object getValue() {
        return pIP.getSelectdValue();
    }
    
}
