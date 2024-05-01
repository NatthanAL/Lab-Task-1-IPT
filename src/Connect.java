import java.sql.*;

public class Connect {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "admin";
    static final String PASS = "admin1234";
    //static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("the connection ok");
        } catch (Exception e) {
            System.out.println("cannot connect");
        }
    }

}
