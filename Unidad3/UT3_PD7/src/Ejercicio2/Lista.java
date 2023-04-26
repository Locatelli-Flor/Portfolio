package Ejercicio2;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
       if(esVacia()){
           this.setPrimero(nodo);
           return;
       }
       Nodo<T> guia = primero;
       while(guia.getSiguiente() != null){
           guia = guia.getSiguiente();
       }
       guia.setSiguiente(nodo);
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {

    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if(esVacia()){
            return null;
        }
        Nodo<T> guia = primero;
        while(guia != null){
            if(guia.getEtiqueta() == clave){
                return guia;
            }
            guia = guia.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        return false;
    }

    @Override
    public String imprimir() {
        return null;
    }

    @Override
    public String imprimir(String separador) {
        if(esVacia()){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> guia = primero;

        while(guia != null){
            sb.append(guia.getEtiqueta());
            guia = guia.getSiguiente();
        }
        return sb.toString();
    }

    @Override
    public int cantElementos() {
        return 0;
    }

    @Override
    public boolean esVacia() {
        return this.primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }


}
