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
String sId=request.getParameter("id");
int id=Integer.parseInt(sId);
//if(id<0) -> insert / else -> update
Employee emp = new Employee(-1, "", "");
String readonly="";
out.print("id=" + id);
if(id>0){
	readonly="readonly";
	emp = EmployeeDao.getEmployee(id);
}
%>

<h2>Update Employee Record: </h2>
	<form action="doUpdate.jsp" method="post">
		<label>Id:</label>
			<input type="text" name="id" <%=readonly %> value="<%=emp.getId() %>"><br><br>
		<label>First Name:</label>
			<input type="text" name="firstName" value="<%=emp.getFirstName() %>"><br>
		<label>Last Name:</label>
			<input type="text" name="lastName" value="<%=emp.getLastName() %>"><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>