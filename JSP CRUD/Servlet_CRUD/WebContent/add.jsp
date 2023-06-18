<%@page import="org.apache.commons.fileupload.servlet.ServletRequestContext"%>
<%@page import="org.apache.commons.fileupload.FileUpload"%>
<%@page import="model.EmployeeDao"%>
<%@page import="model.Employee"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
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
   File file ;
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
   String filePath = context.getInitParameter("file-upload");

   String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	String dob = request.getParameter("dob");
	String mobile = request.getParameter("mobile");
	String city = request.getParameter("city");

	
	//String myskill="";
	//String check_skill[]=request.getParameterValues("skill");
	//for(int i=0; i<check_skill.length; i++) {
	//myskill+=check_skill[i]+",";
	//}
	
	String myskill = "";
	String[] check_skill = request.getParameterValues("skill");

	if (check_skill != null) {
	    for (int i = 0; i < check_skill.length; i++) {
	        myskill += check_skill[i] + ",";
	    }
	}
	

	String imageFileName = "";

	try {
	    // Parse the multipart request and get a list of FileItems
		List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(new ServletRequestContext(request));

	    // Process each file item in the list
	    for (FileItem item : items) {
	        if (!item.isFormField()) {
	            // Get the file name and extension
	            String fileName = item.getName();
	            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

	            // Generate a unique file name
	            imageFileName = System.currentTimeMillis() + "." + extension;

	            // Save the file to the upload folder
	            File uploadedFile = new File(filePath, imageFileName);
	            item.write(uploadedFile);
	        }
	    }
	} catch (Exception e1) {
	    e1.printStackTrace();
	    response.getWriter().println("File upload failed!");
	}

	// Save the file details in the database
	Employee e = new Employee(fname, lname, gender, email, mobile, dob, city, myskill, imageFileName);
	int a = EmployeeDao.insert(e);

	if(a>0)
	{
		out.print("Inserted successfully!");
		request.getRequestDispatcher("index.jsp").include(request, response);
	}
	
	else{
		out.print("Not Inserted!");
		request.getRequestDispatcher("index.jsp").include(request, response);
	}

%>

</body>
</html>


