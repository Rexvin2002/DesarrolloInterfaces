
package Unidad01.ListaEjercicios.Ejercicio08;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kgv17
 */
public class ContadorPulsaciones {

    private Map<Integer, Integer> pulsacionesBoton = new HashMap<>();

    public ContadorPulsaciones() {
        
        pulsacionesBoton.put(1, 0);
        pulsacionesBoton.put(2, 0);
        pulsacionesBoton.put(3, 0);
        pulsacionesBoton.put(4, 0);
        
    }

    // Método para incrementar el contador de pulsaciones de un botón
    public void incrementarPulsaciones(Integer boton) {
        pulsacionesBoton.put(boton, this.pulsacionesBoton.get(boton) + 1);
    }
    
    // Getter para obtener el mapa de las pulsaciones de los botones
    public Map<Integer, Integer> getPulsacionesBoton() {
        return pulsacionesBoton;
    }

    // Método para obtener las pulsaciones de un botón específico
    public Integer getPulsacionesBoton(Integer boton) {
        return pulsacionesBoton.get(boton);
    }

}
