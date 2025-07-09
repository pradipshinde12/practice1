package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_operation {

    public static void main(String[] args) {

        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "pradip@123";
        String query = "UPDATE emp SET empname = ? WHERE empid = ?";

        try {
            // Load and register the Driver class
            Class.forName(path);

            // Create a connection 
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set parameters in correct order
            ps.setString(1, "atul sir"); // empname
            ps.setInt(2, 204);           // empid

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Data updated Successfully");
            } else {
                System.out.println("Data not updated Successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
