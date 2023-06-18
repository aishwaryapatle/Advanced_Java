package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Teacher;
import model.TeacherDao;

@WebServlet("/loginServ")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String loginErrorMsg = "Invalid Email or Passowd!";
		
		Teacher t = new Teacher(email, password);
		boolean status = new TeacherDao().loginAuthentication(t);
		if(status==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("createtest.html");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("loginErrorMsg", loginErrorMsg);
			out.print("Invalid Email or Password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
