package Day12_Assessments.Hospital;

import java.io.Serializable;

class Patient implements Serializable {
    int id;
    String name;
    String disease;
    int age;

    public Patient(int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + disease + " | Age: " + age);
    }
}
