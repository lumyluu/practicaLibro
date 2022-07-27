package OperadoresIncrementoDecremento;

public class Post_Pre_Incremento {
    public static void main (String [] args) {
        int c = 5;
        System.out.printf("C antes del postincremento: %d%n", c);
        System.out.printf("C antes del postincremento: %d%n", c++);
        System.out.printf("C antes del postincremento: %d%n", c);


        System.out.println();

        c = 5;
        System.out.printf("C antes del postincremento: %d%n", c);
        System.out.printf("C antes del postincremento: %d%n", ++c);
        System.out.printf("C antes del postincremento: %d%n", c);

    }
}
