<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Student id: ${requestScope.student.stuNo }<br/>
	Student Name: ${requestScope.student.stuName }<br/>
	Student Age: ${requestScope.student.stuAge }<br/>
	<a href="/MySSM">return</a>
</body>
</html>