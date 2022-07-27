package cap4.escuela_Cap4;

import java.util.Scanner;

public class RepeticionConExcepcion {
    public static void main (String [] args){
        int total = 0;
        int contador = 1;
        int calificacion;
        double promedio;

        Scanner scanner = new Scanner(System.in);

        while ( contador <= 3){
            System.out.println ("Ingrese la siguiente calificación");
            try{ // try es intentar - si coloco algo que no sea del 0 al 100 salta a catch
                calificacion = scanner.nextInt();
                contador +=1;
                System.out.println(contador);
                total += calificacion;
            }catch (Exception e){ // catch es agarrar la exepcion
                System.out.println("Introduzca un número del 0 al 100");
            }
        }


        promedio = total / 3;
        System.out.println( "El total de la clase es: " + total);
        System.out.println( "El promedio de la clase es: " + promedio);




    }
}
