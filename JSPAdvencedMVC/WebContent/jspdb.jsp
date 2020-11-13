<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <head>
        <title>Szulets </title>
        <style type="text/css">
            label{ margin-right:20px;}
            input{ margin-top:5px;}
        </style>
    </head>
    <body>
    
    <% 
    int aid = 5;
    String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
	String user = "hbstudent";
	String password = "hbstudent"; 
	String sql = "SELECT * FROM Alien.aliens where idaliens = ?";
	
    Class.forName("com.mysql.jdbc.Driver"); 
    Connection con = DriverManager.getConnection(url, user, password);
    PreparedStatement prep = con.prepareStatement(sql);
    
    prep.setInt(1, aid);
    ResultSet res = prep.executeQuery();
    
    while(res.next()){
     out.println(res.getString(1));	
     out.println(res.getString(2));	
     out.println(res.getString(3));	
    }
    out.println("<br>");
    %>
    

     Time on the server <%= new java.util.Date() %>	
    </body>
</html>