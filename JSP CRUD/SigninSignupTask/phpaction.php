<!DOCTYPE html>
<html>
<body>

<?php
// $servername = "localhost:3307";
// $username = "root";
// $password = "";
// $dbname = "test1";

// // Create connection
// $conn = mysqli_connect($servername, $username, $password, $dbname);

// // Check connection
// if (!$conn) {
//   die("Connection failed: " . mysqli_connect_error());
// }

// //successfully connected msg
// echo "Connected successfully";

//fetching values from previous page
$name = $_GET["name"];
$email = $_GET["email"]; 
$mobile = $_GET["mobile"];
$eventDate = $_GET["eventDate"];
$eventType = $_POST['eventType'];
$bio = $_GET["bio"];
$address = $_GET["address"];
$city = $_GET["city"];
$pincode = $_GET["pincode"];

// //insert query
// $sql = "INSERT INTO user (firstname, lastname, email, mobile)
// VALUES ('$firstname', '$lastname', '$email', '$mobile')";

// //checking whether query executed or not
// if ($conn->query($sql) === TRUE) {
//   echo "New record created successfully";
// } else {
//   echo "Error: " . $sql . "<br>" . $conn->error;
// }

// //closing the connection
// $conn->close();
// ?>

<br><br>
Name      : <?php echo $_GET["firstname"]; ?><br>
Email     : <?php echo $_GET["email"]; ?><br>
Mobile    : <?php echo $_GET["mobile"]; ?>
<?php echo $_GET["eventDate"]; ?>
<?php echo $_GET["eventType"]; ?>
<?php echo $_GET["bio"]; ?>
<?php echo $_GET["address"]; ?>


<br><br>You have successfully registered!
</body>
</html>