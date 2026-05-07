package Day3_Assessment;

class Patient{
	private String patientName = "Trump";
	private String healthInfo = "Mental";
	
	public void displayHealth() {
		System.out.println("Patient " + this.patientName + " is " + this.healthInfo);
	}
}

public class Hospital {

	public static void main(String[] args) {
		Patient p = new Patient();
		p.displayHealth();
	}

}
