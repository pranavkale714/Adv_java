

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        //Getting the data typed in textbox in html page
        String uname=request.getParameter("username");
        out.println("<b> Welcome "+uname);
        
        //adding the data of textbox in Cookie with a name "myname"
        Cookie ck=new Cookie("myname", uname);
        response.addCookie(ck);
        
        out.println("<html><body>");
        out.println("<form method='post' action='http://localhost:8080/session_management_by_cookies_14th/MyServlet2'> ");
        out.println("<input type='submit' value='Go'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
