import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleQueryExecutionTime {
    public static void main(String[] args) {
        try {
            // Connect to the SQLite database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/path/to/your/database.db");

            // Prepare your query
            String query = "SELECT * FROM Artist LIMIT 5"; // Adjust this query

            // Start measuring time
            long startTime = System.nanoTime();  // Use nanoTime for more precision

            // Execute the query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Process the result (optional, just to keep the query running)
            while (rs.next()) {
                // Print data or do something with the result
                System.out.println("Artist ID: " + rs.getInt("ArtistId"));
                System.out.println("Artist Name: " + rs.getString("Name"));
            }

            // End measuring time
            long endTime = System.nanoTime();  // Capture end time

            // Calculate and display execution time
            long duration = (endTime - startTime);  // Time in nanoseconds
            System.out.println("Query executed in: " + duration + " nanoseconds");

            // Close connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

