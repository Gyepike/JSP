<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% out.println("<h3>!Dispatcher!<h/3>");  %>
   <br/>
   <form action="helloworld" method="GET">
      Enter first : <input type="text" name="num1"> <br/> <br/>
      Enter second : <input type="text" name="num2"> <br/> <br/>
      <input type="submit">
   </form>
   <jsp:include page="my-footer.jsp"></jsp:include>
</body>
</html>