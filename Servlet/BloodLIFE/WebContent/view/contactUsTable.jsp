<%@page import="model.ContactUs"%>
<%@page import="java.util.List"%>
<%@page import="model.ContactUsDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- <link rel="icon" type="image/x-icon" href="favicon.ico"> -->
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/owl.carousel.min.css">
	<link rel="stylesheet" href="../css/owl.theme.default.min.css">
	<link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
		rel="stylesheet">
	<link rel="stylesheet" href="../css/style.css">
	<link rel="stylesheet" href="../css/table_css/style.css">
	
    <title>Contact Us</title>

</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">

	<jsp:include page="../include/header2.jsp"></jsp:include>

	<%
		List<ContactUs> list = ContactUsDao.getAllRecords();
		request.setAttribute("list", list);
	%>
	
	
	<section class="ftco-section">
	<div class="container">
		<div class="row justify-content-center">
			<!--  <div class="col-md-6 text-center mb-5">
				<h2 class="heading-section">Table #02</h2>
			</div>-->
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="table-wrap">
					<table class="table">
						<thead class="thead-dark">
							<tr>

								<th>ID</th>
								<th>Firstname</th>
								<th>Lastname</th>
								<th>Email</th>
								<th>Message</th>
								<!--  <th>Action</th> -->

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="u">
								<tr class="alert" role="alert">
									<th scope="row">${u.getId()}</th>
									<td>${u.getFirstName()}</td>
									<td>${u.getLastName()}</td>
									<td>${u.getEmail()}</td>
									<td>${u.getMessage()}</td>
									<!-- <td><a href="editform.jsp?id=${u.getId()}"
										style="font-size: 14px; color: white;"
										class="btn btn-labeled btn-warning"> <span
											class="btn-label"><i class="fa fa-edit"></i></span>Edit
									</a> <a href="deleteuserAction.jsp?id=${u.getId()}"
										style="font-size: 14px; color: white;"
										class="btn btn-labeled btn-danger"> <span
											class="btn-label"><i class="fa fa-remove"></i></span>Delete
									</a></td>
									-->
							</c:forEach>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	</section>

	<jsp:include page="../include/footer.jsp"></jsp:include>

</body>
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.bundle.min.js"></script>
	<script src="../js/owl.carousel.min.js"></script>
	<script src="../js/app.js"></script>
</html>