
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
			 Class.forName("com.mysql.jdbc.Driver"); // class formname telusko
	         Connection con = DriverManager.getConnection(url,uname,pass);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
