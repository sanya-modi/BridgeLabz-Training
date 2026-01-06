package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String location, String date, int attendees,
                          double venueCost, double serviceCost,
                          User organizer) {

        super("Birthday Party", location, date, attendees,
              venueCost, serviceCost, 500, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event Scheduled");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
