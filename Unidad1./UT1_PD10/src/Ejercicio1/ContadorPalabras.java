package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ContadorPalabras {
    public static void main(String[] args) throws IOException {
        String[] Ar1 = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] Ar2 = {"Hola", "mundo", "de", "la", "informática"};

        ContadorPalabras prueba = new ContadorPalabras();
        prueba.palabrasComunes(Ar1 ,Ar2);

        String ruta = "C:\\Users\\Flori\\IdeaProjects\\UT1_PD10\\src\\Ejercicio1\\entrada.txt";
        prueba.palabrasComunesArchivo(ruta);
    }

    //  Parte b
    String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        ArrayList<String> comunes = new ArrayList<>();

        for (int i = 0; i < palabras1.length; i++) {
            if(Arrays.asList(palabras2).contains(palabras1[i])){
               comunes.add(palabras1[i]);
            }
        }
        String[] resultado = new String[comunes.size()];
        System.out.println(Arrays.toString(comunes.toArray(resultado)));
        return comunes.toArray(resultado);
    }

    String[] palabrasComunesArchivo(String rutaArchivo) throws IOException {

        ArrayList<String> lineas = new ArrayList<>();
        FileReader arch = new FileReader(rutaArchivo);
        Scanner leer = new Scanner(arch);

        String linea;

        while(leer.hasNextLine()){
            linea = leer.nextLine();
            lineas.add(linea);
        }
        leer.close();

        Random random = new Random();
        int indice1 = random.nextInt(lineas.size());
        int indice2 = random.nextInt(lineas.size());

        while(indice1 == indice2){
            indice2 = random.nextInt(lineas.size());
        }

        String linea1 = lineas.get(indice1);
        System.out.println(linea1);
        String linea2 = lineas.get(indice2);
        System.out.println(linea2);

        String[] array1 = linea1.split("\n");
        String[] array2 = linea2.split("\n");

        ContadorPalabras contar = new ContadorPalabras();

        return(contar.palabrasComunes(array1, array2));
    }
}

// parte a
// Este ejercicio toma dos vectores de palabras y devuelve otro que contiene las palabras
// que están en ambos. Para hacer esto, la función itera sobre el primer vector y corrobora
// que el elemento esté en el otro vector. Si está, lo agrega al tercer vector.


