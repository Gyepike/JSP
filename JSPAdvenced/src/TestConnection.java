
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
 * Statment type
 * 
 *  Nomalma stament + varibale bad
 *  PreperedStament 
 * 
 *  CallableStatement PL/SQL Stroe oprocedure 
 * 
 * 
 */

public class TestConnection {

	public static void main(String[] args)  {
		
		try {
			 String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
			 String uname = "hbstudent";
			 String pass = "hbstudent";
			 
			 int  aid = 7;
			 String name = "Ali";
			 String skill = "Repuloszonyeg";
			 
			 int  aid2 = 8;
			 String name2 = "Ali";
			 String skill2 = "Repuloszonyeg";
			 
			 
			 String query = "SELECT * FROM Alien.aliens where idaliens = 2";
			 String query2 = "SELECT * FROM Alien.aliens";
			 String query3 = "INSERT INTO Alien.aliens VALUES ("+ aid + ", '"+name+"', '"+skill +"')";  // normal way 			 
			 String query4 = "INSERT INTO Alien.aliens VALUES  (?, ?, ?) ";  // prepered statment 
			 
			 Class.forName("com.mysql.jdbc.Driver"); // class formname telusko
	         Connection con = DriverManager.getConnection(url,uname,pass);
			 Statement stat = con.createStatement(); // preperedStament
	
			 ResultSet res =  stat.executeQuery(query2);  
			 
			 while(res.next()) {
				 
				 String aname  = res.getString("aname");
				 String tech  = res.getString("tech");
				 int    id  = res.getInt(1);
				 				 
				 System.out.println("id. " + id +  "  Alien neve: " + aname+ " " + "A technologia " + tech );
			 }
			 
			 res =  stat.executeQuery(query);
			 res.next();
			 System.out.println(res.getString(2));
			 
			int count = stat.executeUpdate(query3); // normal stament
			System.out.println("A table "+count+" db rekord(ok) update");
			 
			 
		     PreparedStatement pstat = con.prepareStatement(query4); // prepered statment 
		     pstat.setInt(1, aid2);
		     pstat.setString(2, name2);
		     pstat.setString(3, skill2);
		     
		     count = pstat.executeUpdate();
		     System.out.println("A table "+count+" db rekord(ok) update");
			 stat.close();
			 con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
