package Ejercicio3;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void initialize(int a, float b){
        NumberHolder crear = new NumberHolder();
        crear.anInt = a;
        crear.aFloat = b;

        System.out.println(crear.anInt);
        System.out.println(crear.aFloat);

    }

}
