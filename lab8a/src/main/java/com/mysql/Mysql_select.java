package com.mysql;
import java.sql.*;
import java.util.Properties;

public class Mysql_select {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            // Connect to MySQL
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root");        // Use your MySQL username
            info.put("password", "");        // Use your MySQL password if set

            dbConnection = DriverManager.getConnection(url, info);
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database 'test'");
            }

            // Read from coffee table
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("Current records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("%d, %s, %d\n", id, coffee_name, price);
            }

            // Insert a new coffee record
            String insertQuery = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement pstmt = dbConnection.prepareStatement(insertQuery);
            pstmt.setString(1, "Tajmahal");
            pstmt.setInt(2, 950);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Inserted rows: " + rowsInserted);

            pstmt.close();
            st.close();
            dbConnection.close();

        } catch (SQLException e) {
            System.err.println("SQL Exception:");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception:");
            e.printStackTrace();
        }
    }
}
