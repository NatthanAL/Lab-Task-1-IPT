import java.sql.*;


public class InsertValue {
    static final String DB_URL = "jdbc:mysql://localhost/EMPLOYEEDB";
    static final String USER = "admin";
    static final String PASS = "admin1234";
    static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement();

            String sql = "INSERT INTO employeedb VALUES(1001,'Owen', 'Kent', 12345)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1002,'Eey', 'Ong', 12346)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1003,'Yoo', 'Nyy', 12347)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1004,'David', 'Dhabi', 12348)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1005,'Lubu', 'Liam', 12349)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1006,'George', 'Grey', 12350)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1007,'Elly', 'Jones', 12351)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1008,'Emily', 'Anderson', 12352)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1009,'Cici', 'Caca', 12353)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1010,'Martha', 'Luiz', 12354)";
            stm.executeUpdate(sql);
            System.out.println("Inserting records ...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
