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

public class ControladorAlumno {
    private Conexion conexion;

    public ControladorAlumno(Conexion conexion) {
        this.conexion = conexion;
    }

    public void registrarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (nombre, apellido, dni, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conexion.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, alumno.getNombre());
            pst.setString(2, alumno.getApellido());
            pst.setString(3, alumno.getDni());
            pst.setString(4, alumno.getEmail());
            int filas = pst.executeUpdate();
            if (filas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    alumno.setId(rs.getInt(1));
                }
                System.out.println("Alumno registrado con ID: " + alumno.getId());
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar alumno: " + e.getMessage());
        }
    }
}
