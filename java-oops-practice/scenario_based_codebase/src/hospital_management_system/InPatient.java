package hospital_management_system;

public class InPatient extends Patient {

    private int roomNumber;
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(int patientId, String name, int age,
                     int roomNumber, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public double getRoomChargePerDay() {
        return roomChargePerDay;
    }

    public double calculateRoomCharges() {
        return daysAdmitted * roomChargePerDay;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- In Patient Details ----");
        System.out.println("Patient Id : " + getPatientId());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Days Admitted : " + daysAdmitted);
    }
}
