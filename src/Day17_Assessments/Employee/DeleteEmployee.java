package Day17_Assessments.Employee;
import java.sql.*;

public class DeleteEmployee {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			String query =
                    "DELETE FROM employee WHERE id = ?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, 105);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record deleted");

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
