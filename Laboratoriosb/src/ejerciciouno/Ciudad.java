package ejerciciouno;

/**
 *
 * @author cavargas10
 */
public class Ciudad {

    private String nombre;
    private double poblacion;
    private Provincia provincia;

    public Ciudad(String n, double p, Provincia pr) {
        establecerNombre(n);
        establecerPoblacion(p);
        establecerProvincia(pr);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerPoblacion(double po) {
        poblacion = po;
    }

    public double obtenerPoblacion() {
        return poblacion;
    }

    public void establecerProvincia(Provincia pr) {
        provincia = pr;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public String toString() {
        String cadena = String.format("Ciudad: %s\n\tPoblacion: %.2f\n\t"
                + "Provincia: %s\n\tRegion: %s", obtenerNombre(), 
                obtenerPoblacion(),obtenerProvincia().obtenerNombre(), 
                obtenerProvincia().obtenerRegion());
        return cadena;
    }

}
