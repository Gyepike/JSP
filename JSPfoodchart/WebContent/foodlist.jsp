<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Food List</p>

	<%
		String[] foodlist = (String[]) request.getAttribute("foodItemsList");

	    String name = request.getAttribute("Name").toString();
		
	    out.println(name);
	    
	    out.println("<br/>");
	    for (String food : foodlist) {

			out.println(food);
			out.println("<br/>");
			
		}
		
	%>
	<br/>
    <c:out value="${Name}"/>  
    <br/>
    <c:forEach items="${foodItemsList}" var="food">
         ${food}
         <br/>
    </c:forEach>
	<br/>
</body>
</html>