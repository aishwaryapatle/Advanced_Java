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

	<title>Add Blood Bank</title>
	<style>
		@media screen and (min-width:1024px) {
	        .container-fluid {
	            width: 60%; 
	            /* padding-right: var(--bs-gutter-x,5rem);
	            padding-left: var(--bs-gutter-x,7rem);  */
	            padding-top: var(--bs-gutter-x,4rem);
	            padding-bottom: var(--bs-gutter-x,4rem);
	            }
	        }
        @media screen and (min-width:768px) and (max-width: 1023px) {
            .container-fluid {
                width: 60%; 
                padding-top: var(--bs-gutter-x,4rem);
                padding-bottom: var(--bs-gutter-x,4rem);
            }
        }
        @media screen and (max-width: 767px) {
            .container-fluid {
                width: 82%; 
                padding-top: var(--bs-gutter-x,4rem);
                padding-bottom: var(--bs-gutter-x,4rem);
            }
        }
    </style>
    
</head>

<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">
	    
    <jsp:include page="../include/header2.jsp"></jsp:include>

	<!-- Add Blood Bank -->
    <div class="container-fluid">
        <div class="row gy-4">
            <div class="col-lg-4 col-sm-12 bg-cover" style="background-image: url(../img/c2.jpg); min-height:300px;">
                <div>

                </div>
            </div>
            <div class="col-lg-8">
                <form class="p-lg-5 col-12 row g-3">
                    <div>
                        <h1>Add Blood Bank</h1>
                    </div>
                    
                    <div class="col-12">
                        <label for="bname" class="form-label">Blood Bank / Hospital Name</label>
                        <input type="text" name="bname" class="form-control" placeholder="Blood Bank Name" id="bname"
                            aria-describedby="bnameHelp">
                    </div>

                    <div class="col-12">
                        <label for="bemail" class="form-label">Email address</label>
                        <input type="bemail" name="bemail" class="form-control" placeholder="bloodbank@example.com" id="bemail"
                            aria-describedby="bemailHelp">
                    </div>
                   
                    <div class="col-6">
                        <label for="country" class="form-label">Country</label>
                            <select name="country" id="country" class="form-control"
                            aria-describedby="countryHelp">
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
                        <label for="state" class="form-label">State</label>
                            <select name="state" id="state" class="form-control"
                            aria-describedby="stateHelp">
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
                        <label for="district" class="form-label">District</label>
                            <select name="district" id="district" class="form-control"
                            aria-describedby="districtHelp">
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
                        <label for="city" class="form-label">City</label>
                            <select name="city" id="city" class="form-control"
                            aria-describedby="cityHelp">
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

                    <div class="col-12">
                        <label for="baddress" class="form-label">Address / Location</label>
                        <input type="text" name="baddress" class="form-control" id="baddress"
                            aria-describedby="baddressHelp">
                    </div>

                    <div class="col-6">
                        <label for="bphone" class="form-label">Mobile Number</label>
                        <input type="number" name="bphone" class="form-control" id="bphone"
                            aria-describedby="bphoneHelp">
                    </div>

                    <div class="col-6">
                        <label for="category" class="form-label">Category</label>
                            <select name="category" id="category" class="form-control"
                            aria-describedby="categoryHelp">
                                <option selected="true" value="" disabled="disabled">-- select --</option>
                                <option value="Government Blood Banks">Government Blood Banks</option>
                                <option value="Private Blood Banks">Private Blood Banks</option>
                            </select>
                    </div>

                    <div class="col-12">
                        <label for="services" class="form-label">Services</label>
                        <textarea name="services"
                            class="form-control" id="services" rows="4"></textarea>
                    </div>                    

                    <div class="col-12">
                        <button type="submit" class="btn btn-brand">Add Blood Bank</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
    
    <jsp:include page="../include/footer.jsp"></jsp:include>
</body>
	<script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.bundle.min.js"></script>
    <script src="../js/owl.carousel.min.js"></script>
    <script src="../js/app.js"></script>
</html>