<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form Page</title>
</head>
<body>
	<h1>Student Form Page</h1>
	<form action="addStudent">
		<label for="id">Id:</label><br>
		<input type="text" id="id" name="id"><br>
		
		<label for="name">Name:</label><br>
		<input type="text" id="name" name="name"><br>
		
		<label for="email">Email:</label><br>
		<input type="text" id="email" name="email"><br>
		
		<label for="dob">DOB:</label><br>
		<input type="text" id="dob" name="dob"><br>
		
		<label for="age">Age:</label><br>
		<input type="text" id="age" name="age"><br><br>
		
		<input type="submit"><br>
	</form>
</body>
</html>