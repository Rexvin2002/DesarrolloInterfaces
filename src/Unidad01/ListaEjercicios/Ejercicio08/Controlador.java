
package Unidad01.ListaEjercicios.Ejercicio08;

/**
 *
 * @author kgv17
 */
public class Controlador {

    // Se inicializa un objeto de la clase ContadorPulsaciones
    private final ContadorPulsaciones contadorPulsaciones = new ContadorPulsaciones();

    // Atributo que representa la Ventana Principal
    private final VentanaPrincipal ventanaPrincipal;

    // Constructor por parámetros de la clase Controlador, se inicializa la ventana y se configuran los eventos
    public Controlador(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        inicializarEventos();
    }

    // Método para configurar los eventos de las acciones de la ventana principal
    private void inicializarEventos() {
        // Añade los métodos para mostrar los àneles a los JRadioButtons y al JComboBox
        ventanaPrincipal.addAccionesAction(e -> ventanaPrincipal.mostrarPanelAcciones());
        ventanaPrincipal.addResultadosAction(e -> ventanaPrincipal.mostrarPanelResultados());
        ventanaPrincipal.addCambiarAccionAction(e -> ventanaPrincipal.mostrarAcciones());
        ventanaPrincipal.addCambiarResultadoAction(e -> ventanaPrincipal.mostrarResultados());
        
        // Añade el método para contar las pulsaciones de cada botón
        ventanaPrincipal.addButtonB1Action(e -> gestionarPulsaciones(1));
        ventanaPrincipal.addButtonB2Action(e -> gestionarPulsaciones(2));
        ventanaPrincipal.addButtonB3Action(e -> gestionarPulsaciones(3));
        ventanaPrincipal.addButtonB4Action(e -> gestionarPulsaciones(4));
        
        // Añade el método para obtener y añadir cada checkbox al TextPane
        ventanaPrincipal.addCheckBoxLeer(e -> gestionarSelecciones());
        ventanaPrincipal.addCheckBoxEscalada(e -> gestionarSelecciones());
        ventanaPrincipal.addCheckBoxEsquiar(e -> gestionarSelecciones());
        ventanaPrincipal.addCheckBoxSubmarinismo(e -> gestionarSelecciones());

    }

    // Método para incrementar las pulsaciones en la Tabla de Pulsaciones
    private void gestionarPulsaciones(Integer boton) {
        
        contadorPulsaciones.incrementarPulsaciones(boton);

        Integer pulsaciones = contadorPulsaciones.getPulsacionesBoton(boton);

        ventanaPrincipal.actualizarPulsaciones(boton, pulsaciones);
        
    }

    // Método para gestionar la selección de Checkboxs y actualizar el TextPane
    private void gestionarSelecciones() {
        String selecciones = ventanaPrincipal.obtenerSelecciones();
        ventanaPrincipal.actualizarTextPane(selecciones);
    }

}
