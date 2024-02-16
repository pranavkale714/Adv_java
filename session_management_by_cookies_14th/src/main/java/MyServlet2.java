

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    javax.servlet.http.Cookie[] ck=request.getCookies();
	    String val="";
	    String value="";
	    boolean flag=false;
	    
	    if(ck==null)
	    {
	        out.println("<b> Please visit to user page to add your name");
	    }
	    
	    else
	    {
	        
	        for(javax.servlet.http.Cookie c:ck)
	        {
	            val=c.getName();
	            if(val.equals("myname"))
	            {
	                value=c.getValue();
	                flag=true;
	            }
	        }
	        
	        }
	    if(flag)
	    {
	        out.print("Hello "+ value);
	    }
	        
	    
	    }
	}

