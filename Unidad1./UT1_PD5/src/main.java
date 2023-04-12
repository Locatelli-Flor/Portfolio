import Ejercicio1.ContarVocalesYConsonantes;
import Ejercicio1.Enumerador;
import Ejercicio3.Palindromos;

public class main {
    public static void main(String[] args) {
        // Ejercicio 1 parte 1
        Enumerador.GustosPizza prueba = Enumerador.GustosPizza.JAMON;
        // Ejercicio 1 parte 2
        ContarVocalesYConsonantes prueba2 = new ContarVocalesYConsonantes();
        System.out.println(prueba2.contar("hola     mundo"));

        switch(prueba){
            case JAMON:
                System.out.println("Top tier");
                break;
            case ROQUEFORT:
                System.out.println("Yippie");
                break;
            case PEPPERONI:
                System.out.println("Mamma mia");
                break;
            case CAPRESSE:
                System.out.println("Mi favorita :)");
                break;
            default:
                System.out.println("Ninguna");
        }



        // Ejercicio 3
        Palindromos.calcularPalindromo("Anita lava la tina.");
        Palindromos.calcularPalindromo("Roma, ¿acaso saca amor?");

    }
}