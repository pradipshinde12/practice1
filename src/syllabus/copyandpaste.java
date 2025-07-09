package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class copyandpaste{
	public static void main(String args[])
	{
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String password ="pradip@123";
		String query="insert into empbackup values (?,?,?)";

		try
		{
			//load and register the Driver class
			
			Class.forName(path);
			//create a connection 
			
		 Connection con=DriverManager.getConnection(url, username, password);

			
		  PreparedStatement ps =con.prepareStatement(query);
		  ps.setInt(1, 211);
		  ps.setString(2, "varun");
		  ps.setFloat(3, 400000);
		   int i=ps.executeUpdate();
		   
		   if(i>0)
		   {
			   System.out.print("data Added Successfully");
		   }
		   else
		   {
			   System.out.print("data  not Added Successfully"); 
		   }
		   
		   ps.close();
		   con.close();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		

	}

}
