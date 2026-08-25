import java.util.Scanner;

public class PruebaLibroCalificaciones2 {
    public static void main(String [] args) {
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el nombre del curso: " );
        String nombreCursoIngresado = entrada.nextLine();
        System.out.println();

        System.out.println("Escribe el nombre del Profesor Asignado: " );
        String nombreProfesorAsignado = entrada.nextLine();

        miLibroCalificaciones.mostrarMensaje(nombreCursoIngresado, nombreProfesorAsignado);
    }
}