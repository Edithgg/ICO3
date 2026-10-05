public abstract class Empleado{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;


    public Empleado(String primerNombre, String apellidoPaterno, String NumeroSeguroSocial){
            this.primerNombre = primerNombre;
            this.apellidoPaterno = apellidoPaterno;
            this.numeroSeguroSocial = NumeroSeguroSocial;
    }

    public String obtenerPrimerNombre(){
        return primerNombre;
    }

    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }

    @Override 
    public String toString(){
        return String.format("%s %s%n numero de seguro social: %s",
            obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial()
        );
    }
     
    //metodo abstractoxd
    public abstract double ingresos();
}