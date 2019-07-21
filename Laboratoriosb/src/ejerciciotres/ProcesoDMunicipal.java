package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class ProcesoDMunicipal {

    private DepartamentoMunicipal[] dmunicipal;
    double sumapresupuestos;
    double promedioedadjefes;

    public ProcesoDMunicipal(DepartamentoMunicipal[] dmuni) {
        dmunicipal = dmuni;
    }

    public void establecerDMunicipales(DepartamentoMunicipal[] dm) {
        dmunicipal = dm;
    }

    public DepartamentoMunicipal[] obtenerDMunicipales() {
        return dmunicipal;
    }

    public void establecerSumaPresupuestos() {
        double suma = 0;

        for (int i = 0; i < dmunicipal.length; i++) {
            suma = dmunicipal[i].obtenerPresupuesto() + suma;
        }

        sumapresupuestos = suma;
    }

    public double obtenerSumaPresupuestos() {
        return sumapresupuestos;
    }

    public String toString() {
        String cadena = String.format("Suma de Prsupuestos: %.2f\n",
                obtenerSumaPresupuestos());

        return cadena;
    }
}
