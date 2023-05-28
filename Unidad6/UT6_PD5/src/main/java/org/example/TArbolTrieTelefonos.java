package org.example;

import java.util.Comparator;
import java.util.LinkedList;


public class TArbolTrieTelefonos implements IArbolTrieTelefonos {

    private TNodoTrieTelefonos raiz;

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String pais, String area) {
        if (raiz == null){
            raiz = new TNodoTrieTelefonos();
        }
        LinkedList<TAbonado> result = new LinkedList<TAbonado>();
        raiz.buscarTelefonos(pais + area, result);
        result.sort(Comparator.naturalOrder());
        return result;
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        if (raiz == null){
            raiz = new TNodoTrieTelefonos();
        }
        raiz.insertar(unAbonado);
    }

 
    
}
