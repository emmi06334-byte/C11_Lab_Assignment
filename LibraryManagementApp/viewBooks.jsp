<%@ page import="java.util.*,library.dao.BookDAO,library.model.Book" %>
<html>
<body>
<h2>Issued Books</h2>
<table border="1">
<tr><th>ID</th><th>Title</th><th>Author</th><th>Reference ID</th><th>Issued To (Student ID)</th><th>Issue Date</th><th>Submission Date</th></tr>
<%
    List<Book> list = new BookDAO().getAllBooks();
    for(Book b : list){
%>
<tr>
<td><%= b.getId() %></td>
<td><%= b.getTitle() %></td>
<td><%= b.getAuthor() %></td>
<td><%= b.getReferenceId() %></td>
<td><%= b.getIssuedTo() %></td>
<td><%= b.getIssueDate() %></td>
<td><%= b.getSubmissionDate() %></td>
</tr>
<% } %>
</table>
</body>
</html>