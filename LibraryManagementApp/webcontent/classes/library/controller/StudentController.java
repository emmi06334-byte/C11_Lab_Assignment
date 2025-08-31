package webcontent.classes.library.controller;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import webcontent.classes.library.model.Student;
import webcontent.classes.library.dao.StudentDAO;

public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");

        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        s.setCourse(course);

        try {
            new StudentDAO().insertStudent(s);
        } catch(Exception e){ e.printStackTrace(); }

        resp.sendRedirect("viewStudents.jsp");
    }
}
