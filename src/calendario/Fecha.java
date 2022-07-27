package calendario;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void mostrarFecha (){
        System.out.println(dia + "/" + mes + "/ " + anio );

    }



    public int getDía (){
        return  dia;
    }
    public void setDía (int dia){
        this.dia = dia;
    }


    public int getMes (){
        return mes;
    }
    public void setMes (int mes){
        this.mes = mes;
    }

    public int getAnio (){
        return anio;
    }
    public void setanio ( int anio){
        this.anio = anio;
    }


    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
