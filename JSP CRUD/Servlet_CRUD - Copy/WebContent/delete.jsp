<%@page import="model.EmployeeDao"%>
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
int a = EmployeeDao.delete(id);

if(a>0)
{
	//out.print("Deleted successfully!");
	request.setAttribute("successMessage", "Data Deleted successfully!");

	request.getRequestDispatcher("show.jsp").include(request, response);
}

else{
	out.print("Not Deleted!");
	request.getRequestDispatcher("show.jsp").include(request, response);
}

%>
</body>
</html>