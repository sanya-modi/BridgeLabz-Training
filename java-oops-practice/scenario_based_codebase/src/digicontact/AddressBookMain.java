package digicontact;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("""
            DigiContact Address Book
            1. Add Contact
            2. Edit Contact
            3. Delete Contact
            4. Search by City/State
            5. Display All Contacts
            6. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();

                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    book.addContact(
                            new Contact(fn, ln, phone, email,
                                    new Address(city, state, zip))
                    );
                }

                case 2 -> {
                    System.out.print("Enter full name to edit: ");
                    String name = sc.nextLine();

                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("New Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    book.editContact(name, phone, email,
                            new Address(city, state, zip));
                }

                case 3 -> {
                    System.out.print("Enter full name to delete: ");
                    book.deleteContact(sc.nextLine());
                }

                case 4 -> {
                    System.out.print("Enter City or State: ");
                    book.searchByCityOrState(sc.nextLine());
                }

                case 5 -> book.displayAll();

                case 6 -> {
                    System.out.println("Goodbye");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
