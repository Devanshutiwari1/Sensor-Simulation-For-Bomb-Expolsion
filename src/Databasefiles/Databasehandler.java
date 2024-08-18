package Databasefiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Databasehandler {

    private static final String URL = "jdbc:mysql://localhost:3306/drdo_server";
    private static final String USER = "root";
    private static final String PASSWORD = "9160";

    private Connection connection;


    public Databasehandler() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public int getOrInsertDateId(String date) throws SQLException {
//        String selectQuery = "SELECT id FROM Dates WHERE date = ?";
//        String insertQuery = "INSERT INTO Dates (date) VALUES (?)";
//
//        PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
//        selectStmt.setString(1, date);
//        ResultSet rs = selectStmt.executeQuery();
//
//        if (rs.next()) {
//            return rs.getInt("id");
//        } else {
//            PreparedStatement insertStmt = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
//            insertStmt.setString(1, date);
//            insertStmt.executeUpdate();
//
//            ResultSet generatedKeys = insertStmt.getGeneratedKeys();
//            if (generatedKeys.next()) {
//                return generatedKeys.getInt(1);
//            } else {
//                throw new SQLException("Inserting date failed, no ID obtained.");
//            }
//        }
//    }

    public void insertSensorData(int sensor_num, double latitude, double longitude, String today, String formattedTime, String site_On_Going, String sensor_health , int capacity) throws SQLException {
        String query = "INSERT INTO SensorData (sensor_num, latitude_°N, longitude_°E, Current_Day, formatted_Time, site_on_going, sensor_health , capacity_KT) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, sensor_num);
        stmt.setDouble(2, latitude);
        stmt.setDouble(3, longitude);
        stmt.setString(4, today);
        stmt.setString(5, formattedTime);
        stmt.setString(6, site_On_Going);
        stmt.setString(7, sensor_health );
        stmt.setInt(8, capacity );

        System.out.println("Executing query: " + stmt.toString());
        stmt.executeUpdate();
        System.out.println("Data inserted successfully.");
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
