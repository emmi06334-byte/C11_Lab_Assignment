package webcontent.classes.com.example.library.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import webcontent.classes.com.example.library.model.Student;

public class StudentDAO {
    private final String URL = "jdbc:mysql://localhost:3306/librarydb";
    private final String USER = "root";
    private final String PASS = "password";

    public boolean registerStudent(Student s) {
        boolean status = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            String sql = "INSERT INTO students(name, email, course) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                status = true;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}