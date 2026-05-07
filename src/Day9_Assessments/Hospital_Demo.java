package Day9_Assessments;

class Patient {
    String name;
    Patient next;

    public Patient(String name) {
        this.name = name;
        this.next = null;
    }
}

class HospitalQueue {
    private Patient head;
    private Patient tail;

    public void addPatient(String name) {
        Patient newPatient = new Patient(name);
        if (head == null) {
            head = tail = newPatient;
        } else {
            tail.next = newPatient;
            tail = newPatient;
        }
        System.out.println("Patient " + name + " added to the end of the queue.");
    }

    //emergency
    public void addEmergency(String name) {
        Patient newPatient = new Patient(name);
        if (head == null) {
            head = tail = newPatient;
        } else {
            newPatient.next = head;
            head = newPatient;
        }
        System.out.println("EMERGENCY: Patient " + name + " moved to the front.");
    }

    public void removePatient() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Patient " + head.name + " has been treated and removed.");
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void viewAllPatients() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Patient current = head;
        System.out.print("Current Queue: ");
        while (current != null) {
            System.out.print("[" + current.name + "]" + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public void checkFirstAndLast() {
        String first = (head != null) ? head.name : "None";
        String last = (tail != null) ? tail.name : "None";
        System.out.println("First in queue: " + first + " | Last in queue: " + last);
    }
}

public class Hospital_Demo {

	public static void main(String[] args) {
		HospitalQueue hospital = new HospitalQueue();

        hospital.addPatient("Alice");
        hospital.addPatient("Bob");
        hospital.addEmergency("Charlie"); //emergency-case
        hospital.addPatient("David");

        hospital.viewAllPatients();
        hospital.checkFirstAndLast();

        
        hospital.removePatient();
        hospital.viewAllPatients();

	}

}
