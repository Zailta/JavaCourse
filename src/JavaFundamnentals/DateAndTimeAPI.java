package JavaFundamnentals;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDate now = LocalDate.now();
        Period p = LocalDate.of(1947, Month.SEPTEMBER, 23).until(now);
         long until = LocalDate.of(1947, Month.SEPTEMBER, 23).until(now, ChronoUnit.DAYS);
        System.out.println("Instance is: "+instant);
        System.out.println("Local date is: "+now);
        System.out.println("Period is: "+p);
        System.out.println("Years Difference is: "+p.getYears());
        System.out.println("To get Number of months/days/years from a particular date we use Chrono Unit: "+ until);
    }

}
