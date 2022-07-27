package calculosDeEnteros;
import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main ( String [] args ){
        Scanner scanner = new Scanner (System.in);

        int numero1,
            numero2;
        int suma, multiplicacion, division, resta, residuo;


        System.out.print("Ingrese primer numero");
        numero1 = scanner.nextInt();

        System.out.print ("Ingrese el segundo numero");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;
        System.out.print ("Suma: " + suma + "\n");

        resta= numero1 - numero2;
        System.out.print("Resta: " + resta + "\n");

        multiplicacion = numero1 * numero2;
        System.out.print( "Multiplicacion: " + multiplicacion + "\n");

        division = numero1 / numero2;
        System.out.print( "Division: " + division + "\n");

        residuo =  numero1 % numero2;
        System.out.print( "Residuo: " + division + "\n");
    }
}
