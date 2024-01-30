package deployment_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deployment_disc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("i am in service method");
		out.println("it is also known as web.xml");
		out.println("mainly use for url mapping");
		out.println("not need to create nowdays but in old project it is used and and and it depends on project to");
		out.println("in modern program we use servlet annotation--@webservlet");
		out.println("When a request comes web server uses web.xml file to map the URL of the request to the specific code that handle the request.");
		
	}

}
