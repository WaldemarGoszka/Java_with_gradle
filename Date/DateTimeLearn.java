package Date;

import java.time.*;
import java.util.Arrays;

public class DateTimeLearn {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2022, 2,5));
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.from(LocalDateTime.now()) );
        System.out.println(Month.AUGUST);
        System.out.println(Arrays.toString(Month.values()));
        LocalDate ld = LocalDate.now();
        System.out.println("-------"+Month.JANUARY.ordinal());

        System.out.println();

        System.out.println(OffsetDateTime.now());
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")));
        System.out.println(OffsetDateTime.now(ZoneOffset.UTC));
        System.out.println(ZoneId.of("UTC"));
        System.out.println(OffsetDateTime.of(2020, 5,3,5,5,5,5,ZoneOffset.UTC));
        System .out.println(ZoneId.systemDefault());

        Duration duration = Duration.ofDays(1);
        duration = duration.withSeconds(120);
        System.out.println(duration);
        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());
    }

}
