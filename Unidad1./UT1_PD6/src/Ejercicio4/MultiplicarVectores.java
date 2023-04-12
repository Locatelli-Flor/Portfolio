package Ejercicio4;

import java.util.Arrays;

public class MultiplicarVectores {
    public static void main(String[] args) {
        int[] vec1 = new int[3];
        vec1[0] = 1;
        vec1[1] = 2;
        vec1[2] = 3;

        int[] vec2 = new int[3];
        vec2[0] = 1;
        vec2[1] = 2;
        vec2[2] = 3;

        System.out.println(Arrays.toString(multiplicarVectores(vec1, vec2)));

    }
    public static int[] multiplicarVectores(int[] matriz1, int[] matriz2){
        if (matriz1.length != matriz2.length){
            System.out.println("No se pueden multiplicar");
            return null;
        }

        int[] multiplicacion = new int[matriz1.length];
        int contador = matriz1.length -1;

        for(int i = 0; i <= matriz1.length -1; i++){
            multiplicacion[i] = matriz1[i] * matriz2[contador];
            contador --;
        }

        return multiplicacion;
    }

}

// La multiplicación de 2 vectores se hace multiplicando el primer elemento del primer vector
// con el último, el segundo con el penúltimo, sucesivamente. El resultado se guarda en otro vector.
// Para poder realizarse esto, se necesita que los dos vectores a multiplicar tengan las mismas dimensiones y
// que los dos vectores tengan elementos de tipo int.
// Para hacer este ejercicio, pensé en primero comprobar que los dos vectores tengan el mismo largo, y luego
// hacer un bucle for, asignándole al vector resultado la multiplicación entre el primer valor del primer vector por el último vector del segundo vector
// con ayuda de un contador que vaya disminuyendo desde la longitud de los vectores hasta 0, y con la variable i del for, que va de 0 hasta la longitud de los vectores


