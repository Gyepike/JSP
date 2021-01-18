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
	  <h4 align="center" > Student List</h4>

	
	
	<h1 align="center" >Student</h1>
	<table border="1" cellpadding="15%" align="center" bordercolor="blue">
        <tr>
            <th>ID </th>
            <th>First Name </th>  
            <th>Last Name </th>
            <th>Email Name </th> 
        </tr>
        
		<c:forEach items="${students}" var="student">
		<tr>
		    <td>${student.id} </td>
		   <td>${student.firstName} </td>
		   <td>${student.lastName} </td>
		   <td>${student.email} </td>
		</tr>
		</c:forEach>
    </table>
</body>
</html>