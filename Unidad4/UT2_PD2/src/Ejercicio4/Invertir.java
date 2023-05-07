package Ejercicio4;

public class Invertir {
    public void invertirArray(int[] A, int i, int j){
        if(i < j){
            int aux = A[i];
            A[i] = A[j];
            A[j] = aux;
            invertirArray(A, i+1, j-1);
        }
    }
}
