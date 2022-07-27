package tareaCapitulo4;
//Escriba instrucciones en Java para realizar cada una de las siguientes tareas:
//a) Usar una instrucción para asignar la suma de x y y a z, e incrementar x en 1 después del cálculo.
//b) Evaluar si la variable cuenta es mayor que 10. De ser así, imprimir “Cuenta es mayor que 10”.
//c) Usar una instrucción para decrementar la variable x en 1, luego restarla a la variable total
// y almacenar el resultado en la variable total.
//d) Calcular el residuo después de dividir q entre divisor, y asignar el resultado a q.
// Escriba esta instrucción de dos maneras distintas.
import java.util.Scanner;
public class IncreDosVariables {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println ("Ingrese un número entero");
        x = scanner.nextInt();

        System.out.println ("Ingrese un número entero");
        y = scanner.nextInt();

        z = x + y;
        x++;
        System.out.printf ( "Resultado de cuenta: %d%n",z);
        System.out.printf ( "Resultado de cuenta con incrementación en uno: %d%n", x);

        if ( z > 10){
            System.out.println ("La cuenta es mayor que 10");
        }

        x--;
        System.out.printf("X con incremento en uno: %d%n", x);
        z = x + y;
        System.out.printf("Resultado de cuenta: %d%n", z);

        z= - x;
        System.out.printf("Resultado de cuenta con resta: %d%n", z);


        double q = 10;
        double divisor = 3;

        q = q % divisor;
        System.out.println("Resultado de cuenta residuo:"+q);



    }
}

