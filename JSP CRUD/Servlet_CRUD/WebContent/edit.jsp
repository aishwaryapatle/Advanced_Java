<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="model.Employee"%>
<%@page import="model.EmployeeDao"%>
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

<%

int id = Integer.parseInt(request.getParameter("id"));
Employee e = EmployeeDao.getEmployeeById(id);
%>


<form action="update.jsp" method="get">

<input type="hidden" id="id" name="id" value="<%=e.getId() %>"> 

<label for="fname">First Name:</label>
<input type="text" id="fname" name="fname" value="<%=e.getFname() %>"> 
<br><br>

<label for="lname">Last Name:</label>
<input type="text" id="lname" name="lname" value="<%=e.getFname() %>"> 
<br><br>

<label for="gender">Gender:</label>
Male:<input type="radio" id="gender" name="gender" value="male" <%if (e.getGender().equals("male")) out.print("checked"); %>>
Female:<input type="radio" id="gender" name="gender" value="female" <%if (e.getGender().equals("female")) out.print("checked"); %>>
<br><br>

<label for="mobile">Mobile No:</label>
<input type="text" id="mobile" name="mobile" value="<%=e.getMobile() %>"> 
<br><br>

<label for="email">Email:</label>
<input type="email" id="email" name="email" value="<%=e.getEmail() %>"> 
<br><br>

<label for="dob">DOB:</label>
<input type="date" id="dob" name="dob" value="<%=e.getDob()%>"> 
<br><br>

<label for="city">City</label>
<select name="city" id="city">
  <option value="Nagpur" <% if (e.getCity().equals("Nagpur")) out.print("selected"); %>>Nagpur</option>
  <option value="Pune" <% if (e.getCity().equals("Pune")) out.print("selected"); %>>Pune</option>
  <option value="Banglore" <% if (e.getCity().equals("Banglore")) out.print("selected"); %>>Banglore</option>
  <option value="Bhandara" <% if (e.getCity().equals("Bhandara")) out.print("selected"); %>>Bhandara</option>
  
</select>
<br><br>

<label for="skill">Skills</label>
<%
String[] strArray = null;  
strArray = e.getSkill().split(",");  
		
%>
<input type="checkbox" name="skill" value="Cricket" <% if (Arrays.asList(strArray).contains("Cricket")) out.print("checked"); %>> Cricket<br>
<input type="checkbox" name="skill" value="Football" <% if (Arrays.asList(strArray).contains("Football")) out.print("checked"); %>>Football<br>
<input type="checkbox" name="skill" value="Hockey" <% if (Arrays.asList(strArray).contains("Hockey")) out.print("checked"); %>>Hockey<br>
<input type="checkbox" name="skill" value="Tennis" <% if (Arrays.asList(strArray).contains("Tennis")) out.print("checked"); %>>Tennis<br>

<input type=button onClick="parent.location='index.jsp'"
value='click here'>
<input type="submit" name="btn" value="SAVE">
<input type="submit" name="btn" value="UPDATE">
<input type="submit" name="btn" value="DELETE">
<input type="reset" name="btn" value="RESET">

</form>

</body>
</html>