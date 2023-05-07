public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    public boolean insertar(TElementoAB<T> unElemento) {
        if(this.raiz == null){
            return false;
        }
        return this.raiz.insertar(unElemento);
    }

    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if(this.raiz == null){
            return null;
        }
        return this.raiz.buscar(unaEtiqueta);
    }

    public String preOrden() {
        if(this.raiz == null){
            return null;
        }
        return this.raiz.preOrden();
    }

    public String inOrden() {
        if(this.raiz == null){
            return null;
        }
        return this.raiz.inOrden();
    }

    public String postOrden() {
        if(this.raiz == null){
            return null;
        }
        return this.raiz.postOrden();
    }

    public void eliminar(Comparable unaEtiqueta) {
        if(this.raiz != null){
            this.raiz.eliminar(unaEtiqueta);
        }
    }

}
