

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/modalWindowServlet")
public class ModalWindowServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='ISO-8859-1'>");
		out.print("<title>Add Staff</title>");
		out.print("<link rel='stylesheet' href='css/serviceServlet.css'>");
		out.print("</head>");
		out.print("<body>");
		
		out.print("    <!--------- <title>Responsive Navigation Menu</title>------>");
        out.print("    <link rel='stylesheet' href='css/adminDashboard.css'>");
        out.print("	   <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
        out.print("    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");
        out.print("    <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js'></script>");
        out.print("    <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
        
		out.print("</head>");
        out.print("<body>");
		
		
		out.print("<button type='button' class='btn btn-info btn-lg' data-toggle='modal' data-target='#myModal'>Open Modal</button>");

		out.print("<!-- Modal -->");
		out.print("<div class='modal fade' id='myModal' role='dialog'>");
		out.print("<div class='modal-dialog'>");
		
		
		out.print("<!-- Modal content-->");
		out.print("<div class='modal-content'>");
		out.print("<div class='modal-header'>");
		out.print("<button type='button' class='close' data-dismiss='modal'>&times;</button>");
		out.print("<h4 class='modal-title'>Modal Header</h4>");
		out.print("</div>");
		out.print("<div class='modal-body'>");
		out.print("<p>Some text in the modal.</p>");
		out.print("<div class='grp2'>");
		out.print("	<h3 style='font-family:Serif;'><b>Add New Staff</b></h3>");
		out.print("	<form action='discountActionServlet' method='post'>");
		out.print("		<table class='css-styled-table'>");
		out.print("			<tr>");
		out.print("				<td>Discount Day:</td>");
		out.print("				<td>");
		out.print("					<select id='day' name='day'>");
		out.print("						<option>Day</option>");
		out.print("						<option value='Sunday'>Sunday</option>");
		out.print("						<option value='Monday'>Monday</option>");
		out.print("						<option value='Tuesday'>Tuesday</option>");
		out.print("						<option value='Wednesday'>Wednesday</option>");
		out.print("						<option value='Thursday'>Thursday</option>");
		out.print("						<option value='Friday'>Friday</option>");
		out.print("						<option value='Saturday'>Saturday</option>");
		out.print("					</select>");
		out.print("				</td>");
		out.print("			</tr>");
		out.print("				<td>Discount:</td>");
		out.print("				<td><input type='number' name='discount' ></td>");
		out.print("			</tr>");
		out.print("			</tr>");
		out.print("				<td>Description:</td>");
		out.print("				<td><textarea name='description' rows='3' cols='22'></textarea></td>");
		out.print("			</tr>");
		out.print("			<tr>");
		out.print("				<td colspan='2' style='text-align: center;''><input style='width: 80px' type='submit' value='Save' /></td>");
		out.print("			</tr>");
		out.print("		</table>");
		out.print("	</form>");
		out.print("</div>");
		out.print("</div>");
		out.print("<div class='modal-footer'>");
		out.print("<button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>");
		out.print("</div>");
		out.print("</div>");
		
		out.print("</div>");
		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
