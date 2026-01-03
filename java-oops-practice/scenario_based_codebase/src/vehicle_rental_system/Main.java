package vehicle_rental_system;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Sanya");

        Vehicle bike = new Bike(101, "Honda", 300);
        Vehicle car = new Car(102, "Hyundai", 1200, 2000);
        Vehicle truck = new Truck(103, "Tata", 2000, 500);

        customer.rentVehicle(bike, 3);
        System.out.println("-------------------");

        customer.rentVehicle(car, 2);
        System.out.println("-------------------");

        customer.rentVehicle(truck, 4);
    }
}
