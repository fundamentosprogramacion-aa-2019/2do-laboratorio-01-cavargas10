/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

/**
 *
 * @author carva
 */
public class ProcesoPersona {

    private Persona[] person;
    double promedioedadjefes;

    public ProcesoPersona(Persona[] per) {
        person = per;
    }

    public void establecerEdadJefes(Persona[] p) {
        person = p;
    }

    public Persona[] obtenerEdadJefes() {
        return person;
    }

    public void establecerPromedioEdadJefes() {
        double suma = 0;

        for (int i = 0; i < person.length; i++) {
            suma = person[i].obtenerEdad() + suma;
        }

        promedioedadjefes = suma / person.length;
    }

    public double obtenerPromedioEdadJefes() {
        return promedioedadjefes;
    }

    public String toString() {
        String cadena = String.format("Promedio Edad de Jefes: %.2f\n",
                obtenerPromedioEdadJefes());

        return cadena;
    }
}
