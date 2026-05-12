package Day17_Assessments.Employee;
import java.sql.*;

public class CRUD_Ex {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db", 
					"root", env_data.PASSWORD);
			
			Statement st = con.createStatement();			
			
			//CREATE
			st.executeUpdate("INSERT INTO employee VALUES (110,'Karan','IT',45000)");
			
			//READ
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name"));
            }
            
            //UPDATE
            st.executeUpdate("UPDATE employee SET salary=70000 WHERE id=110");
            
            //DELETE
            st.executeUpdate(
                    "DELETE FROM employee WHERE id=110");

            System.out.println("CRUD Operations Completed");

            con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
