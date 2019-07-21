package ejerciciouno;

/**
 *
 * @author cavargas10
 */
public class Region {

    private String nombre;

    public Region(String n) {
        establecerNombre(n);
    }

    public void establecerNombre(String nomb) {
        nombre = nomb;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String toString() {
        String cadena = String.format("%s\n\t", obtenerNombre());
        return cadena;
    }

}
