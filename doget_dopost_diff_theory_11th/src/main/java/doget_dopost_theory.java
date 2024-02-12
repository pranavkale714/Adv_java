

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doget_dopost_theory")
public class doget_dopost_theory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("post method use in html to send data securely as it is encrypted inside http");
		out.println("if we use post mehthod in html then use dopost method  in servlet");
		
		out.println("if we want to send less sensitive data then we use get method in html");
		out.println("if we use get method in html then we use doget method in servlet");
		
	}
       
  

}
