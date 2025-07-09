package syllabus;

import  java.sql.*;
import java.util.ArrayList;
import java.util.List;

class emp{
	
	int empid;
	String empname;
	float salary;
	
	emp(int empid, String empname, float salary)
	{
		 this.empid=empid;
		  this.empname=empname;
		  this.salary=salary;
	}

	@Override
	public String toString() 
	{
		return "emp [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}

public class Select_Operation {
	public static void main(String args[])
	{
		List<emp> l1=new ArrayList<emp>();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pradip@123");
			
			 Statement st =  con.createStatement();
			 
			 ResultSet rs= st.executeQuery("select empid,empname,salary from emp");
			 
			 
			 while(rs.next())
			 {
				 int id=rs.getInt("empid");
				 String name= rs.getString("empname");
				 float salary=rs.getFloat("salary");
				 
				 emp e1=new emp(id, name, salary);
				 l1.add(e1);
				 
			 }
			 
			 
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		for(emp e: l1)
		{
			System.out.println(e);
		}
		
	}

}
