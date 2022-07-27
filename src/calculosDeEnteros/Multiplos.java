package calculosDeEnteros;
import java.util.Scanner;
//Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e
// imprima el resultado.
public class Multiplos {
    public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);
       int  numero1, numero2, calculo;

       System.out.println ("Ingrese un número");
       numero1 = scanner.nextInt();

        System.out.println ("Ingrese un número");
        numero2 = scanner.nextInt();

        calculo = numero1 % numero2;
        if (calculo == 0){
            System.out.printf ("%s es múltiplo de %s", numero1, numero2);

        } else
            System.out.printf("%s no es múltiplo de %s", numero1, numero2);

    }
}
