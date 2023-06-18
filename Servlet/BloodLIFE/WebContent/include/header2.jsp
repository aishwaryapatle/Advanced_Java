<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/style.css">

<title>BloodLife - Home</title>

<style>
.navbar-nav li:hover>ul.dropdown-menu {
	display: block;
}

.dropdown-submenu {
	position: relative;
}

.dropdown-submenu>.dropdown-menu {
	top: 0;
	/*left:-100%;*/
	left: -10rem;
	/* 10rem is the min-width of dropdown-menu */
	margin-top: -6px;
}

/* rotate caret on hover */
.dropdown-menu>li>a:hover:after {
	text-decoration: underline;
	transform: rotate(-90deg);
}
</style>
</head>
<body>
<!-- TOP NAV -->
	<div class="top-nav" id="home">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-auto">
					<p>
						<i class='bx bxs-envelope'></i> info@example.com
					</p>
					<p>
						<i class='bx bxs-phone-call'></i> 123 456-7890
					</p>
				</div>
				<div class="col-auto social-icons">
					<a href="#"><i class='bx bxl-facebook'></i></a> <a href="#"><i
						class='bx bxl-twitter'></i></a> <a href="#"><i
						class='bx bxl-instagram'></i></a> <a href="#"><i
						class='bx bxl-pinterest'></i></a>
				</div>
			</div>
		</div>
	</div>

	<!-- BOTTOM NAV -->
	<nav class="navbar navbar-expand-lg navbar-light bg-white sticky-top">
	<div class="container">
		<a class="navbar-brand" href="#"><span class="dot">Blood</span>LIFE</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ms-auto">
				<li class="nav-item"><a class="nav-link" href="../index.jsp#home">Home</a>
				</li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="../index.jsp#about"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> About </a>
					<ul class="dropdown-menu dropdown-menu-right"
						aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="../index.jsp#team">Team</a></li>
						<li><a class="dropdown-item" href="../index.jsp#campaigns">Campaigns</a></li>
						<li><a class="dropdown-item" href="../index.jsp#reviews">Reviews</a></li>
					</ul></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Looking for Blood </a>
					<ul class="dropdown-menu dropdown-menu-right"
						aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="#">Search Donor</a></li>
						<li><a class="dropdown-item" href="#">Search Blood Bank</a></li>
					</ul>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="../index.jsp#event">Events</a>
				</li>
				<li class="nav-item">
					<a href="#" data-bs-toggle="modal"
					data-bs-target="#exampleModal" class="nav-link">Contact
					</a>
				</li>
			</ul>

			<a href="login.jsp" class="btn btn-brand ms-lg-3">Login</a>
		</div>
	</div>
	</nav>

</body>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/app.js"></script>
</html>