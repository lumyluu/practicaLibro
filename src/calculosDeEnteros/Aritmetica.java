package calculosDeEnteros;
//Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números
//del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.

import java.util.Scanner;

public class Aritmetica {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola mundo");
        int numero1, numero2, suma,resta,multiplicacion, division, resto;

        int a= 1;
        float b= 1.0f;
        char c ='a';
        boolean cb= true;
        String la = "Ludmila lalal dgahjsdg a hdaskjhhd b cnbacbmzcb adahskd h";
        double d= 2.0;


        System.out.println ("Ingrese un número entero ");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println( " Suma: " + suma + " \n Resta: " + resta + "\n Multiplicación: " +
                multiplicacion + "\n División: " + division + " \n Resto: " + resto);
    }
}
