import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {
        // Get the current time in the system's default time zone
        ZonedDateTime currentTime = ZonedDateTime.now();

        // Define the time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        // Convert and display the time for each zone
        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(gmtZone);
        ZonedDateTime istTime = currentTime.withZoneSameInstant(istZone);
        ZonedDateTime pstTime = currentTime.withZoneSameInstant(pstZone);

        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}