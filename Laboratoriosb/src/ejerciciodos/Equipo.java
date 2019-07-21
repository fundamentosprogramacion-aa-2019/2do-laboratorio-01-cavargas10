package ejerciciodos;

/**
 *
 * @author cavargas10
 */
public class Equipo {

    private String nombre;
    private int numCampeonatos;
    private Federacion federacion;

    public Equipo(String n, int nc, Federacion fe) {
        establecerNombre(n);
        establecerNumCampeonatos(nc);
        establecerFederacion(fe);

    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNumCampeonatos(int nca) {
        numCampeonatos = nca;
    }

    public int obtenerNumCampeonatos() {
        return numCampeonatos;
    }

    public void establecerFederacion(Federacion fe) {
        federacion = fe;
    }

    public Federacion obtenerFederacion() {
        return federacion;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n\tNumero de Campeonatos: %d"
                + "\n\tFederacion: %s", obtenerNombre(), 
                obtenerNumCampeonatos(), obtenerFederacion());
        return cadena;
    }
}
