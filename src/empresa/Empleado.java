package empresa;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }

    public void aumentarSueldo (double porcentaje){
        salarioMensual += ((salarioMensual * porcentaje) / 100);

    }

    public double getSueldoAnual (){
       return salarioMensual * 12;
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual(){
        return salarioMensual;
      }

      public void setSalarioMensual(double salarioMensual) {
          if (salarioMensual > 0) {
              this.salarioMensual = salarioMensual;
          }
      }

      @Override
    public String toString (){
        return "Empleado: " +
                "\n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Salario mensual: " + salarioMensual +
                 "\n Salario anual actual: " + getSueldoAnual();

      }
    }
