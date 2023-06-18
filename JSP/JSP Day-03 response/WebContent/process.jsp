<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Day-03 (response)</title>
</head>
<body>
	<%
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
	%>
	<%
		if(uname.equals("admin") && upass.equals("admin123"))
		{
			response.sendRedirect("http://www.google.com");
		}
		else
		{
			response.sendRedirect("index.html");
		}
	%>
</body>
</html>