<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<%
if(session!=null) //If session is not null
{
    session.invalidate(); //removes all session attributes bound to the session
    System.out.println("You have logged out successfully");
	response.sendRedirect("../index.jsp");
    System.out.println("Logged out");
}
else
{
	response.sendRedirect("../index.jsp");
}
%>
</body>
</html>