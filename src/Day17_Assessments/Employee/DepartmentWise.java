package Day17_Assessments.Employee;
import java.sql.*;

public class DepartmentWise {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			String query =
                    "SELECT * FROM employee WHERE department=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, "IT");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name"));
            }

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
