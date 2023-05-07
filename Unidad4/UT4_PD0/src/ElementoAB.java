public class ElementoAB implements TElementoAB{
    public Comparable etiqueta;
    public Comparable dato;
    public TElementoAB<ElementoAB> hijoIzq;
    public TElementoAB<ElementoAB> hijoDer;
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public TElementoAB getHijoIzq() {
        return this.hijoIzq;
    }

    public TElementoAB getHijoDer() {
        return this.hijoDer;
    }

    public void setHijoIzq(TElementoAB elemento) {
        this.hijoIzq = elemento;
    }

    public void setHijoDer(TElementoAB elemento) {
        this.hijoDer = elemento;
    }

    public TElementoAB buscar(Comparable unaEtiqueta) {
        if(this.getEtiqueta() == unaEtiqueta){
            return this;
        }
        if(this.hijoIzq.getEtiqueta().compareTo(unaEtiqueta) <= 0){

        }
        return null;
    }

    public boolean insertar(TElementoAB elemento) {
        return false;
    }

    public String preOrden() {
        String st = this.getEtiqueta() + " ";

        if(this.getHijoIzq() != null){
            st = st  + this.hijoIzq.preOrden();
        }
        if(this.getHijoDer() != null){
            st = st  + this.hijoIzq.preOrden();
        }
        return st;
    }

    public String inOrden() {
        String st = "";
        if(this.getHijoIzq() != null){
            st = st + this.getHijoIzq().inOrden();
        }
        st = st + this.getEtiqueta();
        if(this.getHijoDer() != null){
            st = st + this.getHijoDer().inOrden();
        }
        return st;
    }

    public String postOrden() {
        String st = "";
        if(this.getHijoIzq() != null){
            st = st + this.getHijoIzq().postOrden();
        }
        if(this.getHijoDer() != null){
            st = st + this.getHijoDer().postOrden();
        }
        st = st + this.getEtiqueta() + this.postOrden();

        return st;
    }

    public Object getDatos() {
        return this.dato;
    }

    public TElementoAB eliminar(Comparable unaEtiqueta) {
        return null;
    }
}
