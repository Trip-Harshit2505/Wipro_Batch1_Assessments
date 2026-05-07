package Day3_Assessment;

class Salary {
	private double salary;
	
	public void set(double salary) {
		this.salary = salary;
	}
	
	public void get() {
		System.out.println(this.salary);
	}
}

public class Employee {
	
	public static void main(String[] args) {
		Salary s = new Salary();
		s.set(12540.25);
		s.get();
	}
}
