package Ejercicio2;

public class Conjunto{
    public Nodo cabeza;
    public Conjunto() {
        cabeza = null;
    }

    public Conjunto union(Conjunto otroConjunto) {
        if(this.esVacia()){
            return otroConjunto;
        }
        if(otroConjunto.esVacia()){
            return this;
        }
        Conjunto conjunto3 = new Conjunto();

        Nodo guia = this.getCabeza();

        while(guia != null){
            conjunto3.insertar(new Nodo(guia.getEtiqueta(), guia.getDato()));
            guia = guia.getSiguiente();
        }

        guia = otroConjunto.getCabeza();

        while(guia != null){
            if(!conjunto3.buscar(guia.getEtiqueta())){
                conjunto3.insertar(new Nodo<>(guia.getEtiqueta(), guia.getDato()));
            }
            guia = guia.getSiguiente();
        }

        return conjunto3;
    }

    public Conjunto interseccion(Conjunto otroConjunto) {
        Conjunto conjunto3 = new Conjunto();

        Nodo guia = this.getCabeza();
        while(guia != null){
            if(otroConjunto.buscar(guia.getEtiqueta()) && !conjunto3.buscar(guia.getEtiqueta())){
                conjunto3.insertar(new Nodo(guia.getEtiqueta(), guia.getDato()));
            }
            guia = guia.getSiguiente();
        }
        return conjunto3;
    }

    public void insertar(Nodo nodo) {
        if(esVacia()){
            this.setPrimero(nodo);
            return;
        }
        Nodo guia = getCabeza();
        while(guia.getSiguiente() != null){
            guia = guia.getSiguiente();
        }
        guia.setSiguiente(nodo);
    }

    public void insertar(Comparable etiqueta, Object dato) {

    }

    public boolean buscar(Comparable clave) {
        if(esVacia()){
            return false;
        }
        Nodo guia = cabeza;

        while(guia.getSiguiente() != null){
            if(guia.getEtiqueta() == clave){
                return true;
            }
            guia = guia.getSiguiente();
        }
        return false;
    }

    public boolean eliminar(Comparable clave) {
        return false;
    }

    public String imprimir() {
        if(esVacia()){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Nodo guia = cabeza;

        while(guia != null){
            sb.append(guia.getEtiqueta() + ", ");
            guia = guia.getSiguiente();
        }
        return sb.toString();
    }

    public String imprimir(String separador) {
        return null;
    }

    public int cantElementos() {
        return 0;
    }

    public boolean esVacia() {
        return this.cabeza == null;
    }

    public void setPrimero(Nodo unNodo) {
        this.cabeza = unNodo;
    }

    public Nodo getCabeza(){
        return this.cabeza;
    }
}
