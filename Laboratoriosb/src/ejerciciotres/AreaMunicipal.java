package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class AreaMunicipal {

    private String nombre;
    private Persona directorArea;
    private Municipio municipio;

    public AreaMunicipal(String n, Persona da, Municipio m) {
        establecerNombre(n);
        establecerDirectorArea(da);
        establecerMunicipio(m);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerDirectorArea(Persona da) {
        directorArea = da;
    }

    public Persona obtenerDirectorArea() {
        return directorArea;
    }

    public void establecerMunicipio(Municipio m) {
        municipio = m;
    }

    public Municipio obtenerMunicipio() {
        return municipio;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n\tDirector de Area: "
                + "%s %s %d\n\tMunicipio: %s %s\n\t", obtenerNombre(),
                obtenerDirectorArea().obtenerNombre(),
                obtenerDirectorArea().obtenerApellido(),
                obtenerDirectorArea().obtenerEdad(),
                obtenerMunicipio().obtenerNombre(),
                obtenerMunicipio().obtenerCiudad());
        return cadena;
    }
}
