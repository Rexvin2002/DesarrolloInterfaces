package component;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LimitedJTextField extends JTextField implements Serializable {
    private LimitedText limitedTextConfig;

    public LimitedJTextField() {
        // Initialize with default settings
        this.limitedTextConfig = new LimitedText(Color.BLACK, Color.WHITE, Color.WHITE, Color.BLACK, 5);

        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateColors();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateColors();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateColors();
            }
        });

        // Initial color update
        SwingUtilities.invokeLater(this::updateColors);
    }

    public void setLimitedTextConfig(LimitedText config) {
        if (config == null) {
            throw new IllegalArgumentException("LimitedText configuration cannot be null");
        }
        this.limitedTextConfig = config;
        updateColors();
    }

    public LimitedText getLimitedTextConfig() {
        return limitedTextConfig;
    }

    private void updateColors() {
        if (limitedTextConfig == null) return;

        boolean exceedsLimit = getText().length() > limitedTextConfig.getTextLimit();

        if (exceedsLimit) {
            setForeground(limitedTextConfig.getForegroundSuperandoLimite());
            setBackground(limitedTextConfig.getBackgroundSuperandoLimite());
        } else {
            setForeground(limitedTextConfig.getForegroundSinSuperarLimite());
            setBackground(limitedTextConfig.getBackgroundSinSuperarLimite());
        }
    }
}