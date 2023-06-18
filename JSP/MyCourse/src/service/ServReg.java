package service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Teacher;
import model.TeacherDao;


@WebServlet("/servReg")
public class ServReg extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tname=request.getParameter("tname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String mob=request.getParameter("mob");
		
		
		Teacher t=new Teacher(tname, email, pass, mob);
		
		try
		{
		TeacherDao tdb=new TeacherDao();
		
		if(tdb.checkUser(t)){
			System.out.println("User already in database");
			
		}
		else
		{
		tdb.save(t);
		System.out.println("Data Inserted!");
		RequestDispatcher rd=request.getRequestDispatcher("createtest.html");
		rd.forward(request, response);
		}
		}
		catch (Exception e) {
			System.out.println("Error "+e);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
