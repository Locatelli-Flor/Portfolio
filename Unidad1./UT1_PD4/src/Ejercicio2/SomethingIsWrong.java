package Ejercicio2;

import java.awt.*;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.width*myRect.height);
    }

}

// El error de este programa es que la variable myRect no está inicializada,
// por lo que no se puede asignarle valores a sus atributos. El otro error que aparece
// es en myRect.area() ya que no hay un método area.