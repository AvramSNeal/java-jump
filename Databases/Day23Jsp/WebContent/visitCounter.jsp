<%@ page import = "java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Application Object in JSP</title>
</head>
<body>
	<%
		Integer hitsCount = (Integer)application.getAttribute("hitCounter");
		if(hitsCount ==  null || hitsCount == 0){
			/* First visit */
			out.println("Welcome to my website!");
			hitsCount = 1;
		} else {
			/* return visit */
			out.println("Welcome back to my website!");
			hitsCount += 1;
		}
		application.setAttribute("hitCounter", hitsCount);
	%>
	<div style="text-align:center;">
		<p>Total number of visits: <%= hitsCount%></p>
	</div>
</body>
</html>