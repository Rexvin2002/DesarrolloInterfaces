
package Unidad01.ListaEjercicios.Ejercicio08;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kgv17
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        inicializarTablaPulsaciones();
    }

    // Añadir Listener a los JRadios y JComboBoxs
    public void addAccionesAction(ActionListener listener) {
        jRadioButtonAcciones.addActionListener(listener);
    }
    public void addCambiarAccionAction(ActionListener listener) {
        jComboBoxCambiarAccion.addActionListener(listener);
    }
    
    public void addResultadosAction(ActionListener listener) {
        jRadioButtonResultados.addActionListener(listener);
    }
    public void addCambiarResultadoAction(ActionListener listener) {
        jComboBoxCambiarResultado.addActionListener(listener);
    }
    
    
    // Añade un listener a cada jButton
    public void addButtonB1Action(ActionListener listener) {
        jButtonB1.addActionListener(listener);
    }
    public void addButtonB2Action(ActionListener listener) {
        jButtonB2.addActionListener(listener);
    }
    public void addButtonB3Action(ActionListener listener) {
        jButtonB3.addActionListener(listener);
    }
    public void addButtonB4Action(ActionListener listener) {
        jButtonB4.addActionListener(listener);
    }

    // Añade un listener a cada jCheckBox
    public void addCheckBoxLeer(ActionListener listener) {
        jCheckBoxLeer.addActionListener(listener);
    }
    public void addCheckBoxEscalada(ActionListener listener) {
        jCheckBoxEscalada.addActionListener(listener);
    }
    public void addCheckBoxEsquiar(ActionListener listener) {
        jCheckBoxEsquiar.addActionListener(listener);
    }
    public void addCheckBoxSubmarinismo(ActionListener listener) {
        jCheckBoxSubmarinismo.addActionListener(listener);
    }
    
    // Inicializa la tabla de pulsaciones
    private void inicializarTablaPulsaciones() {
        DefaultTableModel modeloTabla = new DefaultTableModel(); // Se crea un modelo de tabla por defecto
        modeloTabla.setColumnIdentifiers(new String[]{"Botón", "Pulsaciones"});

        ContadorPulsaciones contadorPulsaciones = new ContadorPulsaciones();
        // Se itera sobre cada boton de contadorPulsaciones
        for (Integer boton : contadorPulsaciones.getPulsacionesBoton().keySet()) {
            Integer pulsaciones = contadorPulsaciones.getPulsacionesBoton().get(boton); // Se obtiene las pulsaciones
            modeloTabla.addRow(new Object[]{boton, null}); // Se añade a la tabla    
        }
        jTablePulsaciones.setModel(modeloTabla); // Se aplica el modelo de tabla creado al componente jTablePersonas

    }
    
    
    public void mostrarPanelAcciones() {
        // Se obtiene un objeto de tipo CardLayout
        CardLayout cardLayout = (CardLayout) jPanelCentral.getLayout();

        // Se vacia todos los componentes del panel central antes de añadir uno nuevo
        jPanelCentral.removeAll();

        // Se añade el panel Acciones
        jPanelCentral.add(jPanelAccionesPanel, "Acciones");

        // Se muestra el panel Acciones
        cardLayout.show(jPanelCentral, "Acciones");

        // Se refresca el panel central para que los cambios se reflejen
        jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
        jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
    }
    public void mostrarAcciones() {
        // Se verifica si el item seleccionado en el comboBox es Botones
        if (jComboBoxCambiarAccion.getSelectedItem().equals("Botones")) {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelAcciones.getLayout();

            // Se vacía todos los componentes del panel central de Acciones antes de añadir uno nuevo
            jPanelAcciones.removeAll();

            // Se añade el panel Botones
            jPanelAcciones.add(jPanelBotones, "Botones");

            // Se muestra el panel Botones
            cardLayout.show(jPanelAcciones, "Botones");

            // Se refresca el panel SubAcciones para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        } else {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelAcciones.getLayout();

            // Se vacía todos los componentes del panel central antes de añadir uno nuevo
            jPanelAcciones.removeAll();

            // Se añade el panel Opciones
            jPanelAcciones.add(jPanelOpciones, "Opciones");

            // Se muestra el panel Opciones
            cardLayout.show(jPanelAcciones, "Opciones");

            // Se refresca el panel SubAcciones para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        }
    }
    
    public void mostrarPanelResultados() {
        // Se obtiene un objeto de tipo CardLayout
        CardLayout cardLayout = (CardLayout) jPanelCentral.getLayout();

        // Se vacia todos los componentes del panel central antes de añadir uno nuevo
        jPanelCentral.removeAll();

        // Se añade el panel Resultados
        jPanelCentral.add(jPanelResultadosPanel, "Resultados");

        // Se muestra el panel Resultados
        cardLayout.show(jPanelCentral, "Resultados");

        // Se refresca el panel central para que los cambios se reflejen
        jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
        jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
    }
    public void mostrarResultados() {
        // Se verifica si el item seleccionado en el comboBox es Pulsaciones
        if (jComboBoxCambiarResultado.getSelectedItem().equals("Pulsaciones")) {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelResultados.getLayout();

            // Se añade el panel Pulsaciones
            jPanelResultados.add(jPanelPulsaciones, "Pulsaciones");

            // Se muestra el panel Pulsaciones
            cardLayout.show(jPanelResultados, "Pulsaciones");

            // Se refresca el panel SubResultados para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        } else {
            // Se obtiene un objeto de tipo CardLayout
            CardLayout cardLayout = (CardLayout) jPanelResultados.getLayout();

            // Se añade el panel Selecciones
            jPanelResultados.add(jPanelSelecciones, "Selecciones");

            // Se muestra el panel Selecciones
            cardLayout.show(jPanelResultados, "Selecciones");

            // Se refresca el panel SubResultados para que los cambios se reflejen
            jPanelCentral.revalidate(); // Se revalida el contenedor para que reconozca los cambios en los componentes
            jPanelCentral.repaint(); // Se vuelve a dibujar el contenedor y sus componentes
        }
    }
    
    
    // Actualiza las pulsaciones en la tabla
    public void actualizarPulsaciones(Integer boton, Integer valor) {
        // Se itera sobre cada fila de la tabla
        for (int i = 0; i < jTablePulsaciones.getRowCount(); i++) {
            if (jTablePulsaciones.getValueAt(i, 0).equals(boton)) { // Se verifica si la fila coincide con la fila del botón pasado por parámetro
                jTablePulsaciones.setValueAt(valor, i, 1); // Se actualiza el valor de la fila con el parámetro valor
            }
        }
    }

    // Métodos para obtener y actualizar las selecciones
    public String obtenerSelecciones() {
        ArrayList<String> selecciones = new ArrayList<>();

        // Se verifica checkbox a checkbox si está seleccionada y se añade al ArrayList
        if (jCheckBoxLeer.isSelected()) {
            selecciones.add(jCheckBoxLeer.getText());
        }
        if (jCheckBoxEscalada.isSelected()) {
            selecciones.add(jCheckBoxEscalada.getText());
        }
        if (jCheckBoxEsquiar.isSelected()) {
            selecciones.add(jCheckBoxEsquiar.getText());
        }
        if (jCheckBoxSubmarinismo.isSelected()) {
            selecciones.add(jCheckBoxSubmarinismo.getText());
        }

        // Se convierte la lista de selecciones a una cadena
        String seleccionesTexto = String.join("\n", selecciones);

        return seleccionesTexto; // Se devuelve la cadena con las selecciones
    }
    public void actualizarTextPane(String selecciones){
        jTextPaneSelecciones.setText(selecciones); // Se actualiza el texto de jTextPaneSelecicones
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPaneles = new javax.swing.ButtonGroup();
        jPanelVentanaPrincipal = new javax.swing.JPanel();
        jPanelOpcionesPaneles = new javax.swing.JPanel();
        jLabelPaneles = new javax.swing.JLabel();
        jRadioButtonAcciones = new javax.swing.JRadioButton();
        jRadioButtonResultados = new javax.swing.JRadioButton();
        jPanelCentral = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelResultadosPanel = new javax.swing.JPanel();
        jPanelCambiarResultados = new javax.swing.JPanel();
        jLabelCambiarResultado = new javax.swing.JLabel();
        jComboBoxCambiarResultado = new javax.swing.JComboBox<>();
        jPanelResultados = new javax.swing.JPanel();
        jPanelPulsaciones = new javax.swing.JPanel();
        jLabelPulsaciones = new javax.swing.JLabel();
        jScrollPanePulsaciones = new javax.swing.JScrollPane();
        jTablePulsaciones = new javax.swing.JTable();
        jPanelSelecciones = new javax.swing.JPanel();
        jLabelSelecciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneSelecciones = new javax.swing.JTextPane();
        jPanelAccionesPanel = new javax.swing.JPanel();
        jPanelCambiarAcciones = new javax.swing.JPanel();
        jLabelCambiarAccion = new javax.swing.JLabel();
        jComboBoxCambiarAccion = new javax.swing.JComboBox<>();
        jPanelAcciones = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jPanelOpciones = new javax.swing.JPanel();
        jCheckBoxLeer = new javax.swing.JCheckBox();
        jCheckBoxEscalada = new javax.swing.JCheckBox();
        jCheckBoxEsquiar = new javax.swing.JCheckBox();
        jCheckBoxSubmarinismo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jPanelVentanaPrincipal.setLayout(new java.awt.BorderLayout());

        jPanelOpcionesPaneles.setBackground(new java.awt.Color(0, 0, 0));
        jPanelOpcionesPaneles.setMinimumSize(new java.awt.Dimension(600, 40));
        jPanelOpcionesPaneles.setPreferredSize(new java.awt.Dimension(600, 40));
        jPanelOpcionesPaneles.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabelPaneles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPaneles.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPaneles.setText("CAMBIAR PANELES:");
        jPanelOpcionesPaneles.add(jLabelPaneles);

        jRadioButtonAcciones.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupPaneles.add(jRadioButtonAcciones);
        jRadioButtonAcciones.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAcciones.setText("ACCIONES");
        jRadioButtonAcciones.setFocusable(false);
        jRadioButtonAcciones.setName("Acciones"); // NOI18N
        jPanelOpcionesPaneles.add(jRadioButtonAcciones);

        jRadioButtonResultados.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupPaneles.add(jRadioButtonResultados);
        jRadioButtonResultados.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonResultados.setText("RESULTADOS");
        jRadioButtonResultados.setFocusable(false);
        jRadioButtonResultados.setName("Resultados"); // NOI18N
        jPanelOpcionesPaneles.add(jRadioButtonResultados);

        jPanelVentanaPrincipal.add(jPanelOpcionesPaneles, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setMinimumSize(new java.awt.Dimension(600, 220));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(600, 220));
        jPanelCentral.setLayout(new java.awt.CardLayout());

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("JUEGO DE PANELES");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(600, 220));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(600, 220));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(600, 220));
        jPanelCentral.add(jLabelTitulo, "card2");

        jPanelResultadosPanel.setMinimumSize(new java.awt.Dimension(600, 260));
        jPanelResultadosPanel.setName("Resultados"); // NOI18N
        jPanelResultadosPanel.setLayout(new java.awt.BorderLayout());

        jPanelCambiarResultados.setBackground(new java.awt.Color(51, 255, 51));
        jPanelCambiarResultados.setMinimumSize(new java.awt.Dimension(600, 40));
        jPanelCambiarResultados.setPreferredSize(new java.awt.Dimension(600, 40));
        jPanelCambiarResultados.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));

        jLabelCambiarResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCambiarResultado.setText("Cambiar resultados:");
        jPanelCambiarResultados.add(jLabelCambiarResultado);

        jComboBoxCambiarResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulsaciones", "Selecciones" }));
        jPanelCambiarResultados.add(jComboBoxCambiarResultado);

        jPanelResultadosPanel.add(jPanelCambiarResultados, java.awt.BorderLayout.PAGE_START);

        jPanelResultados.setMinimumSize(new java.awt.Dimension(600, 220));
        jPanelResultados.setLayout(new java.awt.CardLayout());

        jPanelPulsaciones.setName("Pulsaciones"); // NOI18N
        jPanelPulsaciones.setPreferredSize(new java.awt.Dimension(600, 220));

        jLabelPulsaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPulsaciones.setText("RECUENTO Nº PULSACIONES de los botones ");

        jScrollPanePulsaciones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPanePulsaciones.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPanePulsaciones.setMinimumSize(new java.awt.Dimension(300, 80));
        jScrollPanePulsaciones.setPreferredSize(new java.awt.Dimension(300, 80));

        jTablePulsaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePulsaciones.setMinimumSize(new java.awt.Dimension(300, 80));
        jScrollPanePulsaciones.setViewportView(jTablePulsaciones);

        javax.swing.GroupLayout jPanelPulsacionesLayout = new javax.swing.GroupLayout(jPanelPulsaciones);
        jPanelPulsaciones.setLayout(jPanelPulsacionesLayout);
        jPanelPulsacionesLayout.setHorizontalGroup(
            jPanelPulsacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPulsacionesLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabelPulsaciones)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanelPulsacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPanePulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPulsacionesLayout.setVerticalGroup(
            jPanelPulsacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPulsacionesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelPulsaciones)
                .addGap(18, 18, 18)
                .addComponent(jScrollPanePulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanelResultados.add(jPanelPulsaciones, "card2");

        jPanelSelecciones.setName("Selecciones"); // NOI18N
        jPanelSelecciones.setPreferredSize(new java.awt.Dimension(600, 220));

        jLabelSelecciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSelecciones.setText("OPCIONES SELECCIONADAS");

        jScrollPane1.setViewportView(jTextPaneSelecciones);

        javax.swing.GroupLayout jPanelSeleccionesLayout = new javax.swing.GroupLayout(jPanelSelecciones);
        jPanelSelecciones.setLayout(jPanelSeleccionesLayout);
        jPanelSeleccionesLayout.setHorizontalGroup(
            jPanelSeleccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSeleccionesLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(jPanelSeleccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSelecciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSeleccionesLayout.setVerticalGroup(
            jPanelSeleccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelSelecciones)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelResultados.add(jPanelSelecciones, "card3");

        jPanelResultadosPanel.add(jPanelResultados, java.awt.BorderLayout.CENTER);

        jPanelCentral.add(jPanelResultadosPanel, "card4");

        jPanelAccionesPanel.setMinimumSize(new java.awt.Dimension(600, 260));
        jPanelAccionesPanel.setName("Acciones"); // NOI18N
        jPanelAccionesPanel.setLayout(new java.awt.BorderLayout());

        jPanelCambiarAcciones.setBackground(new java.awt.Color(255, 102, 102));
        jPanelCambiarAcciones.setMinimumSize(new java.awt.Dimension(600, 40));
        jPanelCambiarAcciones.setPreferredSize(new java.awt.Dimension(600, 40));
        jPanelCambiarAcciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 10));

        jLabelCambiarAccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCambiarAccion.setText("Cambiar acciones:");
        jPanelCambiarAcciones.add(jLabelCambiarAccion);

        jComboBoxCambiarAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Botones", "Opciones" }));
        jPanelCambiarAcciones.add(jComboBoxCambiarAccion);

        jPanelAccionesPanel.add(jPanelCambiarAcciones, java.awt.BorderLayout.PAGE_START);

        jPanelAcciones.setMinimumSize(new java.awt.Dimension(600, 220));
        jPanelAcciones.setLayout(new java.awt.CardLayout());

        jPanelBotones.setName("Botones"); // NOI18N
        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 30));

        jButtonB1.setText("B1");
        jButtonB1.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanelBotones.add(jButtonB1);

        jButtonB2.setText("B2");
        jButtonB2.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanelBotones.add(jButtonB2);

        jButtonB3.setText("B3");
        jButtonB3.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanelBotones.add(jButtonB3);

        jButtonB4.setText("B4");
        jButtonB4.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanelBotones.add(jButtonB4);

        jPanelAcciones.add(jPanelBotones, "card2");

        jPanelOpciones.setName("Opciones"); // NOI18N

        jCheckBoxLeer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxLeer.setText("Leer");

        jCheckBoxEscalada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxEscalada.setText("Escalada");

        jCheckBoxEsquiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxEsquiar.setText("Esquiar");

        jCheckBoxSubmarinismo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxSubmarinismo.setText("Submarinismo");

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEsquiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxEscalada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSubmarinismo))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLeer)
                    .addComponent(jCheckBoxEscalada))
                .addGap(39, 39, 39)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSubmarinismo)
                    .addComponent(jCheckBoxEsquiar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanelAcciones.add(jPanelOpciones, "card3");

        jPanelAccionesPanel.add(jPanelAcciones, java.awt.BorderLayout.CENTER);

        jPanelCentral.add(jPanelAccionesPanel, "card3");

        jPanelVentanaPrincipal.add(jPanelCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPaneles;
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonB3;
    private javax.swing.JButton jButtonB4;
    private javax.swing.JCheckBox jCheckBoxEscalada;
    private javax.swing.JCheckBox jCheckBoxEsquiar;
    private javax.swing.JCheckBox jCheckBoxLeer;
    private javax.swing.JCheckBox jCheckBoxSubmarinismo;
    private javax.swing.JComboBox<String> jComboBoxCambiarAccion;
    private javax.swing.JComboBox<String> jComboBoxCambiarResultado;
    private javax.swing.JLabel jLabelCambiarAccion;
    private javax.swing.JLabel jLabelCambiarResultado;
    private javax.swing.JLabel jLabelPaneles;
    private javax.swing.JLabel jLabelPulsaciones;
    private javax.swing.JLabel jLabelSelecciones;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelAccionesPanel;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCambiarAcciones;
    private javax.swing.JPanel jPanelCambiarResultados;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelOpcionesPaneles;
    private javax.swing.JPanel jPanelPulsaciones;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JPanel jPanelResultadosPanel;
    private javax.swing.JPanel jPanelSelecciones;
    private javax.swing.JPanel jPanelVentanaPrincipal;
    private javax.swing.JRadioButton jRadioButtonAcciones;
    private javax.swing.JRadioButton jRadioButtonResultados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePulsaciones;
    private javax.swing.JTable jTablePulsaciones;
    private javax.swing.JTextPane jTextPaneSelecciones;
    // End of variables declaration//GEN-END:variables
}
