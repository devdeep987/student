<%@ page import = "java.util.ResourceBundle" %> 
<% ResourceBundle resource = ResourceBundle.getBundle("application");
 
String version=resource.getString("version");%>
 
<%=version %>
<!DOCTYPE html>
<html>
<head><title> Index</title></head>
<body bgcolor="yellow">
<h3>Hello World!</h3>
You can choose from the options given below: <br>
1.<a href="create">click here to make an input into the database</a><br>
2.<a href="show"> click here to see all the students in the databse and also edit and update them </a><br>
</body>
</html> 
