package universidad_cap4;

import java.util.Scanner;

public class Examenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int aprobados = 0;
        int desaprobados = 0;
        int calificacion;

        while (contador < 10) {
            System.out.println("Introduzca el resultado del examen ( 1 para aprobados, 2 para desaprobados) ");
            calificacion = scanner.nextInt();

            if (calificacion == 1) {
                aprobados++;
                System.out.println("Cantidad de aprobados " +aprobados);
            } else if
            (calificacion == 2) {
                desaprobados++;
                System.out.println( "Cantidad de desaprobados "+ desaprobados);
            }
            contador++;
            System.out.println("Cantidad de exámenes " +contador);
        }

        if (aprobados >= 8) {
            System.out.println("Bono para el instructor");
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de aprobados: " + desaprobados);
    }
}
