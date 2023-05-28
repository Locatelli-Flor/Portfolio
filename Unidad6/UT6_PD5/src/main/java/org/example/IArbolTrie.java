package org.example;


import java.util.LinkedList;

public interface IArbolTrie {

    void imprimirIndice();
    int buscar(String palabra);

    void insertar(String palabra, int[] indicesDePag);

    LinkedList<String> predecir(String prefijo);
    
}
