import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    List<Sucursal> listSucursales = new LinkedList<>();

    public void agregarSucursal(Sucursal sucursal){
        listSucursales.add(sucursal);
    }

    public boolean eliminarSucursal(String clave){
        Sucursal toBeRemoved = buscar(clave);
        if(toBeRemoved!=null){
            listSucursales.remove(toBeRemoved);
            return true;
        }
        return false;
    }

    public Sucursal buscar(String clave){
        for(Sucursal sucursal : listSucursales){
            if(sucursal.getCity().equals(clave)){
                return sucursal;
            }
        }
        return null;
    }

    public int cantidadSucursales(){
        return listSucursales.size();
    }

    public boolean esVacia(){
        return listSucursales.isEmpty();
    }

    public void imprimirSucursales(){
        for(Sucursal sucursal: listSucursales){
            System.out.println("Sucursal en "+ sucursal.getCity());
        }
    }

    public String imprimirSucursalSeparador(String separador){
        StringBuilder ciudades = new StringBuilder();
        for(Sucursal sucursal : this.listSucursales){
            ciudades.append(sucursal.getCity()).append(";_");
        }
        return ciudades.toString();
    }
}
