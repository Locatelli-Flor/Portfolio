package Ejercicio1;

public class Tablero {
    public static void main(String[] args) {
        imprimirTablero(5,5);
    }
    public static void imprimirTablero(int largo, int ancho){
        StringBuilder cadena = new StringBuilder(largo);

        for (int i = 0; i <= largo; i++){
            cadena.append("#");
        }

        for (int i = 1; i <= ancho; i++){
            System.out.println(cadena);
        }
    }
}
