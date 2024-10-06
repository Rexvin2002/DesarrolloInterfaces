
package Unidad01.Ejemplo03;

import java.util.Date;

/**
 *
 * @author kgv17
 */
public class Cliente {
    private String apellidos;
    private String nombre;
    private Date fechaNacimiento;
    private String ciudad;
    
    public Cliente(String apellidos, String nombre, Date fechaNacimiento, String ciudad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0]=apellidos;
        s[1]=nombre;
        s[2]=fechaNacimiento.toString();
        s[3]=ciudad;
        return s;
    }
}
