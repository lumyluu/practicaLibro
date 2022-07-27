package tareaCapitulo4;
//(Kilometraje de gasolina) Los conductores se preocupan por el kilometraje de sus automóviles.
// Un conductor ha llevado el registro de varios reabastecimientos de combustible, registrando
//los kilómetros conducidos y los litros usados en cada tanque lleno. Desarrolle una aplicación en
// Java que reciba como entrada los kilómetros conducidos y los litros usados (ambos como enteros)
// por cada viaje.
// El programa debe calcular y mostrar los kilómetros por litro obtenidos en cada
// viaje, y debe imprimir el total de kilómetros por litro obtenidos en todos los viajes hasta este
// punto. Todos los cálculos del promedio deben producir resultados en números de punto flotante.
// Use la clase Scanner y la repetición controlada por centinela para obtener los datos del usuario.

import java.util.Scanner;
public class Cap4_4_17 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int kilometros = 0;
        int litrosCombustible = 0;
        int cantidadViajes;
        int contador = 0;
        double kmPorLitro = 0;
        double total = 0;
        double promedio;

        System.out.println("Ingrese cantidad de viajes");
        cantidadViajes = scanner.nextInt();


        while ( contador < cantidadViajes) {
            System.out.println("Ingrese kilómetros recorridos por viaje");
            kilometros = scanner.nextInt();
            System.out.println( " Cantidad de kilometros recorridos: " + kilometros);

            System.out.println("Ingrese litros utilizados por viaje");
            litrosCombustible = scanner.nextInt();
            System.out.println( "Cantidad de litros usados" + litrosCombustible);

            kmPorLitro = kilometros / litrosCombustible;
            System.out.println( " kilometros por litros: " + kmPorLitro);

            total =+ kmPorLitro;
            contador++;
        }

        promedio = total / cantidadViajes;

        System.out.println( " Cantidad de viajes: " + cantidadViajes);
        System.out.println( " Promedio: " + promedio);




    }
}
