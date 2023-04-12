package Ejercicio1;

public class Factorial {
    public static int factorial(int num) {
        int resultado = 1;

        if (num < 0) {
            return -1;
        }

        for (int i = num; i > 1 ; i--) {
            resultado *= i;
        }

        return resultado;
    }
}
