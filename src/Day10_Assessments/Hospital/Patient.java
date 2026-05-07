package Day10_Assessments.Hospital;

class Patient implements Comparable<Patient>{
	private final int id;
	private String name;
	private int age;
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.id, other.id);
	}
	
	@Override
	public String toString() {
		return "Patient{id=" + id + ", name='" + name + "', age=" + age + "}";
	}
}
