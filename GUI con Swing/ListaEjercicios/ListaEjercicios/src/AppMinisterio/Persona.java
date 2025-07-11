package AppMinisterio;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class Persona {

    private String profesion;
    private String hermanos;
    private String edad;
    private String sexo;
    private String deporte;
    private String compras;
    private String television;
    private String cine;

    public Persona(String profesion, Object hermanos, Object edad, String sexo, String deporte, int compras, int television, int cine) {
        this.profesion = profesion;
        this.hermanos = String.valueOf(hermanos);
        this.edad = (String) edad;
        this.sexo = sexo;
        this.deporte = deporte;
        this.compras = String.valueOf(compras);
        this.television = String.valueOf(television);
        this.cine = String.valueOf(cine);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getHermanos() {
        return hermanos;
    }

    public void setHermanos(String hermanos) {
        this.hermanos = hermanos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public String[] toArrayString() {
        String[] s = new String[8];
        s[0] = profesion;
        s[1] = hermanos;
        s[2] = edad;
        s[3] = sexo;
        s[4] = deporte;
        s[5] = compras;
        s[6] = television;
        s[7] = cine;
        return s;
    }
}
