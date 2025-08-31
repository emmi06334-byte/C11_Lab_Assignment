<%@ page import="webcontent.classes.com.library.model.Student" %>
<%
    Student s = (Student) request.getAttribute("student");
%>
<html>
<head><title>Edit Student</title></head>
<body>
<h2>Edit Student</h2>
<form action="StudentServlet?action=update" method="post">
    <input type="hidden" name="id" value="<%=s.getId()%>">
    Name: <input type="text" name="name" value="<%=s.getName()%>"><br>
    Email: <input type="email" name="email" value="<%=s.getEmail()%>"><br>
    Course: <input type="text" name="course" value="<%=s.getCourse()%>"><br>
    <input type="submit" value="Update">
</form>
</body>
</html>