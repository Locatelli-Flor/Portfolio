package org.example;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        TTrieHashMap trie = new TTrieHashMap();
        trie.insertarIndice("src/main/java/org/example/PalabrasIndice.txt");
        System.out.println(trie.predecir("d"));
    }
}