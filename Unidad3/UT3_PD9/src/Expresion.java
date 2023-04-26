import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Expresion {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("{");
        list1.add("{");
        list1.add("}");
        list1.add("}");

        System.out.println(controlCorchetes(list1));
    }
    public static boolean controlCorchetes(ArrayList<String> caracteres){
        Stack<String> pila = new Stack<>();
        for(int i = 0; i < caracteres.size() ; i++){
            if (caracteres.get(i) == "{"){
                pila.push("{");
            }
            else{
                if(pila.isEmpty()){
                    return false;
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }
}
