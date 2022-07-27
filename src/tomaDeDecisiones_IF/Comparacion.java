package tomaDeDecisiones_IF;
//Compara enteros utilizando instrucciones if, operadores relacionales  y de igualdad.
import java.util.Scanner;
public class Comparacion {
    public static void main ( String [] args){
        Scanner scanner = new Scanner (System.in);

        int numero1,
                numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = scanner.nextInt();

        System.out.println("Escriba el segundo entero: ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2)

        System.out.printf( "%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf( "%d != %d%n", numero1, numero2);

        if  (numero1 < numero2)
            System.out.printf( "%d < %d%n", numero1, numero2);

        if  (numero1 > numero2)
            System.out.printf( "%d > %d%n", numero1, numero2);

        if  (numero1 <= numero2)
            System.out.printf( "%d <= %d%n", numero1, numero2);

        if  (numero1 >= numero2)
            System.out.printf( "%d >= %d%n", numero1, numero2);



    }

}
