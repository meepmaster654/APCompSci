import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        createNewTask("Eat it up");
    }
    static void createNewTask(String taskName) {
        String sql = "INSERT INTO tasklist (taskname) VALUES (?)";
        
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set the parameters for the query
            stmt.setString(1, taskName);

            // Execute the query
            stmt.executeUpdate();
            System.out.println("Task created successfully!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class DatabaseUtil {

    // Reusable method to establish a connection to PostgreSQL
    public static Connection getConnection() throws SQLException {
        // Database connection URL in the JDBC format
        String url = "jdbc:postgresql://localhost:5432/todolistdb"; // Your database URL
        
        // Username to connect to the database
        String user = "postgres";  // Your PostgreSQL username
        
        // Password to connect to the database
        String password = "Will34will34!";  // Your PostgreSQL password

        // Establishes and returns a connection to the database
        return DriverManager.getConnection(url, user, password);
    }
}