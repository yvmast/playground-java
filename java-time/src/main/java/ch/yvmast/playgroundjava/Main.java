package ch.yvmast.playgroundjava;

import java.time.Duration;
import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello world!");


        // Comparison of Durations
        Duration duration24h = Duration.ofHours(24L);
        Duration duration0815 = Duration.ofHours(8L).plusMinutes(15L);
        Duration duration36h = Duration.ofHours(36L);

        out.println(String.format("Duration.toHoursPart: %d and Duration.toMinutesPart: %d"
                , duration0815.toHoursPart(), duration0815.toMinutesPart()));

        out.println("duration0815.compareTo(duration24h): " + duration0815.compareTo(duration24h));
        out.println("duration24h.compareTo(duration24h): " + duration24h.compareTo(duration24h));
        out.println("duration36h.compareTo(duration24h): " + duration36h.compareTo(duration24h));



        // Adding time to date
        LocalDate date = LocalDate.of(2023, 4,4);
        out.println(String.format("DateTime at duration: %s"
                , date.atTime(duration0815.toHoursPart(), duration0815.toMinutesPart())));
        out.println(String.format("DateTime at duration plus duration: %s"
                , date.atTime(duration0815.toHoursPart(), duration0815.toMinutesPart())
                        .plus(duration24h)));
        out.println(String.format("Date (without Time) at duration plus duration: %s"
                , date.atTime(duration0815.toHoursPart(), duration0815.toMinutesPart())
                        .plus(duration24h)
                        .toLocalDate()));

    }
}