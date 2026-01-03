package vehicle_rental_system;

public class Truck extends Vehicle {

    private double loadChargePerDay;

    public Truck(int vehicleId, String brand, double baseRate, double loadChargePerDay) {
        super(vehicleId, brand, baseRate);
        this.loadChargePerDay = loadChargePerDay;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (loadChargePerDay * days);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck ID : " + vehicleId);
        System.out.println("Brand : " + brand);
        System.out.println("Base Rate : " + baseRate);
        System.out.println("Load Charge/Day : " + loadChargePerDay);
    }
}
