<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.collabera.dao.*,com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<style>
	table{
		cellpadding: 4;
		width: 60%;
		border: 1px solid black;
	}
	tr:hover{
		background-color: lightgrey;
	}
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
String spageNo = request.getParameter("pageNo");
int pageNo=Integer.parseInt(spageNo);
String spageSize = request.getParameter("pageSize");
int pageSize;
if (spageSize==null){
	pageSize = 10;
} else {
	pageSize=Integer.parseInt(spageSize);
}
List<Employee> list = EmployeeDao.getList(pageNo, pageSize);

int nrPages= (int)Math.ceil(EmployeeDao.getTotalRecords()/(double)pageSize);
%>
<h2>Employee Management System</h2>

<h3>Page No: <%= pageNo %></h3>
<form action="view.jsp">
<select name="pageSize" onchange="this.form.submit()">
	<option value="5" <% if( pageSize==5 ) out.print("selected"); %> >5</option>
	<option value="10" <% if( pageSize==10 ) out.print("selected"); %> >10</option>
	<option value="15" <% if( pageSize==15 ) out.print("selected"); %> >15</option>
	<option value="20" <% if( pageSize==20 ) out.print("selected"); %> >20</option>

</select>
<input type="hidden" name="pageNo" value="<%=pageNo%>"></form>
<table> 
<tr>
	<th><a href="create.jsp">Add a New Employee</a></th>
</tr>
</table>
<table class="emp-table" border="1">

<tr>
	<th>Id</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Action</th>
</tr>


<%for(Employee e:list){%>
	<tr>
		<td><%=e.getId()%></td>
		<td><%=e.getFirstName()%></td>
		<td><%=e.getLastName()%></td>
		<td> <a href="delete.jsp?id=<%= e.getId()%>">Delete</a>&nbsp;
			<a href=" update.jsp?id=<%= e.getId()%>">Update</a>
		</td>
	</tr>
<%}%>

</table>

<div class="pagination">
<span>Pages: </span>
<%
String cssActive="";
for(int i=1; i<=nrPages; i++){
	if(i==pageNo){
		cssActive="active";
	}
	else cssActive="";
%>
<a class="page-link <%=cssActive%>" href="view.jsp?pageNo=<%=i%>&pageSize=<%=pageSize%>"> <%=i%> </a>
<%}%>
</div>
</body>
</html>