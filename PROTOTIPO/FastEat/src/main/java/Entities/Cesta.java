package Entities;

import java.util.ArrayList;

/**
 *
 * @author Kevin e Iván
 */
public class Cesta {

    private int idUsuario; // Identificador del usuario asociado a la cesta
    private ArrayList<Producto> productosCesta; // Lista de productos de la cesta del usuario

    // Constructor
    public Cesta(int idUsuario) {
        this.idUsuario = idUsuario;
        this.productosCesta = new ArrayList<>();
    }

    // Getter para el ID del usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    // Getter para los productos de la cesta
    public ArrayList<Producto> getProductosCesta() {
        return productosCesta;
    }

    // Método para añadir un producto a la cesta
    public void addProducto(Producto producto) {
        productosCesta.add(producto);
    }

    // Método para eliminar un producto de la cesta
    public void removeProducto(Producto producto) {
        productosCesta.remove(producto);
    }

    // Método para vaciar la cesta
    public void vaciarCesta() {
        productosCesta.clear();
    }

    // Método para mostrar los productos en la cesta
    public void mostrarCesta() {
        System.out.println("Cesta del usuario con ID: " + idUsuario);
        for (Producto producto : productosCesta) {
            System.out.println(producto);
        }
    }
}
