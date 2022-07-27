package calculosDeEnteros;
     import java.util.Scanner;
public class Suma {
    public static void main (String [] args ){
        Scanner scanner = new Scanner ( System.in);

        int numero1;
        int numero2;
        int suma;

        // "System" pertenece al paquete java.lang.Esta se importa de manera predeterminada
        System.out.print ("Escriba el primer numero");
        numero1 = scanner.nextInt();

        System.out.print("Escriba el segundo numero");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;

        System.out.printf("La suma es %d%n", suma);
        // %d es un receptáculo que refiere a un entero decimal

        System.out.printf ("La suma es %d%n", numero1 + numero2);

    }
}
