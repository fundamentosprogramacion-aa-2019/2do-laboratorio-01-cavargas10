package ejerciciouno;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {
        Region r1 = new Region("Costa");
        Region r2 = new Region("Sierra");
        Region r3 = new Region("Oriente");

        Provincia pr1 = new Provincia("El Oro", r1);
        Provincia pr2 = new Provincia("Guayas", r1);
        Provincia pr3 = new Provincia("Loja", r2);
        Provincia pr4 = new Provincia("Quito", r2);
        Provincia pr5 = new Provincia("Napo", r3);

        Ciudad c1 = new Ciudad("Machala", 2041606, pr1);
        Ciudad c2 = new Ciudad("Balsas", 6861, pr1);
        Ciudad c3 = new Ciudad("Guayaquil", 180617, pr2);
        Ciudad c4 = new Ciudad("Duran", 235769, pr2);
        Ciudad c5 = new Ciudad("Catamayo", 17140, pr3);
        Ciudad c6 = new Ciudad("Loja", 180617, pr3);
        Ciudad c7 = new Ciudad("Sangolqui", 75080, pr4);
        Ciudad c8 = new Ciudad("Quito", 1619000, pr4);
        Ciudad c9 = new Ciudad("Tena", 60880, pr5);
        Ciudad c10 = new Ciudad("Archidona", 4205, pr5);

        Ciudad[] ciudades = new Ciudad[10];

        ciudades[0] = c1;
        ciudades[1] = c2;
        ciudades[2] = c3;
        ciudades[3] = c4;
        ciudades[4] = c5;
        ciudades[5] = c6;
        ciudades[6] = c7;
        ciudades[7] = c8;
        ciudades[8] = c9;
        ciudades[9] = c10;

        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("%s\n", ciudades[i]);
        }

        ProcesoCiudad proceso = new ProcesoCiudad(ciudades);
        proceso.establecerPromedioPoblacion();

        System.out.printf("%s\n", proceso);
    }

}
