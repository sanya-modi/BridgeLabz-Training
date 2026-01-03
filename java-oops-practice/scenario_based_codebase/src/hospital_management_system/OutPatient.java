package hospital_management_system;

public class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Out Patient Details ----");
        System.out.println("Patient Id : " + getPatientId());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Consultation Fee : " + consultationFee);
    }
}
