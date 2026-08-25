public class LibroCalificaciones {

    private String nombreDelCurso, nombredelProfesor;

    public void mostrarMensaje(String curso, String nombredelProfesor){
        nombreDelCurso = curso;
        this.nombredelProfesor = nombredelProfesor;

        System.out.printf("Bienvenido libro de Calificaciones para\n%s\n", nombreDelCurso);
        System.out.printf("El profesor asignado es %s\n", this.nombredelProfesor);
    }
}