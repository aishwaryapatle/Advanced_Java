<%@page import="model.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Action</title>
</head>
<body>

	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User u = new User(email, password);
		
		String userValidate = UserDao.authenticateUser(u);
		if(userValidate.equals("User_Role"))
		{
			System.out.println("User's Home");
			session.setAttribute("User", email);
			response.sendRedirect("../index.jsp");
		}
		
		else if(userValidate.equals("Admin_Role"))
        {
            System.out.println("Admin's Home");
 
            session.setAttribute("Admin", email); //setting session attribute
            response.sendRedirect("../index.jsp");
        }
		
		else if(userValidate.equals("Not_Valid"))
		{
			out.print("Sorry UserName or Password Error!");  

		}
	%>
</body>
</html>