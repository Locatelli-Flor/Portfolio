package org.example;

public class Main {
    public static void main(String[] args) {
        TArbolTrie nuevo = new TArbolTrie();
        TArbolTrie_Old viejo = new TArbolTrie_Old();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/main/java/org/example/PalabrasIndice.txt");
        for (String s : lineas) {
            nuevo.insertar(s, new int[]{0, 1, 2});
            viejo.insertar(s, new int[]{0, 1, 2});
        }


        Medible[] medibles = new Medible[2];
        int i = 0;
        medibles[i++] = new MedicionBuscarTrie(nuevo);
        medibles[i++] = new MedicionBuscarTrieOld(viejo);
        Medicion mi;
        i = 0;
        Object[] params = {5, lineas};
        String[] lineas2 = new String[6];
        lineas2[i++] = "algoritmo,tiempo,memoria";
        for (Medible m : medibles){
            mi= m.medir(params);
            mi.print();
            lineas2[i++] = mi.getTexto()+","+mi.getTiempoEjecucion().toString()+","+mi.getMemoria().toString();

        }

    }
}