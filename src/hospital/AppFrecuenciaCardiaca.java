package hospital;

import calendario.Fecha;

public class AppFrecuenciaCardiaca {
    public static void main (String [] args ){
        Fecha fecha = new Fecha(23,12,1996);
        FrecuenciasCardiacas paciente1 = new FrecuenciasCardiacas( "Juan", "Manzilla", fecha);
        System.out.println (paciente1);
    }
}
