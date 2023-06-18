<%@page import="model.User"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save the details</title>
</head>
<body>

	<%
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("upass");

		User u = new User(name, email, pass);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();
		s.save(u);

		System.out.println("Object saved successfully.....!!");

		tx.commit();

		s.close();
		factory.close();
		
		out.print("Hey "+ name+" your details are saved successfully!");
	%>

</body>
</html>