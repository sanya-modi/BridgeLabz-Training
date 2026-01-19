package bag_ball_organizer;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Bag> bags = new HashMap<>();

        while (true) {
            System.out.println("""
            TinyTown Bag-n-Ball Organizer
            1. Add Bag
            2. Add Ball to Bag
            3. Remove Ball from Bag
            4. Display Balls in a Bag
            5. Display All Bags & Ball Count
            6. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();

                    System.out.print("Enter Bag Color: ");
                    String color = sc.nextLine();

                    System.out.print("Enter Bag Capacity: ");
                    int capacity = sc.nextInt();
                    sc.nextLine();

                    bags.put(bagId, new Bag(bagId, color, capacity));
                    System.out.println("Bag added successfully.");
                }

                case 2 -> {
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();

                    Bag bag = bags.get(bagId);
                    if (bag == null) {
                        System.out.println("Bag not found.");
                        break;
                    }

                    System.out.print("Enter Ball ID: ");
                    String ballId = sc.nextLine();

                    System.out.print("Enter Ball Color: ");
                    String ballColor = sc.nextLine();

                    System.out.print("Enter Ball Size (Small/Medium/Large): ");
                    String size = sc.nextLine();

                    bag.addBall(new Ball(ballId, ballColor, size));
                }

                case 3 -> {
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();

                    Bag bag = bags.get(bagId);
                    if (bag == null) {
                        System.out.println("Bag not found.");
                        break;
                    }

                    System.out.print("Enter Ball ID to remove: ");
                    String ballId = sc.nextLine();
                    bag.removeBall(ballId);
                }

                case 4 -> {
                    System.out.print("Enter Bag ID: ");
                    String bagId = sc.nextLine();

                    Bag bag = bags.get(bagId);
                    if (bag == null) {
                        System.out.println("Bag not found.");
                    } else {
                        bag.displayBalls();
                    }
                }

                case 5 -> {
                    System.out.println("\n--- All Bags Summary ---");
                    for (Bag bag : bags.values()) {
                        bag.displayInfo();
                    }
                }

                case 6 -> {
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

