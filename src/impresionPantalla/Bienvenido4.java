package impresionPantalla;
// Imprimir varias líneas con el método System.out.printf.
// %s sirve para ser reemplazado. Por ejemplo sustituye
//“Bienvenido a” por el primer %s y “la programacion en Java!” por el segundo %s.
// %n es un salto de línea ( especificador) No se utiliza este argumento ( %n) para el print/println.
// \n ( salto de línea), %n ( especificador)

public class Bienvenido4 {

    public static void main ( String [] args){
        System.out.printf ( "%s%n%s%n", "Bienvenido a", "la programacion en Java!");
        System.out.printf ( "Hola %s %n%s 2022 %n", "Bienvenido a", "la programacion en Java!");
    }

}
