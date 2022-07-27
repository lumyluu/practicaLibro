package calculosDeEnteros;
// Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
//los números del usuario y muestre el número más grande, seguido de las palabras “es más grande”. Si los números son
//iguales, imprima el mensaje “Estos números son iguales”.

import java.util.Scanner;
public class ComparacionDeEnteros {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner (System.in);

        int numero1, numero2;

        System.out.println("Ingrese un número entero ");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero");
        numero2 = scanner.nextInt();

        if ( numero1 > numero2){
            System.out.println (" Es mas grande " + numero1);

        } else if ( numero1 < numero2 ){
            System.out.println ("Es mas grande " + numero2);

        }else  {
            System.out.println ( "Estos números son iguales ");
        }

    }
}
