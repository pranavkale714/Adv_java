<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="st" class="mybean.Student"/>
<jsp:setProperty property="rollno" value="1223" name="st"/>
<jsp:setProperty property="name" value="Virat" name="st"/>
    <%-- Accessing the properties directly --%>
    <p>Roll No: <%= st.getRollno() %></p>
    <p>Name: <%= st.getName() %></p>
    
Rollno:<jsp:getProperty property="rollno" name="st"/> <br>
Name:<jsp:getProperty property="name" name="st"/>
</body>
</html>