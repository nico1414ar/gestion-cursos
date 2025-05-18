/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorCurso {
    private Conexion conexion;

    public ControladorCurso(Conexion conexion) {
        this.conexion = conexion;
    }

    public void registrarCurso(Curso curso) {
        String sql = "INSERT INTO curso (nombre, descripcion) VALUES (?, ?)";
        try (PreparedStatement pst = conexion.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, curso.getNombre());
            pst.setString(2, curso.getDescripcion());
            int filas = pst.executeUpdate();
            if (filas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    curso.setId(rs.getInt(1));
                }
                System.out.println("Curso registrado con ID: " + curso.getId());
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar curso: " + e.getMessage());
        }
    }
}
