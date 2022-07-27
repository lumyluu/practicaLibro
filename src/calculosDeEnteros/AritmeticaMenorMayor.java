package calculosDeEnteros;
import java.util.Scanner;
//Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
//promedio, producto, menor y mayor de esos números.

public class AritmeticaMenorMayor {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2,numero3, suma, promedio, producto;
        int mayor, menor;

        System.out.println("Ingrese el primer número entero");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero");
        numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero");
        numero3 = scanner.nextInt();

        suma = numero1 + numero2 + numero3;
        producto = numero1 * numero2 * numero3;
        promedio = ( numero1 + numero2 + numero3) / 3;

        mayor = numero1;

        if ( mayor < numero2){
            mayor = numero2;
        }
        if ( mayor < numero3){
            mayor = numero3;

        }
        menor = numero1;
        if ( menor > numero2){
            menor = numero2;
        }
        if ( menor > numero3){
            menor = numero3;
        }
        System.out.printf (" El mayor es: %s \n" +
                "El menor es: %s \n" +
                "suma: %s \n" +
                "producto: %s \n" +
                "promedio: %s \n", mayor, menor, suma,producto,promedio);



    }
}
