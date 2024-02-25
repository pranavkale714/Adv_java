<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=5;
int square()
{
	return a*a;
}
%>
 	<%
	//out.print("it is used to evaluate an expression and directly output its result within jsp page<br>");
 	
	%>
<%=
a
%>
	<%=
	square()
	%>
	
<% 
//out.print("you can directy print value without using out.print<br>");
//out.print("you can also call method directly<br>");
%>
</body>
</html>