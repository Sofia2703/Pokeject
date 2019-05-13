<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){
	include "Connect.php";
	$Name = $_POST["Name"];
	$PaoEasy = $_POST["PaoEasy"];
	$intvalue = intval($PaoEasy);

    $query = "INSERT INTO user (Name,PaoEasy) values ('$Name','$intvalue');";
	mysqli_query($con,$query) or die (mysqli_error($con));
	mysqli_close($con);
}
?>