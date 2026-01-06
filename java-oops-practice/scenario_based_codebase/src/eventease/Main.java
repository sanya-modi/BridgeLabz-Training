package eventease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Organizer Name: ");
        String name = sc.nextLine();

        System.out.print("Organizer Email: ");
        String email = sc.nextLine();

        User organizer = new User(name, email);

        System.out.print("Choose Event (birthday / conference): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Service Cost: ");
        double serviceCost = sc.nextDouble();

        Event event;

        if (type.equals("birthday")) {
            event = new BirthdayEvent(location, date, attendees,
                                      venueCost, serviceCost, organizer);
        } else {
            event = new ConferenceEvent(location, date, attendees,
                                        venueCost, serviceCost, organizer);
        }

        event.schedule();

        System.out.println("\nEvent ID : " + event.getEventId());

        sc.close();
    }
}
