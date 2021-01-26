<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Studnet</title>
   <link type="text/css" rel="stylesheet" href="css/style.css">
  <link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
 <!--  window.location.href is not a method, it's a property that will tell you the current URL location of the browser. 
  Changing the value of the property will redirect the page. -->
 <br/>
<!--   window.open() is a method that you can pass a URL to that you want to open in a new window. For example -->
     <div id="wrapper">
       <div id="header">
             <h2> Munyi Mano University</h2>
        </div>
   </div>  
   
   <div id="container">
         <div id="content">
           <h3>Add Student </h3>
          <form action="StudentController">
             <input type="hidden" name="command" value="ADD" /> 
            <table>
                 <tbody>
                     <tr>
                       <td> <label>First Name:</label> </td>
                       <td><input type="text" name="firstName"> </td>                
                     </tr>
                      <tr>
                       <td> <label>Last Name:</label> </td>
                       <td><input type="text" name="lastName"> </td>                
                     </tr>
                      <tr>
                       <td> <label>Email:</label> </td>
                       <td><input type="text" name="email"> </td>                
                     </tr>
                     
                      <tr>
                       <td> <label></label> </td>
                       <td><input type="submit" class="save" value="Save"> </td>                
                     </tr>
                     
                     
                 </tbody>
            </table>
          </form>
          <div style="clear:both;" > </div>
          <p>
             <a href="StudentController" >Back to List</a>
          </p>
         </div>
   </div>
    
</body>

</html>