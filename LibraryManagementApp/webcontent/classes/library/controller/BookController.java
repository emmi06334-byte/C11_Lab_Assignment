package webcontent.classes.library.controller;




import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Date;
import webcontent.classes.library.model.Book;
import webcontent.classes.library.dao.BookDAO;

public class BookController extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String referenceId = req.getParameter("referenceId");
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        Date issueDate = Date.valueOf(req.getParameter("issueDate"));
        Date submissionDate = Date.valueOf(req.getParameter("submissionDate"));

        Book b = new Book();
        b.setTitle(title);
        b.setAuthor(author);
        b.setReferenceId(referenceId);
        b.setIssuedTo(studentId);
        b.setIssueDate(issueDate);
        b.setSubmissionDate(submissionDate);

        try {
            new BookDAO().issueBook(b);
        } catch(Exception e){ e.printStackTrace(); }

        resp.sendRedirect("viewBooks.jsp");
    }
}
