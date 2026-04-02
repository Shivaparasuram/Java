package x_JAVA_8;

import java.time.*;

public class _9Date_Time {
    static void main(String[] args) {

        //TODAY DATE
        LocalDate Date= LocalDate.now();
        System.out.println("Today Date "+Date);

        //SET DATE MANUALLY
        LocalDate Date1 = LocalDate.of(2003, Month.MAY,13);
        System.out.println("Set Date "+Date1);

        //LIVE TIME
        LocalTime time=LocalTime.now();
        System.out.println("Live time "+time);

        //ALL COUNTRY ZONE ID"s
        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

        LocalTime t= LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Foreign Timings "+t);

    }
}
