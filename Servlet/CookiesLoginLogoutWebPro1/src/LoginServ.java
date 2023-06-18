

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		if(uname.equals("admin") && upass.equals("abc"))
		{
			Cookie c1 = new Cookie("uname", uname);
			Cookie c2 = new Cookie("upass", upass);
			
			response.addCookie(c1);
			response.addCookie(c2);
			
			out.print("WELCOME "+uname.toUpperCase());
			out.print("<br/><a href='profile'>Profile</a><br/>");
			out.print("<a href='logout'>Logout</a>");
		}
		else
		{
			request.getRequestDispatcher("index.html").include(request, response);
			out.print("Please enter valid username or password");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
