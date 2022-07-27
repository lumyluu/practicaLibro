package estructuraDeControl_cap4;
import java.util.Scanner;
//Si la califi cación del estudiante es mayor o igual que 60
//Imprimir “Aprobado”
//De lo contrario
//Imprimir “Reprobado”

public class IfDeSeleccionDoble {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int calificacionEstudiante;

        System.out.println("Ingrese su calificación");
        calificacionEstudiante = scanner.nextInt();

        if (calificacionEstudiante > 60){
            System.out.println("Aprobado");
        }
        else
            System.out.println ("Desaprobado");

    }
}
