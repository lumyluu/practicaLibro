package tareaCapitulo4;

import java.util.Scanner;
public class Cap4_4_19 {
    public static void main (String [] args){
        int SUELDO_BASE = 200;
        double PORCENTAJE_COMISION = 0.09;
        double ART_1 = 239.99;
        double ART_2 = 129.75;
        double ART_3 = 99.95;
        double ART_4 = 350.89;
        int artVendido = 1;
        double total = 0;
        double pagaSemanal;

        Scanner scanner = new Scanner( System.in);

        while ( artVendido != 0 ){
            System.out.println( "Ingrese el número de artículo vendido");
            artVendido = scanner.nextInt();

            switch (artVendido){
                case 1:
                    total += ART_1;
                    break;

                case 2:
                    total += ART_2;
                    break;

                case 3:
                    total += ART_3;
                    break;

                case 4:
                    total += ART_4;
                    break;
                default: System.out.println( "Ingrese un valor válido o 0 para salir");
            }
        }

        pagaSemanal = (total* PORCENTAJE_COMISION) + SUELDO_BASE;
        System.out.println( "Total vendido: " + total);
        System.out.println( " Sueldo semanal: " + pagaSemanal);

    }
}
