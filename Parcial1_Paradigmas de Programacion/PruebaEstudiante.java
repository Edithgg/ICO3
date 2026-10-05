import java.util.Scanner;
import java.util.Date;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Registro de Nuevo Estudiante");
        System.out.print("Nombre: ");
        String nom = entrada.nextLine();
        System.out.print("Apellido Paterno: ");
        String apPat = entrada.nextLine();
        System.out.print("Apellido Materno: ");
        String apMat = entrada.nextLine();
        
        Date fechaNac = new Date(); 

        System.out.print("ID de Alumno: ");
        String id = entrada.nextLine();
        System.out.print("Carrera: ");
        String carrera = entrada.nextLine();
        System.out.print("Grado Académico (Licenciatura/Master/Ph.D): ");
        String grado = entrada.nextLine();
        System.out.print("Año esperado de graduación: ");
        int anio = entrada.nextInt();
        entrada.nextLine();

        //obj etuinte
        Estudiante estudiante = new Estudiante(nom, apPat, apMat, fechaNac, id, carrera, grado, anio);

        //arreglo
        System.out.print("\n¿Cuántas calificaciones desea registrar?: ");
        int cantCalificaciones = entrada.nextInt();
        entrada.nextLine();

        String[] listaCalificaciones = new String[cantCalificaciones];

        //capturar las calif
        for (int i = 0; i < cantCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + " (Ej: A, B+, C-, F): ");
            listaCalificaciones[i] = entrada.nextLine();
        }

        //promedio numérico
        estudiante.calcularPromedio(cantCalificaciones, listaCalificaciones);

        //info del estudiante
        System.out.println("\n" + estudiante);

        System.out.print("\n¿Desea cambiar de carrera al estudiante? (si/no): ");
        String respuesta = entrada.nextLine().trim().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.print("Ingrese el nombre de la nueva carrera: ");
            String nuevaCarrera = entrada.nextLine();
            
            //c+ambio de carrera
            estudiante.cambiarCarrera(nuevaCarrera);
            
            System.out.println("\n¡Cambio realizado con éxito!");
            System.out.println("Nueva Carrera del estudiante: " + estudiante.getCarrera());
        }
        
        System.out.println("\nFin del programa. ¡Proceso completado!");
        entrada.close();
    }
}