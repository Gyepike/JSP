<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h3>JSP build in objects </h3>
   Request user agent : </br>
   <%= request.getHeader("User-Agent") %> 
   Language :
   </br>
   <%= request.getLocale() %> 
</body>
</html>