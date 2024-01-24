

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.*;
@WebServlet("/generic_Servlet_demo")
public class generic_Servlet_demo extends GenericServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method 
		PrintWriter out= resp.getWriter();
		out.println("Creating servlet program using GenericServlet");
		out.println("enter first number");
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int n1= Integer.parseInt(num1);
		int n2= Integer.parseInt(num2);
		out.print("Addition of "+n1+ " and "+n2+" is: "+(n1+n2));
	}
       
   

}
