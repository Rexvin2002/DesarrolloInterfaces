package AccesoProgramas.Ejercicio10_2.Programas.AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class AñadirHijo extends javax.swing.JDialog {

    public final LogicaPersonas LOGICAPERSONAS = Registro.logicaPersonas;
    private final Error ER;

    public AñadirHijo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);

        // Establecer fecha inicial en el JSpinner
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1); // Por ejemplo, fecha inicial
        jSpinnerFecha.setModel(new SpinnerDateModel(calendar.getTime(), null, null, Calendar.DAY_OF_MONTH));
        jSpinnerFecha.setEditor(new JSpinner.DateEditor(jSpinnerFecha, "dd/MM/yyyy"));

        ER = new Error((Frame) getParent(), true, "Por favor, complete los campos.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelDeporte = new javax.swing.JLabel();
        jComboBoxDeporte = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabelNivel = new javax.swing.JLabel();
        jSpinnerNivel = new javax.swing.JSpinner();
        jPanelFecha = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jButtonAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(380, 380));
        setMinimumSize(new java.awt.Dimension(380, 380));
        setPreferredSize(new java.awt.Dimension(380, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(380, 380));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Añadir Hijo");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(330, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(330, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(330, 50));
        getContentPane().add(jLabelTitulo);

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanelDatos.setMaximumSize(new java.awt.Dimension(330, 220));
        jPanelDatos.setMinimumSize(new java.awt.Dimension(330, 220));
        jPanelDatos.setPreferredSize(new java.awt.Dimension(330, 220));

        jPanel1.setMaximumSize(new java.awt.Dimension(315, 22));
        jPanel1.setMinimumSize(new java.awt.Dimension(315, 22));
        jPanel1.setPreferredSize(new java.awt.Dimension(315, 22));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 13, 0));

        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre);

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(240, 22));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(240, 22));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(240, 22));
        jPanel1.add(jTextFieldNombre);

        jPanelDatos.add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(315, 22));
        jPanel2.setMinimumSize(new java.awt.Dimension(315, 22));
        jPanel2.setPreferredSize(new java.awt.Dimension(315, 22));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        jLabelApellidos.setText("Apellidos");
        jPanel2.add(jLabelApellidos);

        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(240, 22));
        jTextFieldApellidos.setMinimumSize(new java.awt.Dimension(240, 22));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(240, 22));
        jPanel2.add(jTextFieldApellidos);

        jPanelDatos.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(315, 42));
        jPanel3.setMinimumSize(new java.awt.Dimension(315, 42));
        jPanel3.setPreferredSize(new java.awt.Dimension(315, 42));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jPanel4.setMaximumSize(new java.awt.Dimension(155, 32));
        jPanel4.setMinimumSize(new java.awt.Dimension(155, 32));
        jPanel4.setPreferredSize(new java.awt.Dimension(155, 32));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelDeporte.setText("Deporte");
        jPanel4.add(jLabelDeporte);

        jComboBoxDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Padel", "Squash" }));
        jPanel4.add(jComboBoxDeporte);

        jPanel3.add(jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(155, 32));
        jPanel5.setMinimumSize(new java.awt.Dimension(155, 32));
        jPanel5.setPreferredSize(new java.awt.Dimension(155, 32));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabelNivel.setText("Nivel");
        jPanel5.add(jLabelNivel);

        jSpinnerNivel.setModel(new javax.swing.SpinnerListModel(new String[] {"Inicial", "Medio", "Avanzado", "Profesional"}));
        jPanel5.add(jSpinnerNivel);

        jPanel3.add(jPanel5);

        jPanelDatos.add(jPanel3);

        jPanelFecha.setMaximumSize(new java.awt.Dimension(315, 60));
        jPanelFecha.setMinimumSize(new java.awt.Dimension(315, 60));
        jPanelFecha.setPreferredSize(new java.awt.Dimension(315, 60));

        jLabelFecha.setText("Fecha Nacimiento:");
        jLabelFecha.setMaximumSize(new java.awt.Dimension(300, 16));
        jLabelFecha.setMinimumSize(new java.awt.Dimension(300, 16));
        jLabelFecha.setPreferredSize(new java.awt.Dimension(300, 16));
        jPanelFecha.add(jLabelFecha);

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setMaximumSize(new java.awt.Dimension(300, 30));
        jSpinnerFecha.setMinimumSize(new java.awt.Dimension(300, 30));
        jSpinnerFecha.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanelFecha.add(jSpinnerFecha);

        jPanelDatos.add(jPanelFecha);

        getContentPane().add(jPanelDatos);

        jButtonAñadir.setText("AÑADIR");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadir);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // Obtener los valores de los campos
        String nombre = jTextFieldNombre.getText().trim();  // Eliminar espacios al principio y al final
        String apellidos = jTextFieldApellidos.getText();
        String deporte = jComboBoxDeporte.getSelectedItem().toString();
        String nivel = jSpinnerNivel.getValue().toString();

        // Obtener la fecha en el formato requerido
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = (Date) jSpinnerFecha.getValue();
        String fecha = sdf.format(fechaDate);

        // Validar si el campo "nombre" está vacío
        if (nombre.isEmpty()) {
            ER.setVisible(true);  // Mostrar mensaje de error
        } else {
            // Si el nombre no está vacío, crear el objeto Persona y continuar
            Persona p = new Persona(nombre, apellidos, fecha, deporte, nivel);
            LOGICAPERSONAS.añadirPersona(p);
            dispose();
        }

    }//GEN-LAST:event_jButtonAñadirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            AñadirHijo dialog = new AñadirHijo(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JComboBox<String> jComboBoxDeporte;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDeporte;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFecha;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerNivel;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
