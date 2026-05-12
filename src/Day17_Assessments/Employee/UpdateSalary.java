package Day17_Assessments.Employee;
import java.sql.*;

public class UpdateSalary {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", 
					env_data.PASSWORD);
			
			String query = "UPDATE employee SET salary = ? WHERE  id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, 80000);
            ps.setInt(2, 101);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record updated");

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
