<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" commandName="empObj">
		Student Name:
		<form:input path="name"/><br><br>
		
		Address:
		<form:input path="address"/><br><br>
		
		Age:
		<form:input path="age"/><br><br>
		
		Designation:
		<form:input path="designation"/><br><br>
		
		<input type="submit" value="submit"> 
	</form:form>
</body>
</html>