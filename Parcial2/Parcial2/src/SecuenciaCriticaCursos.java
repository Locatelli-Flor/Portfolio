
import java.util.ArrayList;
import java.util.LinkedList;

public class SecuenciaCriticaCursos {

    public static void main(String[] args) {
        //CARGAR EL GRAFO CON CURSOS.TXT Y PREVIAS.TXT
        TPreviaturas carrera = (TPreviaturas) UtilGrafos.cargarGrafo(
                "C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\cursos.txt",
                "C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\previas.txt",
                false, TPreviaturas.class);

        LinkedList<TVertice> respuesta = new LinkedList<>();
        int duracionMax = carrera.obtenerSecuenciaCritica(respuesta);

        ArrayList<String> l = new ArrayList<>();

        for(TVertice v : respuesta) {
            l.add("Materia: " + v.getEtiqueta() + "     Costo: " + v.getDatos());
        }

        l.add("\nCosto total: " + duracionMax + "\n-----------------------------------------------------------------");

        String[] lineas = new String[l.size()];
        int i = 0;
        for(String s : l){
            lineas[i] = s;
            i++;
        }

        ManejadorArchivosGenerico.escribirArchivo("C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\salida.txt", lineas);

      // completar de acuerdo a la letra
      
      //CARGAR EL GRAFO DE NUEVO, CON CURSOS.TXT Y PREVIAS2.TXT
      carrera = (TPreviaturas) UtilGrafos.cargarGrafo(
                "C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\cursos.txt",
                "C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\previas2.txt",
                false, TPreviaturas.class);

    // completar de acuerdo a la letra

        LinkedList<TVertice> respuesta2 = new LinkedList<>();
        int duracionMax2 = carrera.obtenerSecuenciaCritica(respuesta2);

        ArrayList<String> l2 = new ArrayList<>();

        for(TVertice v : respuesta2) {
            l2.add("Materia: " + v.getEtiqueta() + "        Costo: " + v.getDatos());
        }

        l2.add("\nCosto total: " + duracionMax2 + "\n-----------------------------------------------------------------");

        String[] lineas2 = new String[l2.size()];
        i = 0;
        for(String s : l2){
            lineas2[i] = s;
            i++;
        }

        ManejadorArchivosGenerico.escribirArchivo("C:\\Users\\Flori\\Desktop\\Parcial2\\Parcial2\\src\\salida.txt", lineas2);

    }


    
}
