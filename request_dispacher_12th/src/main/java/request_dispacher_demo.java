

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

@WebServlet("/request_dispacher_demo")
public class request_dispacher_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");

		if(name.equals("Pranav") && password.equals("kale"))
		{
			//this line will take you to another page
			RequestDispatcher rd=req.getRequestDispatcher("/welcome");
			
			rd.forward(req, resp);
		}
		else
		{
			out.println("<b> Invalid user credentials");
			//rd.include method will print response content(ou,println with html page mention below)
	        RequestDispatcher rd=req.getRequestDispatcher("/NewFile.html");
	        //rd.include method can be used to print statement in html file
	        rd.include(req, resp);
		}
		
		
	}

}
