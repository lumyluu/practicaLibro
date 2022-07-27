package UTN;


public class NumerosDelCienAlCero {
    public static void main (String [] args){


       mostrarCada5();

        int contador2 = 100;

        while ( contador2 >= 0) {

            System.out.print(contador2 +", ");
            contador2 -=1;

            if(contador2%5==0){
                System.out.println();
            }
        }
        int contador3 = 100;

        while ( contador3 >= 0) {

            System.out.print(contador3);
            contador3 -=1;


        }

    }

    private static void mostrarCada5() {
        int contador = 100;
        while ( contador >= 0) {

            System.out.print(contador+", ");
            contador -=1;

            if(contador%5==0){
                System.out.print("\t");
            }
        }
    }
}
