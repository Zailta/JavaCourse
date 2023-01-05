package JavaFundamnentals;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDate now = LocalDate.now();
        Period p = LocalDate.of(1947, Month.SEPTEMBER, 23).until(now);
         long until = LocalDate.of(1947, Month.SEPTEMBER, 23).until(now, ChronoUnit.DAYS);
         //get date of different zones
        final Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        // get time and Date of a particular zone. Create meeting at this time.
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.of(
                2023,Month.JANUARY,03), LocalTime.of(
                        4,30), ZoneId.of(
                                "Europe/London"));
        //Create same meeting 1 month later same time
        ZonedDateTime nextMeeting  = zonedDateTime.plus(Period.ofMonths(1));
        //if you want people from other Time zones to joinas well
        ZonedDateTime USTimeZone = nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));
         String of = String.valueOf(ZoneId.of("Europe/London"));
         //Now we got the date- > but how to format ?
        final String USDateFormat = DateTimeFormatter.ISO_DATE_TIME.format(USTimeZone);
        final String USdateFormat2 = DateTimeFormatter.RFC_1123_DATE_TIME.format(USTimeZone);

        System.out.println("Instance is: "+instant);
        System.out.println("Local date is: "+now);
        System.out.println("Period is: "+p);
        System.out.println("Years Difference is: "+p.getYears());
        System.out.println("To get Number of months/days/years from a particular date we use Chrono Unit: "+ until);
        System.out.println("The meeting will be held at : "+ zonedDateTime);
        System.out.println("The Next Timing will take place at "+nextMeeting+ "UK Time, and US time :"+USdateFormat2);
    }

}
