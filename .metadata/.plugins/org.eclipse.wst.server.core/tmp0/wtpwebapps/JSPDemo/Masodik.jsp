<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<html>
    <head>
        <title>Eletkor Szamito Eredmény</title>
        <style type="text/css">
            label{ margin-right:20px;}
            input{ margin-top:5px;}
        </style>
    </head>
    <body>
       <%@ page import="java.time.LocalDate" %>
        <%@ page import="java.time.Month" %>
        <%@ page import="java.time.Period" %>
        <%@ page import="java.time.temporal.ChronoUnit" %>
        <%
        
        String ev =request.getParameter("Ev");
        int szam = 0;
         
        try {   
         szam= Integer.parseInt(ev.trim());
         if(szam > 0  && szam < 120)
         {
        	 LocalDate birthday = LocalDate.of(szam, 1, 1);
        	 LocalDate now = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), 1, 1);
        	 // using period
        	 Period period = Period.between(birthday, now);
        	 szam = period.getYears();
         }
         else if (szam < -1)
         {
        	 out.println("Negativ ertek adtal meg !! Meg sem születtél");
        	 szam = 0;
         } 
         else if (szam > 120)
         {
        	 out.println("Kicsit idös vagy");
        	 szam = 0;
         }    
         else {
        	 out.println("Nulla eves vagy? :)");
        	 szam = 0; 
        	 %>
        	 
        	 <form method="upd.jsp" action="post">
        	    
        	    <input type="hidden" name="vissza" value="${ev}">
        	</form>
        	
         <%	
          }
        }
        catch (NumberFormatException e) {
        	out.println("Hiba!! Nem Evet adtal meg!!");
        }
       // szam = 7;
        %>
        
        
        <form action="Elso.jsp" method="post">
            <fieldset>
                <legend>Mikor születtél (Év)</legend>
                <label>Év: <%=szam%></label>
            </fieldset>
        </form>
    </body>
</html>