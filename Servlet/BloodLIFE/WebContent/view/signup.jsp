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
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="../css/style.css">

    <title>BloodLife-SignUp</title>
   	<style>
   		@media screen and (min-width:1024px) {
            .container-fluid {
                width: 89%; 
                padding-right: var(--bs-gutter-x,5rem);
                padding-left: var(--bs-gutter-x,7rem); 
                padding-top: var(--bs-gutter-x,4rem);
            }
        }
        @media screen and (min-width:768px) and (max-width: 1023px) {
            .container-fluid {
                width: 82%; 
                /* padding-right: var(--bs-gutter-x,3rem); */
                /* padding-left: var(--bs-gutter-x,3rem);  */
                padding-top: var(--bs-gutter-x,4rem);
            }
        }
        @media screen and (max-width: 767px) {
            .container-fluid {
                width: 82%; 
                /* padding-right: var(--bs-gutter-x,3rem); */
                /* padding-left: var(--bs-gutter-x,3rem);  */
                padding-top: var(--bs-gutter-x,4rem);
            }
        }
   	</style>
</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">
    
    <!-- navbar -->
	<jsp:include page="../include/header2.jsp"></jsp:include>
   

    <!-- signup -->
    <div class="container-fluid">
        <div class="row gy-4">
            <div class="col-lg-4 col-sm-12 bg-cover" style="background-image: url(../img/c2.jpg); min-height:300px;">
                <div>

                </div>
            </div>
            <div class="col-lg-8">
                <form action="../controller/signupAction.jsp" class="p-lg-5 col-12 row g-3">
                    <div>
                        <h1>Sign Up</h1>
                        <p>Start your Journey Today</p>
                    </div>
                    <div class="col-lg-6">
                        <label for="userName" class="form-label">First name</label>
                        <input type="text" name="fname" class="form-control" placeholder="Jon" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                    <div class="col-lg-6">
                        <label for="userName" class="form-label">Last name</label>
                        <input type="text" name="lname" class="form-control" placeholder="Doe" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                    <div class="col-6">
                        <label for="userName" class="form-label">Email address</label>
                        <input type="email" name="email" class="form-control" placeholder="Johndoe@example.com" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                    <div class="col-6">
                        <label for="userName" class="form-label">Phone Number</label>
                        <input type="number" name="phonenumber" class="form-control" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                    <div class="col-6">
                        <label for="userName" class="form-label">Password</label>
                        <input type="password" name="password" class="form-control" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>

                    <div class="col-6">
                        <label for="userName" class="form-label">Confirm Password</label>
                        <input type="password" name="cpassword" class="form-control" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>

                    <div class="col-6">
                        <label for="userName" class="form-label">Blood Group</label>
                            <select name="bloodgroup" id="bloodgroup" class="form-control"
                            aria-describedby="emailHelp" required>
                                <option value="A+">A+</option>
                                <option value="A-">A-</option>
                                <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                <option value="O+">O+</option>
                                <option value="O-">O-</option>
                                <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                            </select>
                    </div>

                    <div class="col-6">
                        <label for="userName" class="form-label">Pincode</label>
                        <input type="number" name="pincode" class="form-control" id="userName"
                            aria-describedby="emailHelp" required>
                    </div>
                    <div class="col-12">
                        <button type="submit" class="btn btn-brand">Sign Up</button>
                        <p>Already have an account! <a href="login.jsp">Log In</a></p>
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