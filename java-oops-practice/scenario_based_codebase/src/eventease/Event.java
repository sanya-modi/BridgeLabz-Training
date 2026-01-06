package eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private static int counter = 1000;
    private final int eventId;

    // pricing (encapsulated)
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor WITHOUT packages
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {

        this(eventIdCounter(), eventName, location, date,
             attendees, venueCost, 0, 0, organizer);
    }

    // Constructor WITH packages
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost,
                 double serviceCost, double discount,
                 User organizer) {

        this(eventIdCounter(), eventName, location, date,
             attendees, venueCost, serviceCost, discount, organizer);
    }

    // private unified constructor
    private Event(int eventId, String eventName, String location, String date,
                  int attendees, double venueCost,
                  double serviceCost, double discount,
                  User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    private static int eventIdCounter() {
        return counter++;
    }

    public int getEventId() {
        return eventId;
    }

    // Operator usage
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }
}
