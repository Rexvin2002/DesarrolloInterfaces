package Main.Frame;

import Controllers.CompraRealizada;
import Controllers.Controller;
import Controllers.Seguro;
import Controllers.Error;
import Entities.Cesta;
import Entities.Pedido;
import Entities.Producto;
import Main.Dialogs.AccesoUsuario;
import Main.Dialogs.CrearCuenta;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin e Iván
 */
public final class VentanaPrincipal extends javax.swing.JFrame {

    private Producto p1;
    private Seguro confirmarPago;
    private CompraRealizada compraRealizada;
    private Cesta cestaUsuario;
    private Pedido pedido;
    private AccesoUsuario accesoUsuario;
    private CrearCuenta crearCuenta;
    private String[] ordenDefault, filtroPizza, filtroHamb, filtroPerrito, filtroPatatas, filtroBebidas;
    private Error err;

    /**
     * Creates new form VentanaPrincipal
     */
    private CardLayout cl;

    public VentanaPrincipal() {
        initComponents();
        jSpinnerYear.setValue(2025);
        err = new Error(this, true);
        // Funcion de botones
        applyHandCursorToAllButtons(this);

        // Obtener el tamaño de la pantalla
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        // Establecer el tamaño del JFrame al tamaño de la pantalla
        this.setSize(screenSize.width / 3, screenSize.height);
        setLocationRelativeTo(null);

        accesoUsuario = new AccesoUsuario(this, true);

        configureScrollPaneWithButtons();
        inicializarPaths();
        configuraScrollVertical(ordenDefault);

        iniciarTablaCesta();

        // iniciarTablaPedidos();
        iniciarVentanaPago();

    }

    // Función de borones
    private void applyHandCursorToAllButtons(Container container) {
        // Busca botones recursivamente en todos los componentes y contenedores
        for (Component component : container.getComponents()) {
            if (component instanceof JButton button) {
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            // Si el componente es un contenedor, búsca recursivamente dentro de él
            if (component instanceof Container container1) {
                applyHandCursorToAllButtons(container1);
            }
        }
    }

    //ArrayListPaths
    private void inicializarPaths() {
        ordenDefault = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Agua.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Carbonara.png",
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_Cerdo.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Cocacola.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Jamon.png",
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_Lotus.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_Lotus.png",
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Nestea.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Peperoni.png",
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Bacon.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_BaconQueso.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_QuesoCebolla.png",
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Queso.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_Ternera.png",
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Ternera.jpeg",};

        filtroPerrito = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Bacon.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Queso.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Perrito\\Perrito_Ternera.jpeg",};
        filtroPatatas = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_Cerdo.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_Lotus.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Patatas\\Patatas_BaconQueso.jpeg",};
        filtroBebidas = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Agua.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Cocacola.jpeg",
            "src\\main\\java\\Imgs\\Vertical\\Bebidas\\Bebida_Nestea.jpeg",};
        filtroPizza = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Carbonara.png",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Jamon.png",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_Peperoni.png",
            "src\\main\\java\\Imgs\\Vertical\\Pizza\\Pizza_4Queso.png",};

        filtroHamb = new String[]{
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_Huevo.png",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_Lotus.png",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_QuesoCebolla.png",
            "src\\main\\java\\Imgs\\Vertical\\Burger\\Hamburguesa_Ternera.png",};

    }

    public String[] buscarCoincidencias(String palabraBuscada) {
        if (palabraBuscada.trim().equals(null)) {
            return null;
        }
        // Lista para almacenar las coincidencias
        ArrayList<String> coincidencias = new ArrayList<>();

        for (String ruta : ordenDefault) {
            // Extraer el nombre del archivo (entre la última barra y .png)
            String nombreArchivo = ruta.substring(ruta.lastIndexOf("\\") + 1, ruta.lastIndexOf("."));

            // Verificar si contiene la palabra buscada (ignorando mayúsculas y minúsculas)
            if (nombreArchivo.toLowerCase().contains(palabraBuscada.toLowerCase())) {
                coincidencias.add(ruta);
            }
        }

        // Convertir la lista a un arreglo y devolverlo
        return coincidencias.toArray(new String[0]);
    }

    // Scroll
    private void configureScrollPaneWithButtons() {
        // Lista de imágenes que se utilizarán para los botones
        String[] imagePaths = {
            "src\\main\\java\\Imgs\\Logo.png",
            "src\\main\\java\\Imgs\\Pizza.jpg",
            "src\\main\\java\\Imgs\\Hamburger.png",
            "src\\main\\java\\Imgs\\Patatas.jpeg",
            "src\\main\\java\\Imgs\\Perrito.jpeg",
            "src\\main\\java\\Imgs\\Bebida.jpeg",// Añade más rutas según sea necesario
        };
        jScrollPane1.setBorder(null);
        pScrollH.setLayout(new BoxLayout(pScrollH, BoxLayout.X_AXIS));
        pScrollH.setBorder(null);

        // Crear botones dinámicamente con imágenes
        for (int i = 0; i < imagePaths.length; i++) { // Ajusta el número de botones que necesites
            JButton button = new JButton();

            // Configurar tamaño del botón
            button.setPreferredSize(new Dimension(120, 140));
            button.setMaximumSize(new Dimension(120, 140));

            // Añadir borde biselado
            button.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.DARK_GRAY),
                    BorderFactory.createLineBorder(Color.BLACK, 2)
            ));

            // Establece el filtro del cursor
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // Establecer imagen si está disponible en la lista
            if (i < imagePaths.length) {
                try {
                    Controller.escalarImagenBoton(button, imagePaths[i]);
                } catch (Exception e) {
                    System.err.println("Error loading image for button " + (i + 1) + ": " + e.getMessage());
                }
            }

            // Agregar ActionListener a cada botón con una función específica
            final int buttonIndex = i + 1; // Usar una variable final para el índice
            button.addActionListener((ActionEvent e) -> {
                switch (buttonIndex) {
                    case 1 -> //Todos
                        configuraScrollVertical(ordenDefault);
                    case 2 ->
                        configuraScrollVertical(filtroPizza);
                    //Hamburguesa
                    case 3 ->
                        configuraScrollVertical(filtroHamb);
                    //Pizza
                    case 4 ->
                        configuraScrollVertical(filtroPatatas);
                    //Pizza
                    case 5 ->
                        configuraScrollVertical(filtroPerrito);
                    //Pizza
                    case 6 ->
                        configuraScrollVertical(filtroBebidas);
                    //Pizza
                }
            });

            pScrollH.add(button); // Agregar el botón al panel

            // Agregar un espacio rígido después del botón (excepto el último)
            if (i < 9) { // Corregido de 49 a 9 para coincidir con el número de botones
                pScrollH.add(Box.createRigidArea(new Dimension(20, 0))); // Espaciado horizontal
            }
        }

        // Configurar velocidad de desplazamiento del scroll
        jScrollPane1.getHorizontalScrollBar().setUnitIncrement(30); // Incremento mayor para desplazarse más rápido

        // Forzar el revalidar y repaint para actualizar el scroll
        pScrollH.revalidate();
        pScrollH.repaint();
    }

    private void configuraScrollVertical(String[] paths) {
        // Limpiar el contenido existente en el panel
        pScrollV.removeAll();

        // Configurar layout del panel principal (contenedor vertical)
        pScrollV.setLayout(new BoxLayout(pScrollV, BoxLayout.Y_AXIS));

        // Crear botones dinámicamente con imágenes
        for (int i = 0; i < paths.length; i++) { // Se basa en la longitud de `paths`
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            buttonPanel.setOpaque(false); // Hacer que el panel sea transparente

            JButton button = new JButton();
            button.setPreferredSize(new Dimension(this.getWidth() - 200, 400)); // Tamaño grande
            button.setMaximumSize(new Dimension(this.getWidth() - 200, 400)); // Evitar que cambie de tamaño
            button.setSize(button.getPreferredSize());

            // Establecer borde tipo bevel negro
            button.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK));

            // Establece el filtro del cursor
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // Establecer imagen si está disponible en la lista
            try {

                // Obtener el nombre del archivo sin ruta ni extensión
                String fileName = paths[i].substring(paths[i].lastIndexOf("\\") + 1); // Extraer desde la última barra invertida
                fileName = fileName.substring(0, fileName.lastIndexOf(".")); // Eliminar la extensión del archivo
                button.setText(fileName); // Asignar el nombre al botón   
                Controller.escalarImagenBoton(button, paths[i]);
            } catch (Exception e) {
                System.err.println("Error loading image for button " + (i + 1) + ": " + e.getMessage());
            }

            // Agregar ActionListener a cada botón con una función específica
            button.addActionListener((ActionEvent e) -> {
                this.jLabelNombreProducto.setText(button.getText());
                this.jLabelImagen.setIcon(button.getIcon());

                String buttonText = button.getText();
                String[] parts = buttonText.split("_"); // ["Pizza", "Peperoni"]
                String descripcion;
                StringBuilder finalDesc = new StringBuilder();

                // Procesar tipo y nombre
                String tipo = parts[0].toLowerCase(); // Convertir el tipo a minúsculas: "pizza"
                String nombre = String.join(" ", parts); // Recombinar con espacios: "Pizza Peperoni"
                double precio;
                switch (nombre) {
                    case "Pizza Carbonara" -> {
                        descripcion = "Una deliciosa pizza con base de crema, queso, panceta y un toque de pimienta negra.";
                        precio = 12.99;
                    }
                    case "Hamburguesa Huevo" -> {
                        descripcion = "Jugosa hamburguesa de carne acompañada de un huevo frito, lechuga fresca y pan suave.";
                        precio = 8.49;
                    }
                    case "Pizza Jamon" -> {
                        descripcion = "Clásica pizza con salsa de tomate, queso fundido y generosas lonchas de jamón.";
                        precio = 10.99;
                    }
                    case "Hamburguesa Lotus" -> {
                        descripcion = "Hamburguesa gourmet con carne premium, crujiente lechuga, y una irresistible salsa Lotus.";
                        precio = 9.99;
                    }
                    case "Pizza Peperoni" -> {
                        descripcion = "Pizza con salsa de tomate, queso derretido y rodajas de peperoni perfectamente horneadas.";
                        precio = 11.49;
                    }
                    case "Hamburguesa QuesoCebolla" -> {
                        descripcion = "Deliciosa hamburguesa con queso fundido, cebolla caramelizada y un toque de mostaza.";
                        precio = 8.99;
                    }
                    case "Hamburguesa Ternera" -> {
                        descripcion = "Hamburguesa de carne de ternera jugosa, acompañada de tomate fresco y lechuga crujiente.";
                        precio = 8.79;
                    }
                    case "Pizza 4Queso" -> {
                        descripcion = "Una pizza irresistible con una mezcla de cuatro quesos: mozzarella, gorgonzola, parmesano y cheddar.";
                        precio = 13.49;
                    }
                    case "Perrito Bacon" -> {
                        descripcion = "Perrito caliente con crujiente bacon, salchicha jugosa y un toque de mostaza, servido en pan suave.";
                        precio = 6.99;
                    }
                    case "Perrito Queso" -> {
                        descripcion = "Perrito caliente con queso fundido, salchicha ahumada y un toque de salsa barbacoa.";
                        precio = 7.49;
                    }
                    case "Perrito Ternera" -> {
                        descripcion = "Perrito caliente con una deliciosa salchicha de ternera, cebolla caramelizada y mostaza fresca.";
                        precio = 7.99;
                    }
                    case "Patatas Cerdo" -> {
                        descripcion = "Patatas fritas acompañadas de crujientes trozos de cerdo, bañadas en salsa picante.";
                        precio = 5.49;
                    }
                    case "Patatas Lotus" -> {
                        descripcion = "Patatas fritas con una mezcla especial de especias y la inconfundible salsa Lotus.";
                        precio = 5.99;
                    }
                    case "Patatas BaconQueso" -> {
                        descripcion = "Patatas crujientes cubiertas con trozos de bacon y queso fundido, acompañadas de salsa especial.";
                        precio = 6.49;
                    }
                    case "Bebida Agua" -> {
                        descripcion = "Refrescante agua mineral, ideal para acompañar cualquier comida.";
                        precio = 1.29;
                    }
                    case "Bebida Cocacola" -> {
                        descripcion = "Refresco de cola clásico, refrescante y burbujeante, perfecto para cualquier ocasión.";
                        precio = 1.99;
                    }
                    case "Bebida Nestea" -> {
                        descripcion = "Refresco de té helado Nestea, suave y refrescante, con un toque de limón.";
                        precio = 2.49;
                    }
                    default -> {
                        descripcion = "Descripción no disponible para este producto.";
                        precio = 0.0;
                    }
                }

                finalDesc.append("<html>").append(descripcion).append("</html>");

                this.p1 = new Producto(tipo, (ImageIcon) button.getIcon(), nombre, finalDesc.toString(), precio);
                iniciarDetallesproducto(this.p1);

                cl = (CardLayout) pMain.getLayout();
                cl.show(pMain, "card6");

            });

            // Agregar el botón al contenedor intermedio
            buttonPanel.add(button);

            // Agregar el contenedor al panel principal
            pScrollV.add(buttonPanel);

            // Agregar un espacio rígido después del botón (excepto el último)
            if (i < paths.length - 1) { // Evitar espacio después del último botón
                pScrollV.add(Box.createRigidArea(new Dimension(0, 20))); // Espaciado vertical
            }
        }

        // Configurar velocidad de desplazamiento del scroll
        JScrollPane scrollPane = (JScrollPane) pScrollV.getParent().getParent(); // Obtener el JScrollPane
        scrollPane.getVerticalScrollBar().setUnitIncrement(30); // Incremento mayor para desplazarse más rápido
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // Actualizar el scrollPane
        pScrollV.revalidate();
        pScrollV.repaint();
    }

    // Detalles de producto
    private void iniciarDetallesproducto(Producto p1) {
        // Obtener la imagen del producto y establecerla en el JLabel
        Icon icono = p1.getImageIcon();
        this.jLabelImagen.setIcon(icono);
        this.jLabelNombreProducto.setText(p1.getNombre());
        this.jLabelDescripcion.setText(p1.getDescripcion());
        this.jLabelPrecio.setText(String.valueOf(p1.getPrecio() + " €"));

    }

    /*
    private void inicializarIngredientes() {

        String[] ingredientes;

        // Obtener el tipo de producto
        String tipoProducto = p1.getTipo();

        // Seleccionar los ingredientes según el tipo de producto
        ingredientes = switch (tipoProducto) {
            case "Hamburguesa" ->
                new String[]{"Sin ingredientes", "Lechuga", "Tomate", "Cebolla", "Queso", "Pepinillos", "Ketchup", "Mostaza"};
            case "Pizza" ->
                new String[]{"Sin ingredientes", "Mozzarella", "Pepperoni", "Champiñones", "Aceitunas", "Orégano", "Salsa de Tomate"};
            case "Ensalada" ->
                new String[]{"Sin ingredientes", "Lechuga", "Tomate", "Zanahoria", "Aceitunas", "Cebolla", "Pepino", "Vinagreta"};
            default ->
                new String[]{"Sin ingredientes"};
        };

        // Vaciar el ComboBox si ya tiene elementos
        this.jComboBoxIngredientes.removeAllItems();

        // Añadir cada ingrediente al ComboBox
        for (String ingrediente : ingredientes) {
            this.jComboBoxIngredientes.addItem(ingrediente);
        }

        // Seleccionar el primer elemento por defecto, si hay ingredientes
        if (this.jComboBoxIngredientes.getItemCount() > 0) {
            this.jComboBoxIngredientes.setSelectedIndex(0);
        }

        // Añadir un ActionListener al ComboBox para actualizar la descripción
        this.jComboBoxIngredientes.addActionListener(e -> actualizarDescripcion());

    }

    private void actualizarDescripcion() {

       // String ingredienteSeleccionado = (String) this.jComboBoxIngredientes.getSelectedItem();

        // Si se selecciona "Sin ingredientes", limpiar los ingredientes previamente añadidos
        if ("Sin ingredientes".equals(ingredienteSeleccionado)) {

            // Eliminar la parte de los ingredientes de la descripción
            p1.setDescripcion(p1.getDescripcion().split(" Ingredientes:")[0]);

        } else {

            // Si hay un ingrediente seleccionado, añadirlo a la descripción
            if (!p1.getDescripcion().contains("Ingredientes:")) {

                p1.setDescripcion(p1.getDescripcion() + " Ingredientes: " + ingredienteSeleccionado);

            } else {

                // Si ya tiene ingredientes, añadir el nuevo ingrediente
                p1.setDescripcion(p1.getDescripcion() + ", " + ingredienteSeleccionado);

            }

        }

    }
     */
    // Cesta
    private void iniciarTablaCesta() {
        // Configurar el modelo de la tabla
        // Ajustar el ancho de la columna "Producto" a 200 píxeles

        DefaultTableModel modeloTabla = new DefaultTableModel();

        modeloTabla.setColumnIdentifiers(new String[]{"Tipo", "Producto", "Nombre", "Descripción", "Precio"});
        jTableCesta.setModel(modeloTabla);
        jTableCesta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableCesta.setRowHeight(70);
        jTableCesta.getColumnModel().getColumn(1).setPreferredWidth(70); // Ancho preferido
        jTableCesta.getColumnModel().getColumn(1).setMinWidth(70);       // Ancho mínimo
        jTableCesta.getColumnModel().getColumn(1).setMaxWidth(70);
        // Configurar el renderer para una columna con imágenes (por ejemplo, la columna "Producto")
        jTableCesta.getColumnModel().getColumn(1).setCellRenderer((JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) -> {
            JLabel label = new JLabel();
            if (value instanceof Icon icon) {
                label.setIcon(icon);
            }
            label.setOpaque(true);
            if (isSelected) {
                label.setBackground(table.getSelectionBackground());
            } else {
                label.setBackground(table.getBackground());
            }
            return label;
        });
    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCesta.getModel();
        modelo.setRowCount(0);
    }

    public void añadirProductoTabla(Producto p1) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableCesta.getModel();
        modeloTabla.addRow(p1.toArrayObject());
        actualizarSumaPrecios();
    }

    /*
    // Historial de pedidos
    private void iniciarTablaPedidos() {

        DefaultTableModel modeloTable = new DefaultTableModel();
        modeloTable.setColumnIdentifiers(new String[]{"IdPedido", "Fecha", "Usuario", "Consideraciones", "Precio Total"});
        this.jTablePedidos.setModel(modeloTable);
        //porque pollas no te va
    }
    
    public void añadirPedidoAHistorial(Pedido p) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTablePedidos.getModel();
        System.out.println(Arrays.toString(p.toArrayString()));
        Object[] ob = {"Tu padre", "La chupa", "De muerte", "la", "muy"};
        modeloTabla.addRow(ob);
        //modeloTabla.addRow(p.toArrayString());
    }
     */
    private void actualizarSumaPrecios() {
        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableCesta.getModel();

        // Inicializar suma
        double sumaTotal = 0.0;

        // Iterar sobre las filas de la tabla
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            // Obtener el valor de la última columna (Precio)
            String precioTexto = (String) modeloTabla.getValueAt(i, modeloTabla.getColumnCount() - 1);

            // Convertir el texto de precio (ejemplo: "54€") en un número
            try {
                double precio = Double.parseDouble(precioTexto.replace("€", "").trim());
                sumaTotal += precio;
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir precio: " + precioTexto);
            }
        }

        // Actualizar el JLabel con la suma total formateada
        jLabelPrecioTotal.setText(String.format("%.2f €", sumaTotal));
    }

    public String[] obtenerValoresTerceraColumna(JTable tabla) {
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        // Crear un array para almacenar los valores de la tercera columna
        String[] valores = new String[modelo.getRowCount()];

        // Recorrer todas las filas y obtener los valores de la tercera columna (índice 2)
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object valor = modelo.getValueAt(i, 2); // Índice 2 porque las columnas son 0-based
            valores[i] = valor != null ? valor.toString() : ""; // Convertir a String y manejar nulos
        }

        return valores;
    }

    public boolean validarTarjeta() {

        // Obtener valores de los componentes
        String numeroTarjeta = jTextFieldCardNumber.getText().trim();
        String cvv = jTextFieldCVV.getText().trim();
        int mes = (int) jSpinnerMonth.getValue();
        int año = (int) jSpinnerYear.getValue();

        // Validar número de tarjeta
        if (!numeroTarjeta.matches("\\d{13,19}")) {
            return false;
        }

        // Validar CVV
        if (!cvv.matches("\\d{3,4}")) {
            return false;
        }

        // Validar fecha de caducidad
        YearMonth fechaActual = YearMonth.now();
        YearMonth fechaCaducidad = YearMonth.of(año, mes);
        if (mes < 1 || mes > 12 || !fechaCaducidad.isAfter(fechaActual)) {
            return false;
        }

        // Si todo es válido
        return true;
    }

    // Ventana de pago
    private void iniciarVentanaPago() {
        Controller.escalarEstablecerImagen(this.jLabelImagenVisaMasterCard, "src\\main\\java\\Imgs\\VisaMasterCard.png");
        Controller.escalarEstablecerImagen(this.jLabelCardIcon, "src\\main\\java\\Imgs\\CardIcon2.png");
        Controller.escalarEstablecerImagen(this.jLabelCalendar, "src\\main\\java\\Imgs\\CalendarIcon2.png");
        Controller.escalarEstablecerImagen(this.jLabelLock, "src\\main\\java\\Imgs\\LockIcon2.png");
        Controller.escalarEstablecerImagen(this.jLabelQuestionIcon, "src\\main\\java\\Imgs\\QuestionIcon2.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonUsuario = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonCesta = new javax.swing.JButton();
        pMain = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        jPanelMenu1 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pScrollH = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButtonCrearCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pScrollV = new javax.swing.JPanel();
        pCesta = new javax.swing.JPanel();
        jButtonListo = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCesta = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelPrecioTotal = new javax.swing.JLabel();
        pUser = new javax.swing.JPanel();
        jButtonInformacionPersonal = new javax.swing.JButton();
        jButtonCambiarContraseña = new javax.swing.JButton();
        jLabelTitulo1 = new javax.swing.JLabel();
        jButtonCerrarSesion = new javax.swing.JButton();
        pPago = new javax.swing.JPanel();
        jPanelMain = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelPayPanel = new javax.swing.JPanel();
        jLabelCardNumber = new javax.swing.JLabel();
        jLabelCardIcon = new javax.swing.JLabel();
        jTextFieldCardNumber = new javax.swing.JTextField();
        jLabelCardNumberError = new javax.swing.JLabel();
        jLabelCaducidad = new javax.swing.JLabel();
        jLabelCalendar = new javax.swing.JLabel();
        jLabelCaducidadError = new javax.swing.JLabel();
        jLabelCVV = new javax.swing.JLabel();
        jTextFieldCVV = new javax.swing.JTextField();
        jLabelCVVError = new javax.swing.JLabel();
        jLabelLock = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPagar = new javax.swing.JButton();
        jSpinnerMonth = new javax.swing.JSpinner();
        jLabelQuestionIcon = new javax.swing.JLabel();
        jSpinnerYear = new javax.swing.JSpinner();
        jLabelImagenVisaMasterCard = new javax.swing.JLabel();
        pDetallePedido = new javax.swing.JPanel();
        jPanelMain1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jButtonAñadirCesta = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabelCantidad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pInformacionUsuario = new javax.swing.JPanel();
        jPanelMain2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCalle = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabelProvincia = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jButtonVolver1 = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPisoPuerta = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldProvinciaCiudad = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        pCambiarContraseña = new javax.swing.JPanel();
        jPanelMain3 = new javax.swing.JPanel();
        jLabelRepetirContraseña = new javax.swing.JLabel();
        jLabelNuevaContraseña = new javax.swing.JLabel();
        jLabelContraseñaAntigua = new javax.swing.JLabel();
        jLabelTitulo3 = new javax.swing.JLabel();
        jButtonCancelar1 = new javax.swing.JButton();
        jButtonConfirmar1 = new javax.swing.JButton();
        jLabelErrorContraseñasNoCoincidentes = new javax.swing.JLabel();
        jLabelErrorContraseñaAntigua = new javax.swing.JLabel();
        jPasswordFieldContraseñaAntigua = new javax.swing.JPasswordField();
        jPasswordFieldNuevaContraseña = new javax.swing.JPasswordField();
        jPasswordFieldContraseñaRepetida = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setBackground(new java.awt.Color(0, 0, 255));
        setMinimumSize(new java.awt.Dimension(850, 1000));
        setSize(new java.awt.Dimension(850, 1000));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonUsuario.setBackground(new java.awt.Color(255, 102, 0));
        jButtonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jButtonUsuario.setText("USUARIO");
        jButtonUsuario.setMaximumSize(new java.awt.Dimension(100, 55));
        jButtonUsuario.setMinimumSize(new java.awt.Dimension(100, 55));
        jButtonUsuario.setPreferredSize(new java.awt.Dimension(100, 55));
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });

        jButtonMenu.setBackground(new java.awt.Color(255, 102, 0));
        jButtonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMenu.setText("MENÚ");
        jButtonMenu.setMaximumSize(new java.awt.Dimension(100, 55));
        jButtonMenu.setMinimumSize(new java.awt.Dimension(100, 55));
        jButtonMenu.setPreferredSize(new java.awt.Dimension(100, 55));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jButtonCesta.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCesta.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCesta.setText("CESTA");
        jButtonCesta.setMaximumSize(new java.awt.Dimension(100, 55));
        jButtonCesta.setMinimumSize(new java.awt.Dimension(100, 55));
        jButtonCesta.setPreferredSize(new java.awt.Dimension(100, 55));
        jButtonCesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(jButtonCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                    .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(131, 131, 131)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pMain.setLayout(new java.awt.CardLayout());

        pMenu.setBackground(new java.awt.Color(255, 102, 0));
        pMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelMenu1.setMinimumSize(new java.awt.Dimension(800, 250));
        jPanelMenu1.setPreferredSize(new java.awt.Dimension(800, 238));

        jTextFieldBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBuscar.setPreferredSize(new java.awt.Dimension(300, 26));
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pScrollH.setBackground(new java.awt.Color(51, 51, 51));
        pScrollH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pScrollH.setLayout(new javax.swing.BoxLayout(pScrollH, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pScrollH);

        jButtonLogin.setBackground(new java.awt.Color(255, 102, 0));
        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("INICIAR SESIÓN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCrearCuenta.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCrearCuenta.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCrearCuenta.setText("CREAR CUENTA");
        jButtonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenu1Layout = new javax.swing.GroupLayout(jPanelMenu1);
        jPanelMenu1.setLayout(jPanelMenu1Layout);
        jPanelMenu1Layout.setHorizontalGroup(
            jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenu1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenu1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(jButtonLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCrearCuenta))
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30))
        );
        jPanelMenu1Layout.setVerticalGroup(
            jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenu1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonLogin)
                    .addComponent(jButtonCrearCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pScrollV.setBackground(new java.awt.Color(51, 51, 51));
        pScrollV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pScrollV.setLayout(new javax.swing.BoxLayout(pScrollV, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(pScrollV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pMain.add(pMenu, "card2");

        pCesta.setBackground(new java.awt.Color(51, 51, 51));
        pCesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonListo.setBackground(new java.awt.Color(255, 102, 0));
        jButtonListo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListo.setText("LISTO");
        jButtonListo.setPreferredSize(new java.awt.Dimension(130, 23));
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CESTA");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(800, 1000));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(800, 1000));

        jTableCesta.setBackground(new java.awt.Color(102, 102, 102));
        jTableCesta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTableCesta.setForeground(new java.awt.Color(204, 204, 204));
        jTableCesta.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCesta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableCesta.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTableCesta.setMinimumSize(new java.awt.Dimension(800, 1000));
        jTableCesta.setPreferredSize(new java.awt.Dimension(800, 1000));
        jScrollPane3.setViewportView(jTableCesta);

        jButtonVolver.setBackground(new java.awt.Color(255, 102, 0));
        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setMaximumSize(new java.awt.Dimension(130, 23));
        jButtonVolver.setMinimumSize(new java.awt.Dimension(130, 23));
        jButtonVolver.setPreferredSize(new java.awt.Dimension(130, 23));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("PRECIO TOTAL:");

        jLabelPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPrecioTotal.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout pCestaLayout = new javax.swing.GroupLayout(pCesta);
        pCesta.setLayout(pCestaLayout);
        pCestaLayout.setHorizontalGroup(
            pCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCestaLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(pCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCestaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrecioTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pCestaLayout.setVerticalGroup(
            pCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCestaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPrecioTotal))
                .addGap(20, 20, 20))
        );

        pMain.add(pCesta, "card1");

        pUser.setBackground(new java.awt.Color(51, 51, 51));
        pUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonInformacionPersonal.setBackground(new java.awt.Color(255, 102, 0));
        jButtonInformacionPersonal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonInformacionPersonal.setForeground(new java.awt.Color(0, 0, 0));
        jButtonInformacionPersonal.setText("INFORMACIÓN PERSONAL");
        jButtonInformacionPersonal.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonInformacionPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionPersonalActionPerformed(evt);
            }
        });

        jButtonCambiarContraseña.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCambiarContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCambiarContraseña.setText("CAMBIAR CONTRASEÑA");
        jButtonCambiarContraseña.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarContraseñaActionPerformed(evt);
            }
        });

        jLabelTitulo1.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("CUENTA");

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCerrarSesion.setText("CERRAR SESIÓN");
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pUserLayout = new javax.swing.GroupLayout(pUser);
        pUser.setLayout(pUserLayout);
        pUserLayout.setHorizontalGroup(
            pUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUserLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(pUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jButtonInformacionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        pUserLayout.setVerticalGroup(
            pUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonInformacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        pMain.add(pUser, "card3");

        pPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelMain.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTitle.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitle.setText("Pagar con Tarjeta");

        jPanelPayPanel.setBackground(new java.awt.Color(60, 60, 60));

        jLabelCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCardNumber.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCardNumber.setText("Nº Tarjeta:");

        jLabelCardIcon.setText(" ");
        jLabelCardIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCardIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCardIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        jTextFieldCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCardNumber.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldCardNumber.setText("4111111111111111");
        jTextFieldCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCardNumberActionPerformed(evt);
            }
        });

        jLabelCardNumberError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCardNumberError.setForeground(new java.awt.Color(204, 51, 0));
        jLabelCardNumberError.setText(" ");

        jLabelCaducidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCaducidad.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCaducidad.setText("Caducidad:");

        jLabelCalendar.setText(" ");
        jLabelCalendar.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCalendar.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCalendar.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabelCaducidadError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCaducidadError.setForeground(new java.awt.Color(204, 51, 0));
        jLabelCaducidadError.setText(" ");

        jLabelCVV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCVV.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCVV.setText("CVV:");

        jTextFieldCVV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCVV.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldCVV.setText("123");
        jTextFieldCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCVVActionPerformed(evt);
            }
        });

        jLabelCVVError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCVVError.setForeground(new java.awt.Color(204, 51, 0));
        jLabelCVVError.setText(" ");

        jLabelLock.setText(" ");
        jLabelLock.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelLock.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelLock.setPreferredSize(new java.awt.Dimension(25, 25));

        jButtonCancelar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPagar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPagar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPagar.setText("PAGAR");
        jButtonPagar.setPreferredSize(new java.awt.Dimension(120, 40));
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jSpinnerMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinnerMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabelQuestionIcon.setText(" ");
        jLabelQuestionIcon.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelQuestionIcon.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelQuestionIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanelPayPanelLayout = new javax.swing.GroupLayout(jPanelPayPanel);
        jPanelPayPanel.setLayout(jPanelPayPanelLayout);
        jPanelPayPanelLayout.setHorizontalGroup(
            jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCardNumber)
                    .addComponent(jLabelCVV)
                    .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                        .addComponent(jLabelLock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelQuestionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                        .addComponent(jLabelCardIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCardNumberError, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelCaducidad)
                    .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelCVVError, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                            .addComponent(jLabelCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                                    .addComponent(jSpinnerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jSpinnerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelCaducidadError, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanelPayPanelLayout.setVerticalGroup(
            jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPayPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelCardNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCardIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCardNumberError)
                .addGap(18, 18, 18)
                .addComponent(jLabelCaducidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCaducidadError)
                .addGap(18, 18, 18)
                .addComponent(jLabelCVV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuestionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCVVError)
                .addGap(20, 20, 20)
                .addGroup(jPanelPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabelImagenVisaMasterCard.setText(" ");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelImagenVisaMasterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImagenVisaMasterCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelPayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pPagoLayout = new javax.swing.GroupLayout(pPago);
        pPago.setLayout(pPagoLayout);
        pPagoLayout.setHorizontalGroup(
            pPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pPagoLayout.setVerticalGroup(
            pPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pMain.add(pPago, "card5");

        pDetallePedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelMain1.setBackground(new java.awt.Color(51, 51, 51));

        jLabelImagen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelImagen.setForeground(new java.awt.Color(204, 204, 204));
        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setText("IMAGEN PRODUCTO");
        jLabelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelImagen.setMaximumSize(new java.awt.Dimension(99999, 99999));
        jLabelImagen.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabelImagen.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabelNombreProducto.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabelNombreProducto.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreProducto.setText("Nombre Producto");
        jLabelNombreProducto.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jLabelNombreProducto.setMinimumSize(new java.awt.Dimension(98, 30));
        jLabelNombreProducto.setPreferredSize(new java.awt.Dimension(98, 30));

        jLabelDescripcion.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDescripcion.setText("Detalles del producto");
        jLabelDescripcion.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jLabelDescripcion.setMinimumSize(new java.awt.Dimension(207, 70));
        jLabelDescripcion.setPreferredSize(new java.awt.Dimension(207, 70));

        jLabelPrecio.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 102, 0));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio");
        jLabelPrecio.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jLabelPrecio.setMinimumSize(new java.awt.Dimension(39, 70));
        jLabelPrecio.setPreferredSize(new java.awt.Dimension(39, 70));

        jButtonAñadirCesta.setBackground(new java.awt.Color(255, 102, 0));
        jButtonAñadirCesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAñadirCesta.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAñadirCesta.setText("AÑADIR A CESTA");
        jButtonAñadirCesta.setMaximumSize(new java.awt.Dimension(277, 40));
        jButtonAñadirCesta.setMinimumSize(new java.awt.Dimension(277, 40));
        jButtonAñadirCesta.setPreferredSize(new java.awt.Dimension(277, 40));
        jButtonAñadirCesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirCestaActionPerformed(evt);
            }
        });

        jLabelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCantidad.setText("Cantidad");
        jLabelCantidad.setMaximumSize(new java.awt.Dimension(9999, 9999));

        javax.swing.GroupLayout jPanelMain1Layout = new javax.swing.GroupLayout(jPanelMain1);
        jPanelMain1.setLayout(jPanelMain1Layout);
        jPanelMain1Layout.setHorizontalGroup(
            jPanelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMain1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(jPanelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelMain1Layout.createSequentialGroup()
                            .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAñadirCesta, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanelMain1Layout.setVerticalGroup(
            jPanelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMain1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonAñadirCesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDetallePedidoLayout = new javax.swing.GroupLayout(pDetallePedido);
        pDetallePedido.setLayout(pDetallePedidoLayout);
        pDetallePedidoLayout.setHorizontalGroup(
            pDetallePedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDetallePedidoLayout.createSequentialGroup()
                .addComponent(jPanelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pDetallePedidoLayout.setVerticalGroup(
            pDetallePedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pMain.add(pDetallePedido, "card6");

        pInformacionUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelMain2.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMain2.setMinimumSize(new java.awt.Dimension(600, 450));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombre.setText("Nombre");

        jLabelCalle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCalle.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCalle.setText("Calle, nº");

        jLabelPiso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPiso.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPiso.setText("Piso, Puerta");

        jLabelProvincia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelProvincia.setForeground(new java.awt.Color(204, 204, 204));
        jLabelProvincia.setText("Provincia, Ciudad");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmail.setText("Email");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsuario.setText("Usuario");

        jLabelApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(204, 204, 204));
        jLabelApellidos.setText("Apellidos");

        jButtonVolver1.setBackground(new java.awt.Color(255, 102, 0));
        jButtonVolver1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVolver1.setText("VOLVER");
        jButtonVolver1.setPreferredSize(new java.awt.Dimension(130, 40));
        jButtonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolver1ActionPerformed(evt);
            }
        });

        jButtonConfirmar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar.setText("CONFIRMAR");
        jButtonConfirmar.setEnabled(false);
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(130, 40));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jLabelTitulo2.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("INFORMACIÓN PERSONAL");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldPisoPuerta.setEditable(false);
        jTextFieldPisoPuerta.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldPisoPuerta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPisoPuerta.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldCalle.setEditable(false);
        jTextFieldCalle.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldCalle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCalle.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldApellidos.setEditable(false);
        jTextFieldApellidos.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldUsuario.setEditable(false);
        jTextFieldUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(204, 204, 204));

        jTextFieldProvinciaCiudad.setEditable(false);
        jTextFieldProvinciaCiudad.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldProvinciaCiudad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldProvinciaCiudad.setForeground(new java.awt.Color(204, 204, 204));

        jButtonEditar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setMaximumSize(new java.awt.Dimension(130, 23));
        jButtonEditar.setMinimumSize(new java.awt.Dimension(130, 23));
        jButtonEditar.setPreferredSize(new java.awt.Dimension(130, 40));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMain2Layout = new javax.swing.GroupLayout(jPanelMain2);
        jPanelMain2.setLayout(jPanelMain2Layout);
        jPanelMain2Layout.setHorizontalGroup(
            jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMain2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMain2Layout.createSequentialGroup()
                        .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMain2Layout.createSequentialGroup()
                                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelApellidos)
                                    .addComponent(jLabelUsuario)
                                    .addComponent(jLabelNombre))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelProvincia)
                                .addComponent(jLabelPiso)
                                .addComponent(jLabelCalle)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldPisoPuerta, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jTextFieldCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jTextFieldProvinciaCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)))
                    .addComponent(jLabelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMain2Layout.createSequentialGroup()
                        .addComponent(jButtonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanelMain2Layout.setVerticalGroup(
            jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMain2Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabelTitulo2)
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProvincia)
                    .addComponent(jTextFieldProvinciaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPisoPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPiso))
                .addGap(18, 18, 18)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCalle))
                .addGap(20, 20, 20)
                .addGroup(jPanelMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pInformacionUsuarioLayout = new javax.swing.GroupLayout(pInformacionUsuario);
        pInformacionUsuario.setLayout(pInformacionUsuarioLayout);
        pInformacionUsuarioLayout.setHorizontalGroup(
            pInformacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pInformacionUsuarioLayout.setVerticalGroup(
            pInformacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pMain.add(pInformacionUsuario, "card7");

        pCambiarContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelMain3.setBackground(new java.awt.Color(51, 51, 51));

        jLabelRepetirContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRepetirContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelRepetirContraseña.setText("Repetir contraseña");

        jLabelNuevaContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNuevaContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNuevaContraseña.setText("Nueva contraseña");

        jLabelContraseñaAntigua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContraseñaAntigua.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseñaAntigua.setText("Contraseña antigua");

        jLabelTitulo3.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabelTitulo3.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo3.setText("CAMBIAR CONTRASEÑA");

        jButtonCancelar1.setBackground(new java.awt.Color(255, 102, 0));
        jButtonCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });

        jButtonConfirmar1.setBackground(new java.awt.Color(255, 102, 0));
        jButtonConfirmar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConfirmar1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConfirmar1.setText("CONFIRMAR");
        jButtonConfirmar1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButtonConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar1ActionPerformed(evt);
            }
        });

        jLabelErrorContraseñasNoCoincidentes.setForeground(new java.awt.Color(204, 51, 0));
        jLabelErrorContraseñasNoCoincidentes.setText(" ");

        jLabelErrorContraseñaAntigua.setForeground(new java.awt.Color(204, 51, 0));
        jLabelErrorContraseñaAntigua.setText(" ");

        jPasswordFieldContraseñaAntigua.setPreferredSize(new java.awt.Dimension(965, 32));

        jPasswordFieldNuevaContraseña.setMinimumSize(new java.awt.Dimension(64, 32));
        jPasswordFieldNuevaContraseña.setPreferredSize(new java.awt.Dimension(965, 32));

        jPasswordFieldContraseñaRepetida.setPreferredSize(new java.awt.Dimension(965, 32));

        javax.swing.GroupLayout jPanelMain3Layout = new javax.swing.GroupLayout(jPanelMain3);
        jPanelMain3.setLayout(jPanelMain3Layout);
        jPanelMain3Layout.setHorizontalGroup(
            jPanelMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMain3Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanelMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelErrorContraseñaAntigua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelErrorContraseñasNoCoincidentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMain3Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelContraseñaAntigua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRepetirContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNuevaContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldContraseñaAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldContraseñaRepetida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanelMain3Layout.setVerticalGroup(
            jPanelMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMain3Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabelTitulo3)
                .addGap(30, 30, 30)
                .addComponent(jLabelContraseñaAntigua)
                .addGap(9, 9, 9)
                .addComponent(jPasswordFieldContraseñaAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorContraseñaAntigua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNuevaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelRepetirContraseña)
                .addGap(8, 8, 8)
                .addComponent(jPasswordFieldContraseñaRepetida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorContraseñasNoCoincidentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCambiarContraseñaLayout = new javax.swing.GroupLayout(pCambiarContraseña);
        pCambiarContraseña.setLayout(pCambiarContraseñaLayout);
        pCambiarContraseñaLayout.setHorizontalGroup(
            pCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pCambiarContraseñaLayout.setVerticalGroup(
            pCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pMain.add(pCambiarContraseña, "card8");

        getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed

        if (accesoUsuario != null && accesoUsuario.getUsuarioLogeado() != null) {
            cl = (CardLayout) pMain.getLayout();
            cl.show(pMain, "card3");

        } else {
            accesoUsuario.setVisible(true);
        }

    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card2");
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonCestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCestaActionPerformed

        if (accesoUsuario != null && accesoUsuario.getUsuarioLogeado() != null) {
            cl = (CardLayout) pMain.getLayout();
            cl.show(pMain, "card1");

        } else {
            accesoUsuario.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCestaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String busqueda = jTextFieldBuscar.getText();
        configuraScrollVertical(buscarCoincidencias(busqueda));

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed

        if (jTableCesta.getRowCount() == 0) {
            err.setError("La cesta está vacía.");
            err.setVisible(true);
        } else {
            cl = (CardLayout) pMain.getLayout();
            cl.show(pMain, "card5");
        }

        
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card2");
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonInformacionPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionPersonalActionPerformed

        this.jTextFieldNombre.setText(accesoUsuario.getUsuarioLogeado().getNombre());
        this.jTextFieldApellidos.setText(accesoUsuario.getUsuarioLogeado().getApellidos());
        this.jTextFieldUsuario.setText(accesoUsuario.getUsuarioLogeado().getNombreUsuario());
        this.jTextFieldEmail.setText(accesoUsuario.getUsuarioLogeado().getEmail());
        this.jTextFieldProvinciaCiudad.setText(accesoUsuario.getUsuarioLogeado().getProvinciaCiudad());
        this.jTextFieldPisoPuerta.setText(accesoUsuario.getUsuarioLogeado().getPisoPuerta());
        this.jTextFieldCalle.setText(accesoUsuario.getUsuarioLogeado().getCalle());
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card7");

    }//GEN-LAST:event_jButtonInformacionPersonalActionPerformed

    private void jButtonCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarContraseñaActionPerformed

        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card8");


    }//GEN-LAST:event_jButtonCambiarContraseñaActionPerformed

    private void jButtonAñadirCestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirCestaActionPerformed

        if (accesoUsuario != null && accesoUsuario.getUsuarioLogeado() != null) {
            // Obtener la cantidad seleccionada
            int cantidadSeleccionada = (int) this.jSpinnerCantidad.getValue();
            if (cantidadSeleccionada <= 0) {

                err.setError("Selecciona almenos un producto");
                err.setVisible(true);

            } else {
                // Añadir los productos a la cesta
                for (int cantidad = 0; cantidad < cantidadSeleccionada; cantidadSeleccionada--) {
                    añadirProductoTabla(this.p1);

                }

                cl = (CardLayout) pMain.getLayout();
                cl.show(pMain, "card1");

            }

        } else {

            accesoUsuario.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAñadirCestaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card1");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolver1ActionPerformed
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card3");
    }//GEN-LAST:event_jButtonVolver1ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        this.jTextFieldNombre.setEditable(false);
        this.jTextFieldApellidos.setEditable(false);
        this.jTextFieldUsuario.setEditable(false);
        this.jTextFieldEmail.setEditable(false);
        this.jTextFieldProvinciaCiudad.setEditable(false);
        this.jTextFieldCalle.setEditable(false);
        this.jTextFieldPisoPuerta.setEditable(false);
        this.jButtonConfirmar.setEnabled(false);

        accesoUsuario.getUsuarioLogeado().setNombre(this.jTextFieldNombre.getText());
        accesoUsuario.getUsuarioLogeado().setApellidos(this.jTextFieldApellidos.getText());
        accesoUsuario.getUsuarioLogeado().setNombreUsuario(this.jTextFieldUsuario.getText());
        accesoUsuario.getUsuarioLogeado().setEmail(this.jTextFieldEmail.getText());
        accesoUsuario.getUsuarioLogeado().setProvinciaCiudad(this.jTextFieldProvinciaCiudad.getText());
        accesoUsuario.getUsuarioLogeado().setCalle(this.jTextFieldCalle.getText());
        accesoUsuario.getUsuarioLogeado().setPisoPuerta(this.jTextFieldPisoPuerta.getText());

        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card3");
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        this.jTextFieldNombre.setEditable(true);
        this.jTextFieldApellidos.setEditable(true);
        this.jTextFieldUsuario.setEditable(true);
        this.jTextFieldEmail.setEditable(true);
        this.jTextFieldProvinciaCiudad.setEditable(true);
        this.jTextFieldCalle.setEditable(true);
        this.jTextFieldPisoPuerta.setEditable(true);
        this.jButtonConfirmar.setEnabled(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card3");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar1ActionPerformed

        char[] contraseñaAntigua = this.jPasswordFieldContraseñaAntigua.getPassword();
        char[] nuevaContraseña = this.jPasswordFieldNuevaContraseña.getPassword();
        char[] contraseñaRepetida = this.jPasswordFieldContraseñaRepetida.getPassword();

        if (!Arrays.equals(contraseñaAntigua, accesoUsuario.getUsuarioLogeado().getContraseña())) {

            this.jLabelErrorContraseñaAntigua.setText("Contraseña inexistente.");

        } else if (!Arrays.equals(contraseñaRepetida, nuevaContraseña)) {

            this.jLabelErrorContraseñasNoCoincidentes.setText("Las contraseñas no coinciden");

        } else {
            accesoUsuario.getUsuarioLogeado().setContraseña(nuevaContraseña);
            cl = (CardLayout) pMain.getLayout();
            cl.show(pMain, "card3");
        }
    }//GEN-LAST:event_jButtonConfirmar1ActionPerformed

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        if (validarTarjeta() != true) {
            err.setVisible(true);
            err.setError("Los datos de la tarjeta no son correctos");
        } else {
            confirmarPago = new Seguro(this, true, jLabelPrecioTotal.getText());
            confirmarPago.setVisible(true);

            if (confirmarPago.getRespuesta()) {
                pedido = new Pedido("Loa antes posible");

                String[] productos = obtenerValoresTerceraColumna(jTableCesta);
                pedido.setPrecioTotal(jLabelPrecioTotal.getText());
                pedido.setProductos(productos);

                // añadirPedidoAHistorial(pedido);
                cl = (CardLayout) pMain.getLayout();
                cl.show(pMain, "card2");
                
                compraRealizada = new CompraRealizada(this, true);
                compraRealizada.setVisible(true);
            }
        }


    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        if (accesoUsuario.getUsuarioLogeado() == null) {
            this.accesoUsuario.setVisible(true);
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCuentaActionPerformed
        crearCuenta = new CrearCuenta(this, true);
        crearCuenta.setVisible(true);
    }//GEN-LAST:event_jButtonCrearCuentaActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.accesoUsuario.setUsuarioLogeado(null);
        limpiarTabla();
        cl = (CardLayout) pMain.getLayout();
        cl.show(pMain, "card2");
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCVVActionPerformed

    private void jTextFieldCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCardNumberActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirCesta;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCambiarContraseña;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCesta;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmar1;
    private javax.swing.JButton jButtonCrearCuenta;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonInformacionPersonal;
    private javax.swing.JButton jButtonListo;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jButtonVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCVV;
    private javax.swing.JLabel jLabelCVVError;
    private javax.swing.JLabel jLabelCaducidad;
    private javax.swing.JLabel jLabelCaducidadError;
    private javax.swing.JLabel jLabelCalendar;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCardIcon;
    private javax.swing.JLabel jLabelCardNumber;
    private javax.swing.JLabel jLabelCardNumberError;
    private javax.swing.JLabel jLabelContraseñaAntigua;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelErrorContraseñaAntigua;
    private javax.swing.JLabel jLabelErrorContraseñasNoCoincidentes;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelImagenVisaMasterCard;
    private javax.swing.JLabel jLabelLock;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JLabel jLabelNuevaContraseña;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelPrecioTotal;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JLabel jLabelQuestionIcon;
    private javax.swing.JLabel jLabelRepetirContraseña;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMain1;
    private javax.swing.JPanel jPanelMain2;
    private javax.swing.JPanel jPanelMain3;
    private javax.swing.JPanel jPanelMenu1;
    private javax.swing.JPanel jPanelPayPanel;
    private javax.swing.JPasswordField jPasswordFieldContraseñaAntigua;
    private javax.swing.JPasswordField jPasswordFieldContraseñaRepetida;
    private javax.swing.JPasswordField jPasswordFieldNuevaContraseña;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JSpinner jSpinnerMonth;
    private javax.swing.JSpinner jSpinnerYear;
    private javax.swing.JTable jTableCesta;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCVV;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCardNumber;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPisoPuerta;
    private javax.swing.JTextField jTextFieldProvinciaCiudad;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JPanel pCambiarContraseña;
    private javax.swing.JPanel pCesta;
    private javax.swing.JPanel pDetallePedido;
    private javax.swing.JPanel pInformacionUsuario;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pPago;
    private javax.swing.JPanel pScrollH;
    private javax.swing.JPanel pScrollV;
    private javax.swing.JPanel pUser;
    // End of variables declaration//GEN-END:variables
}
