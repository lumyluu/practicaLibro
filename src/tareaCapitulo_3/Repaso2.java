package tareaCapitulo_3;
import java.util.Scanner;
// Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas
    public class Repaso2 {
       public static void main (String [] args) {


           // a) Indicar que un programa calculará el producto de tres enteros.
           // Creá las variables numero1, numero2, numero3 y resultado de tipo int.
           // Calculá el producto entre los 3 números enteros.

          // b) Crear un objeto Scanner llamado entrada que lea valores de la entrada estándar.
           Scanner entrada = new Scanner (System.in);

           // c) Declarar las variables x, y, z y resultado de tipo int.
           int x,y,z, resultado;

           // d) Pedir al usuario que escriba el primer entero.
           System.out.print( "Ingrese el primer entero");

           // e) Leer el primer entero del usuario y almacenarlo en la variable x
           x = entrada.nextInt ();

           // f) Pedir al usuario que escriba el segundo entero.
           System.out.print( "Ingrese el segundo  entero");

           //g) Leer el segundo entero del usuario y almacenarlo en la variable y.
           y = entrada.nextInt();

           //h) Pedir al usuario que escriba el tercer entero.
           System.out.print( "Ingrese el tercer entero");

           //i) Leer el tercer entero del usuario y almacenarlo en la variable z
           z = entrada.nextInt();

           // j) Calcular el producto de los tres enteros contenidos
           // en las variables x, y y z, y asignar el resultado a la variable resultado.
           resultado = x * y * z;

           // k) Usar System.out.printf para mostrar el mensaje
           // “El producto es”, seguido del valor de la variable resultado.
        System.out.println ("El producto es: " + resultado);




       }
    }
