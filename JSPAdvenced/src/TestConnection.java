
import java.sql.*;
/*
 * import sql language package 
 * load + register the driver jdbc connection com.mysql.connectior.jar
 * Create connectntion
 * creaet statement 
 * execuete the query
 * process results 
 * close 
 * 
 */

public class TestConnection {

	public static void main(String[] args)  {
		
		try {
			 String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
			 String uname = "hbstudent";
			 String pass = "hbstudent";
			 
			 String query = "SELECT * FROM Alien.aliens where idaliens = 1";
			 Class.forName("com.mysql.jdbc.Driver"); // class formname telusko
	         Connection con = DriverManager.getConnection(url,uname,pass);
			 Statement stat = con.createStatement();
	
			 ResultSet res =  stat.executeQuery(query);
			 
			 while(res.next()) {
				 
				 String aname  = res.getString("aname");
				 String tech  = res.getString("tech");
				 int    id  = res.getInt(1);
				 				 
				 System.out.println("id. " + id +  "   Alien neve " + aname+ " " + " A technologia " + tech );
			 }
			 
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
