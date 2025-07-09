package GeneradorNombresMezclados;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
public class MixedNames {

    public String nombre1;
    public String nombre2;

    public MixedNames(String n1, String n2) {
        this.nombre1 = n1;
        this.nombre2 = n2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    // Método para generar los nombres mezclados
    public String generateMixedNames() {
        String mixedName1 = nombre1.substring(0, nombre1.length() / 2) + nombre2.substring(nombre2.length() / 2);
        String mixedName2 = nombre2.substring(0, nombre2.length() / 2) + nombre1.substring(nombre1.length() / 2);
        String mixedName3 = nombre1.substring(0, nombre1.length() / 3) + nombre2.substring(nombre2.length() / 3);
        String mixedName4 = nombre2.substring(0, nombre2.length() / 3) + nombre1.substring(nombre1.length() / 3);

        String mixedNames = mixedName1 + "  " + mixedName2 + "  " + mixedName3 + "  " + mixedName4;

        return mixedNames.toUpperCase();
    }
}
