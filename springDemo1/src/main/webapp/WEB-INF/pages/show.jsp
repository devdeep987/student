<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hey welcome , here is the list of all the students in the database</h3>
<table border="1">

			<th>ID</th>
			<th>Name</th>
			<th>Course</th>
			<c:forEach var="student" items="${student}">
				<tr>

					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.course}</td>
					<td><a href="editStudent?id=${student.id}">Edit</a>
						     <a href="deleteStudent?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<br><br><a href="http://localhost:8080/springDemo1/">click here to go back</a>

</body>
</html>