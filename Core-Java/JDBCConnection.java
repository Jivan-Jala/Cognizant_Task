// File: JDBCConnection.java
import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // SQLite file
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String createTable = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT)";
            stmt.execute(createTable);

            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
