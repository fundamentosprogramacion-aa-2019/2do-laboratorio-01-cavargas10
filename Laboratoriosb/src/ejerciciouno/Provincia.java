package ejerciciouno;

/**
 *
 * @author cavargas10
 */
public class Provincia {

    private String nombre;
    private Region region;

    public Provincia(String n, Region r) {
        establecerNombre(n);
        establecerRegion(r);
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerRegion(Region r) {
        region = r;
    }

    public Region obtenerRegion() {
        return region;
    }

    public String toString() {
        String cadena = String.format("Provincia: %s\n\tRegion: %s\n\t"
                + obtenerNombre(), obtenerRegion());
        return cadena;
    }
}
