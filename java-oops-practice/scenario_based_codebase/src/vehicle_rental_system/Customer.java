package vehicle_rental_system;

public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        vehicle.displayInfo();
        double amount = vehicle.calculateRent(days);
        System.out.println("Rented for " + days + " days");
        System.out.println("Total Rent : " + amount);
    }
}
