import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {


    public static Empresa empresa = new Empresa();

    public static Empresa empresa2 = new Empresa();

    public static Empresa empresa3 = new Empresa();

    public static void setUpEmpresa1(){
        String [] info = ManejadorArchivosGenerico.leerArchivo("src/suc1.txt");
        for(String str : info){
            Sucursal toBeAdded = new Sucursal();
            toBeAdded.setCity(str);
            empresa.agregarSucursal(toBeAdded);
        }
    }

    public static void setUpEmpresa2(){
        String [] info = ManejadorArchivosGenerico.leerArchivo("src/suc2.txt");
        for(String str : info){
            Sucursal toBeAdded = new Sucursal();
            toBeAdded.setCity(str);
            empresa2.agregarSucursal(toBeAdded);
        }
    }

    public static void setUpEmpresa3(){
        String [] info = ManejadorArchivosGenerico.leerArchivo("src/suc3.txt");
        for(String str : info){
            Sucursal toBeAdded = new Sucursal();
            toBeAdded.setCity(str);
            empresa3.agregarSucursal(toBeAdded);
        }
    }

    public static void main(String[] args) {
        //Ejercicio1
        setUpEmpresa1();
        System.out.println(empresa.cantidadSucursales());

        //Ejercicio2

        empresa.eliminarSucursal("Chicago");
        Sucursal sucNextToHongKong =null;
        for(int i=0; i<empresa.listSucursales.size();i++){
            if(Objects.equals(empresa.listSucursales.get(i).getCity(), "Hong Kong")){
                sucNextToHongKong=empresa.listSucursales.get(i+1);
                System.out.println(sucNextToHongKong.getCity());
            }
        }

        //Ejercicio 3
        setUpEmpresa2();
        empresa2.eliminarSucursal("Tokio");
        empresa2.eliminarSucursal("Shenzen");
        System.out.println(empresa2.cantidadSucursales());

        //Ejercicio 4
        setUpEmpresa3();
        System.out.println(empresa3.imprimirSucursalSeparador(";_"));


    }
}