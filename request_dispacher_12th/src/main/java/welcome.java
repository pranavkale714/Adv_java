

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String name=req.getParameter("name");
        out.println("<b> Welcome "+name);
	}

}
