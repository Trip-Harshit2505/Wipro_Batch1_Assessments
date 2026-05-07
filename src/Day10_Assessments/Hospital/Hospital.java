package Day10_Assessments.Hospital;

public class Hospital {

	public static void main(String[] args) {
		HospitalSystem hs = new HospitalSystem();
		
		hs.registerPatient(new Patient(104, "Rohit", 27));
		hs.registerPatient(new Patient(102, "Samarth", 36));
		hs.registerPatient(new Patient(101, "Trump", 52));
		hs.registerPatient(new Patient(102, "Samarth", 36));
	
		hs.displayPatients();

	}

}
