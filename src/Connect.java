import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {
        Connection connection = ConnectDB();
        
        if (connection != null) {
            // Do something with the connection (e.g., execute SQL queries)
            
            // Don't forget to close the connection when done
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection ConnectDB() {
        Connection connection = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/hospital";
            String username = "root";
            String password = "tanay@2003";

            // Establish a connection to the database
            connection = DriverManager.getConnection(url, username, password);
        } 
        
        return connection;
    }
}
