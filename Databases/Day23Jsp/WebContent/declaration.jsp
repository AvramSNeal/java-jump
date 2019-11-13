<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.jsp.Math" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration Scriptlet</title>
</head>
<body>
	<h2>Declaration Scriptlet Demo</h2>
	<%! int data=50; %>
	<%!
	int cube(int n){
		return n*n*n;
	}
	%>
	<%= "Value of the variable is: " + data %>
	<%= "<hr>Cube of 3 is: " + cube(3) %>
	<% 
	Math math = new Math(); 
	out.print("<hr>Square of 3 is: " + math.square(3));
	%>
	
	
</body>
</html>