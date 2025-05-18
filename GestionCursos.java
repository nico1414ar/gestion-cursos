/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Nico
 */
import java.sql.Date;
import java.util.Calendar;

public class GestionCursos {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try {
            conexion.conectar();

            ControladorAlumno controladorAlumno = new ControladorAlumno(conexion);
            ControladorCurso controladorCurso = new ControladorCurso(conexion);
            ControladorInscripcion controladorInscripcion = new ControladorInscripcion(conexion);

            Alumno alumno = new Alumno("Juan", "Pérez", "34274536", "juan@example.com");
            controladorAlumno.registrarAlumno(alumno);

            Curso curso = new Curso("classroom", "Curso introductorio a Java");
            controladorCurso.registrarCurso(curso);

            Date fechaInscripcion = new Date(Calendar.getInstance().getTimeInMillis());
            Inscripcion inscripcion = new Inscripcion(alumno.getId(), curso.getId(), fechaInscripcion);
            controladorInscripcion.inscribirAlumno(inscripcion);

            conexion.cerrar();
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}
