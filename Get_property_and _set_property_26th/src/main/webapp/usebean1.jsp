<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="mybean.user2"></jsp:useBean>
<jsp:setProperty property="id" name="user"/>
<jsp:setProperty property="password" name="user"/>
Records:
<jsp:getProperty property="id" name="user"/>
<jsp:getProperty property="password" name="user"/>
</body>
</html>