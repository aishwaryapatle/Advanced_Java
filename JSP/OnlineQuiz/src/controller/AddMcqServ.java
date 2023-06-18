package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.McqTest;
import model.McqTestDao;

@WebServlet("/addMcqServ")
public class AddMcqServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String qname = request.getParameter("qname");
		String opt1 = request.getParameter("opt1");
		String opt2 = request.getParameter("opt2");
		String opt3 = request.getParameter("opt3");
		String opt4 = request.getParameter("opt4");
		String ans = request.getParameter("ans");
		String marks = request.getParameter("marks");
		
		McqTest mt = new McqTest(qname, opt1, opt2, opt3, opt4, ans, marks);
		McqTestDao mtdao = new McqTestDao();
		mtdao.save(mt);
		
//		RequestDispatcher rd = request.getRequestDispatcher("buildtest.jsp");
//		rd.include(request, response);
		
		response.sendRedirect("buildtest.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
