<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
 Statement stmt=  con.createStatement();
//String query="insert into student values(224,'Ashwini', 94,'Pune','Maharashtra') ";             
//String query="insert into student (rollno,name,marks) values (225,'Aditya',96) ";
//String query="update student set name='Harsh' where rollno=222 ";
String query="delete from student where roll_no=21";
int num_of_record=    stmt.executeUpdate(query);
out.println(num_of_record+ " record deleted"); 
 
//  ResultSet rs=   stmt.executeQuery("select * from student");
//  while(rs.next())
 // {
    //  out.print(rs.getInt(1) + ", "+ rs.getString(2)+", "+rs.getInt(3)+" ,"+rs.getString(4)+", "+rs.getString(5));
      //    out.println("<br>");
//  }
//con.close();
%>
</body>
</html>