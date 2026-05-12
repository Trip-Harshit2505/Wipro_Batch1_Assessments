package Day17_Assessments.Employee;
import java.sql.*;

public class Insert_Data {

	public static void main(String[] args) {
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			String query = "INSERT INTO employee VALUES(?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			// Employee 1
            ps.setInt(1, 101);
            ps.setString(2, "Abhishek");
            ps.setString(3, "IT");
            ps.setDouble(4, 60000);
            ps.executeUpdate();

            // Employee 2
            ps.setInt(1, 102);
            ps.setString(2, "Rahul");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.executeUpdate();

            // Employee 3
            ps.setInt(1, 103);
            ps.setString(2, "Aman");
            ps.setString(3, "Finance");
            ps.setDouble(4, 70000);
            ps.executeUpdate();

            // Employee 4
            ps.setInt(1, 104);
            ps.setString(2, "Neha");
            ps.setString(3, "IT");
            ps.setDouble(4, 55000);
            ps.executeUpdate();

            // Employee 5
            ps.setInt(1, 105);
            ps.setString(2, "Priya");
            ps.setString(3, "Marketing");
            ps.setDouble(4, 40000);
            ps.executeUpdate();

            System.out.println("5 Employees Inserted");

            con.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
