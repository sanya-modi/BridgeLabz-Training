package sorting.medwarehouse;

public class Medicine {

    int medicineId;
    String name;
    int expiryDays; // days remaining till expiry

    public Medicine(int medicineId, String name, int expiryDays) {
        this.medicineId = medicineId;
        this.name = name;
        this.expiryDays = expiryDays;
    }

    public void display() {
        System.out.println(
                "ID: " + medicineId +
                ", Name: " + name +
                ", Expiry in days: " + expiryDays
        );
    }
}

