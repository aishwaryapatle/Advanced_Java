<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save</title>
</head>
<body>

<jsp:useBean id="u" class="model.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i = UserDao.save(u);
if (i>0) {
	out.print("Successfully registered!<br>");
%>
	<a href="index.html">Home</a><br>
	<a href="show.jsp">Show</a>
<%
}
else {
	out.print("Bad Luck!");
}

%>
</body>
</html>