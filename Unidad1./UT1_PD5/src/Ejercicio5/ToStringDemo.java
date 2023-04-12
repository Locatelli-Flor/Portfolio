package Ejercicio5;

public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }

}

// 1) La salida al ejecutarlo es: 3 dígitos antes de la coma y 2 dígitos despues de la coma

// 2) El programa convierte a string el número d. Al hacer esto, se utiliza la función
// indexOf para determinar en qué posición está puesto el punto.
// Como el índice de los strings comienza en cero, la posición del punto en el
// string va a corresponder a la cantidad de números antes del punto.

// El segundo printIn toma el largo del string, le resta los caractéres hasta el
// punto, sin incluirlo. El menos uno se tiene que agregar porque la función lenght
// comienza a contar desde 1, mientras que la función indexOf comienza desde el 0,
// por lo que sobra un caractér que hay que eliminar.

