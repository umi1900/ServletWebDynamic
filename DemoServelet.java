package org.umar.learnServelet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;;


public class DemoServelet extends HttpServlet
{
	String message = "hello";
	
	@Override
	public void init()
	{
		System.out.println("init");
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		PrintWriter out = response.getWriter();
		out.println("<h1> + message" + "</h1>");
		
		System.out.println("service");
	}
}
