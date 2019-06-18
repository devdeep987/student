<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create form</title>
</head>
<body bgcolor="red">
<h3>Type in your inputs below:</h3>
<form action="processForm" method= "GET">
	<input type="text" name="studentName" 
  		placeholder="what's your name?"/> <br>
  
  <input type="text" name="courseName" 
  		placeholder="course"/><br>
  
 <input type="submit"/>
</form>
<br><br><a href="http://localhost:8080/springDemo1/">click here to go back</a>
</body>
</html>