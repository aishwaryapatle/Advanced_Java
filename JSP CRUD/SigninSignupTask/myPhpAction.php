<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$servername = "localhost:3307";
$username = "root";
$password = "";
$dbname = "test1";

// Create connection
// $conn = mysqli_connect($servername, $username, $password, $dbname);

// Check connection
// if (!$conn) {
//   die("Connection failed: " . mysqli_connect_error());
// }

//successfully connected msg
// echo "Connected successfully";

//fetching values from previous page
$name = $_GET["name"];
$email = $_GET["email"]; 
$mobile = $_GET["mobile"];
$eventDate = $_GET["eventDate"];
$eventType = $_GET['eventType'];
$bio = $_GET["bio"];
$address = $_GET["address"];
$city = $_GET["city"];
$pincode = $_GET["pincode"];

// //insert query
// $sql = "INSERT INTO user1 (uname, uemail, umobile, ueventDate, ueventType, ubio, uaddress, ucity, upincode)
// VALUES ('$name', '$email', '$mobile', '$eventDate', '$eventType', '$bio', '$address', '$city', '$pincode')";

//checking whether query executed or not
// if ($conn->query($sql) === TRUE) {
//   echo "New record created successfully";
// } else {
//   echo "Error: " . $sql . "<br>" . $conn->error;
// }

//closing the connection
// $conn->close();
?>

<br><br>
Name      : <?php echo $_GET["name"]; ?><br>
Email     : <?php echo $_GET["email"]; ?><br>
Mobile    : <?php echo $_GET["mobile"]; ?><br>
EventDate : <?php echo $_GET["eventDate"]; ?><br>
Type      :<?php echo $_GET["eventType"]; ?><br>
Bio       :<?php echo $_GET["bio"]; ?><br>
Address   :<?php echo $_GET["address"]; ?><br>
City      :<?php echo $_GET["city"]; ?><br>
Pincode   :<?php echo $_GET["pincode"]; ?><br>
</body>
</html>