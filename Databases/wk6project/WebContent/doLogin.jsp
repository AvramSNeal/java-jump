<%@ page import="com.collabera.mongo.*" %>
<%
/*
if(session != null) {
	RequestDispatcher rd = request.getRequestDispatcher("employeeList.jsp");
} else {}
*/
String userName = request.getParameter("userName");
String password = request.getParameter("password");
UserLoginDao user = new UserLoginDao();
user.connectToMongo();

if(user.findUser(userName, password)!=null) {
	out.print("You are successfully logged in!");
	out.print("<br>Welcome, " + userName);
	session.setAttribute("userName", userName);
	request.getRequestDispatcher("employeeList.jsp").include(request, response);
	return;
	
} else {
	out.print("Sorry, username or password error!");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
	
}

%>