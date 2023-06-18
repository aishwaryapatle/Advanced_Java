<%@page import="model.McqTest"%>
<%@page import="model.McqTestDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create MCQ Test</title>
</head>
<body>

<%
int k = 0;
McqTest mt = null;
McqTestDao mtdb = new McqTestDao();
try {
	int qid = Integer.parseInt(request.getParameter("qid"));
	if(qid>=1)
		k=qid;
	
	mt = mtdb.getQueById(qid);
}
catch(Exception e)
{
	k = new McqTestDao().getQueCount();
	k=k+1;
}
%>

	<h3>Create MCQ Test</h3>
	<form action="addMcqServ">
	
		<label for="qid">Q<%=k%>:</label><br>
		
		<label for="qname">Question:</label>
		<input type="text" name="qname" id="qname" value="<%=mt==null?"":mt.getQname()%>"><br><br>
		
		<label for="opt1">Option 1:</label>
		<input type="text" name="opt1" id="opt1" value="<%=mt==null?"":mt.getOpt1()%>"> <br><br>
		
		<label for="opt2">Option 2:</label>
		<input type="text" name="opt2" id="opt2" value="<%=mt==null?"":mt.getOpt2()%>"> <br><br>
		
		<label for="opt3">Option 3:</label>
		<input type="text" name="opt3" id="opt3" value="<%=mt==null?"":mt.getOpt3()%>"> <br><br>
		
		<label for="opt4">Option 4:</label>
		<input type="text" name="opt4" id="opt4" value="<%=mt==null?"":mt.getOpt4()%>"> <br><br>
		
		<label for="ans">Answer:</label>
		<input type="text" name="ans" id="ans" value="<%=mt==null?"":mt.getAns()%>"> <br><br>
		<!-- <select name="ans" id="ans">
			<option selected="selected" disabled="disabled">Select Answer</option>
            <option value="opt1">Option 1</option>
            <option value="opt2">Option 2</option>
            <option value="opt3">Option 3</option>
            <option value="opt4">Option 4</option>
        </select> <br><br> -->
		
		<label for="marks">Marks:</label>
		<input type="text" name="marks" id="marks" value="<%=mt==null?"":mt.getMarks()%>"> <br><br>

		<%if(k!=1) { %>
		<a href="buildtest.jsp?qid=<%=k-1%>">Previous</a>	
		<%}%>	
		<input type="submit" value="Add New Question">
	</form>
	
</body>
</html>