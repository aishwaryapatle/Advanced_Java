<%@page import="model.McqTest"%>
<%@page import="model.McqTestDao"%>
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
int k=0;
McqTestDao mdb=new McqTestDao();
McqTest mt=null;
try
{
int qid=Integer.parseInt(request.getParameter("qid"));

if(qid>=1)
k=qid;

//data nikalo

mt=mdb.allQues(qid);

System.out.print("Object = "+mt);
}
catch(Exception e)
{	
k=mdb.qcount();//6
k+=1;
}
%>
<form action="servAddQue">

Q:   <%=k %><br>
<input type="text" name="qid" value="<%=mt==null?" ":mt.getqId()%>"><br/>
Q : <input type="text" name="que" value="<%=mt==null?"":mt.getQue()%>"><br/>  <!-- Ternary  operator -->
a : <input type="text" name="op1"  value="<%=mt==null?"":mt.getOp1()%>"><br/>
b : <input type="text" name="op2"  value="<%=mt==null?"":mt.getOp2()%>"><br/>
c : <input type="text" name="op3"  value="<%=mt==null?"":mt.getOp3()%>"><br/>
d : <input type="text" name="op4"  value="<%=mt==null?"":mt.getOp4()%>"><br/>
e : <input type="text" name="op5"  value="<%=mt==null?"":mt.getOp5()%>"><br/>
Ans : <input type="text" name="ans"  value="<%=mt==null?"":mt.getAns()%>"><br/>
Mark : <input type="text" name="mark"  value="<%=mt==null?"":mt.getMrk()%>"><br/>

<%if(k!=1) {%>
<a href="buildtest.jsp?qid=<%=k-1%>&btn=pre">pre</a>
<%} %>

<%if(!(k-1==mdb.qcount())) {%>
<a href="buildtest.jsp?qid=<%=k+1%>">next</a>
<input type="submit" value="update" name="btn">
<a href="buildtest.jsp">Last Que</a>
<%}else{ %>
<input type="submit" value="Add Que" name="btn">
<%} %>
</form> 
</body>
</html>