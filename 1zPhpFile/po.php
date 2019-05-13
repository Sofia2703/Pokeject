<?php15_mysql
require "conn.php";
//$con = mysqli_connect("localhost","id3526615_bambol","454687","id3526615_pokedb");
$user_name = "1234";
$user_phone = "1234";
$mysql_qry = "select * from id3526615_pokedb wherer Name like '$user_name' and phone like '$user_phone'";
$result = mysql_query($conn,$mysql_qry)
if(mysql_num_rows($result) > 0){
	echo "login success";
}else{
	echo "r u sure your login name is right?";
}
?>