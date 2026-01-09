package artify;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("Sanya", 10000);

        List<Artwork> digitalArt = new ArrayList<>();
        List<Artwork> printArt = new ArrayList<>();

        // Digital Art
        digitalArt.add(new DigitalArt("Neon City Dreams", "Aarav Mehta", 1200.00, "personal"));
        digitalArt.add(new DigitalArt("Cosmic Bloom", "Riya Sharma", 2500.00, "commercial"));
        digitalArt.add(new DigitalArt("Midnight Sakura", "Kunal Verma", 5000.00, "exclusive"));
        digitalArt.add(new DigitalArt("Abstract Waves Pack", "Ananya Gupta", 799.00, "subscription"));

        // Print Art
        printArt.add(new PrintArt("Vintage Paris Poster", "Meera Nair", 1800.00, "personal"));
        printArt.add(new PrintArt("Botanical Wall Art Set", "Rohit Iyer", 3200.00, "commercial"));
        printArt.add(new PrintArt("Limited Edition Canvas – Monochrome Muse", "Aditi Rao", 7500.00, "exclusive"));
        printArt.add(new PrintArt("Seasonal Home Decor Prints", "Nikhil Shah", 999.00, "subscription"));

        // Step 1: Ask user art type
        System.out.println("Welcome to Artify Marketplace");
        System.out.print("Which art do you want? (digital / print): ");
        String artType = sc.nextLine().toLowerCase();

        List<Artwork> selectedList = null;

        if (artType.equals("digital")) {
            selectedList = digitalArt;
        } else if (artType.equals("print")) {
            selectedList = printArt;
        } else {
            System.out.println("Invalid art type selected.");
            sc.close();
            return;
        }

        // Step 2: Display selected art
        System.out.println("\nAvailable " + artType + " art:");
        for (Artwork art : selectedList) {
            art.displayDetails();
        }

        // Step 3: Ask user art name
        System.out.print("\nEnter the name of the art you want to purchase: ");
        String artName = sc.nextLine();

        boolean found = false;

        // Step 4: Purchase selected art
        for (Artwork art : selectedList) {
            if (art.getTitle().equalsIgnoreCase(artName)) {

                IPurchasable purchasableArt = (IPurchasable) art;
                purchasableArt.purchase(user);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Art piece not found.");
        }

        System.out.println("\nRemaining Wallet Balance: ₹" + user.getWalletBalance());
        sc.close();
    }
}
