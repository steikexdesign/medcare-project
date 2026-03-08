<?php

$conn = new mysqli("localhost","Bhuvanesh","","medcare_db");

if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}

?>