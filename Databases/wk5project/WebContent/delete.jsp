<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.dao.*,com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<style>
	body{
	background-color:white;
	color: black;
	font-family: "Verdana", Verd, Sans-serif;
	}
	a{
		padding: 4px;
		margin: 0 10px;
		text-decoration: none;
		font-weight: bold;
		color: blue;	
	}
	a:hover{

		color: limegreen;
	}

</style>
</head>
<body>
<%
String id=request.getParameter("id");
int empId=Integer.parseInt(id);
Employee emp = new Employee();
emp = EmployeeDao.getEmployee(empId);
EmployeeDao.delete(empId);
%>
<h3>Employee : 
<%= emp.getId()%>
<%= emp.getFirstName()%>
<%= emp.getLastName()%>
- Deleted!</h3>
<a href="view.jsp?pageNo=1">Back to Employee List</a>
</body>
</html>