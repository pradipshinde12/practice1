package jdbc_practice;

import java.sql.*;
public class insert 
{
	public static void main(String args[])
	{
		
		String url="jdbc:mysql://localhost:3306/jdbc_db";
		String uname="root";
		String password="pradip@1234.";
		String query="insert into emp2 values(?,?,?)";
		try
		{
			// load the register
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection con= DriverManager.getConnection(url,uname, password);
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,301);
			ps.setString(2, "kalu");
			ps.setInt(3, 99990);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("data added success");
			}
			else
			{
				System.out.println(" data insertiin failed");
			}
			
		}catch (Exception e)
		{
			e.printStackTrace();
			
		
		}
	}

}
