<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<jsp:include page="link.html"></jsp:include>

	<h3>Teacher Registration Form</h3>
	<form action="teacherRegServ">
		<label for="name">Name:</label>
		<input type="text" name="name" id="name"> <br><br>
		
		<label for="email">Email:</label>
		<input type="text" name="email" id="email"> <br><br>
		
		<label for="phone">Phone:</label>
		<input type="text" name="phone" id="phone"> <br><br>
		
		<label for="password">Password:</label>
		<input type="text" name="password" id="password"><br><br>
		
		<input type="submit" name="Register">
	</form>
</body>
</html>