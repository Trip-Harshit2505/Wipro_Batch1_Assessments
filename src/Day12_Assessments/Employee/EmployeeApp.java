package Day12_Assessments.Employee;
import java.io.*;

class Employee implements Serializable {
	private int id;
	private String name;
	private double salary;
	String path = "src/Day12_Assessments/Employee";
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(id + " - " + name + " - " + salary);
	}
}

public class EmployeeApp {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Employee e1 = new Employee(1, "Trump", 500000);
		
		//Serialization
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(e1.path + "/emp.dat", true)))
		{
			oos.writeObject(e1);
			
			System.out.println("Employee saved!!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Deserialization
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(e1.path + "/emp.dat")))
		{
			Employee e2 = (Employee) ois.readObject();
			
			System.out.println("\nEmployee Loaded: ");
			e2.display();
		}

	}

}
