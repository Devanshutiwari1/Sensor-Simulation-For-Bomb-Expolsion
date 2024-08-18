import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteIntegration {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Path to the SQLite database file
            String url = "jdbc:sqlite:src/db/DRDO_SERVER.db";
            
            // Create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
            
            // SQL statement for creating a new table
            String sql = """
                         CREATE TABLE IF NOT EXISTS SensorData (
                         ID INTEGER PRIMARY KEY AUTOINCREMENT,
                         sensor_num INT,
                         latitude_N DOUBLE,
                         longitude_E DOUBLE,
                         Current_Day TEXT,
                         formatted_Time TIME,
                         site_on_going TEXT,
                         sensor_health TEXT,
                         capacity_KT INT
                         );""";
            
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Table 'SensorData' created successfully.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


