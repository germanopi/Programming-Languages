<?php // Basic Syntax

$helloWolrd="Hello World!"; // Variable declaration

$array=['G','E','R','M','ERROR','A','N','O',]; // Array declaration
$name='';

echo $helloWolrd; // Print variable
echo '<br>';      // Break Line

for($i=0;$i<count($array);$i++){ // Repeat array's lenght times
		if($array[$i]=='ERROR'){ // Don't let take some index
			continue;
		}
	$name.=$array[$i];			 // Concatenate name with array
}
echo $name;
echo '<br>';   

// <form method="post">  Create a web post
//	<input type="text" name="user"> Text create a box to receive data and user is how server will recognize it
//	<input type="text" name="numero">
//	<input type="text" name="email">
//	<input type="submit" name="action"> Submite create a button to do some action
// </form> 

if(isset($_POST['action'])){ // Verify is action was already triggered or if exist

	define("user","$_POST[user]");// user will receive given data on name box
	define("number","$_POST[number]"); // number will receive given data on number box
	define("email","$_POST[email]");	// email will receive given data on email box

	if(strlen(user)>=5){ 	// Verify if there's more than 5 letters in name
		echo "user has more than five letters";
		echo '<br>';      
	}
	if(is_numeric(number)){ // Verify if number is realley a number
		echo "number is a number";
		echo '<br>';     
	}
	if(strstr(email,'@')==true){ // Verify if string email has a substring with @
		echo "there's a @ on email";
		echo '<br>';      
	}
}

// Identify same numbers in two arrays

$array_0=array(0,1,3,4,6,8);
$array_1=array(10,90,23,8,6);
$array_result=[];

for($i =0;$i<count($array_0);$i++){
	for($j=0;$j<count($array_1);$j++){
		if($array_0[$i]==$array_1[$j]){
			$array_result[]=$array_0[$i];
		} 
	}
}

foreach ($array_result as $key => $value) { // For each index in array_result print its value
	echo "Both arrays have $value";
	echo '<br>';
}

//	 Identify repetitive values on an array

$array=array(1,1,3,4,4,5);
$array_count=array();

for($i=0;$i<count($array);$i++){
	$value=$array[$i];
	if(!isset($array_count[$value])){
		$array_count[$value]=0;
	}else{
		$array_count[$value]++;
	}
}

foreach ($array_count as $key => $value) {
	echo '<hr>';
	echo $key ;
	echo  " has been repeated ";
	echo $value;
	echo " times ";
	echo '<hr>';  // Create a line
}

// Fill an array with random numbers without repeat 

$array_random=[];

for($i=0;$i<5;$i++){
	$array_random[$i]=rand(1,5);
	while(inArrayCustom($i,$array_random[$i], $array_random)){
		$array_random[$i]=rand(1,5);
	}
	
}
print_r($array_random);

function inArrayCustom($index,$value,$array){
	for($i=0;$i<count($array);$i++){
		if($array[$i]==$value && $i!=$index){
			return true;
		}
	}
	return false;
}

?>

<form method="post"> 
	<input type="text" name="user"> 
	<input type="text" name="number">
	<input type="text" name="email">
	<input type="submit" name="action"> 
</form> 
 
