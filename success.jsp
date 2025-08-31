<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="com.example.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful</title>
</head>
<body>
<h2>Registration Successful</h2>
<%
Student student = (Student) request.getAttribute("student");
if (student != null) {
%>
<p>Name: <%= Student.getName() %></p>
<p>Email: <%= Student.getEmail() %></p>
<p>Mobile: <%= Student.getMobile() %></p>
<p>Course: <%= Student.getCourse() %></p>
<% } else { %>
<p>No student information available.</p>
<% } %>


<p><a href="register.jsp">Register another student</a></p>
</body>
</html>