package Entities;

/**
 *
 * @author Kevin e Iván
 */
public class Usuario {

    private static int usuarioCount = 0;
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private char[] contraseña;
    private String email;
    private int telefono;
    private String provinciaCiudad;
    private String pisoPuerta;
    private String calle;

    public Usuario(String nombre, String apellidos, String nombreUsuario, char[] contraseña, String email, int telefono, String provinciaCiudad, String calle, String pisoPuerta) {
        Usuario.usuarioCount++;
        this.idUsuario = Usuario.usuarioCount;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.email = email;
        this.telefono = telefono;
        this.provinciaCiudad = provinciaCiudad;
        this.pisoPuerta = pisoPuerta;
        this.calle = calle;
    }

    public static int getUsuarioCount() {
        return usuarioCount;
    }

    public static void setUsuarioCount(int usuarioCount) {
        Usuario.usuarioCount = usuarioCount;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    public char[] getContraseña() {
        return contraseña;
    }

    public void setContraseña(char[] contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getProvinciaCiudad() {
        return provinciaCiudad;
    }

    public void setProvinciaCiudad(String provinciaCiudad) {
        this.provinciaCiudad = provinciaCiudad;
    }

    public String getPisoPuerta() {
        return pisoPuerta;
    }

    public void setPisoPuerta(String pisoPuerta) {
        this.pisoPuerta = pisoPuerta;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

}
