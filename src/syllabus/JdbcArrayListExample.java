package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// A simple Student class
class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}

public class JdbcArrayListExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/jdbc_db"; // Replace with your DB details
        String user = "root"; // Replace with your username
        String password = "pradip@123" + ""; // Replace with your password

        List<Student> students = new ArrayList<>();

        try {
            // 1. Load the JDBC driver (optional for newer JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // 3. Create statement
            Statement stmt = conn.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT id, name, marks FROM student");

            // 5. Iterate result set and store in ArrayList
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                Student student = new Student(id, name, marks);
                students.add(student);
            }

            // 6. Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

		
		  // 7. Use the ArrayList after DB is closed
        for (Student s : students) {
		  System.out.println(s); }
		 
    }
}
