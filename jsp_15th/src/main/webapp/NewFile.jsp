<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to web world
<%! int a=2, b=5,c=0; %>
<%
c=a+b;
out.println("<br>" +" Addition of "+ a +" and "+ b+ " is "+c +"<br>");
c=b-a;
out.println("Substraction of "+ b +" and "+ a+ " is "+c+"<br>");
c=a*b;
out.println("Multiplication of "+ a +" and "+ b+ " is "+c+"<br>");
c=b/a;
out.println("Division of "+ b +" and "+ a+ " is "+c);
%>
</body>
</html>