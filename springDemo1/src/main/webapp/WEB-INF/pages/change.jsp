<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hey welcome, here you can update or delete from the database</h2>

<form:form action="update" method= "GET" modelAttribute="student">
tap if you want to edit and enter the id<br>
<form:hidden path="id" />
<form:input type="text" path="name"/> <br>
<form:input type="text" path="course"/> <br>
<input type="submit"/>
</form:form>

</body>
</html>