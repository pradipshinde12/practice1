package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


class demo {
	int id;
	String name;
	float salary;

	public demo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class Select_operation {


	public static void main(String args[]) {
		List<demo> d = new ArrayList<demo>();

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String uname = "root";
		String password = "pradip@123";
		String query = "SELECT empid, empname, salary FROM emp";

		try {
			Class.forName(path);
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement ca = con.createStatement();

			ResultSet rs = ca.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String empname = rs.getString(2);
				Float salary = rs.getFloat(3);

				demo d1 = new demo(id, empname, salary);
				d.add(d1);
			}

			// Print the results to check
			for (demo emp : d) {
				System.out.println(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
