import java.util.Date;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;

    //Constructor
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    //getters

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    public String obtenerApellidoMaterno(){
        return apellidoMaterno;
    }

    public Date obtenerFechaNacimiento(){
        return fechaNacimiento;
    }

    public String obtenerNombreCompleto(){
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    //settersxd

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public void establecerApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }

    public void establecerFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
}