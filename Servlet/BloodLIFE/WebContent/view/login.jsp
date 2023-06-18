<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/owl.carousel.min.css">
    <link rel="stylesheet" href="../css/owl.theme.default.min.css">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="../css/style.css">

    <title>BloodLife-Login</title>
   
</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">
    
    <!-- navbar -->
	<jsp:include page="../include/header2.jsp"></jsp:include>
   

    <!-- login -->
    <div style="width: 70%; padding-right: var(--bs-gutter-x,5rem);
        padding-left: var(--bs-gutter-x,7rem); 
        padding-top: var(--bs-gutter-x,4rem);
        padding-bottom: var(--bs-gutter-x,4rem);" class="container-fluid">
        <div class="row gy-4">
            <div class="col-lg-4 col-sm-12 bg-cover" style="background-image: url(../img/c2.jpg); min-height:300px;">
                <div>

                </div>
            </div>
            <div class="col-lg-8">
                <form action="../controller/loginAction.jsp" class="p-lg-5 col-12 row g-3">
                    <div>
                        <h1>Log In</h1>
                        <p>Please Login to Continue</p>
                    </div>
                    
                    <div class="col-12">
                        <label for="userName" class="form-label">Email address</label>
                        <input type="email" name="email" class="form-control" placeholder="Johndoe@example.com" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                   
                    <div class="col-12">
                        <label for="userName" class="form-label">Password</label>
                        <input type="password" name="password" class="form-control" id="userName"
                            placeholder="Password" aria-describedby="emailHelp" required>
                    </div>

                    <div class="col-12">
                        <button type="submit" class="btn btn-brand">Log In</button>
                        <p>Create an account! <a href="signup.jsp">Sign Up</a></p>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
    <!-- footer -->
	<jsp:include page="../include/footer.jsp"></jsp:include>

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered modal-xl">
			<div class="modal-content">
				<div class="modal-body p-0">
					<div class="container-fluid">
						<div class="row gy-4">
							<div class="col-lg-4 col-sm-12 bg-cover"
								style="background-image: url(../img/c2.jpg); min-height: 300px;">
								<div></div>
							</div>
							<div class="col-lg-8">
								<form action="../controller/ContactUsAction.jsp" class="p-lg-5 col-12 row g-3">
									<div>
										<h1>Get in touch</h1>
										<p>Fell free to contact us and we will get back to you as
											soon as possible</p>
									</div>
									<div class="col-lg-6">
										<label for="firstName" class="form-label">First name</label>
										<input type="text" name="firstName" class="form-control" placeholder="Jon"
											id="firstName" aria-describedby="firstNameHelp" required>
									</div>
									<div class="col-lg-6">
										<label for="lastName" class="form-label">Last name</label>
										<input type="text" name="lastName" class="form-control" placeholder="Doe"
											id="lastName" aria-describedby="lastNameHelp" required>
									</div>
									<div class="col-12">
										<label for="email" class="form-label">Email address</label>
										<input type="email" name="email" class="form-control"
											placeholder="Johndoe@example.com" id="email"
											aria-describedby="emailHelp" required>
									</div>
									<div class="col-12">
										<label for="message" class="form-label">Enter Message</label>
										<textarea name="message"
											class="form-control" id="" rows="4" required></textarea>
									</div>

									<div class="col-12">
										<button type="submit" class="btn btn-brand">Send
											Message</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.bundle.min.js"></script>
    <script src="../js/owl.carousel.min.js"></script>
    <script src="../js/app.js"></script>
</html>