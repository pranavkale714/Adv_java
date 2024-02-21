<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String email=  request.getParameter("username");
out.print("Welcome "+email +"<br>");
session.setAttribute("myvalue", email);
    if(session.isNew())
    	// isNew() on the session object,check if the session is a new one or is already in use
    {
        out.println("New user <br>");
    }
    else
    {
    	//else block
        out.println("Existing user <br>");
        out.println("Session ID: "+session.getId()+"<br>");
    }
out.println("<br>=========== Exploring methods of session object================<br>");
out.println("Session creation time: "+session.getCreationTime()+"<br>");
out.println("Last accessed time is: "+session.getLastAccessedTime());
%>
<br>
<a href="showuser.jsp">Show user</a>
<a href="logout.jsp">Logout</a>
</body>
</html>
