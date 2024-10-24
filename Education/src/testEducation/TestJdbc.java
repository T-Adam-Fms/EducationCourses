package testEducation; // TEST DB CONNECTION

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mariadb://localhost:3306/education";  // Replace with your database details
        String user = "root";  //  username
        String password = "fms2024";  // database password

        try {
            // Load the MariaDB JDBC Driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Establish the connection to the database
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the JDBC driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred.");
            e.printStackTrace();
        }
    }
}
