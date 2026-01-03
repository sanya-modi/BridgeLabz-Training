package vehicle_rental_system;

public class Bike extends Vehicle {

    public Bike(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike ID : " + vehicleId);
        System.out.println("Brand : " + brand);
        System.out.println("Base Rate : " + baseRate);
    }
}
