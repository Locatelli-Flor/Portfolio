package Ejercicio2;

public class StringIgualdad {
    public static void stringIgualdad(){
        // 1
        String s1 = "Hola";
        String s2 = "Hola";
        if ( s1 == s2 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        // 2

        String s3 = new String("Hola");
        String s4 = "Hola";
        if ( s3 == s4 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        // En el primer caso, se va a ejecutar el true, ya que ambos objetos apuntan al mismo string "Hola"
        // En el segundo caso, el s3 está creando un nuevo objeto con el mismo string, y eso hace que la condición del if sea falsa,
        // no están referenciando al mismo objeto.

        // Según la organización Geeksforgeeks(2022, 8 de noviembre): "Both equals() method and the == operator are used to compare two objects in Java. == is an operator and equals() is method. But == operator compares reference or memory location of objects in a heap, whether they point to the same location or not."
        // GeeksforGeeks. (2022, November 8). Difference between comparing String using == and .equals  method in Java. https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/
        // En esta cita se puede confirmar que el operador == compara si los dos objetos apuntan al mismo espacio de memoria, no si los contenidos son iguales.

        // Una solución para el primer ejercicio es cambiar la condición del while a: !s.equals("")
    }
}
