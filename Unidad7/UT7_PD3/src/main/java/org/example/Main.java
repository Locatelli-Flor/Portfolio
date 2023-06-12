package org.example;

public class Main {
    public static void main(String[] args) {
        TGrafoDirigido grafo = UtilGrafos.cargarGrafo(
                "src/main/java/org/example/aeropuertos.txt",
                "src/main/java/org/example/conexiones.txt", true, TGrafoDirigido.class);

        assert grafo != null;
        UtilGrafos.imprimirMatrizAdyMejorado(grafo.warshall(), grafo.getVertices(), "Mapa de Conexiones");
        UtilGrafos.imprimirMatrizMejorado(grafo.floyd(), grafo.getVertices(), "Mapa de Conexiones");

        // Ejercicio 1:
        // 1. De Montevideo a Río es 3780
        // 2. De Mvdeo a Curitiba es 2580
        // 3. El mantenimiento deberia instalarse en Curitiba, ya que es el centro del grafo

        // Ejercicio 2:
        System.out.println(grafo.existeConexion("Montevideo", "Curitiba"));
        System.out.println(grafo.existeConexion("Porto_Alegre", "Santos"));

        // Ejercicio 3
        System.out.println(grafo.getRecorridoBPF());
        System.out.println(grafo.getRecorridoBPF("Montevideo"));
        //El orden de ejecucion del bpf es O(N), donde N es la cantidad de vertices del grafo, ya que se visita cada uno 1 sola vez
    }
}

