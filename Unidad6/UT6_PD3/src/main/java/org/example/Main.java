package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
public class Main {

    public static void main(String[] args) {
        imprimirRandom(3, "src/main/java/org/example/libro.txt");
    }

    //Ejercicio 1
    public static void sacaNull(Map mapa){
        for(Object key : mapa.keySet()){
            if (mapa.get(key)==null){
                mapa.remove(key);
            }
        }
    }

    //Ejercicio 2
    public static Map<String,String> inviertePar(Map<String, String> mapa){
        Map<String,String> result = new HashMap<>();
        for (Map.Entry<String, String> entrada : mapa.entrySet()){
            if (result.containsKey(entrada.getValue())){
                throw new IllegalArgumentException("Valores duplicados");
            }
            result.put(entrada.getValue(), entrada.getKey());
        }
        return result;
    }

    //Ejercicio 3
    public static void imprimirCadenasLargo(String[] lineas){
        HashMap<Integer, String> res = new HashMap<>();
        for (String linea : lineas){
            for (String palabra : linea.split(" ")){
                res.put(Integer.valueOf(palabra.length()), palabra);
            }
        }
        for (String entrada : res.values().toArray(new String[0])){
            System.out.println(entrada);
        }
    }

    //Ejercicio 4
    public static void imprimirRandom(int cantLineas, String ruta){
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        Random rand = new Random();
        rand.ints();
        int i = 0;
        while (cantLineas != 0){
            i = rand.nextInt(lineas.length);
            System.out.println(lineas[i]);
            cantLineas--;
        }
    }
}