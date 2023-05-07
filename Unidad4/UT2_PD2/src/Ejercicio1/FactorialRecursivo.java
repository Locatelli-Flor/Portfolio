package Ejercicio1;

public class FactorialRecursivo {
    public int Facorial(int num){
        if(num == 0){
            return 1;
        }
        return (num * Facorial(num - 1));
    }
}

// El órden del tiempo de ejecución es n porque la sentencia recursiva
// se va a ejecutar las mismas veces que n + 1, porque se resta 1 a n hasta llegar a cero

// Si el número es negativo el algoritmo se repite infitas veces, hasta dar stackoverflow, se puede arreglar esto
// con un control al principio del algoritmo con un if y retornar -1 si es negativo