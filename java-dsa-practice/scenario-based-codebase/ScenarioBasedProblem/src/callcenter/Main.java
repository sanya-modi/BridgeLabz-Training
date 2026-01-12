package callcenter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerQueue queue = new CustomerQueue();

        // Ask number of customers to add
        System.out.print("Enter number of customers to add: ");
        int addCount = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= addCount; i++) {
            System.out.println("\nCustomer " + i);

            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Is VIP? (true/false): ");
            boolean isVIP = sc.nextBoolean();
            sc.nextLine();

            queue.add(name, isVIP);
        }
        
        //Display Queue after adding
        System.out.println("\n--- Queue State After Adding---");
        queue.displayVIPQueue();
        queue.displayNormalQueue();

        // Ask number of customers to serve
        System.out.print("\nEnter number of customers to serve: ");
        int serveCount = sc.nextInt();

        System.out.println("\n--- Serving Customers ---");
        for (int i = 1; i <= serveCount; i++) {
            queue.remove();
        }

        // Final state
        System.out.println("\n--- Final Queue State ---");
        queue.displayVIPQueue();
        queue.displayNormalQueue();

        System.out.println("\n--- Call Count Data ---");
        queue.displayCallCount();

        sc.close();
    }
}
