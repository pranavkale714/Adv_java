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
out.print("Welcome "+email);
session.setAttribute("myvalue", email);
%>
<br>
<a href="showuser.jsp">Show user</a>
</body>
</html>
