public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, 
        String numeroSeguroSocial, double ventasBrutas, 
        double tarifaComision, double salarioBase)
    {
        // llamada explícita al constructor de la superclase EmpleadoPorComision
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, 
            ventasBrutas);

        // si salarioBase no es válido, lanza excepción
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    // establece el salario base
    public void establecerSalarioBase(double salarioBase)
    {
        if (salariobase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    }

    // calcula los ingresos
    @Override 
    public double ingresos()
    {
        // no está permitido: tarifaComision y ventasBrutas son private en la superclase
        return obtenerSalarioBase() + (tarifaComision() * ventasBrutas());
    }

    // devuelve representación String de EmpleadoBaseMasComision
    @Override 
    public String toString()
    {
        // no está permitido: intentos por acceder a los miembros private de la superclase 
        return String.format("%s%n%s%n%s: %.2f", super.toString(),
        "Con sueldo base", "salario Base", obtenerSalarioBase());
    }
} // fin de la clase EmpleadoBaseMasComision