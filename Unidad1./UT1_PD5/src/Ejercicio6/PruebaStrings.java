package Ejercicio6;

public class PruebaStrings {
    static String Prueba = "  aprUEba123  ";
    static CharSequence secuencia = "p1b";

    public static void main(String[] args) {
        pruebaSubstring1(2, 5);
        pruebaSubstring2(2);
        pruebaSplit1("pr");
        pruebaSplit2("ba", 5);
        pruebaSubSequence(0, 2);
        pruebaTrim();
        pruebaToLowerCase();
        pruebaToUpperCase();
        pruebaIndexOf(1);
        pruebaIndexOf2(1, 5);
        pruebaIndexOf3("12");
        pruebaIndexOf4("U",3);
        pruebaContains(secuencia);
        pruebaReplace("a","o");
        pruebaReplace2("U", "1");
        pruebaReplaceFirst("a","10");

    }

    // Método substring: tiene dos usos:
    // String substring(int indiceComienzo, int indiceFinal). Este método toma
    // retorna un nuevo string que comienza en el índice dado como primer parámetro
    // y termina en el índice dado como segundo parámetro.
    // Ejemplo:
    public static void pruebaSubstring1(int Inicio, int Final){
        System.out.println(Prueba.substring(Inicio,Final));
    }
    // Seungdo uso: retorna un string que empieza en el índice pasado como parámetro
    // y va hasta el final del string
    // Ejemplo:
    public static void pruebaSubstring2(int Inicio){
        System.out.println(Prueba.substring(Inicio));
    }

    // Método split: tiene dos usos:
    // String[] split(String renex). Este método busca el parámetro dado en el string, y retorna un array con cada caractér que
    // se encuentra
    // Ejemplo:
    public static void pruebaSplit1(String Match){
        String[] prueba2 = Prueba.split(Match);
        System.out.println(prueba2);
    }

    // Segundo uso: retorna un arrya con cada carácter que encuentra dado el primer parámetro, pero tiene un segundo parámetro que limita el
    // tamaño del array
    // Ejemplo:
    public static void pruebaSplit2(String Match , int limite){
        String[] prueba3 = Prueba.split(Match, limite);
        System.out.println(prueba3);
    }

    // Método subSequence: dada una secuencia de caracteres, este método requiere dos parámetros: el índice de inicio y de fin. Retorna
    // una nueva secuencia de caractéres que comienza en el índice dado en el primer carácter y termina en el segundo índice menos 1
    //  Ejemplo:
    public static void pruebaSubSequence(int inicio, int fin){


        System.out.println(Prueba.subSequence(inicio, fin));
    }

    // Método trim: retorna una copia del string removiendo espacion en blanco al princio y al final
    // Ejemplo:
    public static void pruebaTrim(){
        System.out.println(Prueba.trim());
    }

    // Método toLowerCase: Retorna una copia del string con los caractéres cambiados a minúscula
    // Ejemplo:
    public static void pruebaToLowerCase(){
        System.out.println(Prueba.toLowerCase());
    }

    // Método toUpperCase: Retorna una copia del string con los caractéres cambiados a mayúscula
    // Ejemplo:
    public static void pruebaToUpperCase(){
        System.out.println(Prueba.toUpperCase());
    }

    // Método indexOf y lastIndexOf: tiene cuatro usos:
    // Primer uso: int (last)indexOf(int ch). Retorna el índice de la primera (última) ocurrencia con el caractér dado como parámetro
    // Ejemplo:
    public static void pruebaIndexOf(int indice){
        System.out.println(Prueba.indexOf(indice) + Prueba.lastIndexOf(indice));
    }

    // Segundo uso: int (last)indexOf(int ch, int fromIndex). Retorna el índice de la primera (última) ocurrencia con el carácter buscando a partir (desde el final del string hasta) de un índice
    // dado como segundo parámetro
    // Ejemplo:
    public static void pruebaIndexOf2(int indice, int desde){
        System.out.println(Prueba.indexOf(indice, desde) + Prueba.lastIndexOf(indice, desde));
    }

    // Tercer uso: int (last)indexOf(String str). Retorna el índice de la primera(última) ocurrencia con el substring dado como parámetro
    // Ejemplo:
    public static void pruebaIndexOf3(String sub){
        System.out.println(Prueba.indexOf(sub) + Prueba.lastIndexOf(sub));
    }

    // Cuarto uso: int (last)indexOf(String str, int fromIndex). Retorna el índice de la primera (última) ocurrencia con el substring dado como parámetro
    // buscando a partir (desde el final del string hasta) de un índice dado como segundo parámetro
    // Ejemplo:
    public static void pruebaIndexOf4(String sub, int desde){
        System.out.println(Prueba.indexOf(sub, desde) + Prueba.lastIndexOf(sub, desde));
    }

    // Método contains: retorna true si el string contiene el caractér especificado como parámetro
    // Ejemplo:
    public static void pruebaContains(CharSequence secuencia){
        System.out.println(Prueba.contains(secuencia));
    }

    // Método replace: tiene 2 usos:
    // Primero uso: String replace(char oldChar, char newChar) : retorna un nuevo string reemplazando el primer caractér dado como parámetro
    // por el segundo caractér dado como parámetro
    // Ejemplo:
    public static void pruebaReplace(char viejo, char nuevo){
        System.out.println(Prueba.replace(viejo,nuevo));
    }

    // Segundo uso: String replace(CharSequence target, CharSequence replacement). retorna un nuevo string reemplazando cada substring del
    // primer CharSequence con el correspondiente en el segundo CharSequence
    // Ejemplo:
    public static void pruebaReplace(CharSequence aCambiar, CharSequence reemplazo){
        System.out.println(Prueba.replace(aCambiar,reemplazo));
    }

    // Método replaceAll: retorna un string cambiando todas las ocurrencias del primer substring dado como parámetro con el string original,
    // con el segundo pasado como parámetro
    // Ejemplo:
    public static void pruebaReplace2(String match, String reemplazo){
        System.out.println(Prueba.replace(match, reemplazo));
    }

    // Método replaceFirst: retorna un string reemplazando la primera ocurrencia del substring pasado como primer parámetro con el string pasado
    // como segundo parámetro
    // Ejemplo:
    public static void pruebaReplaceFirst(String match, String reemplazo){
        System.out.println(Prueba.replaceFirst(match,reemplazo));
    }
}
