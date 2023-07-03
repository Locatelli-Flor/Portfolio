
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ernesto
 */
public class TPreviaturas extends TGrafoDirigido implements IPreviaturas{

    public TPreviaturas(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public int obtenerSecuenciaCritica(LinkedList<TVertice> laSecuencia) {
        TCaminos caminos = this.todosLosCaminos("Ingreso", "Graduacion");

        LinkedList<TCamino> caminosIterar = caminos.getCaminos();

        int sumaDuracion = 0;
        TCamino caminoMayor = null;
        int mayorDuracion = 0;

        for(TCamino c : caminosIterar){
            sumaDuracion = 0;
            Collection<TVertice> v = c.getOtrosVertices();
            for(TVertice vertice : v){
                sumaDuracion += (Integer) vertice.getDatos();
            }

            if(sumaDuracion > mayorDuracion){
                mayorDuracion = sumaDuracion;
                caminoMayor = c;
            }
        }

        Collection<TVertice> secuenciaCritica = caminoMayor.getOtrosVertices();

        for(TVertice v : secuenciaCritica){
            laSecuencia.add(v);
            System.out.println("Materia: " + v.getEtiqueta() + "        Costo: " + v.getDatos());
        }

        System.out.println("Costo total:" + mayorDuracion);

        return mayorDuracion;
    }

   

 
}
