package JuegoDePaneles;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Main {

    public static void main(String[] args) {

        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

        Controlador controlador = new Controlador(ventanaPrincipal);
        ventanaPrincipal.setVisible(true);

    }

}
