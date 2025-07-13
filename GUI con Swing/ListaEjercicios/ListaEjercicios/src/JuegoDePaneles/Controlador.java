package JuegoDePaneles;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Controlador {

    private final ContadorPulsaciones CONTADORPULSACIONES = new ContadorPulsaciones();
    private final VentanaPrincipal VENTANAPRINCIPAL;

    public Controlador(VentanaPrincipal ventanaPrincipal) {

        this.VENTANAPRINCIPAL = ventanaPrincipal;
        inicializarEventos();

    }

    private void inicializarEventos() {

        // Añade los métodos para mostrar los àneles a los JRadioButtons y al JComboBox
        VENTANAPRINCIPAL.addAccionesAction(e -> VENTANAPRINCIPAL.mostrarPanelAcciones());
        VENTANAPRINCIPAL.addResultadosAction(e -> VENTANAPRINCIPAL.mostrarPanelResultados());
        VENTANAPRINCIPAL.addCambiarAccionAction(e -> VENTANAPRINCIPAL.mostrarAcciones());
        VENTANAPRINCIPAL.addCambiarResultadoAction(e -> VENTANAPRINCIPAL.mostrarResultados());

        // Añade el método para contar las pulsaciones de cada botón
        VENTANAPRINCIPAL.addButtonB1Action(e -> gestionarPulsaciones(1));
        VENTANAPRINCIPAL.addButtonB2Action(e -> gestionarPulsaciones(2));
        VENTANAPRINCIPAL.addButtonB3Action(e -> gestionarPulsaciones(3));
        VENTANAPRINCIPAL.addButtonB4Action(e -> gestionarPulsaciones(4));

        // Añade el método para obtener y añadir cada checkbox al TextPane
        VENTANAPRINCIPAL.addCheckBoxLeer(e -> gestionarSelecciones());
        VENTANAPRINCIPAL.addCheckBoxEscalada(e -> gestionarSelecciones());
        VENTANAPRINCIPAL.addCheckBoxEsquiar(e -> gestionarSelecciones());
        VENTANAPRINCIPAL.addCheckBoxSubmarinismo(e -> gestionarSelecciones());

    }

    // Método para incrementar las pulsaciones en la Tabla de Pulsaciones
    private void gestionarPulsaciones(Integer boton) {

        CONTADORPULSACIONES.incrementarPulsaciones(boton);
        Integer pulsaciones = CONTADORPULSACIONES.getPulsacionesBoton(boton);
        VENTANAPRINCIPAL.actualizarPulsaciones(boton, pulsaciones);

    }

    // Método para gestionar la selección de Checkboxs y actualizar el TextPane
    private void gestionarSelecciones() {

        String selecciones = VENTANAPRINCIPAL.obtenerSelecciones();
        VENTANAPRINCIPAL.actualizarTextPane(selecciones);

    }

}
