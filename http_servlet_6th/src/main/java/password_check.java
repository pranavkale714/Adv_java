

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/password_check")
public class password_check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username= request.getParameter("name");
		String password= request.getParameter("password");
		 
		 if(username.equals("Pranav") && password.equals("Kale"))
		 {
		out.println("Welcome "+username);
		 }
		 else
		 {
			 out.println("Please check your user credentials");
		 }
	}

}
