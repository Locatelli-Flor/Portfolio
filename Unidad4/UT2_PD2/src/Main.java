import Ejercicio1.FactorialRecursivo;
import Ejercicio2.SumaLineal;
import Ejercicio3.Exponente;
import Ejercicio4.Invertir;

public class Main {
    public static void main(String[] args) {
        FactorialRecursivo prueba = new FactorialRecursivo();
        System.out.println(prueba.Facorial(4));
        System.out.println(prueba.Facorial(5));
        System.out.println(prueba.Facorial(0));

        SumaLineal prueba2 = new SumaLineal();
        System.out.println(prueba2.suma(new int[]{1,2,3}, 3));

        System.out.println(Exponente.exponente(-3, 3));

        Invertir i = new Invertir();
        int[] a = new int[]{3,5,4,2,1,6};
        i.invertirArray(a, 3, 1);
        for(int j : a){
            System.out.println(j);
        }
    }
}