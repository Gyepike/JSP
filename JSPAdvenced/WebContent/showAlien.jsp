<%@page import="com.anti.JSPAdvenced.web.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  Show alien!!
   <%
   
      Alien a1 =(Alien) request.getAttribute("alien");
  
      out.println(a1.toString());
   %>
</body>
</html>