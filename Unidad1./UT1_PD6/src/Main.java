import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //leerEntradaArchivo("src//Ejercicio2//entrada//entrada.txt");
        //leerEntradaStdin();

        transformarTextoT9("src//Ejercicio3//entrada.txt");
        //transformarT9Texto("src//Ejercicio3//entrada.txt");

    }

    // Ejercicio 2 a)
    public static void leerEntradaArchivo(String rutaArchivo) throws FileNotFoundException {
        File file = new File(rutaArchivo);
        Scanner scan = new Scanner(file);
        List<String> lista = new ArrayList<>();

        while(scan.hasNextLine()){
            lista.add(scan.nextLine());
        }

        System.out.println("El entero leído es: " + lista.get(0));
        System.out.println("El número de punto flotante es: " + lista.get(1));
        System.out.println("La cadena leía es: " + lista.get(2));
        System.out.println("¡Hola Peter! La suma de " + lista.get(0) + " y " + lista.get(1) + " es " + (Integer.parseInt(lista.get(0)) + Float.parseFloat(lista.get(1))));
        System.out.println("La división entera de " + lista.get(1) + " y " + lista.get(0) + " es " + String.format("%.0f", Float.parseFloat((lista.get(1))) / Integer.parseInt(lista.get(0)) - 1) + " y su resto es " + String.format("%.2f", Float.parseFloat(lista.get(1)) % Integer.parseInt(lista.get(0))));
    }

    // Ejercicio 2 b)
    public static void leerEntradaStdin(){
        System.out.println("Ingrese el radio: ");
        Scanner scan = new Scanner(System.in);
        double radio = Float.parseFloat(scan.nextLine());
        double perimetro = Math.PI * radio * 2;
        double area = 2 * Math.PI * radio * radio;

        System.out.println("El perímetro es: " + perimetro + "\nEl área es: " + area);

    }

    // Ejercicio 3 a)

    public static void transformarTextoT9(String rutaArchivo) throws FileNotFoundException {
        File archivo = new File(rutaArchivo);
        Scanner sc = new Scanner(archivo);
        PrintWriter wr = new PrintWriter(new File("src//Ejercicio3//salida.txt"));

        String linea;
        String caracter;
        int letra;

        HashMap<String, Integer> dicc = new HashMap<>();
        dicc.put("a", 2); dicc.put("b", 22); dicc.put("c", 222);
        dicc.put("d", 3); dicc.put("e", 33); dicc.put("f", 333);
        dicc.put("g", 4); dicc.put("h", 44); dicc.put("i", 444);
        dicc.put("j", 5); dicc.put("k", 55); dicc.put("l", 555);
        dicc.put("m", 6); dicc.put("n", 66); dicc.put("o", 666);
        dicc.put("p", 7); dicc.put("q", 77); dicc.put("r", 777); dicc.put("s", 7777);
        dicc.put("t", 8); dicc.put("u", 88); dicc.put("v", 888);
        dicc.put("w", 9); dicc.put("x", 99); dicc.put("y", 999); dicc.put("z", 9999);
        dicc.put(" ", 0);
        dicc.put(".", 1);

        while(sc.hasNextLine()){
            linea = sc.nextLine().toLowerCase();
            int contador = 0;

            while(contador < linea.length()){
                caracter = String.valueOf(linea.charAt(contador));

                letra = dicc.get(caracter);
                wr.print(letra);
                contador++;
            }
            wr.println();
        }

        sc.close();
        wr.close();
    }

    // Ejercicio 3 parte b)
    public static void transformarT9Texto(String rutaArchivo){
        try{
            FileReader archivo = new FileReader(rutaArchivo);
            FileWriter arch = new FileWriter(rutaArchivo);

            BufferedReader br = new BufferedReader(archivo);
            BufferedWriter bw = new BufferedWriter(arch);

            ArrayList<String> lineas = new ArrayList<>();

            while(br.readLine() != null){
                lineas.add(br.readLine());
            }
            br.close();

            Collections.reverse(lineas);

            for(int i = 0; i <= lineas.size() - 1; i++){
                bw.write(lineas.get(i));
            }

            bw.close();

            transformarTextoT9("src//Ejercicio3//entrada.txt");

        }
        catch (FileNotFoundException e){
            System.out.println("No se encontró archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}