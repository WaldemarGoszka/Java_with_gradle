package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
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

    }

}
