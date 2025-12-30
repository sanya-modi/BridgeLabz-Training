import java.util.*;

public class MovieTicketBooking {

    // Converts movie name to corresponding index
    static int getMovieIndex(String movie) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(movie)) {
                return i;
            }
        }
        return -1; // Invalid movie
    }

    // Method to book gold seats
    static boolean bookGoldSeat(int index, int tickets) {

        // Calculate available gold seats
        int available = goldSeat[index] - goldBooked[index];

        // Validate ticket count
        if (tickets < 1 || tickets > available) {
            System.out.println("Only " + available + " gold seats available.");
            return false;
        }

        // Update booked count
        goldBooked[index] += tickets;
        return true;
    }

    // Method to book silver seats
    static boolean bookSilverSeat(int index, int tickets) {

        // Calculate available silver seats
        int available = silverSeat[index] - silverBooked[index];

        // Validate ticket count
        if (tickets < 1 || tickets > available) {
            System.out.println("Only " + available + " silver seats available.");
            return false;
        }

        // Update booked count
        silverBooked[index] += tickets;
        return true;
    }

    // Displays ticket details in formatted way
    static void printTicket(int customerNo, String movie, int tickets, char snack) {

        System.out.println("\n-----------------------------");
        System.out.println("        MOVIE TICKET         ");
        System.out.println("-----------------------------");
        System.out.println(" Customer No. : " + customerNo);
        System.out.println(" Movie        : " + movie);
        System.out.println(" Tickets      : " + tickets);
        System.out.println(" Snacks       : " + (snack == 'y' ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }

    // Total seats for each movie (index based)
    // 0-comedy, 1-action, 2-thriller, 3-horror
    static int[] goldSeat = {15, 20, 25, 15};
    static int[] silverSeat = {20, 40, 30, 25};

    // Tracks of how many seats are already booked
    static int[] goldBooked = {0, 0, 0, 0};
    static int[] silverBooked = {0, 0, 0, 0};

    // Movie names as index positions
    static String[] movies = {"comedy", "action", "thriller", "horror"};

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Take number of customers
        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();

        // Keeps track of processed customers
        int count = 0; 

        // Loop until all customers are served
        while (count < customers) {

            // Ask movie type
            System.out.print("\nEnter movie type (comedy/action/thriller/horror): ");
            String movieType = sc.next().toLowerCase();

            // Convert movie name to index
            int index = getMovieIndex(movieType);

            // Check movie type
            if (index == -1) {
                System.out.println("Invalid movie type.");
                continue; 
            }

            // Ask seat type
            System.out.print("Enter seat type (G for Gold / S for Silver): ");
            char seatType = sc.next().toLowerCase().charAt(0);

            if(seatType != 'g' && seatType != 's') {
                System.out.println("Invalid seat type.");
                continue;
            }
            // Ask number of tickets
            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            // Tracks successful booking
            boolean booked = false; 

            // Seat booking decision
            if (seatType == 'g') {
                booked = bookGoldSeat(index, tickets);
            } 
            else if (seatType == 's') {
                booked = bookSilverSeat(index, tickets);
            } 

            // If booking fails, retry same customer
            if (!booked) continue;

            // Ask for complimentary snacks
            System.out.print("Complimentary snacks? (Y/N): ");
            char snack = sc.next().toLowerCase().charAt(0);

            // Print ticket details
            printTicket(count + 1, movieType, tickets, snack);

            count++; // Move to next customer
        }
    }

}
