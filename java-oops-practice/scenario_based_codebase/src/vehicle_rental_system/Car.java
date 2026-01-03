package vehicle_rental_system;

public class Car extends Vehicle {

    private double luxuryCharge;

    public Car(int vehicleId, String brand, double baseRate, double luxuryCharge) {
        super(vehicleId, brand, baseRate);
        this.luxuryCharge = luxuryCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car ID : " + vehicleId);
        System.out.println("Brand : " + brand);
        System.out.println("Base Rate : " + baseRate);
        System.out.println("Luxury Charge : " + luxuryCharge);
    }
}
