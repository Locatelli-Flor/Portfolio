import Ejercicio3.Multsuma;
import Ejercicio4.Alumno;
import Ejercicio5.Contador;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 3
        Multsuma prueba1 = new Multsuma();
        System.out.println(prueba1.multsuma(1.0, 2.0, 3.0));

        // Ejercicio 5
        Contador prueba2 = new Contador();
        prueba2.displayCountWhile();
        Contador prueba3 = new Contador();
        prueba3.displayCountDoWhile();
        Contador prueba4 = new Contador();
        prueba4.displayCountFor();

        // Ejercicio 4

        Alumno alumno = new Alumno("pepe");
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println(alumno.paraAString(2));

    }
}