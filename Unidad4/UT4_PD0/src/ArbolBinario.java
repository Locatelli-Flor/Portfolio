public class ArbolBinario implements IArbolBB{

    public TElementoAB<ElementoAB> raiz;

    public boolean insertar(TElementoAB unElemento) {
        return false;
    }

    public TElementoAB buscar(Comparable unaEtiqueta) {
        return null;
    }

    public String preOrden() {
        if (this.raiz == null){
            return null;
        }
        return this.raiz.preOrden();
    }

    public String inOrden() {
        if (this.raiz == null){
            return null;
        }
        return this.raiz.inOrden();
    }

    public String postOrden() {
        if (this.raiz == null){
            return null;
        }
        return this.raiz.postOrden();
    }

    public void eliminar(Comparable unaEtiqueta) {

    }
}
