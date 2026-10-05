public class PruebaEmpleadoBaseMasComision
{
    public static void main(String[] args)
    {
        // crea instancia de objeto EmpleadoBaseMasComision
        EmpleadoBaseMasComision empleado =
            new EmpleadoBaseMasComision(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // obtiene datos del empleado por comisión con sueldo base
        System.out.printf(
            "Informacion del empleado obtenida por metodos get: %n");

        System.out.printf("%s %s%n", "El primer nombre es",
            empleado.getPrimerNombre());

        System.out.printf("%s %s%n", "El apellido es",
            empleado.getApellidoPaterno());

        System.out.printf("%s %s%n", "El numero de seguro social es",
            empleado.getNumeroSeguroSocial());

        System.out.printf("%s %.2f%n", "Las ventas brutas son",
            empleado.getVentasBrutas());

        System.out.printf("%s %.2f%n", "La tarifa de comision es",
            empleado.getTarifaComision());

        System.out.printf("%s %.2f%n", "El salario base es",
            empleado.getSalarioBase());

        empleado.setSalarioBase(1000);

        System.out.printf("%n%s:%n%n%s%n",
            "Informacion actualizada del empleado, obtenida por toString",
            empleado.toString());
    } // fin de main
} // fin de la clase PruebaEmpleadoBaseMasComision