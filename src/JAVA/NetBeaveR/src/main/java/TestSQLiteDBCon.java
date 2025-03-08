import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSQLiteDBCon {
    public static void main(String[] args) {
        // Replace with the path to your SQLite database
        String url = "jdbc:sqlite:/home/NickstaK/sqlite/Chinook.db";

        // Establish the connection
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}