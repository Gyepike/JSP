<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%@ include file="my-header.html"  %>  
    <%= request.getContextPath() %> 
    Login Page:
     <form action="nev" method="GET">
        <fieldset>
		       Login : <input type="text" name="loginname">
		       <br/>
		       Password : <input type="text" name="password">
		       <br/>
		       <input type="submit" value="Nyomd Meg"> 
	     </fieldset>   
     </form> 
   <%@ include file="my-footer.jsp" %>
</body>
</html>