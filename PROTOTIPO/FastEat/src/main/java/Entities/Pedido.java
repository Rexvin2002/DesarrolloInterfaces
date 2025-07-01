package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kevin e Iván
 */
public class Pedido {

    private static int idCounter = 0;
    private int idPedido;
    private String[] productos;
    private String consideraciones,precio;

    public Pedido(String consideraciones) {
        Pedido.idCounter++;
        this.idPedido = Pedido.idCounter;
        this.consideraciones = consideraciones;
    }

    public static int getIdCounter() {
        return Pedido.idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Pedido.idCounter = idCounter;
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }
    
    public void setPrecioTotal(String precio){
        this.precio=precio;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String detalles) {
        this.consideraciones = detalles;
    }

    public String[] toArrayString() {

        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        String[] s = new String[5];
        s[0] = String.valueOf(this.idPedido);
        s[1] = String.valueOf(fecha);
        // s[2]=AccesoUsuario.usuarioLogeado.getNombre();
        s[2] = "user";
        s[3] = this.consideraciones;
        s[4] = precio;

        return s;

    }

}
