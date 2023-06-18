<%@page import="java.util.List"%>
<%@page import="model.UserDao"%>
<%@page import="model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Show</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link
	href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="table_css/style.css">


<style type="text/css">
.btn-label {
	position: relative;
	left: -12px;
	display: inline-block;
	padding: 6px 12px;
	background: rgba(0, 0, 0, 0.15);
	border-radius: 3px 0 0 3px;
}

.btn-labeled {
	padding-top: 0;
	padding-bottom: 0;
}
</style>
</head>
<body style="background: white;">

	<%
		List<User> list = UserDao.getAllRecords();
		request.setAttribute("list", list);
	%>

	<jsp:include page="header.jsp"></jsp:include>

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
								<th>Address</th>
								<th>City</th>
								<th>Action</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="u">
								<tr class="alert" role="alert">
									<th scope="row">${u.getId()}</th>
									<td>${u.getFirstname()}</td>
									<td>${u.getLastname()}</td>
									<td>${u.getEmail()}</td>
									<td>${u.getAddress()}</td>
									<td>${u.getCity()}</td>
									<td><a href="editform.jsp?id=${u.getId()}"
										style="font-size: 14px; color: white;"
										class="btn btn-labeled btn-warning"> <span
											class="btn-label"><i class="fa fa-edit"></i></span>Edit
									</a> <a href="deleteuserAction.jsp?id=${u.getId()}"
										style="font-size: 14px; color: white;"
										class="btn btn-labeled btn-danger"> <span
											class="btn-label"><i class="fa fa-remove"></i></span>Delete
									</a></td>
							</c:forEach>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	</section>

</body>
</html>