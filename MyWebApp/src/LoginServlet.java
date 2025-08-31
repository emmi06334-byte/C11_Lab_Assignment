

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(request.getParameter("username"));
        loginBean.setPassword(request.getParameter("password"));

        if ("admin".equals(loginBean.getUsername()) && "1234".equals(loginBean.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("loginBean", loginBean);
            response.sendRedirect("welcome.jsp");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Invalid username or password</h3><a href='login.jsp'>Try Again</a>");
        }
    }
}
