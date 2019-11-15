<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.dao.*,com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<%
String empId=request.getParameter("id");
String firstName=request.getParameter("firstName");
String lastName=request.getParameter("lastName");
Employee emp = new Employee(Integer.parseInt(empId), firstName, lastName);
emp = EmployeeDao.insert(emp);
if(emp!=null){
	out.print("<h1>Employee : "
			+ emp.getId()
			+ " " + emp.getFirstName()
			+ " " + emp.getLastName()
			+ " - Saved!</h1>");
}

%>
<hr>
<a href="view.jsp?pageNo=1">Back to Employee List</a>
</body>
</html>