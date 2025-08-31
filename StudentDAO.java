package com.example.dao;


import com.example.model.Student;
import com.example.util.DBUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentDAO {
private static final String INSERT_SQL = "INSERT INTO students (name, email, mobile, course) VALUES (?, ?, ?, ?)";


public boolean save(Student student) throws SQLException {
try (Connection conn = DBUtil.getConnection();
PreparedStatement ps = conn.prepareStatement(INSERT_SQL)) {


ps.setString(1, student.getName());
ps.setString(2, student.getEmail());
ps.setString(3, student.getMobile());
ps.setString(4, student.getCourse());


int rows = ps.executeUpdate();
return rows > 0;
}
}
}