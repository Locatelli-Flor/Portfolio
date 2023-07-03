
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class TCamino {

    private final TVertice origen;
    private Collection<TVertice> otrosVertices;
// es una lista de etiquetas de los vertices
// ATENCIÓN: PONER LA CLASE CONCRETA QUE									     	     
// SEA MÁS APROPIADA
    private Double costoTotal = 0.0d;

    public void imprimirEtiquetasConsola() {
        System.out.println(imprimirEtiquetas());
    }

    public String imprimirEtiquetas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Origen: " + getOrigen().getEtiqueta());
        for (TVertice adyacente : getOtrosVertices()) {
            sb.append(" -> " + adyacente.getEtiqueta());
        }
        return sb.toString();
    }

    public TCamino(TVertice v) {
        this.origen = v;
        this.otrosVertices = new LinkedList();

    }

    public boolean agregarAdyacencia(TAdyacencia adyacenciaActual) {
        if (adyacenciaActual.getDestino() != null) {
            setCostoTotal((Double) getCostoTotal() + ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().add(adyacenciaActual.getDestino());
        }
        return false;
    }

    public boolean eliminarAdyacencia(TAdyacencia adyacenciaActual) {
        if (getOtrosVertices().contains(adyacenciaActual.getDestino())) {
            setCostoTotal((Double) getCostoTotal() - ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().remove(adyacenciaActual.getDestino());
        }
        return false;
    }

    public TVertice getOrigen() {
        return origen;
    }

    public Collection<TVertice> getOtrosVertices() {
        return otrosVertices;
    }

    public void setOtrosVertices(Collection<TVertice> otrosVertices) {
        this.otrosVertices = otrosVertices;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public TCamino copiar() {
        TVertice origen = new TVertice(this.getOrigen().getEtiqueta(), this.getOrigen().getDatos());
        TCamino copia = new TCamino(origen);
        origen.getAdyacentes().addAll(this.getOrigen().getAdyacentes());
        copia.getOtrosVertices().addAll(this.getOtrosVertices());

        return copia;
    }


}
