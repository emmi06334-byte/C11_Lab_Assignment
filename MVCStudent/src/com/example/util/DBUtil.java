package com.example.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
private static final String URL = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true";
private static final String USER = "punam"; // change
private static final String PASS = "12345"; // change


static {
try {
// For MySQL Connector/J 8+ driver class is com.mysql.cj.jdbc.Driver, registered automatically
Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
}


public static Connection getConnection() throws SQLException {
return DriverManager.getConnection(URL, USER, PASS);
}
}
