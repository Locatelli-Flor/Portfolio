package Ejercicio2;

public class esPrimo {

    public static boolean isPrime(long n) {
        boolean prime = true;
        int contador = 3;

        while(contador <= Math.sqrt(n)){
            if (n % contador == 0) {
                prime = false;
                break;
            }
            contador++;
        }

        if ((n % 2 != 0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static long sumaPrimos(long num) {
        long suma = 0;

        while (num >= 0){
            suma+= num;
            num -= 2;
        }

        return suma;
    }
}
