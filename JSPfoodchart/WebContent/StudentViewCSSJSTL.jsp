<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.anti.mvcstudent.dto.*, java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <title>MVC Student List CSS  </title>
 <link type="text/css" rel="stylesheet" href="css/style.css" >
</head>

  
<body>

   <div id="wrapper">
       <div id="header">
             <h2> Munyi Mano University</h2>
        </div>
   </div>  
   
   <div id="container">
         <div id="content">
         
           <!-- Add new Student -->
           <input type="button" value="Add Student" 
             onclick="window.location.href='add-student-form.jsp'; return false;"
             class="add-student-button"
           />
       
             <table >
                 <tr>
                      <th>First Name</th>
                      <th>Last Name</th>
                      <th>Email</th>
                 </tr>
                   <c:forEach items="${students}" var="student">
                     <tr>
                        <td>${student.firstName}</td>
                        <td>${student.lastName}</td>
                        <td>${student.email}</td>
                     </tr>
                   </c:forEach>
                   
             </table>
         </div>
   </div>
   
</body>
</html>