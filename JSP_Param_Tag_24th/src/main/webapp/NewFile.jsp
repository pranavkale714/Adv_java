<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Using JSP param to send parameter to other jsp page </h3>
<jsp:forward page="NewFile1.jsp">
<jsp:param value="scott" name="password"/>
</jsp:forward>
</body>
</html>