package calculosDeEnteros;
import java.util.Scanner;
//(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par

public class ParImpar {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        int numero1;
        int resto;

        System.out.println("Ingrese un numero ");
        numero1 = scanner.nextInt();

        resto = numero1 % 2;

        if ( resto == 0){
            System.out.println(numero1 + " Es par");

        } else {
            System.out.println(numero1 + " Es impar");
        }




    }
}
