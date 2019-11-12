package com.collabera;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	public void service(ServletRequest req,ServletResponse res)
	throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello Generic Servlet (header 1)</h1>");
		out.print("<h2>Second Line(header 2)</h2>");
		out.print("<h3>Hello Generic Servlet (header 3)</h3>");
		out.print("</body></html>");
	}
}
