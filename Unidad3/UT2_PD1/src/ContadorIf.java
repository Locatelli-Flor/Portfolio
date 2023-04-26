import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ContadorIf {
    public static void main(String[] args) throws IOException {

        contar("src/numeros.txt");
    }

    public static void contar(String ruta) throws IOException {

        File fl = new File(ruta);
        Scanner sc = new Scanner(fl);
        ArrayList<Integer> lista = new ArrayList<>();

        int cantidadNum = Integer.parseInt(sc.nextLine());

        while (sc.hasNextLine()){
            lista.add(Integer.valueOf(sc.nextLine()));
        }

        int primero;
        int segundo;
        int contador = 0;

        for (int i = 1; i < cantidadNum - 1; i++){
            for (int j = cantidadNum - 1; j >= i; j--){
                if(lista.get(j) < lista.get(j-1)){
                    contador++;

                    primero = lista.get(j);
                    segundo = lista.get(j-1);

                    lista.set(lista.indexOf(primero), segundo);
                    lista.set(lista.indexOf(segundo), primero);
                }
            }
        }

        System.out.println(cantidadNum);
        System.out.println(contador);
        System.out.println(lista.get(0));
        System.out.println(lista.get(lista.size() - 1));

    }
}
