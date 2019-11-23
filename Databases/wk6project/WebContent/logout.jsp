<%
	session.invalidate();
	out.print("You are successfully logged out!<br>");
	out.print("<a href='index.jsp'>Return to Home Page</a>");
%>