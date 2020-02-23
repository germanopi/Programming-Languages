<?php 

// Valid constant names
define("FOO",     "something");
define("FOO2",    "something else");
define("FOO_BAR", "something more");

// Invalid constant names
define("2FOO",    "something");

// Conditional about current hour 
$t = date("H");
if ($t < "10") {
    echo "Have a good morning!";
} elseif ($t < "20") {
    echo "Have a good day!";
} else {
    echo "Have a good night!";
}

$a == $b	// True if $a is equal $b.
$a === $b	// True if $a is equals $b and they have same type
$a != $b	// True	if $a is not equal $b.
$a !== $b	// True if $a is not equals $b or they dont have same type

$arr = array(1, 2, 3, 4);
foreach ($arr as &$value) { // $arr is now array(2, 4, 6, 8)
    $value = $value * 2;
}

unset($value); // Reset array index to start

function inverse($x) { // Inverse function
    if (!$x) {
        throw new Exception('Division by zero');
    }
    return 1/$x;
}

try {                          // Exception 
    echo inverse(5) . "\n";
    echo inverse(0) . "\n";
} catch (Exception $e) {
    echo 'Catched exception: ',  $e->getMessage(), "\n";
}

$first ? $second : $third // If first is TRUE return second if its FALSE return third 

$c = $a++;      // c receives a, and a is incremented                     
$e =  ++$b;     // e receives b incremented
$f = double($d) // f receives twice d


?>