package com.collabera.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name= "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);
			
			//Cookie ck = new Cookie("name", name);
			//response.addCookie(ck);
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			
		} else {
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}
	
}
