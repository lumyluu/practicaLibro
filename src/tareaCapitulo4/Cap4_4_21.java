package tareaCapitulo4;
//(Encontrar el número más grande) El proceso de encontrar el valor más grande se utiliza con
// frecuencia en aplicaciones de computadora. Por ejemplo, un programa para determinar el
// ganador de un concurso de ventas recibe como entrada el número de unidades vendidas por
// cada vendedor. El vendedor que haya vendido más unidades es el que gana el concurso.
// Escriba un programa en seudocódigo y después una aplicación en Java que reciba como entrada
//una serie de 10 números enteros, y que determine e imprima el mayor de los números.
// Su programa debe utilizar cuando menos las siguientes tres variables:
//a) contador: un contador para contar hasta 10 (para llevar el registro de cuántos números se han introducido,
//y para determinar cuando se hayan procesado los 10 números).
//b) numero: el entero más reciente introducido por el usuario.
//c) mayor: el número más grande encontrado hasta ahora.

import java.util.Scanner;
public class Cap4_4_21 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int mayor = 0;
        int numero = 0;



        while ( contador < 10){
            System.out.println( "Ingrese el número");
            numero = scanner.nextInt();

            if ( numero > mayor){
                mayor = numero;
            }
       contador++;
            System.out.println( "El mayor es: " + mayor);
        }




    }
}
