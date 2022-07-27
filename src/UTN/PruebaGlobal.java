package UTN;

public class PruebaGlobal {

    public static String nombreUsuario = "LU";
    public static void main(String[] args) {

        System.out.println("hola "+nombreUsuario);
        decirHOla();
    }

    private static void decirHOla() {
        String apellido = "tello";
        System.out.println("hola "+nombreUsuario+ " "+apellido);
    }
}
