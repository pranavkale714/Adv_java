<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="jsp_pagedirective_iserrorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    String n1=request.getParameter("num1");
    String n2=request.getParameter("num2");
    
    int number1=Integer.parseInt(n1);
    int number2=Integer.parseInt(n2);
    
    int result=number1/number2;
    out.print(result);
    
%>
</body>
</html>