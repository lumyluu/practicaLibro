package estructuraDeControl_cap4;
import java.util.Scanner;
//imprime A para las calificaciones de exámenes mayores o iguales
//a 90, B para las calificaciones en el rango de 80 a 89, C para las calificaciones en el rango de 70 a 79, D
//para las calificaciones en el rango de 60 a 69 y F para todas las demás calificaciones:
public class IfAnidados {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        int calificacionEstudiante;
        System.out.println("Ingrese su calificación");

        calificacionEstudiante= scanner.nextInt();

        if (calificacionEstudiante >= 90){
            System.out.println ("A");
        }
        else
            if (calificacionEstudiante >=80){
                System.out.println ("B");
            }
            else
                if (calificacionEstudiante >= 70){
                    System.out.println ("C");
                }
                else
                    if (calificacionEstudiante >= 60){
                        System.out.println ("D");
                    }
                    else
                        System.out.println("F");
    }
}
