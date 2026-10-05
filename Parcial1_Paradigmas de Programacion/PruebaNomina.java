public class PruebaNomina{
    public static void main (String[] args){
        EmpleadoAsalariado objEmpleadoAsalariado = new EmpleadoAsalariado("Andrea", "Torres", "123-234-456", 800.00);
        EmpleadoPorHoras objEmpleadoPorHoras = new EmpleadoPorHoras("Karen", "Armanta", "789-234-456", 50.50, 40);
        EmpleadoPorComision objEmpleadoPorComision = new EmpleadoPorComision("Steve", "Sanders", " 564-762-124", 20000, 0.6);
        EmpleadoBaseMasComision objEmpleadoBaseMasComision = new EmpleadoBaseMasComision("Miriam", "Estrada", "452-634-167", 15000, 0.4, 400.00);
    } //procesamiento de empleados por separado
    System.out.println("Empleados procesados por seprarado: ");
    System.out.printf("%n%s%n%s: $%,.2f%n", objEmpleadoAsalariado, "ingresos", objEmpleadoAsalariado.ingresos());

}