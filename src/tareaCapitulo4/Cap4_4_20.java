package tareaCapitulo4;
import java.util.Scanner;
//(Calculadora del salario) Desarrolle una aplicación en Java que determine el sueldo bruto para
// cada uno de tres empleados. La empresa paga la cuota normal en las primeras 40 horas de
//trabajo de cada empleado, y cuota y media en todas las horas trabajadas que excedan de 40.
// Usted recibe una lista de los empleados de la empresa, el número de horas que trabajó cada
// uno la semana pasada y la tarifa por horas de cada empleado. Su programa debe recibir como entrada
// esta información para cada empleado, para luego determinar y mostrar el sueldo bruto de cada
// trabajador. Utilice la clase Scanner para introducir los datos.

public class Cap4_4_20 {
    public static void main (String [] args){
        Scanner scanner = new Scanner( System.in);

        String nombre;
        int horasTrabajadas;
        double tarifa;
        int contador = 0;
        double total;
        double totalBono = 0;

        while ( contador < 3 ){
            System.out.println( "Ingrese su nombre");
            nombre = scanner.next();

            System.out.println( "Ingrese horas trabajadas");
            horasTrabajadas = scanner.nextInt();

            System.out.println("Ingrese tarifa por hora");
            tarifa = scanner.nextDouble();

            if ( horasTrabajadas <= 40){
                total = horasTrabajadas * tarifa;
                totalBono = 0;
            }
            else{
                total = 40 * tarifa;
                totalBono = total + (horasTrabajadas - 40) * (tarifa * 1.5);

            }
            System.out.println( "Nombre: " + nombre);
            System.out.println( "Horas trabajadas: " + horasTrabajadas);
            System.out.println( " Pago sin bono: " +total);
            System.out.println( "Sueldo con bono: " + totalBono);

            contador++;
        }






    }

}
