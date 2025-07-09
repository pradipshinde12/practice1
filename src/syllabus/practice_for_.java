package syllabus;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

class Student1
 {
	  int id;
	  String  name;
	  float  marks;
	  
	  Student1( int id, String name, float marks)
	  {
		  this.id=id;
		  this.name=name;
		  this.marks=marks;
	  }

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	  
	  
 }

public class practice_for_ 
{
	public static void main(String args[])
	{
		
		List<Student1> Students = new ArrayList<Student1>();
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pradip@123");
		 
		Statement sm=con.createStatement();
		
		ResultSet rs =sm.executeQuery("select id,  name, marks from student");
		
		while (rs.next()) {
		    int id = rs.getInt("id");
		    String name = rs.getString("name");
		    float marks = rs.getFloat("marks");

		    Student1 s1 = new Student1(id, name, marks);
		    Students.add(s1);  // ✅ Correct
		}

		// 6. Close resources
        rs.close();
        sm.close();
        con.close();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		 for(Student1 s : Students)
		 {
			 System.out.println(s);
		 }
		
		
	}

}
