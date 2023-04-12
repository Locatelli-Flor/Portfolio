package Ejercicio5;

public class Contador {
    final int MAX_CONTADOR = 50;
    int contador = 1;
    int incremento = 1;

    public void displayCountWhile(){
        while(contador <= MAX_CONTADOR){
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void displayCountDoWhile(){
        do{
            System.out.println(contador);
            contador += incremento;
        }
        while(contador <= MAX_CONTADOR);
    }

    public void displayCountFor(){
        for(int i = 1; i <= MAX_CONTADOR; i += incremento){
            System.out.println(contador);
            contador += incremento;
        }
    }
}
