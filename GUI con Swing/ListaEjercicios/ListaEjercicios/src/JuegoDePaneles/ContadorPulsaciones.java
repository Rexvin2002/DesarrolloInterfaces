package JuegoDePaneles;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.util.HashMap;
import java.util.Map;

public class ContadorPulsaciones {

    private final Map<Integer, Integer> PULSACIONESBOTON = new HashMap<>();

    public ContadorPulsaciones() {

        PULSACIONESBOTON.put(1, 0);
        PULSACIONESBOTON.put(2, 0);
        PULSACIONESBOTON.put(3, 0);
        PULSACIONESBOTON.put(4, 0);

    }

    // Método para incrementar el contador de pulsaciones de un botón
    public void incrementarPulsaciones(Integer boton) {
        PULSACIONESBOTON.put(boton, this.PULSACIONESBOTON.get(boton) + 1);
    }

    // Getter para obtener el mapa de las pulsaciones de los botones
    public Map<Integer, Integer> getPulsacionesBoton() {
        return PULSACIONESBOTON;
    }

    // Método para obtener las pulsaciones de un botón específico
    public Integer getPulsacionesBoton(Integer boton) {
        return PULSACIONESBOTON.get(boton);
    }

}
