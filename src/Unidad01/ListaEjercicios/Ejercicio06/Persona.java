
package Unidad01.ListaEjercicios.Ejercicio06;

/**
 *
 * @author kgv17
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String deporte;
    private String nivel;
    private String fechaNacimiento;

    public Persona(String nombre, String apellidos, String deporte, String nivel, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.deporte = deporte;
        this.nivel = nivel;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0]=nombre;
        s[1]=apellidos;
        s[2]=deporte;
        s[3]=nivel;
        s[4]=fechaNacimiento;
        return s;
    }
    
}
