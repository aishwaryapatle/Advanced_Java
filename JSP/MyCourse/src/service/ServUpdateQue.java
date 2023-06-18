package service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.McqTest;
import model.McqTestDao;


@WebServlet("/servUpdateQue")
public class ServUpdateQue extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int qid = Integer.parseInt(request.getParameter("qid"));
		String que = request.getParameter("que");
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String op3 = request.getParameter("op3");
		String op4 = request.getParameter("op4");
		String op5 = request.getParameter("op5");
		String ans = request.getParameter("ans");
		String mrk = request.getParameter("mark");
        
		McqTest mt = new McqTest(qid,que, op1, op2, op3, op4, op5, ans, mrk);

		McqTestDao mtdb = new McqTestDao();
		
		mtdb.updateMcq(mt);
	
		System.out.println("Update");
        // qid+=1;
         System.out.println("next Qid "+qid);
	    response.sendRedirect("buildtest.jsp?qid="+qid);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
