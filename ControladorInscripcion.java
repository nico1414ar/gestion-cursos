/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorInscripcion {
    private Conexion conexion;

    public ControladorInscripcion(Conexion conexion) {
        this.conexion = conexion;
    }

    public void inscribirAlumno(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion (id_alumno, id_curso, fecha_inscripcion) VALUES (?, ?, ?)";
        try (PreparedStatement pst = conexion.getConnection().prepareStatement(sql)) {
            pst.setInt(1, inscripcion.getIdAlumno());
            pst.setInt(2, inscripcion.getIdCurso());
            pst.setDate(3, inscripcion.getFechaInscripcion());
            pst.executeUpdate();
            System.out.println("Alumno inscrito correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al inscribir alumno: " + e.getMessage());
        }
    }
}
