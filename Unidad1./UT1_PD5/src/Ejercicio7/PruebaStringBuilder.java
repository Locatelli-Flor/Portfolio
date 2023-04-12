package Ejercicio7;

public class PruebaStringBuilder {

    public static void main(String[] args) {
        constructor1();
        constructor2();
        constructor3();
        constructor4();
        pruebaSetLenght();
        pruebaEnsure();
        pruebaAppend();
        pruebaInsert();
        pruebaDelete();
        pruebaCharAt();
        pruebaReverse();
    }

    // La clase string builder sirve para crear string que son mutables

    // Constructores de string builder
    // StringBuilder(): crea un string builder de largo 16 caractéres
    // Ejemplo:
    public static void constructor1(){
        StringBuilder p1 = new StringBuilder();
        System.out.println(p1);
    }

    // StringBuilder(CharSequence cs): crea un string builder conteniendo los caractéres dados por el CharSequence, además de 16 espacios vacíos al final
    // Ejemplo:
    public static void constructor2(){
        CharSequence s = "1,agj18f.,z";
        StringBuilder p2 = new StringBuilder(s);
        System.out.println(p2);
    }

    // StringBuilder(int capacidad): crea un string builder del largo dado por el int capacidad
    // Ejemplo:
    public static void constructor3(){
        StringBuilder p3 = new StringBuilder(10);
        System.out.println(p3);
    }

    // StringBuilder(String s): crea un string builder que su parte inicial es la especificada por el string s, además de tener 16 espacio vacíos al final
    // Ejemplo:
    public static void constructor4(){
        StringBuilder p4 = new StringBuilder("hola");
        System.out.println(p4);
    }

    // setLenght: setea el largo de una cadena de caracteres. Si el largo es menor al largo del stringbuilder, los valores que quedan por fuera se
    // truncan. Si el largo es mayor al del stringbuilder, se agregan caracteres null al final de la secuencia
    // Ejemplo:
    public static void pruebaSetLenght(){
        StringBuilder p5 = new StringBuilder("holaholahola");
        p5.setLength(5);
        System.out.println(p5);
    }

    // ensureCapacity: se asegura que el largo del stringbuilder sea al menos igual a la capacidad
    // Ejemplo:
    public static void pruebaEnsure(){
        StringBuilder p6 = new StringBuilder(5);
        p6.ensureCapacity(10);
        System.out.println("p6 ahora puede guardar hasta 10 elementos");
    }

    // append() - boolean, char, char[], char[] int offset int len, double, float, int, long, Object, String
    // Agrega el argumento al string builder. Los datos se convierten a string antes de ser agregados
    // Ejemplo:
    public static void pruebaAppend(){
        StringBuilder p7 = new StringBuilder(5);
        p7.append(7);
        p7.append("hola");
        System.out.println(p7.capacity());
    }

    // insert() - int offset boolean b, int offset char c, int offset char[], int index, char[] int offset int len, int offset double b, int offset float f, int offset int i, int offset Object obj, int offset, String s
    // inserta el segundo argumento en el string builder. el primer entero indica el índice donde se van a insertar los datos. Los datos se conviertens a string antes de ser agregados
    // Ejemplo:
    public static void pruebaInsert(){
        StringBuilder p8 = new StringBuilder(10);
        p8.insert(0,"hola");
        p8.insert(0, "1.0");
        System.out.println(p8);
    }

    // delete(int start, int end): Borra la subsecuencia desde el princio hasta el final menos uno en los caractéres del string builder
    // Ejemplo:
    public static void pruebaDelete(){
        StringBuilder p9 = new StringBuilder("hola");
        p9.append(10);
        p9.append(3.0);
        p9.delete(0,1);
        System.out.println(p9);
    }

    // deleteCharAt(int index): Borra el caractér en el índice mencionado
    // Ejemplo:
    public static void pruebaCharAt(){
        StringBuilder p10 = new StringBuilder("wow");
        p10.append(4.5);
        p10.append(0);
        p10.deleteCharAt(1);
        System.out.println(p10);
    }

    // reverse(): da vuelta la secuencia de caracteres en el string builder
    // Ejemplo:
    public static void pruebaReverse(){
        StringBuilder p11 = new StringBuilder("10");
        p11.append(0.1);
        p11.append("hola");
        p11.reverse();
        System.out.println(p11);
    }
}
