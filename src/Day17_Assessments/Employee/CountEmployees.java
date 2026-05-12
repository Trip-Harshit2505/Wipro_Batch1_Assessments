package Day17_Assessments.Employee;
import java.sql.*;

public class CountEmployees {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			String query =
                    "SELECT COUNT(*) AS Total FROM employee";

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			if(rs.next()) {

                System.out.println(
                        "Total Employees: " +
                        rs.getInt("total"));
            }

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
