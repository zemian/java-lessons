package zemian.commontasks.corejava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

// New java.time package
// https://docs.oracle.com/javase/tutorial/datetime/overview/design.html
public class Dates2 {
    public static void main(String[] args) throws Exception {
        // New "epoch" like object
        Instant timestamp = Instant.now();
        System.out.println("timestamp " + timestamp);
        long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(),
                ChronoUnit.SECONDS);
        System.out.println("secondsFromEpoch " + secondsFromEpoch);

        // New Date class
        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println("today " + today);
        System.out.println("payday " + payday);

        // Immutable - You can't change origin date object, but to create new instance
        LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
        LocalDate firstBirthday = dateOfBirth.plusYears(1);
        System.out.println("firstBirthday " + firstBirthday);

        // Weekday display
        // NOTE: Java supported locale: https://www.oracle.com/java/technologies/javase/jdk11-suported-locales.html
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

        // Month display
        Month month = Month.AUGUST;
        // locale = new Locale("en", "US");
        // locale = new Locale("es", "ES");
        locale = new Locale("zh", "CN");
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));

        // Year calc
        boolean validLeapYear = Year.of(2012).isLeap();
        System.out.println("2012 validLeapYear" + validLeapYear);

        // Date-Time objects

        // Time object - The LocalTime class does not store time zone or daylight saving time information.
        // This class is useful for representing human-based time of day, such as movie times, or the opening and closing times of the local library.
        LocalTime thisSec = LocalTime.now();
        System.out.println("hour " + thisSec.getHour() +
                " min " +  thisSec.getMinute() +
                " sec " +  thisSec.getSecond());

        // Date object
        // The class that handles both date and time, without a time zone
        // To include a time zone, you must use a ZonedDateTime or an OffsetDateTime
        System.out.printf("now: %s%n", LocalDateTime.now());
        System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
                LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.printf("now (from Instant): %s%n",
                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
        System.out.printf("6 months from now: %s%n",
                LocalDateTime.now().plusMonths(6));
        System.out.printf("6 months ago: %s%n",
                LocalDateTime.now().minusMonths(6));

        // Timezones
        LocalDateTime dt = LocalDateTime.now();
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<>(allZones);
        Collections.sort(zoneList);
        for (String s: allZones) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
            String out = String.format("%35s %10s%n", zone, offset);

            // Write only time zones that do not have a whole hour offset
            // to standard out.
            if (secondsOfHour != 0) {
                System.out.printf(out);
            }
        }

        // Parsing and Format dates
        if (args.length > 0) {
            String in = args[0];
            LocalDate date = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
            System.out.println("input date " + date);

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("MMM d yyyy");
            LocalDate date2 = LocalDate.parse(in, formatter);
            System.out.printf("date2 %s%n", date2);

            ZoneId leavingZone = ZoneId.of("America/New York");
            LocalDate departure = date;
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
            String out = departure.format(format);
            System.out.printf("LEAVING:  %s (%s)%n", out, leavingZone);
        }
    }
}
