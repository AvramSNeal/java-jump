<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
<%
String id=request.getParameter("id");
int empId=Integer.parseInt(id);
EmployeeDao.delete(empId);
%>
<p>The Employee has been Deleted! </p>
<a href="view.jsp?pageNo=1">Back to Employee List</a>
</body>
</html>