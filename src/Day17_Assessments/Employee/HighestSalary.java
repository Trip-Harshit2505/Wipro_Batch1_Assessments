package Day17_Assessments.Employee;
import java.sql.*;

public class HighestSalary {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			String query = "SELECT * FROM employee ORDER BY salary DESC LIMIT 1";

            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(query);

            if(rs.next()) {

                System.out.println(
                        rs.getString("name") +
                        " -> " +
                        rs.getDouble("salary"));
            }

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
