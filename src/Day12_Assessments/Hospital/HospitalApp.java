package Day12_Assessments.Hospital;

import java.io.*;
import java.util.*;

public class HospitalApp {

    static final String PATH = "src/Day12_Assessments/Hospital/";
    static Scanner sc = new Scanner(System.in);

    public static void savePatient(Patient patient) throws IOException {
        File file = new File(PATH + "patients.dat");
        FileOutputStream fos = new FileOutputStream(file, true);

        ObjectOutputStream oos;

        if (file.length() == 0) {
            oos = new ObjectOutputStream(fos);
        } else {
            oos = new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            };
        }

        oos.writeObject(patient);
        oos.close();
        fos.close();
    }

    public static void viewPatients() throws Exception {
        File file = new File(PATH + "patients.dat");

        if (!file.exists()) {
            System.out.println("No patient records found!");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        System.out.println("\n--- Patient Records ---");

        try {
            while (true) {
                Patient p = (Patient) ois.readObject();
                if (p != null) {
                    p.display();
                }
            }
        } catch (EOFException e) {
            
        }

        ois.close();
    }

    public static void searchPatient(int searchId) throws Exception {
        File file = new File(PATH + "patients.dat");

        if (!file.exists()) {
            System.out.println("No data found!");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        boolean found = false;

        try {
            while (true) {
                Patient p = (Patient) ois.readObject();
                if (p.id == searchId) {
                    p.display();
                    found = true;
                    break;
                }
            }
        } catch (EOFException e) {}

        if (!found) {
            System.out.println("Patient not found!");
        }

        ois.close();
    }

    public static void generateReport(int searchId) throws Exception {
        File file = new File(PATH + "patients.dat");

        if (!file.exists()) {
            System.out.println("No data found!");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        boolean found = false;

        try {
            while (true) {
                Patient p = (Patient) ois.readObject();
                if (p.id == searchId) {

                    FileWriter fw = new FileWriter(PATH + "report_" + p.id + ".txt");

                    fw.write("----- Medical Report -----\n");
                    fw.write("Patient ID: " + p.id + "\n");
                    fw.write("Name: " + p.name + "\n");
                    fw.write("Age: " + p.age + "\n");
                    fw.write("Disease: " + p.disease + "\n");
                    fw.write("Treatment: Medicines + Rest\n");

                    fw.close();

                    System.out.println("Report Generated!");
                    found = true;
                    break;
                }
            }
        } catch (EOFException e) {}

        if (!found) {
            System.out.println("Patient not found!");
        }

        ois.close();
    }

    public static void main(String[] args) throws Exception {

        new File(PATH).mkdirs();

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Disease: ");
                    String disease = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    Patient p = new Patient(id, name, disease, age);
                    savePatient(p);

                    System.out.println("Patient Added!");
                    break;

                case 2:
                    viewPatients();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int searchId = sc.nextInt();
                    searchPatient(searchId);
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    int reportId = sc.nextInt();
                    generateReport(reportId);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
