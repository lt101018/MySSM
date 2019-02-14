<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Get student information by student number
	<form action="controller/queryStudentByNo">
		number:<input name="stuno"  >
		<input type="submit" value="search">
	</form>
	<br/>
	Update student by student number
	<form action="controller/updateStudentByNo">
		number:<input name="number"  >
		name:<input name="name"  >
		age:<input name="age"  >
		<input type="submit" value="update">
	</form>
	<br/>
	Add a new student
	<form action="controller/addNewStudent">
		number:<input name="number"  >
		name:<input name="name"  >
		age:<input name="age"  >
		<input type="submit" value="post">
	</form>
	Delete student by student number
	<form action="controller/deleteStudentByNo">
		number:<input name="stuno"  >
		<input type="submit" value="delete">
	</form>
	<br/>
</body>
</html>