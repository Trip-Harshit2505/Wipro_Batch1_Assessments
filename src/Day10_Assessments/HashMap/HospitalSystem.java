package Day10_Assessments.HashMap;
import java.util.*;

public class HospitalSystem {
	
	HashMap<Integer, Patient> patientMap = new HashMap<>();
	
	public void addPatient(Patient p) {
		if(patientMap.containsKey(p.getId())) {
			System.out.println("Patient with ID: " + p.getId() + " already registered");
		} else {
			patientMap.put(p.getId(), p);
			System.out.println("Patient added: " + p);
		}
	}
	
	public void updatePatient(int id, String name, int age) {
		Patient p = patientMap.get(id);
		
		if(p != null) {
			p.setName(name);
			p.setAge(age);
			System.out.println("Patient updated: " + p);
		} else {
			System.out.println("Patient not found");
		}
	}
	
	public void getPatient(int id) {
		Patient p = patientMap.get(id);
		if(p != null) {
			System.out.println("Found: " + p);
		} else {
			System.out.println("Patient not found");
		}
	}
	
	public void removePatient(int id) {
		Patient p = patientMap.get(id);
		if(p != null) {
			patientMap.remove(p);
			System.out.println(p + " removed successfully");
		} else {
			System.out.println("Patient not found");
		}
	}
	
	public void listPatients() {
		System.out.println("\n****Patients List****");
		for(Map.Entry<Integer, Patient> mpp : patientMap.entrySet()) {
			System.out.println(mpp.getKey() + " - " + mpp.getValue());
		}
		System.out.println();
	}
	
	public void exists(int id) {
		System.out.println(patientMap.containsKey(id) ? "Patient exists" : "Patient not found");
	}
	
	public void countPatients() {
		System.out.println("Total Patients: " + patientMap.size());
	}
	
	public void clearAll() {
		patientMap.clear();
		System.out.println("All records cleared successfully");
	}

}
