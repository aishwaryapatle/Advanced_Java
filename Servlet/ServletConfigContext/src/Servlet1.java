

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		Servlet Config
//		For config there will be only one object per servlet
//		There can be multiple init param
//		It act as a local variable in web.xml
		
		
		ServletConfig config = getServletConfig();
		String HR_name = config.getInitParameter("HR_name");
		String bonus = config.getInitParameter("Bonus");
		out.print("The HR name is" + HR_name);
		out.print("<br>The bonus in this month is "+bonus);
		
		
//		Servlet Context
//		For context there will be only one object for the whole web app by the web container
//		There can be only one init param
//		It act as a global variable in web.xml
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		
		out.print("<br><br>Driver : "+ driver);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
