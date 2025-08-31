<html>
<body>
<h2>Issue a Book</h2>
<form action="BookController" method="post">
    Title: <input type="text" name="title"/><br/>
    Author: <input type="text" name="author"/><br/>
    Reference ID: <input type="text" name="referenceId"/><br/>
    Student ID: <input type="number" name="studentId"/><br/>
    Issue Date: <input type="date" name="issueDate"/><br/>
    Submission Date: <input type="date" name="submissionDate"/><br/>
    <input type="submit" value="Issue"/>
</form>
</body>
</html>