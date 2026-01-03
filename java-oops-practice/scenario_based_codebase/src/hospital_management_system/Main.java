package hospital_management_system;

public class Main {
    public static void main(String[] args) {

        // Polymorphism
        Patient patient = new InPatient(
                101, "Sanya", 21,
                305, 4, 2000
        );

        Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");
        patient.assignDoctor(doctor);

        Bill bill = new Bill(
                5001,
                3000,   // base amount
                10,     // tax %
                500,    // discount
                patient
        );

        patient.setBill(bill);

        patient.displayInfo();
        doctor.displayDoctorDetails();

        Payable payable = bill;
        System.out.println("Total Bill Amount : " + payable.calculatePayment());
    }
}
