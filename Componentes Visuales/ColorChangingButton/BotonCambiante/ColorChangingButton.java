
package Unidad03.BotonCambiante;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ColorChangingButton extends JButton {
    private Color defaultColor = new JButton().getBackground(); // Color predeterminado del botón
    private Color secondaryColor = Color.RED; // Color secundario por defecto
    private boolean changeColor = true; // Determina si el color cambiará o no
    private boolean isDefault = true; // Estado actual del botón

    public ColorChangingButton() {
        this.setBackground(defaultColor);
        this.addActionListener((ActionEvent e) -> {
            if (changeColor) {
                toggleColor();
            }
        });
    }
    
    private void toggleColor() {
        if (isDefault) {
            setBackground(secondaryColor);
        } else {
            setBackground(defaultColor);
        }
        isDefault = !isDefault;
    }

    public Color getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(Color defaultColor) {
        this.defaultColor = defaultColor;
        this.setBackground(defaultColor);
    }

    public Color getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(Color secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public boolean isChangeColor() {
        return changeColor;
    }

    public void setChangeColor(boolean changeColor) {
        this.changeColor = changeColor;
    }
    
}
