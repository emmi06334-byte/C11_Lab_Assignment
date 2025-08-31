<%@ page import="java.util.*,classes.library.dao.StudentDAO,classes.library.model.Student" %>
<html>
<body>
<h2>Registered Students</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th></tr>
<%
    List<Student> list = new StudentDAO().getAllStudents();
    for(Student s : list){
%>
   <tr>
       <td><%= s.getId() %></td>
       <td><%= s.getName() %></td>
       <td><%= s.getEmail() %></td>
       <td><%= s.getCourse() %></td>
</tr>
<% } %>
</table>
</body>
</html>