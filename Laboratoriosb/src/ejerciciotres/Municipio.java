package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class Municipio {

    private String nombre;
    private Ciudad ciudad;

    public Municipio(String n, Ciudad ciu) {
        establecerNombre(n);
        establecerCiudad(ciu);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n\tCiudad: %s\n\t",
                obtenerNombre(), obtenerCiudad());
        return cadena;
    }
}
