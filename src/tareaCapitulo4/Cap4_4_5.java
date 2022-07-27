package tareaCapitulo4;
//Escriba una instrucción en Java para realizar cada una de las siguientes tareas:
//a) Declarar la variable suma de tipo int e inicializarla con 0.
//b) Declarar la variable x de tipo int e inicializarla con 1.
//c) Sumar la variable x a suma y asignar el resultado a la variable suma.
//d) Imprimir “La suma es: ”, seguido del valor de la variable suma.

public class Cap4_4_5 {
    public static void main (String [] args) {

        int suma = 0;
        int x = 1;

        while (x < 11) {
            suma += x;

            System.out.printf("La suma es: %d%n y x: %d%n", suma,x);
            x++;
        }
        int genero = 0;


    }
}
