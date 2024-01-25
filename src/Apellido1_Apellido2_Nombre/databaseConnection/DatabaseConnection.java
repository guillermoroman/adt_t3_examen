package Apellido1_Apellido2_Nombre.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/adt_t3_examen";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

    public static void createNewDatabase(String dbName) {
        // Connection for initial database connection, without specific database
        String urlSinBaseDeDatos = "jdbc:mariadb://localhost:3306";
        try (Connection conn = DriverManager.getConnection(urlSinBaseDeDatos, USUARIO, PASSWORD);
             Statement stmt = conn.createStatement()) {

            // SQL statement to create a new database
            String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully: " + dbName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
