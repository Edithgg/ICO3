import java.util.Date;

public class Estudiante extends Persona {
    // Atributos específicos de Estudiante
    private String idAlumno;
    private String carrera;
    private String gradoObtenido; // Licenciatura
    private int anioGraduacionEsperado;
    private double promCalif; // Promedio numérico

    // Constructor que invoca al constructor de la superclasee
        public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String idAlumno, String carrera,
                          String gradoObtenido, int anioGraduacionEsperado) {
                super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
                this.idAlumno = idAlumno;
                this.carrera = carrera;
                this.gradoObtenido = gradoObtenido;
                this.anioGraduacionEsperado = anioGraduacionEsperado;
                this.promCalif = 0.0;
        }

    // getters y setters
        public String getIdAlumno() 
        { return idAlumno; }
        public void setIdAlumno(String idAlumno) 
        { this.idAlumno = idAlumno; }

        public String getCarrera() 
        { return carrera; }
    // para cambio de carrera
        public void cambiarCarrera(String nuevaCarrera) 
        { this.carrera = nuevaCarrera; }

        public String getGradoObtenido() 
        { return gradoObtenido; }
        public void setGradoObtenido(String gradoObtenido) 
        { this.gradoObtenido = gradoObtenido; }

        public int getAnioGraduacionEsperado()
         { return anioGraduacionEsperado; }
        public void setAnioGraduacionEsperado(int anioGraduacionEsperado) 
        { this.anioGraduacionEsperado = anioGraduacionEsperado; }

        public double getPromCalif() 
        { return promCalif; }

    /**
     * Calcula el promedio 
     * Convierte las letras al equivalente num
     */
        public void calcularPromedio(int numeroCalificaciones, String[] calificaciones) {
            if (numeroCalificaciones <= 0 || calificaciones == null) {
                this.promCalif = 0.0;
                    return;
        }

        double sumaPuntos = 0.0;
        for (String letra : calificaciones) {
            switch (letra.trim().toUpperCase()) {
                case "A":   sumaPuntos += 4.0;  break;
                case "A-":  sumaPuntos += 3.67; break;
                case "B+":  sumaPuntos += 3.33; break;
                case "B":   sumaPuntos += 3.0;  break;
                case "B-":  sumaPuntos += 2.67; break;
                case "C+":  sumaPuntos += 2.33; break;
                case "C":   sumaPuntos += 2.0;  break;
                case "D":   sumaPuntos += 1.0;  break;
                case "F":   sumaPuntos += 0.0;  break;
                default:    sumaPuntos += 0.0;  break; // por si hy entraa invlidaxdd
            }
        }
        this.promCalif = sumaPuntos / numeroCalificaciones;
    }

    // Sobreescritura
    @Override
    public String toString() {
        return "=== DATOS DEL ESTUDIANTE ===\n" +
               "Nombre Completo: " + obtenerNombreCompleto() + "\n" +
               "ID Alumno: " + idAlumno + "\n" +
               "Carrera: " + carrera + "\n" +
               "Grado Objetivo: " + gradoObtenido + "\n" +
               "Año de Graduación: " + anioGraduacionEsperado + "\n" +
               "Promedio de Calificaciones: " + String.format("%.2f", promCalif);
    }
}