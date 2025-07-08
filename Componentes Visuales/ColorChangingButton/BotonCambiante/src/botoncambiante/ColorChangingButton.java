package botoncambiante;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ColorChangingButton extends JButton {

    private Color defaultColor = new JButton().getBackground();
    private Color secondaryColor = Color.RED; 
    private boolean changeColor = true; 
    private boolean isDefault = true; 

    public ColorChangingButton() {
        this.setBackground(defaultColor);
        this.addActionListener((ActionEvent e) -> {
            if (changeColor) {
                toggleColor();
            }
        });
        
        // Añadir MouseListener para cambiar el cursor
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
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