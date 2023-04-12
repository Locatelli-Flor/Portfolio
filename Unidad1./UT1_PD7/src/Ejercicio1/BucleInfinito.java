package Ejercicio1;

public class BucleInfinito {
    public void bucle(){
        String s = "1";
        while (s != "1000") {
            s += "0";
        }
    }
    // El operador == compara si las referencias son iguales, por lo que siempre
    // va a devolver falso. Se puede utilizar el método equals() ya que este revisa los caractéres y
    // no las referencias.
    // En c# el operador == revisa si los valores son iguales, por lo que sería el equivalente a el método equals de java
}
