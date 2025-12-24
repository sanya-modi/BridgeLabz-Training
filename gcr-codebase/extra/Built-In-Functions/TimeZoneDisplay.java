import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    // Function to display time for a given zone
    public static void displayTime(String zoneName, ZoneId zoneId) {
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zoneName + " Time: " + time.format(formatter));
    }

    public static void main(String[] args) {

        // GMT
        displayTime("GMT", ZoneId.of("GMT"));
        // IST (India)
        displayTime("IST", ZoneId.of("Asia/Kolkata"));
        // PST (Pacific Time - USA)
        displayTime("PST", ZoneId.of("America/Los_Angeles"));
    }
}
