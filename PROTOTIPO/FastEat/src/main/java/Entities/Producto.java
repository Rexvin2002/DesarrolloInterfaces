package Entities;

import javax.swing.ImageIcon;
import Controllers.Controller;

/**
 *
 * @author Kevin e Iván
 */
public class Producto {

    private static int idCounter = 0;
    private int idProducto;
    private String tipo;
    private ImageIcon imageIcon;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String tipo, ImageIcon imageIcon, String nombre, String descripcion, double precio) {
        Producto.idCounter++;
        this.idProducto = Producto.idCounter;
        this.tipo = tipo;
        this.imageIcon = imageIcon;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Producto.idCounter = idCounter;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ImageIcon getImageIcon() {
        return this.imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Object[] toArrayObject() {

        Object[] s = new Object[5];
        s[0] = this.tipo;
        s[1] = Controller.escalarImagenTabla(this.imageIcon);
        s[2] = this.nombre;
        s[3] = this.descripcion;
        s[4] = String.valueOf(this.precio) + " €";

        return s;

    }
}
