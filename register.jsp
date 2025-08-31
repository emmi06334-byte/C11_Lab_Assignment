<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
<h2>Student Registration</h2>
<form action="register" method="post">
<label>Name:</label><br>
<input type="text" name="name" required><br><br>


<label>Email:</label><br>
<input type="email" name="email" required><br><br>


<label>Mobile:</label><br>
<input type="text" name="mobile"><br><br>


<label>Course:</label><br>
<input type="text" name="course"><br><br>


<button type="submit">Register</button>
</form>
</body>
</html>