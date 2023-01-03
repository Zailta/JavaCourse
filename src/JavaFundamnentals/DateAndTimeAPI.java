package JavaFundamnentals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDate now = LocalDate.now();
        Period p = LocalDate.of(1947, Month.SEPTEMBER, 23).until(now);
        p.getYears();
        System.out.println("Instance is: "+instant);
        System.out.println("Local date is: "+now);
        System.out.println("Period is: "+p);
        System.out.println("Years Difference is: "+p.getYears());
    }

}
