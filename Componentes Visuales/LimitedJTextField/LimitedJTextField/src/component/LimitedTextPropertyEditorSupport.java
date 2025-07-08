package component;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

public class LimitedTextPropertyEditorSupport extends PropertyEditorSupport {

    private LimitedTextProperties propiedades = new LimitedTextProperties();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return propiedades;
    }

    @Override
    public String getJavaInitializationString() {
        // Obtener el objeto LimitedText seleccionado
        LimitedText textoLimitado = propiedades.getSelectedValue();

        // Verificar si el objeto es nulo
        if (textoLimitado == null) {
            throw new IllegalStateException("No se ha seleccionado un valor válido para LimitedText.");
        }

        // Obtener los colores y el límite de texto
        Color foregroundSinSuperarLimite = textoLimitado.getForegroundSinSuperarLimite();
        Color backgroundSinSuperarLimite = textoLimitado.getBackgroundSinSuperarLimite();
        Color foregroundSuperandoLimite = textoLimitado.getForegroundSuperandoLimite();
        Color backgroundSuperandoLimite = textoLimitado.getBackgroundSuperandoLimite();
        int limite = textoLimitado.getTextLimit();

        // Generar la cadena de inicialización
        return "new component.LimitedText("
                + "new java.awt.Color(" + foregroundSinSuperarLimite.getRed() + ", " + foregroundSinSuperarLimite.getGreen() + ", " + foregroundSinSuperarLimite.getBlue() + "), "
                + "new java.awt.Color(" + backgroundSinSuperarLimite.getRed() + ", " + backgroundSinSuperarLimite.getGreen() + ", " + backgroundSinSuperarLimite.getBlue() + "), "
                + "new java.awt.Color(" + foregroundSuperandoLimite.getRed() + ", " + foregroundSuperandoLimite.getGreen() + ", " + foregroundSuperandoLimite.getBlue() + "), "
                + "new java.awt.Color(" + backgroundSuperandoLimite.getRed() + ", " + backgroundSuperandoLimite.getGreen() + ", " + backgroundSuperandoLimite.getBlue() + "), "
                + limite + ")";
    }

    @Override
    public Object getValue() {
        return propiedades.getSelectedValue();
    }

}
