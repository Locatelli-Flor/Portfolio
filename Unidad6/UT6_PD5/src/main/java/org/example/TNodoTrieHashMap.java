package org.example;



import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrieHashMap implements INodoTrie , Serializable {

    private HashMap<Character ,TNodoTrieHashMap> hijos;
    private LinkedList<Integer> listaPags = new LinkedList<Integer>();
    private boolean esPalabra;

    public TNodoTrieHashMap() {
        hijos = new HashMap();
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
        TNodoTrieHashMap nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            TNodoTrieHashMap nodoAux = nodo.hijos.get(unaPalabra.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                nodo.hijos.put(unaPalabra.charAt(c), new TNodoTrieHashMap());
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
        TNodoTrieHashMap nodo = this;
        unaPalabra = unaPalabra.strip().toLowerCase();
        for (int c = 0; c < unaPalabra.length(); c++) {
            TNodoTrieHashMap nodoAux = nodo.hijos.get(unaPalabra.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                nodo.hijos.put(unaPalabra.charAt(c), new TNodoTrieHashMap());
                nodo = nodo.hijos.get(unaPalabra.charAt(c));
            }
        }
        nodo.esPalabra = true;
    }

    private String imprimir(String s, TNodoTrieHashMap nodo) {
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
            for (HashMap.Entry<Character, TNodoTrieHashMap> nodoAct : nodo.hijos.entrySet()) {
                result += nodoAct.getValue().imprimir(s+(char)(nodoAct.getKey()), nodoAct.getValue());
            }
            return result;
        }
        return "";
    }

    @Override
    public String imprimir() {
        return imprimir("", this);
    }
    
    private TNodoTrieHashMap buscarNodoTrie(String s) {
        TNodoTrieHashMap nodo = this;
        for (int c = 0; c < s.length(); c++) {
            TNodoTrieHashMap nodoAux = nodo.hijos.get(s.charAt(c));
            if (nodoAux != null){
               nodo = nodoAux;
            }
            else{
                return null;
            }
        }
        return nodo;
    }
    
     private void predecir(String s, LinkedList<String> palabras, TNodoTrieHashMap nodo) {
     // implementar
       
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        TNodoTrieHashMap nodoActual = this;
        for (char car : prefijo.toCharArray()){
            TNodoTrieHashMap unHijo = nodoActual.buscarNodoTrie(String.valueOf(car));
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
        for (HashMap.Entry<Character, TNodoTrieHashMap> nodoAct : hijos.entrySet()) {
                nodoAct.getValue().imprimirHijosPrefijo(prefijo+(char)(nodoAct.getKey()), palabras);
            }
        
    }

    @Override
    public int buscar(String s) {
        TNodoTrieHashMap nodoActual = this;
        int result = 0;
        for (int c = 0; c < s.length(); c++) {
            TNodoTrieHashMap nodoAux = nodoActual.hijos.get(s.charAt(c));
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
