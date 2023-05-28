package org.example;

import java.io.Serializable;
import java.util.LinkedList;


public class TArbolTrie implements IArbolTrie, Serializable {

    private TNodoTrie raiz;
    
    public void insertarIndice(String rutaArchivo){
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo(rutaArchivo);
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        for (String p : palabrasclave) {
            for (String palabra : p.split("\n")){
                this.raiz.insertar(palabra);
            }
        }
    }
    
    public void indizarLibro(String rutaArchivo){
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo(rutaArchivo);
        int[] pag = {1};
        int aux = 0;
        for (String p : palabrasclave) {
            aux++;
            if(aux % 50 == 0){
                pag[0]++;
            }
            for (String palabra : p.split(" ")){
                this.insertar(palabra, pag);
            }
        }
    }
    
    @Override
    public void insertar(String palabra, int[] indicesDePag) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra, indicesDePag);
    }

    @Override
    public void imprimirIndice() {
        if (raiz != null) {
            System.out.println(raiz.imprimir());
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        return raiz.buscar(palabra);
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        LinkedList<String> resultado = new LinkedList<>();
        raiz.predecir(prefijo, resultado);
        return resultado;
    }
    
    
}
