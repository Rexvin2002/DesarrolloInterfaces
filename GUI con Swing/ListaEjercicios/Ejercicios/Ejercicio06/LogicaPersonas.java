
package Unidad01.ListaEjercicios.Ejercicio06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kgv17
 */
public class LogicaPersonas {
    private final List<Persona> listaPersonas = new ArrayList<>();

    public void añadirPersona(Persona c){
        listaPersonas.add(c);
    }
    public List<Persona> getListaPersonas(){
        return listaPersonas;
    }
    
}
