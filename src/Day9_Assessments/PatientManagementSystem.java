package Day9_Assessments;
import java.util.*;

class Patients{
	String name;
	int age;
	String disease;
	
	public Patients(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
}

public class PatientManagementSystem {
	
	public static void addPatient(ArrayList<Patients> li, String name, int age, String disease) {
		li.add(new Patients(name, age, disease));
	}
	
	public static void displayPatients(ArrayList<Patients> li) {
		for(Patients p: li) {
			System.out.println("Patient Name: " + p.name + ", Age: " + p.age + ", Disease: " + p.disease);
		}
	}
	
	public static void searchPatient(ArrayList<Patients> li, String name) {
		boolean found = false;
		
		for(Patients p : li) {
			if(p.name.equalsIgnoreCase(name)) {
				System.out.println("Patient found");
				System.out.println("Patient Name: " + p.name + ", Age: " + p.age + ", Disease: " + p.disease);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Patient not found");
		}
	}

	public static void main(String[] args) {
		ArrayList<Patients> patients = new ArrayList<>();
		
		 addPatient(patients, "Sudhir", 45, "Heart");
	     addPatient(patients, "Aman", 30, "Fever");
	     addPatient(patients, "Riya", 25, "Cold");

	     
	     System.out.println("All Patients:");
	     displayPatients(patients);

	     System.out.println("\nSearch Result:");
	     searchPatient(patients, "Aman");

	}

}
