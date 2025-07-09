package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_operation {

    public static void main(String[] args) {

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "pradip@123";

        // DELETE query
        String query = "DELETE FROM emp WHERE empid = ?";

        try {
            // Load and register the Driver class
            Class.forName(path);

            // Create a connection 
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set empid to delete
            ps.setInt(1, 204); // This will delete the row where empid is 204

            // Execute delete
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Data deleted Successfully");
            } else {
                System.out.println("No record found to delete");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
