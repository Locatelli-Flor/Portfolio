package org.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrie implements INodoTrie , Serializable {

    private HashMap<Character ,TNodoTrie> hijos;
    private Character letra;
    private LinkedList<Integer> listaPags = new LinkedList<Integer>();
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new HashMap();
        esPalabra = false;
    }
    
    private TNodoTrie(Character car) {
        hijos = new HashMap();
        letra = car;
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
        TNodoTrie nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            TNodoTrie nodoAux = nodo.hijos.get(unaPalabra.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                nodo.hijos.put(unaPalabra.charAt(c), new TNodoTrie(unaPalabra.charAt(c)));
                nodo = nodo.hijos.get(unaPalabra.charAt(c));
            }
        }
        for(int index : indicesDePag){
                    if (! nodo.listaPags.contains(Integer.valueOf(index))){
                        nodo.listaPags.add(Integer.valueOf(index));
                    }
                }
        nodo.esPalabra = true;
    }
    
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            TNodoTrie nodoAux = nodo.hijos.get(unaPalabra.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                nodo.hijos.put(unaPalabra.charAt(c), new TNodoTrie(unaPalabra.charAt(c)));
                nodo = nodo.hijos.get(unaPalabra.charAt(c));
            }
        }
        nodo.esPalabra = true;
    }

    private String imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            String result = "";
            if (nodo.esPalabra) {
                result = s;
                if (! nodo.listaPags.isEmpty()){
                    result += "  Pags: ";
                    for (int pag : nodo.getPags()){
                        result += pag + ", ";
                    }
                    result = result.substring(0, result.length()-2);
                }
                result += "\n";
            }
            for (TNodoTrie nodoAct : nodo.hijos.values()) {
                    result += nodoAct.imprimir(s+(char)(nodoAct.letra), nodoAct);
            }
            return result;
        }
        return "";
    }

    @Override
    public String imprimir() {
        return imprimir("", this);
    }
    
    private TNodoTrie buscarNodoTrie(String s) {
        TNodoTrie nodo = this;
        for (int c = 0; c < s.length(); c++) {
            TNodoTrie nodoAux = nodo.hijos.get(s.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                return null;
            }
        }
        return nodo;
    }
    
     private void predecir(String s, LinkedList<String> palabras, TNodoTrie nodo) {
     // implementar
       
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrie nodoActual = this;
        for (char car : prefijo.toCharArray()){
            TNodoTrie unHijo = nodoActual.buscarNodoTrie(String.valueOf(car));
            if(unHijo == null){
                return;
            }else{
                nodoActual = unHijo;
            }
        }
    }


    @Override
    public int buscar(String s) {
        TNodoTrie nodoActual = this;
        int result = 0;
        for (int c = 0; c < s.length(); c++) {
            TNodoTrie nodoAux = nodoActual.hijos.get(s.charAt(c));
            if (nodoAux != null){
               nodoActual = nodoAux;
               result++;
            }
            else{
                return -1;
            }
        }
        return result;
    }
  
}
