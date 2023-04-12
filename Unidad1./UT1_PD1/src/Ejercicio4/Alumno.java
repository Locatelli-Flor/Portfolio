package Ejercicio4;

public class Alumno {
    private String nombre;
    public Alumno (String nombre) {
        this.nombre = nombre;
    }
    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 1; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        int idx = 7;
        return vector[idx];
    }

    public static String paraAString(int a) {
        String x1 = String.valueOf(a);
        return x1 ;
    }
    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        return (string[1].charAt(1));
    }
}


    // a) No tiene constructor, y pone el nombre en null
    // b) El método recorrer da el erorr index out of range porque lenght cuenta desde el 1 y el índice empieza en 0. Lo resolvi cambiando la condición
    // del for a i < c= cadena.lenght() - 1
    // c) El vector tiene 8 elementos, pero el mayor índice es el 7, ya que va de 0 a 7. Cambié la variable idx a 7.
    // d) El error es que al crear un array de string de largo 5, no se le asigna ningún valor a cada elemento del array, por lo que no se puede hacer String.charAt(int) a un null
    // e) El método paraAString estaba afuera de la clase