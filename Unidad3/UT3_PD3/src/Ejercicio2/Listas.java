package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas<T> implements ILista{

    Nodo<T> primero;

    public Listas(){
        setPrimero(null);
    }
    @Override
    public void insertar(Nodo nodo) {
        if(esVacia()){
            setPrimero(nodo);
            return;
        }
        Nodo<T> guia = primero;
        while (guia.getSiguiente() != null){
            guia = guia.getSiguiente();
        }
        guia.setSiguiente(nodo);
    }

    @Override
    public void insertar(Comparable etiqueta, Object dato) {
        
    }

    @Override
    public Nodo buscar(Comparable clave) {
        if(esVacia()){
            return null;
        }
        Nodo<T> guia = primero;
        while(guia != null){
            if(guia.getEtiqueta().equals(clave)){
                return guia;
            }
            guia = guia.siguiente;
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if(esVacia()){
            return false;
        }

        Nodo<T> guia = primero;

        while(guia != null){
            if(guia.getSiguiente().getEtiqueta().equals(clave)){
                guia.siguiente = guia.getSiguiente().getSiguiente();
                return true;
            }
            guia = guia.siguiente;
            }
        return false;
    }

    @Override
    public String imprimir() {
        if (esVacia()){
            return null;
        }

        ArrayList<Comparable> aImprimir = new ArrayList<>();
        Nodo<T> guia = primero;

        while (guia != null){
            aImprimir.add(guia.getEtiqueta());
            guia = guia.siguiente;
        }
        return aImprimir.toString();
    }

    @Override
    public String imprimir(String separador) {
        if (esVacia()) {
            return null;
        }

        ArrayList<Comparable> aImprimir = new ArrayList<>();
        Nodo<T> guia = primero;

        while (guia != null){
            aImprimir.add(guia.getEtiqueta());
            guia = guia.siguiente;
        }
        String[] splt = aImprimir.toString().split(separador);

        return Arrays.toString(splt);
    }

    @Override
    public int cantElementos() {
        if(esVacia()){
            return 0;
        }

        int contador = 0;
        Nodo<T> guia = primero;
        while(guia != null){
            contador++;
            guia = guia.siguiente;
        }

        return contador;
    }

    @Override
    public boolean esVacia() {
        return this.primero == null;
    }

    @Override
    public void setPrimero(Nodo unNodo) {
        this.primero = unNodo;
    }
}
