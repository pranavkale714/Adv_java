

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class database_con
 */
@WebServlet("/jdbc_data")
public class jdbc_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter out= resp.getWriter();
		 
		 String fname=req.getParameter("firstname");
		 String lname=req.getParameter("lastname");
		 String email=req.getParameter("email");
		 String mobile_number=req.getParameter("mobilenumber");
		 long mobileno = Long.parseLong(mobile_number);
		//String mydate= request.getParameter("dob"); 
		//java.util.Date dateOfJoin= format.parse( mydate);  
		//java.sql.Date dateJoin= new java.sql.Date( dateOfJoin.getTime() );  

		// out.println(fname+lname+email+mobileno);--to check data coma to servlet
		 Connection con=null;
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				out.println("driver found");
				out.println("\n if driver not found not exception occur then go to 1.properties of project"
						+ "2.deployment assembly"+"3.add"+"4.java build path entries"+"5.apply and close");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
				out.println("\n Connection established");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	
		 
			 PreparedStatement pstmt=null;
			try {
				pstmt = con.prepareStatement("insert into user_registration(Firstname,lastname,emailid,mobilenumber) values(?,?,?,?)");
				 out.println("\n Statement created");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 try {
				pstmt.setString(1, fname);
				pstmt.setString(2, lname);
				 pstmt.setString(3, email);
				 pstmt.setLong(4, mobileno);
				//pstmt.setDate( 2, dateJoin); 
				 int count = pstmt.executeUpdate();
				 out.print(count + "\n Record inserted successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			 
				
		 
}
}