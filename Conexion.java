/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conn;

    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/gestioncursos?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; 
        String password = "admin";
        conn = DriverManager.getConnection(url, usuario, password);
        System.out.println("Conexión exitosa a la base de datos.");
    }

    public Connection getConnection() {
        return conn;
    }

    public void cerrar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
