package ejerciciotres;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Machala", "El Oro");
        Ciudad c2 = new Ciudad("Loja", "Loja");
        Ciudad c3 = new Ciudad("Guayaquil", "Guayas");

        Municipio m1 = new Municipio("Municipalidad de Machala", c1);
        Municipio m2 = new Municipio("Municipalidad de Loja", c1);
        Municipio m3 = new Municipio("Municipalidad de Guayaquil", c2);
        Municipio m4 = new Municipio("Municipalidad de Guayaquil", c3);

        Persona p1 = new Persona("Carlos", "Vargas", 23);
        Persona p2 = new Persona("Andres", "Ramirez", 25);
        Persona p3 = new Persona("Sandra", "Romero", 42);
        Persona p4 = new Persona("Rodrigo", "Garcia", 46);
        Persona p5 = new Persona("Jose", "Poveda", 21);
        Persona p6 = new Persona("Joffre", "Veliz", 20);
        Persona p7 = new Persona("Cristhina", "Zapata", 22);
        Persona p8 = new Persona("Alana", "Vega", 35);
        Persona p9 = new Persona("Martina", "Vinueza", 36);
        Persona p10 = new Persona("Cristhian", "Encarnacion", 38);
        Persona p11 = new Persona("Patricio", "Villon", 34);
        Persona p12 = new Persona("Segundo", "Blacio", 52);
        Persona p13 = new Persona("Jostin", "Jimenez", 46);
        
        Persona[] person = new Persona[8];
        person[0] = p6;
        person[1] = p7;
        person[2] = p8;
        person[3] = p9;
        person[4] = p10;
        person[5] = p11;
        person[6] = p12;
        person[7] = p13;
        
        AreaMunicipal am1 = new AreaMunicipal("Urbano", p1, m1);
        AreaMunicipal am2 = new AreaMunicipal("Urbano", p2, m1);
        AreaMunicipal am3 = new AreaMunicipal("Rural", p3, m2);
        AreaMunicipal am4 = new AreaMunicipal("Rural", p4, m3);
        AreaMunicipal am5 = new AreaMunicipal("Urbano", p5, m4);

        DepartamentoMunicipal dm1 = new DepartamentoMunicipal("Matriculacion "
                + "Vehicular", am1, 15020000, p6);
        DepartamentoMunicipal dm2 = new DepartamentoMunicipal("Alcaldia", am1,
                24510000, p7);
        DepartamentoMunicipal dm3 = new DepartamentoMunicipal("Contraloria",
                am2, 18475200, p8);
        DepartamentoMunicipal dm4 = new DepartamentoMunicipal("Obras Publicas",
                am2, 16816400, p9);
        DepartamentoMunicipal dm5 = new DepartamentoMunicipal("Bomberos", am3,
                11656100, p10);
        DepartamentoMunicipal dm6 = new DepartamentoMunicipal("Policia "
                + "Nacional", am4, 21511620, p11);
        DepartamentoMunicipal dm7 = new DepartamentoMunicipal("Cabildo", am4,
                18544855, p12);
        DepartamentoMunicipal dm8 = new DepartamentoMunicipal("Centro "
                + "Historico", am5, 44465145, p13);

        DepartamentoMunicipal[] dmunicipal = new DepartamentoMunicipal[8];
        dmunicipal[0] = dm1;
        dmunicipal[1] = dm2;
        dmunicipal[2] = dm3;
        dmunicipal[3] = dm4;
        dmunicipal[4] = dm5;
        dmunicipal[5] = dm6;
        dmunicipal[6] = dm7;
        dmunicipal[7] = dm8;

        for (int i = 0; i < dmunicipal.length; i++) {
            System.out.printf("%s\n", dmunicipal[i]);
        }

        ProcesoDMunicipal proceso = new ProcesoDMunicipal(dmunicipal);
        proceso.establecerSumaPresupuestos();
        
        System.out.printf("%s\n", proceso);

        ProcesoPersona procesop = new ProcesoPersona(person);
        procesop.establecerPromedioEdadJefes();
        
        System.out.printf("%s\n", procesop);
        
    }

}
