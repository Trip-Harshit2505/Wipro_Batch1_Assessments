package Day9_Assessments.Set_Example;
import java.util.*;

class Patient{
	int patientID;
	String name;
	int age;
	
	public Patient(int patientID, String name, int age) {
		this.patientID = patientID;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.patientID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Patient)) {
			return false;
		}
		
		Patient p = (Patient) obj;
		return this.patientID == p.patientID;
	}
	
	@Override
	public String toString() {
		return "{ID: " + patientID + ", Name: " + name + "}";
	}
}

class PatientRegistration{
	private HashSet<Patient> registeredIDs;
	private Patient[] registeredPatients;
	
	public PatientRegistration() {
		this.registeredIDs = new HashSet<>();
	}
	
	public void registerPatient(int patientID, String name, int age) {
		Patient newPatient = new Patient(patientID, name, age);
		
		if(registeredIDs.add(newPatient)) {
			System.out.println("Patient with Name: " + name + " and ID " + patientID + " successfully added.");
		}
		else {
			System.out.println("Patient with ID " + patientID + " is already registered.");
		}
	}
	
	public void viewRegisteredPatients() {
		if(registeredIDs.isEmpty()) {
			System.out.println("There are currently no patients.");
		}
		else {
			System.out.println("\n****** Patient IDs ******");
			for (Patient p : registeredPatients) {
                System.out.println(p.toString());
            }
			System.out.println("Total number of Patients: " + registeredIDs.size());
		}
		
	}
}

public class Hospital_EX {

	public static void main(String[] args) {
		PatientRegistration pr = new PatientRegistration();
		
		Scanner sc = new Scanner(System.in);
		
		boolean running = true;
		
		System.out.println("Welcome to Hospital Registration System");
		
		while(running) {
			System.out.println("\nMenu:");
            System.out.println("1. Register New Patient (Unique ID)");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            
            int choice = sc.nextInt();
            
            switch(choice) {
            	case 1 : 
            		System.out.println("Enter Unique Patient ID: ");
            		int id = sc.nextInt();
                    sc.nextLine(); // Clear the buffer
                    System.out.println("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Patient Age: ");
                    int age = sc.nextInt();
            		pr.registerPatient(id, name, age);
            		break;
            	
            	case 2 : 
            		pr.viewRegisteredPatients();
            		break;
            	
            	case 3 : 
            		running = false;
            		System.out.println("Bye Bye!!");
            		break;
            	
            	default:
            		System.out.println("Invalid choice. Please try again.");
            }
		}
		
		sc.close();
	}

}
