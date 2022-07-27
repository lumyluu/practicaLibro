package calculosDeEnteros;
import java.util.Scanner;
//Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
//el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π
// No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo
// como el valor que se imprimirá en una instrucción System.out.printf. Los valores producidos
// por los cálculos del área y de la circunferencia son números de punto flotante. Dichos valores
// pueden imprimirse con el especificador de formato %f en una instrucción System.out.printf.


public class Circulo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        int radioCirculo;
        double diametro, circunferencia, area;

        System.out.println("Ingrese el área de su circulo");
        radioCirculo = scanner.nextInt();

        diametro = 2* radioCirculo;
        System.out.printf("el diametro es %d",2 * radioCirculo);

        circunferencia = 2 * Math.PI * radioCirculo;
        System.out.printf("el diametro es %d",2 * radioCirculo);

        area = Math.PI * (radioCirculo * radioCirculo);
        System.out.printf("el diametro es %d",2 * radioCirculo);

    }
}
