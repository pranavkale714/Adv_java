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
    String data =(String)pageContext.getAttribute("useremail",pageContext.SESSION_SCOPE);
    out.println("Data received from First.jsp is: "+data);
%>
</body>
</html>