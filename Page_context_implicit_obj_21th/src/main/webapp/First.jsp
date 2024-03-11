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
String uid=request.getParameter("userid");
out.println("Data entered in form is: "+uid);
pageContext.setAttribute("useremail", uid,pageContext.SESSION_SCOPE);
out.println("<a href='Second.jsp'> Next Page</a>");
%>
</body>
</html>