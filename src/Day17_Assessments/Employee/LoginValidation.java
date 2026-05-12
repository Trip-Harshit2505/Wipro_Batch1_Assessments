package Day17_Assessments.Employee;
import java.sql.*;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			System.out.print("Enter Username: ");
            String uname = sc.next();

            System.out.print("Enter Password: ");
            String pass = sc.next();

			
			String query = "SELECT * FROM users WHERE username = ? AND password = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Invalid Credentials");
            }

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
