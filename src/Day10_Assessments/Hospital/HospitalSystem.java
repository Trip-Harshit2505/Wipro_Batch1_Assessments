package Day10_Assessments.Hospital;
import java.util.*;

public class HospitalSystem {
	
	private TreeSet<Patient> patients;
	
	public HospitalSystem() {
		patients = new TreeSet<>();
	}
	
	public void registerPatient(Patient p) {
		boolean added = patients.add(p);
		
		if(!added) {
			System.out.println("Patient with ID: " + p.getId() + " already registered");
		} else {
			System.out.println("Patient added: " + p);
		}
	}
	
	public void displayPatients() {
		System.out.println("\n****Registered Patients****");
		for(Patient p : patients) {
			System.out.println(p.toString());
		}
	}

}
