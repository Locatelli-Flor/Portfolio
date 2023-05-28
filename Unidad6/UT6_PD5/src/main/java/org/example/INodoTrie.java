package org.example;


import java.util.LinkedList;

public interface INodoTrie {

    int buscar(String s); // devuelve la cantidad de comparaciones!
    String imprimir();

    void insertar(String unaPalabra, int[] indicesDePagina);
    public void predecir(String prefijo, LinkedList<String> palabras);
    
    
}
