package webcontent.classes.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/librarydb";
    private static final String USER = "punam";  // change if needed
    private static final String PASS = "12345"; // change if needed

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
