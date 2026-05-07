package Day10_Assessments.HashMap;

public class Hospital {

	public static void main(String[] args) {
		HospitalSystem hs = new HospitalSystem();

        hs.addPatient(new Patient(101, "Trump", 25));
        hs.addPatient(new Patient(102, "Alexa", 30));
        hs.addPatient(new Patient(101, "Boomer", 40));

        hs.getPatient(101);
        hs.updatePatient(101, "Trump Updated", 26);

        hs.exists(102);

        hs.listPatients();

        hs.removePatient(102);

        hs.countPatients();

        hs.clearAll();
	}

}
