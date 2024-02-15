

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/send_redirect_demo")
public class send_redirect_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
	    {
	        resp.setContentType("text/html");
	        PrintWriter pw = resp.getWriter();
	        String searchdata=    req.getParameter("searchtext");
	        
	        //send redirect will take to another page
	        resp.sendRedirect("https://www.google.com/search?q="+searchdata);
	        
	        
	    }

}
