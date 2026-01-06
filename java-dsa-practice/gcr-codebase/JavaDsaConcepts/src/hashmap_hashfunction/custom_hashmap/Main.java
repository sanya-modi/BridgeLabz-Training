package hashmap_hashfunction.custom_hashmap;
import java.util.Scanner;

/*
 * Menu-driven Main class for Custom HashMap
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using Integer keys and String values for simplicity
        MyHashMap<Integer, String> map = new MyHashMap<>();

        int choice;

        do {
            System.out.println("\n===== Custom HashMap Menu =====");
            System.out.println("1. Insert (Put)");
            System.out.println("2. Get Value");
            System.out.println("3. Remove Key");
            System.out.println("4. Get Size");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // -------- PUT --------
                case 1:
                    System.out.print("Enter key (Integer): ");
                    int key = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter value (String): ");
                    String value = sc.nextLine();

                    map.put(key, value);
                    System.out.println("Key-Value pair inserted");
                    break;

                // -------- GET --------
                case 2:
                    System.out.print("Enter key to retrieve value: ");
                    int getKey = sc.nextInt();

                    String result = map.get(getKey);
                    if (result != null) {
                        System.out.println("Value: " + result);
                    } else {
                        System.out.println("Key not found");
                    }
                    break;

                // -------- REMOVE --------
                case 3:
                    System.out.print("Enter key to remove: ");
                    int removeKey = sc.nextInt();

                    map.remove(removeKey);
                    System.out.println("Key removed if it existed");
                    break;

                // -------- SIZE --------
                case 4:
                    System.out.println("Current size of HashMap: " + map.size());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

