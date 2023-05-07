package Ejercicio2;

public class SumaLineal {
    public int suma(int[] A, int n){
        if(n == 1){
            return A[0];
        }
        return (suma(A, n - 1) + A[n - 1]);
    }
}

// El órden es n ya que el return con la recursividad se ejecuta n veces.
// Se resta 1 a n hasta llegar a 1
// Si el número es negativo el algoritmo se repite infitas veces, hasta dar stackoverflow, se puede arreglar esto
// con un control al principio del algoritmo con un if y retornar -1 si es negativo
// Si A no tiene elementos se da el error index out of bounds ya que intenta buscar A[n - 1], y esto no existe
