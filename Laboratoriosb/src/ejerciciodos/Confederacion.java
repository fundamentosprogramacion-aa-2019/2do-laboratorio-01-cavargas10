package ejerciciodos;

/**
 *
 * @author cavargas10
 */
public class Confederacion {

    private String nombre;
    private String siglas;

    public Confederacion(String n, String s) {
        establecerNombre(n);
        establecerSiglas(s);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerSiglas(String si) {
        siglas = si;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public String toString() {
        String cadena = String.format("%s\n\tSiglas: %s\n\t",
                obtenerNombre(), obtenerSiglas());
        return cadena;
    }

}
