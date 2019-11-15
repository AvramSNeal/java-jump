<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.dao.*,com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add(Create) Employee</title>
</head>
<body>
<%
Employee emp = new Employee(0, "", "");
System.out.print("NEW EMPLOYEE");

%>

<h2>Add(Create) New Employee: </h2>
	<form action="doUpdate.jsp" method="post">
		<label>Id:</label>
			<input type="text" name="id" value="<%=emp.getId() %>"><br><br>
		<label>First Name:</label>
			<input type="text" name="firstName" value="<%=emp.getFirstName() %>"><br>
		<label>Last Name:</label>
			<input type="text" name="lastName" value="<%=emp.getLastName() %>"><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>