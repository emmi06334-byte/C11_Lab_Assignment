package webcontent.classes.library.dao;



import java.sql.*;
import java.util.*;
import webcontent.classes.library.model.Student;

public class StudentDAO {
    public void insertStudent(Student s) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO students(name,email,course) VALUES(?,?,?)");
        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setString(3, s.getCourse());
        ps.executeUpdate();
        con.close();
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");
        while(rs.next()){
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setCourse(rs.getString("course"));
            list.add(s);
        }
        con.close();
        return list;
    }
}
