package hospital_management_system;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    private Doctor doctor;   // HAS-A
    private Bill bill;       // HAS-A

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Bill getBill() {
        return bill;
    }

    // association methods
    public void assignDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    // polymorphic behavior
    public abstract void displayInfo();
}
