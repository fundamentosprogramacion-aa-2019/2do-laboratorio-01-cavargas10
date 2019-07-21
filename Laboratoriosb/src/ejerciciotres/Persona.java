package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String n, String a, int e) {
        establecerNombre(n);
        establecerApellido(a);
        establecerEdad(e);
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerEdad(int ed) {
        edad = ed;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n\tApellido: %s\n\t"
                + "Edad: %d\n\t", obtenerNombre(), obtenerApellido(),
                obtenerEdad());
        return cadena;
    }
}
