package ejeConstructor_Cap3;
//pagina 128
public class CuentaConstructor {
    private String nombre;
    private double saldo;

    // Constructor de Cuenta que recibe dos parámetros
    public CuentaConstructor(String nombre, double saldo)
    {
        this.nombre = nombre;


    // valida que el saldo sea mayor que 0.0; de lo contrario,
    // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) // si el saldo es válido
            this.saldo = saldo; // lo asigna a la variable de instancia saldo
    }

    // método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito)
    {
        System.out.println ("Su saldo actual es: $ " + getSaldo());
        if (montoDeposito > 0.0 ) // si el montoDeposito es válido
            saldo += montoDeposito; // lo suma al saldo
        System.out.println ("Su saldo actual luego de depositar es: $ " + getSaldo());
    }

    // método que devuelve el saldo de la cuenta
    public double getSaldo()
    {
        return saldo;

    }

    public void retirar (double montoRetirar) {
        System.out.println(" Su saldo actual es: $ " + getSaldo());

        if (montoRetirar < saldo) {
            saldo -= montoRetirar;
        } else {
            System.out.println(" El monto a retirar excede su saldo actual ");
        }
        System.out.println (" Su saldo actual luego del retiro es: $ " + getSaldo());

    }

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre( String nombre){

        this.nombre = nombre;
    }
}
