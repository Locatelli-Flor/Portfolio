package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {


    private HashMap<Integer ,TNodoTrieTelefonos> hijos;
    private boolean esTelefono;
    private TAbonado usuarioAbonado;

    public TNodoTrieTelefonos() {
        hijos = new HashMap<>();
        esTelefono = false;
    }
    
    @Override
    public void insertar(TAbonado unAbonado) {
        TNodoTrieTelefonos nodo = this;
        for (Character c : unAbonado.getTelefono().toCharArray()) {
            int indice = Integer.parseInt(c.toString());
            TNodoTrieTelefonos nodoAux = nodo.hijos.get(indice);
            if (nodoAux == null) {
                nodo.hijos.put(indice, new TNodoTrieTelefonos());
            }
            nodo = nodo.hijos.get(indice);
        }
        nodo.esTelefono = true;
        nodo.usuarioAbonado = unAbonado;
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        TNodoTrieTelefonos nodoActual = this;
        for (String num : primerosDigitos.split("")){
            TNodoTrieTelefonos unHijo = nodoActual.buscarNodoTrie(num);
            if(unHijo == null){
                return;
            }else{
                nodoActual = unHijo;
            }
        }
        nodoActual.cargarPosiblesAbonados(abonados);
    }
    
    private void cargarPosiblesAbonados(LinkedList<TAbonado> abonados){
        if (this.esTelefono){
            abonados.add(this.usuarioAbonado);
        }
        for (TNodoTrieTelefonos i : hijos.values()){
            i.cargarPosiblesAbonados(abonados);
        }
    }
    
    private TNodoTrieTelefonos buscarNodoTrie(String s) {
        TNodoTrieTelefonos nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = Integer.parseInt(s);
            nodo = nodo.hijos.get(indice);
            if (nodo == null){
                return null;
            }
        }
        return nodo;
    }
}
