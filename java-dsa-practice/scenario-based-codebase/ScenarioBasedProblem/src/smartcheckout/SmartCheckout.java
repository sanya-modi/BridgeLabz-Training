package smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue = new LinkedList<>();
    private HashMap<String, Integer> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    // Initialize items
    public SmartCheckout() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Eggs", 10);
        priceMap.put("Rice", 60);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 20);
        stockMap.put("Rice", 5);
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer added to queue: " + customer.name);
    }

    // Process billing
    public void processCheckout() {

        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("\nBilling Customer: " + customer.name);

        for (String item : customer.items) {

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not available.");
                continue;
            }

            int stock = stockMap.get(item);

            if (stock <= 0) {
                System.out.println(item + " is out of stock.");
                continue;
            }

            int price = priceMap.get(item);
            totalBill += price;
            stockMap.put(item, stock - 1);

            System.out.println(item + " - ₹" + price);
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }

    // Display stock
    public void displayStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " → " + stockMap.get(item));
        }
    }
}