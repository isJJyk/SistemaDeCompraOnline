package SistemaCompra.entities.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConnection {
    public static Connection getConnection() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/comprasonline";
            String user = "root";
            String password = null;

            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
