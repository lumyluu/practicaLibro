package empresa;

public class AppEmpleado {
    public static void main (String [] args){

        Empleado empleado1 = new Empleado("Jorge", "Amarilo", 60.000);
        System.out.println (empleado1);
        empleado1.aumentarSueldo(10);
        System.out.println (empleado1);

        Empleado empleado2 = new Empleado( "Martina", "Gonzalez", 65.000);
        System.out.println (empleado2);
        empleado1.aumentarSueldo(10);
        System.out.println (empleado2);



    }
}
