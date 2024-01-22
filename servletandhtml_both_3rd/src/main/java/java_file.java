

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/java_file")
public class java_file extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("firstname");
		 String lname=request.getParameter("lastname");
		 String dob=request.getParameter("dob");
		 String email=request.getParameter("email");
		 String mobile_number=request.getParameter("mobilenumber"); 
		 PrintWriter out= response.getWriter();
		 out.println("First Name: "+fname);
		 out.println("Last Name: "+lname);
		 out.println("DOB: "+dob);
		 out.println("Email id: "+email);
		 out.println("Mobile Number: "+mobile_number);
	}

}
