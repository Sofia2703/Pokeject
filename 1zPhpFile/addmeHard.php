<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){
	include "Connect.php";
	$Nameh = $_POST["Nameh"];
	$PaoHard = $_POST["PaoHard"];
	$intvalue = intval($PaoHard);

    $query = "INSERT INTO PaoHardTB (Nameh,PaoHard) values ('$Nameh','$intvalue');";
	mysqli_query($con,$query) or die (mysqli_error($con));
	mysqli_close($con);
}
?>