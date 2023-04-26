package Ejercicio2;

public class Nodo<T> implements INodo {

    Object dato;

    String etiqueta;
    Nodo siguiente;


    public Object getDato(){
        return this.dato;
    }
    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo nod){
        this.siguiente = nod;
    }

    public void imprimir(){
        System.out.println(this.dato);
    }

    public void imprimirEtiqueta(){
        System.out.println(this.etiqueta);
    }

    public Comparable getEtiqueta(){
        return this.etiqueta;
    }

    public int compareTo(Comparable etiqueta){
        return this.etiqueta.compareTo((String) etiqueta);
    }



}
