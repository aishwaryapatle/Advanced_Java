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

@WebServlet("/servAddQue")
public class ServAddQue extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String btn = request.getParameter("btn");
		if (btn.equals("update")) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("servUpdateQue");
			dispatcher.forward(request, response);
		}
		else
		{

		String qid = request.getParameter("qid");
		String que = request.getParameter("que");
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String op3 = request.getParameter("op3");
		String op4 = request.getParameter("op4");
		String op5 = request.getParameter("op5");
		String ans = request.getParameter("ans");
		String mrk = request.getParameter("mark");

		McqTest mt = new McqTest(que, op1, op2, op3, op4, op5, ans, mrk);

		McqTestDao mtdb = new McqTestDao();

		mtdb.save(mt);
		System.out.println("save");

		RequestDispatcher rd = request.getRequestDispatcher("buildtest.jsp");
		rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
