package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(Constant.DB_URL, Constant.DB_USER, Constant.DB_PASSWORD);
    }

    // Optional helper to close connection safely
    public static void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
