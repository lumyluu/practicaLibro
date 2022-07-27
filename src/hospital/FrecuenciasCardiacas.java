package hospital;

import calendario.Fecha;

import java.time.LocalDate;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;


    public FrecuenciasCardiacas (String nombre, String apellido, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad (){
        int edad = LocalDate.now().getYear() - fechaNacimiento.getAnio();
        return edad;
    }

    public int getFrecuenciaCarMax (){
        int frecuenciaMaxEdad = 220 - getEdad();
        return frecuenciaMaxEdad;
    }

    public double getFrecuenciaMinEsperada (){
        return getFrecuenciaCarMax() * 0.5;

    }

    public double getFrecuenciaMaxEsperada (){
        return getFrecuenciaCarMax() * 0.85;
    }


    public String getNombre (){
        return  nombre;
    }
    public void setNombre ( String nombre){
        this.nombre = nombre;
    }

    public String getApellido (){
        return apellido;
    }
    public void setApellido ( String apellido){
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento (){
        return fechaNacimiento;
    }
    public void setFechaNacimiento ( Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString(){
        return "Legajo Paciente: " +
                "\n Nombre: " + nombre +
                "\n Apellido: " + apellido +
                "\n Fecha de nacimiento: " + fechaNacimiento +
                "\n Frecuencia cardiaca máxima: " + getFrecuenciaCarMax() +
                "\n Frecuencia cardiaca máxima esperada: " + getFrecuenciaMaxEsperada() +
                "\n Frecuencia cardiaca mínima esperada: " + getFrecuenciaMinEsperada();


    }
}
