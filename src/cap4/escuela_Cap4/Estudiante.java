package cap4.escuela_Cap4;

public class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante (String nombre, double promedio) {

        this.nombre = nombre;
        if (promedio > 0.0) {
            if (promedio <= 100.0) {
                this.promedio = promedio;
            }
        }
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPromedio(){
        return promedio;
    }
    public void setPromedio (double promedio) {
        if (promedio > 0.0)
            if (promedio <= 100.0)
                this.promedio = promedio;
    }

    public String getCalificacionEstudiante()
    {
        String calificacionEstudiante = " ";
        if (promedio >= 90.0){
            calificacionEstudiante = "A";
        }
        else
        if (promedio >= 80.0){
            calificacionEstudiante = "B";
        }
        else
        if (promedio >= 70.0){
            calificacionEstudiante = "C";
        }
        else
        if (promedio >= 60.0){
            calificacionEstudiante = "D";
        }
        else
            calificacionEstudiante = "F";

        return calificacionEstudiante;
    }
}

