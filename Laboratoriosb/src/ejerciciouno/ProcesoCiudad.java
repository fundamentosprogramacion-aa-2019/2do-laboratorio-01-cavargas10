package ejerciciouno;

/**
 *
 * @author cavargas10
 */
public class ProcesoCiudad {

    private Ciudad[] ciudades;
    double promediopoblacion;

    public ProcesoCiudad(Ciudad[] ciudadesp) {
        ciudades = ciudadesp;
    }

    public void establecerCiudades(Ciudad[] c) {
        ciudades = c;
    }

    public Ciudad[] obtenerCiudades() {
        return ciudades;
    }

    public void establecerPromedioPoblacion() {
        double suma = 0;

        for (int i = 0; i < ciudades.length; i++) {
            suma = ciudades[i].obtenerPoblacion() + suma;
        }

        promediopoblacion = suma / ciudades.length;
    }

    public double obtenerPromedioPoblacion() {
        return promediopoblacion;
    }

    public String toString() {
        String cadena = String.format("Promedio Poblacion: %.2f\n",
                obtenerPromedioPoblacion());

        return cadena;
    }
}
