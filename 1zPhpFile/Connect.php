<?php
$con = mysqli_connect("localhost","id3526615_bambol","454687","id3526615_pokedb");
if($con->connect_error){
	die("Connection error: " . $con->connect_error);
}else{
	mysql_set_charset($con, "utf8");
}
?>