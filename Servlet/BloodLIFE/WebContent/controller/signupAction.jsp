<%@page import="model.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Action</title>
</head>
<body>

	<%
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		String bloodgroup = request.getParameter("bloodgroup");
		String pincode = request.getParameter("pincode");
		int roleid = 2;

		User u = new User(fname, lname, email, phonenumber, password, cpassword, bloodgroup, pincode, roleid);
		int status = UserDao.save(u);
		if (status > 0) {
			out.print("User Registered!");
		} else {
			out.print("Bad Luck");
		}
	%>
</body>
</html>