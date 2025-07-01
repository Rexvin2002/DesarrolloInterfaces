package component;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author kgv17
 */
public class LimitedText implements Serializable {

    private Color foregroundSinSuperarLimite;
    private Color backgroundSinSuperarLimite;
    private Color foregroundSuperandoLimite;
    private Color backgroundSuperandoLimite;
    private int textLimit;

    public LimitedText(Color foregroundSinSuperarLimite, Color backgroundSinSuperarLimite, Color foregroundSuperandoLimite, Color backgroundSuperandoLimite, int textLimit) {
        this.foregroundSinSuperarLimite = foregroundSinSuperarLimite;
        this.backgroundSinSuperarLimite = backgroundSinSuperarLimite;
        this.foregroundSuperandoLimite = foregroundSuperandoLimite;
        this.backgroundSuperandoLimite = backgroundSuperandoLimite;
        this.textLimit = textLimit;
    }

    public Color getForegroundSinSuperarLimite() {
        return foregroundSinSuperarLimite;
    }

    public void setForegroundSinSuperarLimite(Color foregroundSinSuperarLimite) {
        this.foregroundSinSuperarLimite = foregroundSinSuperarLimite;
    }

    public Color getBackgroundSinSuperarLimite() {
        return backgroundSinSuperarLimite;
    }

    public void setBackgroundSinSuperarLimite(Color backgroundSinSuperarLimite) {
        this.backgroundSinSuperarLimite = backgroundSinSuperarLimite;
    }

    public Color getForegroundSuperandoLimite() {
        return foregroundSuperandoLimite;
    }

    public void setForegroundSuperandoLimite(Color foregroundSuperandoLimite) {
        this.foregroundSuperandoLimite = foregroundSuperandoLimite;
    }

    public Color getBackgroundSuperandoLimite() {
        return backgroundSuperandoLimite;
    }

    public void setBackgroundSuperandoLimite(Color backgroundSuperandoLimite) {
        this.backgroundSuperandoLimite = backgroundSuperandoLimite;
    }

    public int getTextLimit() {
        return textLimit;
    }

    public void setTextLimit(int textLimit) {
        this.textLimit = textLimit;
    }

}
