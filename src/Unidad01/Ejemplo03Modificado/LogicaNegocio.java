
package Unidad01.Ejemplo03Modificado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kgv17
 */
public class LogicaNegocio {
    private final List<Cliente> listaClientes = new ArrayList<>();

    public void añadirCliente(Cliente c){
        listaClientes.add(c);
    }
    public List<Cliente> getListaClientes(){
        return listaClientes;
    }
}
