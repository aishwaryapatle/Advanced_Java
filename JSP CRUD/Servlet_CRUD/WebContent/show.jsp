<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="model.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Employees</title>
</head>
<body>

<script>
        <% if (request.getAttribute("successMessage") != null) { %>
            window.onload = function() {
                alert("<%= request.getAttribute("successMessage") %>");
            };
        <% } %>
    </script>

	<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>FULL NAME</th>
			<th>LAST NAME</th>
			<th>GENDER</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>DOB</th>
			<th>CITY</th>
			<th>SKILL</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
	</thead>

	<%
		EmployeeDao dao = new EmployeeDao();
		List<Employee> el = dao.getAllEmployee();

		for (Employee e : el) {
	%>
	<tbody>
	<tr>
		<td><%=e.getId()%></td>
		<td><%=e.getFname()%></td>
		<td><%=e.getLname()%></td>
		<td><%=e.getGender()%></td>
		<td><%=e.getEmail()%></td>
		<td><%=e.getMobile()%></td>
		<td><%=e.getDob()%></td>
		<td><%=e.getCity()%></td>
		<td><%=e.getSkill()%></td>
	
		<td><a href="edit.jsp?id=<%= e.getId() %>">Edit</a></td>		
		<td><a href="delete.jsp?id=<%=e.getId() %>">Delete</a></td>
	</tr>

	<%
		}
		
	%>
	
	</tbody>
</table>


</body>
</html>