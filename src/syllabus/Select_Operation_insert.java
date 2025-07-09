package syllabus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class ramayan {
    int empid;
    String empname;
    float salary;

    ramayan(int empid, String empname, float salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
    }
}

public class Select_Operation_insert {
    public static void main(String[] args) {

        List<ramayan> l1 = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "pradip@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, username, password)) {

               

                // 1. Fetch all data from emp
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT empid, empname, salary FROM emp");

                while (rs.next()) {
                    int id = rs.getInt("empid");
                    String name = rs.getString("empname");
                    float salary = rs.getFloat("salary");

                    ramayan e1 = new ramayan(id, name, salary);
                    l1.add(e1);
                }

                rs.close();
                st.close();

                // 2. Insert into empbackup, REPLACE avoids duplicate PK error
                String insertQuery = "insert INTO empbackup (empid, empname, salary) VALUES (?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(insertQuery);

                for (ramayan e : l1) {
                    ps.setInt(1, e.empid);
                    ps.setString(2, e.empname);
                    ps.setFloat(3, e.salary);

                    int i = ps.executeUpdate();
                    if (i > 0) {
                        System.out.println("Inserted: " + e);
                    } else {
                        System.out.println("Failed to insert: " + e);
                    }
                }

                ps.close();

                // Commit transaction
                con.commit();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All Employees: ");
        for (ramayan e : l1) {
            System.out.println(e);
        }
    }
}
