package tareaCapitulo_3;
// Indique el orden de evaluación de los operadores en cada una de las siguientes
// instrucciones en Java, y muestre el valor de x después de ejecutar cada una de ellas:

public class Repaso4 {
    public static void main (String [] args ){
        // a) x = 7 + 3 * 6 / 2 – 1;
        int x;
         x = 7 + 3 * 6 / 2 - 1;
         System.out.println ( "El total es: " + x );

         // B = 2 % 2 + 2 * 2 – 2 / 2;
        int B;
        B =  2 % 2 + 2 * 2 - 2 / 2;
        System.out.println ( "El total es: " + B );

        // c) C = (3 * 9 * (3 + (9 * 3 / (3))));
        int C;
        C =  (3 * 9 * ( 3 + ( 9 *  3 / (3))));

        System.out.println ( "El total es: " + C);


    }
}
