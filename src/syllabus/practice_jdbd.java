package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class practice_jdbd
{
	public static void main(String args[])
	{
		try
		{
			 // load the and register the driver class 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 // create the connection 
			 
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pradip@123");
			 
			 // create the prepared statement  to insert the data 
			 PreparedStatement ps=con.prepareStatement("insert into pradip values(?,?)");
			  // set the values
			 ps.setString(1, "ravan");
			 ps.setString(2, "ra@gmail.com");
			 
			 // excute the sql query
			 int i=ps.executeUpdate();
			 // check if  i
			 if(i>0)
			 {
				 System.out.println(" data added successfully");
			 }
			 else
			 {
				 System.out.println(" data not add successfully");
			 }
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
			
		}
	}

}
