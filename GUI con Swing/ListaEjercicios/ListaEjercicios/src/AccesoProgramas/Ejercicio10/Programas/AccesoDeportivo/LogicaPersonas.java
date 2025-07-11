package AccesoProgramas.Ejercicio10.Programas.AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import accesodeportivo.Persona;
import java.util.ArrayList;
import java.util.List;

public class LogicaPersonas {

    private final List<Persona> LISTAPERSONAS = new ArrayList<>();

    public void añadirPersona(Persona c) {
        LISTAPERSONAS.add(c);
    }

    public List<Persona> getListaPersonas() {
        return LISTAPERSONAS;
    }

}
