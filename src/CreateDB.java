import java.sql.*;

public class CreateDB {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "admin";
    static final String PASS = "admin1234";
    static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement();
            String sql="CREATE DATABASE EMPLOYEEDB";
            stm.executeUpdate(sql);
            System.out.println("The database is created successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
