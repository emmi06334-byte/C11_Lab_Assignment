package com.example.controller;


import com.example.dao.StudentDAO;
import com.example.model.Student;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet("/register")
public class StudentController extends HttpServlet {
private StudentDAO studentDAO = new StudentDAO();


@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");


String name = request.getParameter("name");
String email = request.getParameter("email");
String mobile = request.getParameter("mobile");
String course = request.getParameter("course");


Student student = new Student(name, email, mobile, course);


try {
boolean saved = studentDAO.save(student);
if (saved) {
request.setAttribute("student", student);
request.getRequestDispatcher("success.jsp").forward(request, response);
} else {
request.setAttribute("error", "Unable to save student. Please try again.");
request.getRequestDispatcher("error.jsp").forward(request, response);
}
} catch (Exception e) {
e.printStackTrace();
request.setAttribute("error", e.getMessage());
request.getRequestDispatcher("error.jsp").forward(request, response);
}
}


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.sendRedirect("register.jsp");
}
}
