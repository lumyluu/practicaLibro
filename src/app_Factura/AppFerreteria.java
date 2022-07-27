package app_Factura;
import java.util.Scanner;

public class AppFerreteria {
    public static void main (String [] args){
        Scanner scanner = new Scanner( System.in);

        System.out.println( "Ingrese el código de la Pieza ( La encontrará al reverso del producto");
        String resNumPieza = scanner.next();
        String descPieza = null;

        if ( "ADDT".equals(resNumPieza) ){

            System.out.println( "Descripcion pieza: Tornillo del 5");
            descPieza = "Tornillo del 5";
        }
        if ( "ATST".equals(resNumPieza) ){
            System.out.println( "Descripcion pieza: Destornillador estrella");
            descPieza = "Destornillador estrella";

        }

        System.out.println( "Ingrese cantidad de artículos");
        int resCantidadArt = scanner.nextInt();

        System.out.println( "Ingrese el precio del artículo");
        int resPrecioAr = scanner.nextInt();


        Factura miFactura = new Factura (resNumPieza, descPieza, resCantidadArt,resPrecioAr );
        System.out.println(miFactura);
    }
}
