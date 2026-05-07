package Day10_Assessments.TreeMap;

import Day10_Assessments.HashMap.HospitalSystem;
import Day10_Assessments.HashMap.Patient;

public class Hospital {

	public static void main(String[] args) {
		HospitalSystem hs = new HospitalSystem();

        hs.addPatient(new Patient(103, "Trump", 25));
        hs.addPatient(new Patient(102, "Alexa", 30));
        hs.addPatient(new Patient(101, "Boomer", 40));
        hs.addPatient(new Patient(102, "Dinesh", 49));

        hs.getPatient(101);
        hs.updatePatient(103, "Trump Updated", 26);

        hs.exists(102);

        hs.listPatients();

        hs.removePatient(102);

        hs.countPatients();

        hs.clearAll();

	}

}
