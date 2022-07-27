package ejeConstructor_Cap3;

import java.util.Scanner;

public class AppPruebaCuentaConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CuentaConstructor cuenta1 = new CuentaConstructor("Jane Green", 50);
        CuentaConstructor cuenta2 = new CuentaConstructor("John Blue", -7.53);


        int respuesta = 1;

        while (respuesta != 0) {
            System.out.printf("Saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
            System.out.println("Ingrese la acción que desee realizar: \n 1 - depositar \n 2 - retirar  \n 0 - salir");
            respuesta = scanner.nextInt();

            switch (respuesta) {
                case 0:
                    System.out.println("Gracias por utilizar nuestros servicios ");
                    break;
                case 1:
                    System.out.println("Escriba su monto a depositar para cuenta 1: ");
                    double montoDeposito = scanner.nextDouble();
                    cuenta1.depositar(montoDeposito);
                    break;
                case 2:
                    System.out.println("Escriba su monto a retirar para cuenta1: ");
                    System.out.println("Ingrese el montona retirar");
                    double montoRetirar = scanner.nextDouble();
                    cuenta1.retirar(montoRetirar);
                    break;
                default:
                    System.out.println("Ingrese una opción válida");

            }
        }

        //%.(cantidad de comas que quiero correr)f
    }

}
