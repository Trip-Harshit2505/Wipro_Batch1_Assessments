package Day16_Assessments;
import java.util.Scanner;

import Day17_Assessments.Employee.env_data;

import java.sql.*;

public class InsertStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college",
					"root",
					env_data.PASSWORD);
			
			 System.out.print("Enter ID: ");
	         int id = sc.nextInt();
	         sc.nextLine();

	         System.out.print("Enter Name: ");
	         String name = sc.nextLine();

	         System.out.print("Enter Email: ");
	         String email = sc.nextLine();
	         
	         String query = "INSERT INTO students VALUES (?, ?, ?)";
	         
	         PreparedStatement ps = con.prepareStatement(query);
	         
	         ps.setInt(1, id);
	         
	         ps.setString(2, name);
	         
	         ps.setString(3, email);
	         
	         int rows = ps.executeUpdate();
	         
	         if(rows > 0) {
	        	 System.out.println("Data Inserted Successfully");
	         }
	         
	         con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
