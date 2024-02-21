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
  String data= (String) session.getAttribute("myvalue");
out.print("hello "+ data +"<br>");
//session.setMaxInactiveInterval(10);
//you can set session time
session.invalidate();
try
{
String data2= (String) session.getAttribute("myvalue");
out.print("hello "+ data2 +"<br>");
}
catch(Exception e)
{
    out.println(e);
}
%>
</body>
</html>