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
out.print("it is used to embed java code directly into the jsp page.<br>it allow you to write java statements,perform computations and manipulate data within the jsp");
int a=4;
if(a%2==0)
{
	out.print("even");
}
else
{
	out.print("odd");
}
out.print("jdbc also with this tag");
%>

</body>
</html>