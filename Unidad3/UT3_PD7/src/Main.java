import Ejercicio2.Conjunto;
import Ejercicio2.Nodo;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3

        Conjunto AED1 = new Conjunto();
        Conjunto PF = new Conjunto();

        Alumno alumno1 = new Alumno("alumno1", 1234);
        Alumno alumno2 = new Alumno("alumno2", 4321);
        Alumno alumno3 = new Alumno("alumno3", 2341);
        Alumno alumno4 = new Alumno("alumno4", 3421);

        AED1.insertar(new Nodo<IAlumno>(alumno2.getNombreCompleto(), alumno2));
        AED1.insertar(new Nodo<IAlumno>(alumno3.getNombreCompleto(), alumno3));
        PF.insertar(new Nodo<IAlumno>(alumno1.getNombreCompleto(), alumno1));
        PF.insertar(new Nodo<IAlumno>(alumno3.getNombreCompleto(), alumno3));
        PF.insertar(new Nodo<IAlumno>(alumno4.getNombreCompleto(), alumno4));

        Conjunto prubea1 = AED1.union(PF);
        System.out.println(prubea1.imprimir());

        Conjunto prubea2 = AED1.interseccion(PF);
        System.out.println(prubea2.imprimir());
    }
}