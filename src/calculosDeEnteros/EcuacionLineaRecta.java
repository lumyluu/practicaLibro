package calculosDeEnteros;
// operaciones algebraicas pasadas a java

public class EcuacionLineaRecta {
    public static void main (String [] args){
        int y,m = 2,x =0,b = 4;

        // álgebra y= mX + b
       //java
        y = m * x + b;

        System.out.println ("Su resultado es: " + y);
        int z, p = 2, r = 2, q = 4, w = 2, F = 4, I = 2;

        // Álgebra: z = pr%q + w/F – I
        // java
         z = p * r % q + w / F - I;

        System.out.println ("Su resultado es: " + z);

        // Las operaciones *, % y / se evalúan primero, en orden de izquierda a derecha (es decir,
        // se asocian de izquierda a derecha), ya que tienen mayor precedencia que + y -.
        // Las operaciones + y - se evalúan a continuación.
        // Estas operaciones también se aplican de izquierda a derecha.
        // El operador de asignación (=) se evalúa al último.


    }
}
