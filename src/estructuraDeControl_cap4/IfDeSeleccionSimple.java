package estructuraDeControl_cap4;
import java.util.Scanner;
//Si la califi cación del estudiante es mayor o igual que 60
//Imprimir “Aprobado”

public class IfDeSeleccionSimple {
    public static void main (String [] args){
        int calificacionEstudiante;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese su calificación");

        calificacionEstudiante = scanner.nextInt();

        if (calificacionEstudiante > 60){
            System.out.println("Aprobado");
        }




    }
}
