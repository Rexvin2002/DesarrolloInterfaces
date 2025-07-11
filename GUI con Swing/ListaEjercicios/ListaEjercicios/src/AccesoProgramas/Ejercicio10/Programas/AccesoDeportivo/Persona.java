package AccesoProgramas.Ejercicio10.Programas.AccesoDeportivo;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String deporte;
    private String nivel;

    public Persona(String nombre, String apellidos, String fechaNacimiento, String deporte, String nivel) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.deporte = deporte;
        this.nivel = nivel;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String[] toArrayString() {
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = apellidos;
        s[2] = fechaNacimiento;
        s[3] = deporte;
        s[4] = nivel;
        return s;
    }

}
