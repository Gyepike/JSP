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

     
   <% 
   List<Student> students = (List<Student>) session.getAttribute("students");
   
   for(Student student : students  )
   {
	   
	  // out.print(student);
   }
   
   %>
<body>

   <div id="wrapper">
       <div id="header">
             <h2> FooBar University</h2>
        </div>
   </div>  
   
   <div id="container">
         <div id="content">
             <table >
                 <tr>
                      <th>First Name</th>
                      <th>Last Name</th>
                      <th>Email</th>
                 </tr>
                   
                   <% for(Student student : students) { %>
                   
                     <tr>
                        <td><%= student.getFirstName() %></td>
                        <td><%= student.getLastName() %></td>
                        <td><%= student.getEmail() %></td>
                     </tr>
                   <% } %> 
                   

             </table>
         </div>
   </div>
   
</body>
</html>