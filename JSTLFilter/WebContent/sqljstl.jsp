<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql"  uri = "http://java.sun.com/jsp/jstl/sql" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <sql:setDataSource var="db"  driver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false"  user="hbstudent" password="hbstudent"/>
  <sql:query var="rs" dataSource="${db}">SELECT * FROM Alien.aliens</sql:query>
  
  <c:forEach items="${rs.rows}" var="alien">
      <c:out  value="${alien}" ></c:out>
  </c:forEach>
  
  <%
	String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
	String user = "hbstudent";
	String password = "hbstudent"; 
	String sql = "SELECT * FROM Alien.aliens where idaliens = ?";
	
	Class.forName("com.mysql.jdbc.Driver"); 
  %>
</body>
</html>


