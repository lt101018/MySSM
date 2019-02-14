<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Search student information by student id
	<form action="controller/queryStudentByNo">
		id:<input name="stuno"  >
		<input type="submit" value="Search">
	</form>
	<br/><br/>
	Update student by student id
	<form action="controller/updateStudentByNo">
		id:<input name="number"  ><br/>
		name:<input name="name"  ><br/>
		age:<input name="age"  >
		<input type="submit" value="Update">
	</form>
	<br/><br/>
	Add a new student
	<form action="controller/addNewStudent">
		id:<input name="number"  ><br/>
		name:<input name="name"  ><br/>
		age:<input name="age"  >
		<input type="submit" value="Add">
	</form>
	<br/><br/>
	Delete student by student number
	<form action="controller/deleteStudentByNo">
		id:<input name="stuno"  >
		<input type="submit" value="Delete">
	</form>
	<br/>
</body>
</html>