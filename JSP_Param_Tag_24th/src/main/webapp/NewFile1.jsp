<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Receiving the value of password from another jsp page</h3>
<hr>
<%
out.println("Password:" + request.getParameter("password"));
%>
</body>
</html>