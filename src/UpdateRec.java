import java.sql.*;

public class UpdateRec {
    static final String DB_URL = "jdbc:mysql://localhost/employeedb";
    static final String USER = "admin";
    static final String PASS = "admin1234";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement() ;
            String sql = "UPDATE employeedb SET phone = 26940 WHERE emp_id = 1002";
            stm.executeUpdate(sql);
            String query = "SELECT emp_id, first_name, last_name, phone FROM employeedb";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                System.out.print("Emp ID: "+rs.getInt("emp_id"));
                System.out.print(", First Name: "+rs.getString("first_name"));
                System.out.print(", Last Name: "+rs.getString("last_name"));
                System.out.println(", Num Phone: "+rs.getInt("phone"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

