package syllabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ten_objedcts {
    public static void main(String args[]) {
        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "pradip@123";
        String query = "insert into emp values (?, ?, ?)";

        // Array of 10 employee records: {id, name, salary}
        Object[][] employees = {
            {201, "Amit Kumar", 35000f},
            {202, "Sunil Rao", 42000f},
            {203, "Rohan Dede", 30000f},
            {204, "Sneha Patil", 38000f},
            {205, "Priya Sharma", 41000f},
            {206, "Rajesh K", 36000f},
            {207, "Anjali Mehta", 39000f},
            {208, "Vikram Singh", 44000f},
            {209, "Nisha Jain", 37000f},
            {210, "Deepak Joshi", 40000f}
        };

        try {
            // Load and register the Driver class
            Class.forName(path);

            // Create a connection 
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            // Insert all 10 records using loop
            for (Object[] emp : employees) {
                ps.setInt(1, (Integer) emp[0]);
                ps.setString(2, (String) emp[1]);
                ps.setFloat(3, (Float) emp[2]);

                int i = ps.executeUpdate();
                if (i > 0) {
                    System.out.println("Data added successfully for: " + emp[1]);
                } else {
                    System.out.println("Failed to add data for: " + emp[1]);
                }
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
