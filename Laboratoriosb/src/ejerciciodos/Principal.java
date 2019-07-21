package ejerciciodos;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        Confederacion conf1 = new Confederacion("Confederacion Sudamericana de "
                + "Futbol", "CONMEBOL");
        Confederacion conf2 = new Confederacion("Union de Asociaciones Europeas"
                + "de Futbol", "UEFA");
        Confederacion conf3 = new Confederacion("Confederacion Asiatica de "
                + "Futbol", "AFC");
        Confederacion conf4 = new Confederacion("Confederacion Africana de "
                + "Futbol", "CAF");

        Federacion f1 = new Federacion("Federacion Ecuatoriana de Futbol",
                "Futbol", conf1);
        Federacion f2 = new Federacion("Asociacion del Futbol Argentino",
                "Futbol", conf1);
        Federacion f3 = new Federacion("Real Federacion Española de Futbol",
                "Futbol", conf2);
        Federacion f4 = new Federacion("Federacion Portuguesa de Futbol",
                "Futbol", conf2);
        Federacion f5 = new Federacion("Federacion de Futbol de Australia",
                "Futbol", conf3);
        Federacion f6 = new Federacion("Asociacion de Futbol de Indonesia",
                "Futbol", conf3);
        Federacion f7 = new Federacion("Federacion Camerunesa de Futbol",
                "Futbol", conf4);
        Federacion f8 = new Federacion("Federacion Nigeriana de Futbol",
                "Futbol", conf4);

        Equipo e1 = new Equipo("Barcelona SC", 15, f1);
        Equipo e2 = new Equipo("CS Emelec", 14, f1);
        Equipo e5 = new Equipo("CA Boca Juniors", 27, f2);
        Equipo e6 = new Equipo("CA River Plate", 35, f2);
        Equipo e3 = new Equipo("Real Madrid CF", 33, f3);
        Equipo e4 = new Equipo("FC Barcelona", 26, f3);
        Equipo e7 = new Equipo("SL Benfica", 36, f4);
        Equipo e8 = new Equipo("FC Porto", 27, f4);
        Equipo e9 = new Equipo("Sydney FC", 3, f5);
        Equipo e10 = new Equipo("Persipura Jayapura", 4, f6);
        Equipo e11 = new Equipo("Coton Sport Garoua", 15, f7);
        Equipo e12 = new Equipo("Enyimba IFC", 7, f8);

        Equipo[] equipos = new Equipo[12];

        equipos[0] = e1;
        equipos[1] = e2;
        equipos[2] = e3;
        equipos[3] = e4;
        equipos[4] = e5;
        equipos[5] = e6;
        equipos[6] = e7;
        equipos[7] = e8;
        equipos[8] = e9;
        equipos[9] = e10;
        equipos[10] = e11;
        equipos[11] = e12;

        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%s\n", equipos[i]);
        }

        ProcesoEquipos proceso = new ProcesoEquipos(equipos);
        proceso.establecerPromedioCampeonatos();

        System.out.printf("%s\n", proceso);

    }

}
