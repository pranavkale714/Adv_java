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
String value=application.getInitParameter("password");
out.println("Password received using application object is: "+value);
out.println("<hr>");
String username =config.getInitParameter("loginusername");
out.print("<b>User name to login in database is: "+username);
%>
</body>
</html>