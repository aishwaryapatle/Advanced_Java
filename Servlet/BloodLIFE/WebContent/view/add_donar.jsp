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

<title>Add Donar</title>
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

<jsp:include page="../include/header1.jsp"></jsp:include>

<div class="container-fluid">
        <div class="row gy-4">
            <div class="col-lg-4 col-sm-12 bg-cover" style="background-image: url(../img/c2.jpg); min-height:300px;">
                <div>

                </div>
            </div>
            <div class="col-lg-8">
                <form class="p-lg-5 col-12 row g-3">
                    <div>
                        <h1>Add Donor</h1>
                        <!-- <p>Please Login to Continue</p> -->
                    </div>
                    
                    <div class="col-12">
                        <label for="dfname" class="form-label">Donor's First Name</label>
                        <input type="text" name="dfname" class="form-control" placeholder="First Name" id="dfname"
                            aria-describedby="dfnameHelp">
                    </div>
                    <div class="col-12">
                        <label for="dlname" class="form-label">Donor's Last Name</label>
                        <input type="text" name="dlname" class="form-control" placeholder="Last Name" id="dlname"
                            aria-describedby="dlnameHelp">
                    </div>

                    <div class="col-12">
                        <label for="email" class="form-label">Email address</label>
                        <input type="email" name="email" class="form-control" placeholder="Johndoe@example.com" id="email"
                            aria-describedby="emailHelp">
                    </div>

                    <div class="col-12">
                        <label for="phone" class="form-label">Mobile Number</label>
                        <input type="number" name="number" class="form-control" id="phone"
                            aria-describedby="phoneHelp">
                    </div>

                    <div class="col-12">
                        <label for="bloodgroup" class="form-label">Blood Group</label>
                            <select name="bloodgroup" id="bloodgroup" class="form-control"
                            aria-describedby="emailHelp">
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
                        <button type="submit" class="btn btn-brand">Add Donor</button>
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