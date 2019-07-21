package ejerciciodos;

/**
 *
 * @author carva
 */
public class ProcesoEquipos {

    private Equipo[] equipos;
    double promedioCampeonatos;

    public ProcesoEquipos(Equipo[] equips) {
        equipos = equips;
    }

    public void establecerEquipos(Equipo[] e) {
        equipos = e;
    }

    public Equipo[] obtenerEquipo() {
        return equipos;
    }

    public void establecerPromedioCampeonatos() {
        double suma = 0;

        for (int i = 0; i < equipos.length; i++) {
            suma = equipos[i].obtenerNumCampeonatos() + suma;
        }

        promedioCampeonatos = suma / equipos.length;
    }

    public double obtenerPromedioCampeonatos() {
        return promedioCampeonatos;
    }

    public String toString() {
        String cadena = String.format("Promedio Campeonatos: %.2f\n",
                obtenerPromedioCampeonatos());

        return cadena;
    }
}
