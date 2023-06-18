<%@page import="model.User"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save</title>
</head>
<body>

<%

String firstname = request.getParameter("firstname");
String lastname = request.getParameter("lastname");
String email = request.getParameter("email");
String address = request.getParameter("address");
String city = request.getParameter("city");

User u = new User(firstname, lastname, email, address, city);

int i = UserDao.saveUser(u);
if (i>0) {
	out.print("Successfully registered!<br>");
%>
	<a href="index.html">Home</a><br>
	<a href="show.jsp">Show</a>
<%
}
else {
	out.print("Bad Luck!");
}

%>
</body>
</html>