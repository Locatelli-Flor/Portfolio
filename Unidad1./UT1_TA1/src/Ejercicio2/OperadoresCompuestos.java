package Ejercicio2;

public class OperadoresCompuestos {
        public static void main (String[] args){
/*
            // Parte 1
            int result = 1 + 2;
            System.out.println(result);
            result = result - 1; // sustituir por result--
            System.out.println(result);
            result = result * 2; // sustituir por result *= 2
            System.out.println(result);
            result = result / 2; // sustituir por result /= 2
            System.out.println(result);
            result = result + 8; // sustituir por result += 8
            result = result % 7; // sustituir por result %= 7
            System.out.println(result);

            // Parte 2
            int a = 5;
            int b = 3;
            System.out.println(a+=++b); // En orden de jerarquía, primero se realiza la opreación ++i, y luego se hace a += i
            // por lo tanto, indicando con paréntesis la prioridad sería: a = 5 + (3 + 1) que da 9
*/
            // Parte 3
            int i = 3;
            i++;
            System.out.println(i); // Inicializa i con valor 3, al hacer i++, al imprimir i muestra el 4
            ++i;                   // Suma 1 a la variable i, que vale 4
            System.out.println(i); // imprime i, que vale 5
            System.out.println(++i); // Suma 1 a i, que vale 5, imprime el 6 porque los ++ estan antes de la i
            System.out.println(i++); // Suma 1 a i, que vale 6, pero muestra el 6 porque el ++ esta despues de la i
            System.out.println(i); // Imprime i, que vale 7

        }
    }

