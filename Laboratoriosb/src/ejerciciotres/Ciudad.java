package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class Ciudad {

    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        establecerNombre(n);
        establecerProvincia(p);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerProvincia(String prov) {
        provincia = prov;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n\tProvincia: %s\n\t",
                obtenerNombre(), obtenerProvincia());
        return cadena;
    }
}
