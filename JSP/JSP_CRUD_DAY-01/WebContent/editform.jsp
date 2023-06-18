<%@page import="model.User"%>
<%@page import="model.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
<head>
	<title>Login V15</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->

<link rel="stylesheet" href="assets/base.css">
<link rel="stylesheet" href="fixed-navigation-bar.css">
<link rel="shortcut icon" href="http://sixrevisions.com/favicon.ico">

</head>
<body>

<%
int id = Integer.parseInt(request.getParameter("id"));
User u = UserDao.getRecordById(id);
%>
	
	<nav class="fixed-nav-bar">
  <div id="menu" class="menu">
    <a class="sitename" href="fixed-navigation-bar.html">Fixed Nav Bar</a>
    <!-- Example responsive navigation menu  -->
    <a class="show" href="#menu">Menu</a><a class="hide" href="#hidemenu">Menu</a>
    <ul class="menu-items">
      <li><a href="//sixrevisions.com">Home</a></li>
      <li><a href="show.jsp">Show</a></li>
      <li><a href="//sixrevisions.com/contact/">Delete</a></li>
      <li><a href="//twitter.com/sixrevisions">Update</a></li>
  </ul>
  </div>
</nav>
	
	<div class="limiter">
		<div style="margin-top:45px" class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
					<span class="login100-form-title-1">
						Update
					</span>
				</div>

				<form class="login100-form validate-form" action="edituserAction.jsp" method="get">
					
					<div class="wrap-input100 validate-input m-b-26" >
						<span class="label-input100">ID</span>
						<input class="input100" type="text" name="id" value="<%=u.getId()%>" readonly="readonly">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-26" >
						<span class="label-input100">Firstname</span>
						<input class="input100" type="text" name="firstname" value="<%=u.getFirstname()%>">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-26" >
						<span class="label-input100">Lastname</span>
						<input class="input100" type="text" name="lastname" value="<%=u.getLastname()%>">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-26" >
						<span class="label-input100">Email</span>
						<input class="input100" type="email" name="email" value="<%=u.getEmail()%>">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-26" >
						<span class="label-input100">Address</span>
						<input class="input100" type="text" name="address" value="<%=u.getAddress()%>">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" >
						<span class="label-input100">City</span>
						<input class="input100" type="text" name="city" value="<%=u.getCity()%>">
						<span class="focus-input100"></span>
					</div>

					

					<div style="padding-top: 10px;" class="container-login100-form-btn">
						<button class="login100-form-btn">
							Update
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>