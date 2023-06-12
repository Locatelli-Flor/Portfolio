package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<TVertice> verts = new HashSet<TVertice>();
        verts.add(new TVertice("Artigas"));
        verts.add(new TVertice("Canelones"));
        verts.add(new TVertice("Durazno"));
        verts.add(new TVertice("Florida"));
        verts.add(new TVertice("Montevideo"));
        verts.add(new TVertice("Punta del Este"));
        verts.add(new TVertice("Rocha"));

        HashSet<TArista> arts = new HashSet<>();
        arts.add(new TArista("Artigas", "Rocha", 400));
        arts.add(new TArista("Canelones", "Artigas", 500));
        arts.add(new TArista("Canelones", "Colonia", 200));
        arts.add(new TArista("Canelones", "Durazno", 170));
        arts.add(new TArista("Canelones", "Punta del Este", 90));
        arts.add(new TArista("Colonia", "Montevideo", 180));
        arts.add(new TArista("Florida", "Durazno", 60));
        arts.add(new TArista("Montevideo", "Artigas", 700));
        arts.add(new TArista("Montevideo", "Canelones", 30));
        arts.add(new TArista("Montevideo", "Punta del Este", 130));
        arts.add(new TArista("Punta del Este", "Rocha", 90));
        arts.add(new TArista("Rocha", "Montevideo", 270));

        TGrafoDirigido grafo = new TGrafoDirigido(verts, arts);

        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(grafo.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, grafo.getVertices(), "Matriz Costos");
        matriz = grafo.floyd();
        UtilGrafos.imprimirMatrizMejorado(matriz, grafo.getVertices(), "Matriz menor Costos");

        System.out.println(grafo.centroDelGrafo());

        String[] floyd = new String[matriz[0].length];

        int i = 0;
        for (Double[] linea : matriz) {
            for (Double num : linea) {
                if (floyd[i] == null) {
                    floyd[i] = "";
                }
                if (num == Double.MAX_VALUE) {
                    floyd[i] += "INF ";
                } else {
                    floyd[i] += num + " ";
                }
            }
            i++;
        }
        String[] centro = {grafo.centroDelGrafo().toString()};

        ManejadorArchivosGenerico.escribirArchivo("/src/main/java/org/example/floyd.txt", floyd);
        ManejadorArchivosGenerico.escribirArchivo("/src/main/java/org/example/centro.txt", centro);
    }
}
