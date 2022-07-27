package cap4.escuela_Cap4;
// A una clase de diez estudiantes se les aplicó un examen. Las califi caciones (enteros en el rango de 0 a 100) de
//este examen están disponibles para usted. Determine el promedio de la clase para este examen.
import java.util.Scanner;
public class RepeticionControladaConContador {
    public static void main (String [] args){
        int total = 0;
        int contador = 1;
        int calificacion;
        double promedio;

        Scanner scanner = new Scanner(System.in);

        while ( contador <= 3){
            System.out.println ("Ingrese la siguiente calificación");
            calificacion = scanner.nextInt();
            contador +=1;
            System.out.println(contador);
            total += calificacion;
        }

        promedio = total / 3;
        System.out.println( "El total de la clase es: " + total);
        System.out.println( "El promedio de la clase es: " + promedio);



    }
}
