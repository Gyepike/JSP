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
	  <h4 align="center" > Food List</h4>

	<%
		//put UI code here 
		/* 	String[] foodlist = (String[]) request.getAttribute("foodItemsList");
		
		    String name = request.getAttribute("Name").toString();
			
		    out.println(name);
		    
		    out.println("<br/>");
		    for (String food : foodlist) {
		
				out.println(food);
				out.println("<br/>");
				
			} */
	%>
    <table align="center" border="2" bordercolor="blue" >
      <tr>
    	<td>
	 		<c:out value="${Name}" />
		 </td>
		</tr> 
    </table> 
     
	<%--  <c:forEach items="${foodItemsList}" var="food">
         ${food}
       
         <br/>
    </c:forEach> --%>
	<br />
	
	<h1 align="center" >Menu</h1>
	<table border="1" cellpadding="25%" align="center" bordercolor="blue">
    
	<c:forEach items="${list}" var="food">
	<tr>
	   <th>Code</th> 
	   <th>Item</th> 
	   <th>Price</th> 
	</tr>
	<tr>
         <td> ${food.id} </td>
         <td> ${food.item} </td>
         <td> ${food.price} </td>
     </tr>     
	</c:forEach>
    </table>
</body>
</html>