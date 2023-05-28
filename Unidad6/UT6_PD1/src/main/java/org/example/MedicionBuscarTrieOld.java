package org.example;

 /**
 *
 * @author Federico
 */
public class MedicionBuscarTrieOld extends Medible {

    private TArbolTrie_Old trie;

  
    public MedicionBuscarTrieOld(TArbolTrie_Old trie) {
        this.trie = trie;
    }
 
    
    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                trie.buscar(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return trie;
    }
    
}
