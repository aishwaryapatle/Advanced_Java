<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
<%

int id = Integer.parseInt(request.getParameter("id"));

boolean i = UserDao.deleteUser(id);

if(!i)
{
	out.print("Bad Luck!");
	%>
	<a href="index.html">Home</a><br>
	<%
}
else
{
	response.sendRedirect("show.jsp");
}
%>
</body>
</html>