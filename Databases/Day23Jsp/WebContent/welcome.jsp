<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Welcome Page</title>
</head>
<body>
<%
	//Demo Request Parameter
	String name=request.getParameter("uname");
	out.println("Welcome " + name);
	out.println("<br>HTTP Method :" + request.getMethod());
	
	//Demo Config Object % Init Parameter
	String param=config.getInitParameter("dname");
	out.print("<hr>Init Parameter is : " + param);
	
	//Fun Text
	out.print("<br>The parameter value [" + param + "] knows nothing!");
%>
</body>
</html>