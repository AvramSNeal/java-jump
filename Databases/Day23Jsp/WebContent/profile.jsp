<%@include file="link.html" %>
<%
	if(session != null) {
		String name = (String)session.getAttribute("name");
		
		if(name != null) {
			out.print("<b>Welcome to Profile</b>");
			out.print("<br>Welcome, " + name);
		} else {
			out.print("Please login first");
			out.flush();
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
	} else {
		out.print("Please login first");
		request.getRequestDispatcher("login.jsp").include(request, response);
	}
%>