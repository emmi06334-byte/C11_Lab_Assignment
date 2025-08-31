package webcontent.classes.com.example.library.controller;



import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

import webcontent.classes.com.example.library.model.Student;
import webcontent.classes.com.example.library.dao.StudentDAO;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        Student student = new Student(name, email, course);
        StudentDAO dao = new StudentDAO();

        boolean result = dao.registerStudent(student);

        if (result) {
            response.sendRedirect("success.jsp");
        } else {
            response.getWriter().println("Error while registering student!");
        }
    }
}
