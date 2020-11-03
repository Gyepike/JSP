<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
      <form action="StudentServlet" method="GET">
       Első szám : <input type="text" name="firstNumber">
       <br/>
       Második szám : <input type="text" name="secondNumber">
       <br/>
        
       <input type="submit" value="Submit"> 
     </form>
               <%
        String ev =request.getParameter("vissza");
                		%>
</body>
</html>