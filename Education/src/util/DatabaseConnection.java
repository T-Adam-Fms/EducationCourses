package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // MariaDB connection details
    private static final String URL = "jdbc:mariadb://localhost:3306/education";  // Database: education
    private static final String USER = "root";  // Username: root
    private static final String PASSWORD = "fms2024";  // Password: fms2024

    static {
        try {
            // Load the MariaDB JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MariaDB JDBC driver not found.", e);
        }
    }

    // Method to get the connection to MariaDB
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

