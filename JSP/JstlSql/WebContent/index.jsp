<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- 1. SetDataSource -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/jstlsql"  
     user="root"  password="abc123"/>  
 
     <h1>This is JSTL page</h1>


<!-- 2. SetQuery -->
<sql:query dataSource="${db}" var="rs">  

SELECT * from jstlsql.test;  
</sql:query>  
   
<table border="2" width="20%">  
	<tr>  
		<th>Student ID</th>  
		<th>First Name</th>  
		<th>Address</th>  
	</tr>  
	
	<c:forEach var="table" items="${rs.rows}">  
	
	<tr>  
		<td><c:out value="${table.id}"/></td>  
		<td><c:out value="${table.name}"/></td>  
		<td><c:out value="${table.address}"/></td>  
	</tr>  
	</c:forEach>  
</table>  
  

</body>
</html>