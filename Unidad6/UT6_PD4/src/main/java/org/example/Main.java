package org.example;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        palabrasFrecuentes("src/main/java/org/example/libro.txt");
    }

    public static void palabrasFrecuentes(String ruta) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        TreeMap<String, LinkedList<Integer>> mapa = new TreeMap<>();
        Integer numPagina = 1;
        int aux = 0;
        for (String linea : lineas) {
            aux++;
            if (aux % 50 == 0) {
                numPagina++;
            }
            for (String palabra : linea.split(" ")) {
                LinkedList result = mapa.get(palabra);
                if (result == null) {
                    result = new LinkedList();
                    result.add(numPagina);
                    mapa.put(palabra, result);
                } else {
                    result.add(numPagina);
                }
            }
        }
        for (Map.Entry entrada : mapa.entrySet()) {
            System.out.println("" + entrada.getKey() + entrada.getValue().toString());
        }
    }
}