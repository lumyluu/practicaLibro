package estructuraDeControl_cap4;
//Es el único operador ternario en
//Java (un operador que utiliza tres operandos). En conjunto, los operandos y el símbolo ?: forman
// una expresión condicional. El primer operando (a la izquierda del ?) es una expresión booleana (boolean)
//(es decir, una condición que se evalúa a un valor boolean: true o false), el segundo operando (entre el ?
//y :) es el valor de la expresión condicional si la expresión booleana es verdadera (true), y
// el tercer operando (a la derecha del :) es el valor de la expresión condicional
// si la expresión booleana se evalúa como false.
import java.util.Scanner;

public class OperadorCondicionalTernario {
    public static void main (String [] args){
        int calificacionEstudiante;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su calificación");
         calificacionEstudiante = scanner.nextInt();

        System.out.println(calificacionEstudiante >= 60 ? "Aprobado" : "Reprobado");


    }
}
