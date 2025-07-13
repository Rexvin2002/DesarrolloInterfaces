package crudof;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.table.DefaultTableModel;

public class Datos extends javax.swing.JDialog {

    private DefaultTableModel model;
    private final VentanaPrincipal VENTANAPRINCIPAL;

    public Datos(java.awt.Frame parent, boolean modal, String nombre) {
        super(parent, modal);
        initComponents();
        VENTANAPRINCIPAL = (VentanaPrincipal) parent;
        setLocationRelativeTo(null);
        initTableModel();
        loadDeportes(nombre);
    }

    private void initTableModel() {
        // Define el modelo de la tabla con columnas para los datos de socios
        model = new DefaultTableModel(new Object[]{"Código", "Deporte", "Descripción", "Nivel"}, 0);
        jTableDatos.setModel(model);
    }

    private void loadDeportes(String socioName) {
        if (socioName == null) {
            model.addRow(new Object[]{"No hay datos", "", "", ""});
        } else {
            switch (socioName) {
                case "Alice" -> {
                    model.addRow(new Object[]{"Fútbol", "D01", "Fútbol", "Avanzado"});
                    model.addRow(new Object[]{"Baloncesto", "D02", "Baloncesto", "Intermedio"});
                }
                case "Bob" ->
                    model.addRow(new Object[]{"Tenis", "D03", "Tenis", "Principiante"});
                case "Charlie" ->
                    model.addRow(new Object[]{"Tenis", "D03", "Tenis", "Principiante"});
                case "Diana" ->
                    model.addRow(new Object[]{"Tenis", "D03", "Tenis", "Principiante"});
                default ->
                    model.addRow(new Object[]{"No hay datos", "", "", ""});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos");

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
