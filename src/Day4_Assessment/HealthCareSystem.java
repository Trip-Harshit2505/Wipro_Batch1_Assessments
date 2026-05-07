package Day4_Assessment;

class Patient{
	private int id;
	private String name;
	private int age;
	private String illness;
	
	public void set(int id, String name, int age, String illness) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.illness = illness;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public void getDetails() {
		System.out.println("===== Patient Details =====");
		System.out.println("ID: " + this.id);
		System.out.println("Patient Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Illness: " + this.illness);
	}
}

interface PatientService {
	void registerPatient(Patient p);
	void showPatient(int id);
}

class PatientServiceImpl implements PatientService{
	private Patient[] patients = new Patient[10];
	private int cnt = 0;
	
	@Override
	public void registerPatient(Patient patient) {
		if(cnt < patients.length) {
			patients[cnt] = patient;
			cnt++;
			System.out.println("Patient registered Sucessfully!!");
		}
		else {
			System.out.println("Cannot add more patients!!");
		}
	}
	
	@Override
	public void showPatient(int id) {
		boolean found = false;
		
		for(int i = 0; i < cnt; i++) {
			if(patients[i].getId() == id) {
				patients[i].getDetails();
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Patient not found");
		}
	}
}

abstract class Doctor {
	protected String name;
	protected String specialization;
	
	public void setDetails(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	
	public abstract void diagnose(Patient p);
}

class GeneralPhysician extends Doctor{
	
	@Override
	public void diagnose(Patient p) {
		System.out.println(name + " (" + specialization + ") " + "is diaganosing the patient with illness: " + p.getIllness());
	}
}

class Cardiologist extends Doctor {
	
	@Override
	public void diagnose(Patient p) {
		if (p.getIllness().toLowerCase().contains("heart")) {
            System.out.println(name + " (" + specialization + ") " + ": Heart issue detected!");
        } else {
            System.out.println(name + " (" + specialization + ") " + ": Refer to General Physician.");
        }
	}
}



public class HealthCareSystem {

	public static void main(String[] args) {
		
		PatientService service = new PatientServiceImpl();

        // Creating Patients
        Patient p1 = new Patient();
        p1.set(1, "Rahul", 25, "Fever");
        Patient p2 = new Patient();
        p2.set(2, "Amit", 45, "Heart Pain");

        service.registerPatient(p1);
        service.registerPatient(p2);

        service.showPatient(1);
        service.showPatient(2);

        Doctor d1 = new GeneralPhysician();
        d1.setDetails("Dr. Gulati", "GP");
        Doctor d2 = new Cardiologist();
        d2.setDetails("Dr. Saluke", "Cardiologist");

        d1.diagnose(p1);
        d1.diagnose(p2);

        d2.diagnose(p1);
        d2.diagnose(p2);

	}

}
