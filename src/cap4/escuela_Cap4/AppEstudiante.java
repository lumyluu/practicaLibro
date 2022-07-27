package cap4.escuela_Cap4;

public class AppEstudiante {
    public static void main (String [] args){

        Estudiante cuenta1 = new Estudiante( "María", 93.5);
        Estudiante cuenta2 = new Estudiante ( "Manuel", 72.75);

        System.out.printf ("La calificación en letra de %s es: %s%n",
                cuenta1.getNombre(),cuenta1.getCalificacionEstudiante());
        System.out.printf ("La calificación en letra es %s es: %s%n",
        cuenta2.getNombre(), cuenta2.getCalificacionEstudiante());
    }
}
