package context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class context_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("servlet context is use to provide inital parameter");
		out.println("we can get value associated with initil parameter");
		out.println("we can also use it to share information to all/every servlet in project");
		out.println("generally we use database");
		
		out.println("servlet_context is interface");
		ServletContext abc=getServletContext();
		
		String username=abc.getInitParameter("name");
	    out.println(username);
	    
	    String mobile_no=abc.getInitParameter("mobile_no");
	    out.println(mobile_no);
	}
   

}
