<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Courses</title>
	</head>
	<body>
		<h1>Course Entry Page</h1>
		<form action="addCourse">
			<label for="id">Id:</label><br>
			<input type="text" id="id" name="id"><br>
			
			<label for="name">Name:</label><br>
			<input type="text" id="name" name="name"><br>
			
			<label for="email">Department:</label><br>
			<input type="text" id="department" name="department"><br>
			
			<label for="dob">Instructor:</label><br>
			<input type="text" id="instructor" name="instructor"><br>
					
			<input type="submit"><br>
		</form>
	</body>
</html>