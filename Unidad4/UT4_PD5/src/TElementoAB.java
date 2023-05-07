public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return 
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }


    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        return null;
    }

    public boolean insertar(TElementoAB<T> elemento) {
        return false;
    }

    public String preOrden() {
        return null;
    }

    public String inOrden() {
        return null;
    }

    public String postOrden() {
        return null;
    }

    public T getDatos() {
        return this.datos;
    }

    public TElementoAB eliminar(Comparable unaEtiqueta) {
        return null;
    }


}
