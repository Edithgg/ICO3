public class EmpleadoBaseMasComision extends object
{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, double ventasBrutas,
        double tarifaComision, double salarioBase)
    {
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");

        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    public String getPrimerNombre() { return primerNombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getNumeroSeguroSocial() { return numeroSeguroSocial; }

    public void setVentasBrutas(double ventasBrutas)
    {
        if (ventasBrutas < 0.0) throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }
    public double getVentasBrutas() { return ventasBrutas; }

    public void setTarifaComision(double tarifaComision)
    {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        this.tarifaComision = tarifaComision;
    }
    public double getTarifaComision() { return tarifaComision; }

    public void setSalarioBase(double salarioBase)
    {
        if (salarioBase < 0.0) throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() { return salarioBase; }

    public double ingresos()
    {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    @Override
    public String toString()
    {
        return String.format(
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
            "empleado por comisión con sueldo base", primerNombre, apellidoPaterno,
            "número de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas, "tarifa de comisión", tarifaComision,
            "salario base", salarioBase);
    }
}