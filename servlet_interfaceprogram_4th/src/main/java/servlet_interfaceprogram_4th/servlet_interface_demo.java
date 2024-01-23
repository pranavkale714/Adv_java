package servlet_interfaceprogram_4th;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class servlet_interface_demo
 */
@WebServlet("/servlet_interface_demo")
public class servlet_interface_demo implements Servlet {
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.println("type url carefully");
		out.println("vbfhvbh");
		out.println("Welcome to Servlet......");
		out.println("Using Servlet interface");
		out.println("Inside Service method");

	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
