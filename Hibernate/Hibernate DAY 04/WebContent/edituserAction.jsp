<%@page import="model.User"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
	
	<!-- <jsp:useBean id="u" class="model.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/>
	-->
	
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	String city = request.getParameter("city");
	
	User user = new User(id, firstname, lastname, email, address, city);
	
	boolean status = UserDao.update(user);
	if(status == true) {
		response.sendRedirect("show.jsp");
	}
	else
	{
			out.print("back luck");
			%>
				<a href="index.jsp">Home</a>
			<% 
		}
	%>
	
</body>
</html>