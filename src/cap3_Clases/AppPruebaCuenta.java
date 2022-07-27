package cap3_Clases;
import java.util.Scanner;

public class AppPruebaCuenta {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);

        Cuenta miCuenta = new Cuenta();

        System.out.printf("El nombre inicial es: %s%n%n ", miCuenta.getNombre());

        System.out.println("Ingrese el nombre");

        String elNombre = scanner.nextLine();
        miCuenta.setNombre(elNombre);
        System.out.println();

        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n", miCuenta.getNombre());
    }
}
