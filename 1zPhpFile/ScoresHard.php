<?php    
$con = mysqli_connect("localhost","id3526615_bambol","454687","id3526615_pokedb");      
if (mysqli_connect_errno())    
{  echo "Failed to connect to MySQL: " . mysqli_connect_error();    } 

$sql = "SELECT PaoHardTB Nameh,PaoHard FROM PaoHardTB ORDER BY PaoHard DESC"; 

$result = mysqli_query($con ,$sql);


if ($result->num_rows >0) {  
// output data of each row  
while($row[] = $result->fetch_assoc()) {   
$tem = $row;  
$json = json_encode($tem);  
} 
} else {  
echo "0 results"; 
}  
echo $json; 
mysqli_close($con);  
?>