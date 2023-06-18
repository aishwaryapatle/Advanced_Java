function myfun() {

    document.getElementById("emailError").innerHTML = "";
    document.getElementById("nameError").innerHTML = "";
    document.getElementById("mobileError").innerHTML = "";
    document.getElementById("eventDateError").innerHTML = "";
    document.getElementById("addressError").innerHTML = "";
    document.getElementById("cityError").innerHTML = "";
    document.getElementById("pincodeError").innerHTML = "";


    // //Email validation
    var email = document.getElementById("email").value;
    const regex_pattern = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (email == '') {
        document.getElementById("emailError").innerHTML = "Please enter an email address!";
        return false;
    }
    if (!(regex_pattern.test(email))) {
        document.getElementById("emailError").innerHTML = "The email address is not valid!";
        return false;
    }
    // if ((regex_pattern.test(email))) {
    //     document.getElementById("emailError").innerHTML = "";
    // }

    //Name Validation
    var name = document.getElementById("name").value;
    var letters = /^[a-zA-Z ]*$/;
    if(name=='') {
        document.getElementById("nameError").innerHTML = "Please fill the name!";
        return false;
    }
    if (name.length < 5) {
        document.getElementById("nameError").innerHTML = "Name is too short!";
        return false;
    }
    if (name.length == 0) {
        document.getElementById("nameError").innerHTML = "Please fill the name!";
        return false;
    }
    if (!(name.match(letters))) {
        document.getElementById("nameError").innerHTML = "Name must contain only alphabets!";
        return false;
    }

    //eventDate Validation
    var eventDate = document.getElementById("eventDate").value;
    if (eventDate == "") {
        document.getElementById("eventDateError").innerHTML = "Please select eventDate";
        return false;
    }
    

    //Mobile Number Validation
    var a = document.getElementById("mobile").value;
    if (a == "") {
        document.getElementById("mobileError").innerHTML = "Please fill mobile number";
        return false;
    }
    if (isNaN(a)) {
        document.getElementById("mobileError").innerHTML = "Enter only numbers";
        return false;
    }
    if (a.length < 10) {
        document.getElementById("mobileError").innerHTML = "Mobile number must be 10 digit";
        return false;
    }
    if (a.length > 10) {
        document.getElementById("mobileError").innerHTML = "Mobile number must be 10 digit";
        return false;
    }
    if ((a.charAt(0) != 9) && (a.charAt(0) != 8) && (a.charAt(0) != 7)) {
        document.getElementById("mobileError").innerHTML = "Mobile number must start with 9, 8, 7";
        return false;
    }


    //address Validation
    var address = document.getElementById("address").value;
    if (address.trim().length < 2) {
        document.getElementById("addressError").innerHTML = "Please enter an address!";
        return false;
    }
    if (address.length == 0) {
        document.getElementById("addressError").innerHTML = "Please enter an address!";
        return false;
    }


    //city Validation
    var city = document.getElementById("city").value;
    if (city.trim().length < 2) {
        document.getElementById("cityError").innerHTML = "Please enter your city!";
        return false;
    }
    if (city.length == 0) {
        document.getElementById("cityError").innerHTML = "Please enter your city!";
        return false;
    }

    //city Validation
    var pincode = document.getElementById("pincode").value;
    if (pincode.length == 0) {
        document.getElementById("pincodeError").innerHTML = "Please enter your pincode!";
        return false;
    }
    if (pincode == "") {
        document.getElementById("pincodeError").innerHTML = "Please fill pincode";
        return false;
    }
    if (isNaN(pincode)) {
        document.getElementById("pincodeError").innerHTML = "Enter only numbers";
        return false;
    }
    if (pincode.length < 6) {
        document.getElementById("pincodeError").innerHTML = "pincode must be 6 digit";
        return false;
    }
    if (pincode.length > 6) {
        document.getElementById("pincodeError").innerHTML = "pincode must be 6 digit";
        return false;
    }
    
  

}