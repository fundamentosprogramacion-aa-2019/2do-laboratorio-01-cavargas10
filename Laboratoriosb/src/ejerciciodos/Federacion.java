package ejerciciodos;

/**
 *
 * @author cavargas10
 */
public class Federacion {

    private String nombre;
    private String deporte;
    private Confederacion confederacion;

    public Federacion(String n, String d, Confederacion con) {
        establecerNombre(n);
        establecerDeporte(d);
        establecerConfederacion(con);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerDeporte(String de) {
        deporte = de;
    }

    public String obtenerDeporte() {
        return deporte;
    }

    public void establecerConfederacion(Confederacion con) {
        confederacion = con;
    }

    public Confederacion obtenerConfederacion() {
        return confederacion;
    }

    public String toString() {
        String cadena = String.format("%s\n\tDeporte: %s\n\t"
                + "Confederacion: %s\n", obtenerNombre(), obtenerDeporte(),
                obtenerConfederacion());
        return cadena;
    }

}
