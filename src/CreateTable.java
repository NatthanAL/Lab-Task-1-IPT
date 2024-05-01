import java.sql.*;

public class CreateTable {
    static final String DB_URL = "jdbc:mysql://localhost/EMPLOYEEDB";
    static final String USER = "admin";
    static final String PASS = "admin1234";
    static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS employeeDB (" +
                    "emp_id INT PRIMARY KEY NOT NULL," +
                    "first_name VARCHAR(30)," +
                    "last_name VARCHAR(30)," +
                    "phone VARCHAR(30))";
            stm.executeUpdate(sql);
            System.out.println("Table is successfully created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
