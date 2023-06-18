<%@page import="model.EmployeeDao"%>
<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int id = Integer.parseInt(request.getParameter("id"));
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String gender = request.getParameter("gender");
String email = request.getParameter("email");
String dob = request.getParameter("dob");
String mobile = request.getParameter("mobile");
String city = request.getParameter("city");

String myskill="";
String check_skill[]=request.getParameterValues("skill");
for(int i=0; i<check_skill.length; i++) {
myskill+=check_skill[i]+",";
}


Employee e = new Employee(id, fname, lname, gender, email, mobile, dob, city, myskill);

int a = EmployeeDao.update(e);
if(a>0)
{
	//out.print("Deleted successfully!");
	request.setAttribute("successMessage", "Data Updated successfully!");
	//response.sendRedirect("show.jsp");
	request.getRequestDispatcher("show.jsp").include(request, response);
}

else{
	out.print("Not Updated!");
	request.getRequestDispatcher("show.jsp").include(request, response);
}
%>

</body>
</html>