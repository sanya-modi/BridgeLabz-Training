package hospital_management_system;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor Id : " + doctorId);
        System.out.println("Doctor Name : " + name);
        System.out.println("Specialization : " + specialization);
    }
}
