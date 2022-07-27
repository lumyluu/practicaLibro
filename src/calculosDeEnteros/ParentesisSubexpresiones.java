package calculosDeEnteros;

// Los paréntesis se utilizan para agrupar términos en las expresiones en Java, de la misma manera que en las
//expresiones algebraicas.

public class ParentesisSubexpresiones {

    public static void main (String [] args) {

        int numero1 = 10,
                numero2 = 4,
                     numero3 = 2;

        int operacion1,
                operacion2;

        operacion1 =  numero1 * ( numero2 + numero3);

        //Si una expresión contiene paréntesis anidados,
        //se evalúa primero la expresión en el conjunto más interno de paréntesis (a + b en este caso).

        operacion2 = (( numero1 + numero2) * numero3);
    }
}

//* Multiplicación
// /División
// % Residuo
// Se evalúan primero. Si hay varios operadores de este tipo, se evalúan de izquierda a derecha.

//+ Suma
//- Resta
// Se evalúan después. Si hay varios operadores de este tipo, se evalúan de izquierda a derecha.

// = Asignación
// Se evalúa al último.