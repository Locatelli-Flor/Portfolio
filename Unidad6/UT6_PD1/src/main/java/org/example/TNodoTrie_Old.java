package org.example;



import java.io.Serializable;
import java.util.LinkedList;

public class TNodoTrie_Old implements INodoTrie , Serializable {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie_Old[] hijos;
    private LinkedList<Integer> listaPags = new LinkedList<Integer>();
    private boolean esPalabra;

    public TNodoTrie_Old() {
        hijos = new TNodoTrie_Old[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }
    
    public int[] getPags(){
        int i = 0;
        int[] result = new int[listaPags.size()];
        for (Integer num : listaPags){
            result[i] = num.intValue();
            i++;
        }
        return result;
    }

    @Override
    public void insertar(String unaPalabra, int[] indicesDePag) {
        TNodoTrie_Old nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (indice < 0 || indice > 26){
                continue;
            }
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie_Old();                
            }
            nodo = nodo.hijos[indice];
        }
        for(int index : indicesDePag){
                    if (! nodo.listaPags.contains(Integer.valueOf(index))){
                        nodo.listaPags.add(Integer.valueOf(index));
                    }
                }
        nodo.esPalabra = true;
    }
    
    public void insertar(String unaPalabra) {
        TNodoTrie_Old nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie_Old();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    private String imprimir(String s, TNodoTrie_Old nodo) {
        if (nodo != null) {
            String result = "";
            if (nodo.esPalabra) {
                result = s;
                if (nodo.listaPags.size() > 0){
                    result += "  Pags: ";
                    for (int pag : nodo.getPags()){
                        result += pag + ", ";
                    }
                    result = result.substring(0, result.length()-2);
                }
                result += "\n";
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    result += nodo.hijos[c].imprimir(s+(char)(c + 'a'), nodo.hijos[c]);
                }
            }
            return result;
        }
        return "";
    }

    @Override
    public String imprimir() {
        return imprimir("", this);
    }
    
    private TNodoTrie_Old buscarNodoTrie(String s) {
        TNodoTrie_Old nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (indice < 0 || indice > 26 || nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
        }
        return nodo;
    }
    
     private void predecir(String s, LinkedList<String> palabras, TNodoTrie_Old nodo) {
     // implementar
       
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie_Old nodoActual = this;
        for (char car : prefijo.toCharArray()){
            TNodoTrie_Old unHijo = nodoActual.buscarNodoTrie(String.valueOf(car));
            if(unHijo == null){
                return;
            }else{
                nodoActual = unHijo;
            }
        }
        nodoActual.imprimirHijosPrefijo(prefijo, palabras);
    }
    
    private void imprimirHijosPrefijo(String prefijo, LinkedList<String> palabras){
        if (this.esPalabra){
            palabras.add(prefijo);
        }
        for (int i = 0; i < hijos.length; i++){
            if(hijos[i] != null){
                hijos[i].imprimirHijosPrefijo(prefijo+Character.toString('a'+ i ), palabras);
            }
        }
    }

    @Override
    public int buscar(String s) {
        TNodoTrie_Old nodoActual = this;
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            int indice = s.charAt(i) - 'a';
            if (indice < 0 || indice > 26 || nodoActual.hijos[indice] == null){
                return -1;
            }
            else {
                result ++;
                nodoActual = nodoActual.hijos[indice];
            }
        }
        return result;
    }
  
}
