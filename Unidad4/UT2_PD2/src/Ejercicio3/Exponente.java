package Ejercicio3;

public class Exponente {
    public static int exponente(int num, int e){
        if(e == 1){
            return num;
        }
        return(num * exponente(num, e - 1));
    }
}

// Sirve solo para enteros
// Si el número es negativo funciona igual, si el exponente es negativo, da stack overflow
// El tiempo de ejecución es de orden n porque la recursividad se hace la misma cantidad de veces que e - 1.

