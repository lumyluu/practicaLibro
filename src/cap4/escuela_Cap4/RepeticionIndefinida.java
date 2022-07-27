package cap4.escuela_Cap4;
// El usuario escribe calificaciones hasta que se haya introducido el número correcto de ellas. Después,
//el usuario escribe el valor centinela para indicar que no se van a introducir más calificaciones.
// A la repetición controlada por centinela a menudo se le llama repetición indefinida, ya que el número
//de repeticiones no se conoce antes de que comience la ejecución del ciclo.

import java.util.Scanner;
public class RepeticionIndefinida {
    public static void main (String [] args) {
        int total = 0;
        int calificacion = 0;
        double promedio;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la siguiente calificación. Para finalizar ingrese -1");
        calificacion = scanner.nextInt();

        while (calificacion != -1) {

            if (calificacion != -1) {
                total += calificacion;
                contador++;

                System.out.println("Ingrese la siguiente calificación. Para finalizar ingrese -1");
                calificacion = scanner.nextInt();
            }

            if ( contador !=0){
                promedio = total / contador;
                System.out.println(" El total de la clase es: " + total);
                System.out.println(" El promedio de la clase es: " + promedio);
            }
            else{
                System.out.println(" No se introdujeron calificaciones " );
            }


        }
    }
    }



