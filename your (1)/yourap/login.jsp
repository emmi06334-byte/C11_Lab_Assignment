<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="mypackage.LoginBean"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Example using JavaBean</h2>

    <!-- Bean ka object create -->
    <jsp:useBean id="login" class="mypackage.LoginBean" scope="session" />

    <!-- Bean me values set karo -->
    <jsp:setProperty name="login" property="username" value="admin" />
    <jsp:setProperty name="login" property="password" value="12345" />

    <!-- Output display -->
    <p><b>Username:</b> <jsp:getProperty name="login" property="username" /></p>
    <p><b>Password:</b> <jsp:getProperty name="login" property="password" /></p>

    <p style="color:green">✅ JavaBean connected successfully!</p>
</body>
</html>