package Ejercicio1;

import java.util.ArrayList;

public class PruebaJava {

    // Casos de nombres de variables o métodos que no compilan y cuáles errores dan:

    //Caso 1: variable estática con una palabra reservada como identificador
    //static int abstract = 5; Error: java.lang.RuntimeException: Uncompilable code - <identifier> expected

    public static void main(String[] args) {

        // Caso 2: variable de instancia con una palabra reservada como identificador:
        // int float = 0; Error: Exception in thread "main" java.lang.RuntimeException: Uncompilable code - not a statement
        METODO();
        metodoPrueba();

    }

    public static void metodoPrueba(){
        // Caso 3: variable local con una palabra reservada como identificador.
        // String new = "hola"; Error Exception in thread "main" java.lang.RuntimeException: Uncompilable code - not a statement
    }

    // Caso 4: variable de parámetro con una palabra reservada como identificador
    // public static void metodoPrueba2(int abstract){

    // } Error: java.lang.ClassFormatError: Absent Code attribute in method that is not native or abstract in class file com/mycompany/pruebajava/PruebaJava

    // Aclaración: estos errores también ocurren cuando el identificador de una variable (de cualquier tipo) o método comienza con un símbolo o número.


    // Casos de nombres de variables o métodos que compilan, pero son malas prácticas:

    // Caso 1: Los nombres de las constantes (variables que no cambian de valor) deben ir siempre en mayúscula, y en caso de tener más de una palabra,
    // separar con guiones bajos.
    int constanteNumerica = 1; // Mala práctica, el nombre debería ser "CONSTANTE_NUMERICA"

    // Caso 2: El nombre de los métodos deben comenzar con minúsculas, y en caso de que haya más de una palabra, debe comenzar con mayúscula.
    public static void METODO(){ // Mala práctica, el nombre debería ser "metodo".

        // Caso 3: Los nombres de las variables locales deben empezar con minúscula, y en caso de tener más de una palabra, usar Cammelcase
        ArrayList LISTA_NUMEROS = new ArrayList(); // Mala práctica, el nombre debería ser "listaNumeros"

    }

    // Caso 4: El nombre de las clases o de las interfaces debe comenzar con mayúscula, y en caso de tener más de una palabra, usar Pascalcase
    public class clase_prueba // Mala práctica, el nombre debería ser "ClasePrueba"
    {

    }

}