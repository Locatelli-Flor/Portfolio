public class Alumno implements IAlumno{
    public String nombreCompleto;
    public int cedula;
    public Alumno(String nombreCompleto, int cedula){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombreCompleto = nombre;
    }

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }

    public int getCedula(){
        return this.cedula;
    }
}
