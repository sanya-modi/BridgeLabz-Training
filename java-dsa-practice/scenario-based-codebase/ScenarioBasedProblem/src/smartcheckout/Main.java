package smartcheckout;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        while (true) {
            System.out.println("\n===== SMART CHECKOUT MENU =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Checkout");
            System.out.println("3. View Stock");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter items (comma separated): ");
                    String[] itemArray = sc.nextLine().split(",");

                    List<String> items = new ArrayList<>();
                    for (String item : itemArray) {
                        items.add(item.trim());
                    }

                    checkout.addCustomer(new Customer(name, items));
                    break;

                case 2:
                    checkout.processCheckout();
                    break;

                case 3:
                    checkout.displayStock();
                    break;

                case 4:
                    System.out.println("Checkout Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
	
}
