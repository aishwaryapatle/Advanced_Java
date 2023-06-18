<%@page import="model.ContactUsDao"%>
<%@page import="model.ContactUs"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ContactUs Action</title>
</head>
<body>

<%
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String email = request.getParameter("email");
	String message = request.getParameter("message");

	ContactUs c = new ContactUs(firstName, lastName, email, message);
	int status = ContactUsDao.save(c);
	if(status > 0)
	{
		out.print("Message sent");
	}
	else
	{
		out.print("Bad Luck");
	}
%>

</body>
</html>