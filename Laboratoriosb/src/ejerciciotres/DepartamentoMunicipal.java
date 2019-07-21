package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class DepartamentoMunicipal {

    private String nombre;
    private AreaMunicipal area;
    private double presupuesto;
    private Persona jefe;

    public DepartamentoMunicipal(String n, AreaMunicipal a, double pre,
            Persona j) {
        establecerNombre(n);
        establecerArea(a);
        establecerPresupuesto(pre);
        establecerJefe(j);
    }

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerArea(AreaMunicipal a) {
        area = a;
    }

    public AreaMunicipal obtenerArea() {
        return area;
    }

    public void establecerPresupuesto(double p) {
        presupuesto = p;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerJefe(Persona j) {
        jefe = j;
    }

    public Persona obtenerJefe() {
        return jefe;
    }

    public String toString() {
        String cadena = String.format("Departamento Municipal: %s\n\t\tArea: "
                + "%s\n\t\tPresupuesto: %.2f\n\t\tJefe: %s %s\n\t\t",
                obtenerNombre(), obtenerArea().obtenerNombre(),
                obtenerPresupuesto(), obtenerJefe().obtenerNombre(),
                obtenerJefe().obtenerApellido());
        return cadena;
    }
}
