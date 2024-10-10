
package Unidad01.ListaEjercicios.Ejercicio08;

import java.util.List;


/**
 *
 * @author kgv17
 */
public class Opciones {
    
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;

    public Opciones(List<String> lista) {
        // Asignar las opciones a la lista
        lista.set(0, opcion1);
        lista.set(1, opcion2);
        lista.set(2, opcion3);
        lista.set(3, opcion4);
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String[] toArrayString(){
        String[] s = new String[4];
        s[0]=opcion1;
        s[1]=opcion2;
        s[2]=opcion3;
        s[3]=opcion4;
        return s;
    }
    
}
