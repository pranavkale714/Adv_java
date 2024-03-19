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
	request.setAttribute("Name", "PRANAV");
	//out.println(request.getAttribute("Name"));
	%>
	<h3>NAME: ${requestScope.Name }</h3>
	<%
	session.setAttribute("clg","rmd");	
	%>
	<h3>college name: ${clg}</h3>
</body>
</html>