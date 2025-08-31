<%@ page import="com.example.bean.LoginBean" %>
<%@ page session="true" %>
<html>
<head><title>Welcome</title></head>
<body>
<%
  LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");
  if (loginBean != null) {
%>
    <h2>Welcome, <%= loginBean.getUsername() %>!</h2>
<% } else { %>
    <h3>No session found. Please <a href="login.jsp">login</a>.</h3>
<% } %>
</body>
</html>