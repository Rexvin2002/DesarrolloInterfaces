
package Unidad01.ListaEjercicios.Ejercicio08;

/**
 *
 * @author kgv17
 */
public class Resultados1 extends javax.swing.JPanel {

    /**
     * Creates new form Resultados
     */
    public Resultados1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelResultados01 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 260));

        jPanelResultados01.setPreferredSize(new java.awt.Dimension(600, 220));

        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Botón", "Pulsaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTabla.setMaximumSize(new java.awt.Dimension(80, 80));
        jTableTabla.setMinimumSize(new java.awt.Dimension(80, 80));
        jScrollPane1.setViewportView(jTableTabla);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelTitulo.setText("RECUENTO Nº PULSACIONES de los botones");

        javax.swing.GroupLayout jPanelResultados01Layout = new javax.swing.GroupLayout(jPanelResultados01);
        jPanelResultados01.setLayout(jPanelResultados01Layout);
        jPanelResultados01Layout.setHorizontalGroup(
            jPanelResultados01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultados01Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultados01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResultados01Layout.setVerticalGroup(
            jPanelResultados01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultados01Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelResultados01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelResultados01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelResultados01;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabla;
    // End of variables declaration//GEN-END:variables
}
