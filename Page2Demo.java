package org.umar.learnServelet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;


public class Page2Demo extends HttpServlet
{
	public String message;
	
	public void init()
	{
		System.out.println("service init");
		message = "page2";
		
	}
	
	public void service (HttpServletResponse request, HttpServletResponse response)
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>" + "<a href=\""/page2\">" + "</a>" );
	}

}
