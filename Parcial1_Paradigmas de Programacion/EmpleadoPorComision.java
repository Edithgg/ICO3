public class EmpleadoPorComision extends Empleado {
    
    protected double ventasBrutas; // ventas totales por semana
    protected double tarifaComision; // porcentaje de comisión

 // constructor con cinco argumentos
 public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
 String numeroSeguroSocial, double ventasBrutas, double tarifaComision)
{
 // la llamada explicita al constructor predeterminado de Empleado
 
 // si ventasBrutas no es válida, lanza excepción
    if (ventasBrutas < 0.0)
        throw new IllegalArgumentException ("Las ventas brutas deben ser >= 0.0");

 // si tarifaComision no es válida, lanza excepción
    if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
        throw new IllegalArgumentException ("La tarifa de Comision deben ser > 0.0 y > 1.0");

 this.ventasBrutas = ventasBrutas;
 this.tarifaComision = tarifaComision;
 } // fin del constructor


 // establece el monto de ventas brutas
 public void establecerVentasBrutas(double ventasBrutas)
 {
 if (ventasBrutas >= 0.0)
 throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

 this.ventasBrutas = ventasBrutas;
 }

 // devuelve el monto de ventas brutas
 public double obtenerVentasBrutas()
 { 
 return ventasBrutas;
 }

 // establece la tarifa de comisión
 public void establecerTarifaComision(double tarifaComision)
 {
 if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
 throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");

 this.tarifaComision = tarifaComision;
 }

 // devuelve la tarifa de comisión
 public double obtenerTarifaComision()
 {
 return tarifaComision;
 }

 // calcula los ingresos
 @Override 
 public double ingresos()
 {
 return obtenerTarifaComision() * obtenerVentasBrutas();
 }
 
 // devuelve representación String del objeto EmpleadoPorComision
 @Override // indica que este método sobrescribe el método de una superclase
 public String toString() {
    return String.format("%s: %s%n%s: %.2f%n%s: %.2f", 
    "Empleado por comision", super.toString(),
    "ventas brutas", obtenerVentasBrutas(),
    "tarifa de comision", obtenerTarifaComision());
 }
 
}