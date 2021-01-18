<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Student List </title>
</head>
<body>
     
    <h3 align="center">Student List from MVC </h3>
	<table border="1" cellpadding="25%" align="center" bordercolor="blue">
	<tr>
	   <th>id</th> 
	   <th>firstName</th> 
	   <th>lastName</th>
	   <th>email</th>	    
	</tr>
	<c:forEach items="${students}" var="student">
	<tr>
         <td> ${student.id} </td>
         <td> ${student.firstName} </td>
         <td> ${student.lastName} </td>
         <td> ${student.email} </td>
     </tr>     
	</c:forEach>
    </table>
</body>
</html>