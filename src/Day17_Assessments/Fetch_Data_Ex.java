package Day17_Assessments;

import java.sql.*;

import Day17_Assessments.Employee.env_data;

public class Fetch_Data_Ex {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college", 
					"root", env_data.PASSWORD);

			String query = "insert into students values(?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 2);
	         
	         ps.setString(2, "Gaurav");
	         
	         ps.setString(3, "gaurav@example.com");
			int rows = ps.executeUpdate();

			System.out.println(rows + " row inserted ");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
