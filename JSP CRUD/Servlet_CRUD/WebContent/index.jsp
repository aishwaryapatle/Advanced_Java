<%@page import="model.EmployeeDao"%>
<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Employee Form</h1>


<form action="edit.jsp" method="get">
	
	<select name="fname_lname" id="fname_lname" onchange='ddlselect()'>
		<option>-- Select Services --</option>  
		
	<%
		//Storing the services from database into list
		List<Employee> list = null;
		list = EmployeeDao.getAllEmployeesNames();
		
		//retrieving service name and price from list
		for(Employee s : list) {
			out.print("<option value='"+s.getId()+"'>"+(s.getFname()+s.getLname())+"</option>");
		}
	%>
	</select>		


<%
	out.print("<script>");
	out.print("function ddlselect() {var d = document.getElementById('fname_lname'); "
			+ "var displayValue = d.options[d.selectedIndex].value;"
			+ "document.getElementById('id').value=displayValue;}");
	
	out.print("</script>");

%>

<input type="hidden" id=id name="id" readonly="readonly">
<input type="submit" value="Fetch Details">
</form>

<br><br>

<form action="addEmployee.jsp" method="get">

<label for="fname">First Name:</label>
<input type="text" id="fname" name="fname"> 
<br><br>

<label for="lname">Last Name:</label>
<input type="text" id="lname" name="lname"> 
<br><br>

<label for="gender">Gender:</label>
Male:<input type="radio" id="gender" name="gender" value="male">
Female:<input type="radio" id="gender" name="gender" value="female">
<br><br>

<label for="mobile">Mobile No:</label>
<input type="text" id="mobile" name="mobile"> 
<br><br>

<label for="email">Email:</label>
<input type="email" id="email" name="email"> 
<br><br>

<label for="dob">DOB:</label>
<input type="date" id="dob" name="dob"> 
<br><br>

<label for="city">City:</label>
<select name="city" id="city">
  <option value="Nagpur">Nagpur</option>
  <option value="Pune">Pune</option>
  <option value="Banglore">Banglore</option>
  <option value="Bhandara">Bhandara</option>
</select>
<br><br>

<label for="skill">Skills:</label><br>
<input type="checkbox" name="skill" value="Cricket">Cricket<br>
<input type="checkbox" name="skill" value="Football">Football<br>
<input type="checkbox" name="skill" value="Hockey">Hockey<br>
<input type="checkbox" name="skill" value="Tennis">Tennis<br>
<br><br>

<input type=button onClick="parent.location='index.jsp'"
value='click here'><input type="submit" name="btn" value="SAVE">
<input type="submit" name="btn" value="UPDATE">
<input type="submit" name="btn" value="DELETE">
<input type="reset" name="btn" value="RESET">

</form>

<a href="show.jsp">Show all employees</a>

<script>

</script>
</body>
</html>