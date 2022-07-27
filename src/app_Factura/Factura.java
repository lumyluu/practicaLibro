package app_Factura;

public class Factura {
    private String numPieza;
    private String descriPieza;
    private int cantidadArt;
    private double precioArt;

    public Factura(String numPieza, String descriPieza, int cantidadArt, double precioArt) {
        this.numPieza = numPieza;
        this.descriPieza = descriPieza;
        this.cantidadArt = cantidadArt;
        if (precioArt < 0) {
            precioArt = 0;
        }
        this.precioArt = precioArt;
    }

    public double getMontoFactura() {
        double totalPagar = cantidadArt * precioArt;
        if (totalPagar < 0) {
            totalPagar = 0;
        }
        return totalPagar;
    }


    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescriPieza() {
        return descriPieza;
    }

    public void setDescriPieza(String descriPieza) {
        this.descriPieza = descriPieza;
    }

    public int getCantidadArt() {
        return cantidadArt;
    }

    public void setCantidadArt(int cantidadArt) {
        if (cantidadArt < 0) {
            cantidadArt = 0;
        }
        this.cantidadArt = cantidadArt;
    }

    public double getPrecioArt() {
        return precioArt;
    }

    public void setPrecioArt(double precioArt) {
        if (precioArt < 0) {
            precioArt = 0;
        }
        this.precioArt = precioArt;

    }
    @Override
    public String toString(){
        return "Factura: " +
                "\n Número de pieza: " + numPieza +
                "\n Descripción pieza: " + descriPieza +
                "\n Cantidad de artículos: " + cantidadArt +
                "\n Precio artículos: " + precioArt +
                "\n Total a pagar " + getMontoFactura();
    }
}
