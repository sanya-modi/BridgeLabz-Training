package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String location, String date, int attendees,
                            double venueCost, double serviceCost,
                            User organizer) {

        super("Conference", location, date, attendees,
              venueCost, serviceCost, 0, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🏢 Conference Scheduled");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
