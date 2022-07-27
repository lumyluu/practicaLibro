package calculosDeEnteros;
//(Enteros menor y mayor) Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros
//mayor y menor en el grupo.
import java.util.Scanner;
public class EnterosMenorMayor {
    public static void main (String [] args ){
            Scanner scanner = new Scanner(System.in);
        int numero1, numero2,numero3, numero4, numero5;
        int mayor, menor;

        System.out.println("Ingrese un número entero ");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese un número entero ");
        numero2 = scanner.nextInt();

        System.out.println("Ingrese un número entero ");
        numero3 = scanner.nextInt();

        System.out.println("Ingrese un número entero ");
        numero4 = scanner.nextInt();

        System.out.println("Ingrese un número entero ");
        numero5 = scanner.nextInt();

        mayor = numero1;

        if ( mayor < numero2){
            mayor = numero2;

        }
        if (mayor < numero3){
            mayor = numero3;
        }
        if (mayor < numero4){
            mayor = numero4;
        }
        if ( mayor < numero5){
            mayor = numero5;
        }

        menor = numero1;

        if ( menor > numero2){
            menor = numero2;

        }
        if (menor > numero3){
            menor = numero3;
        }
        if (menor > numero4){
            menor = numero4;
        }
        if ( menor > numero5){
            menor = numero5;
        }

        System.out.printf ( "El mayor es: %s\n" +
                "El menor es: %s \n", mayor, menor);



    }
}
