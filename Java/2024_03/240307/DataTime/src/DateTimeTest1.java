import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTest1 {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 03, 07);

        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(2, 33, 20);

        System.out.printf("LocalDate.now() : %s\n", d1);
        System.out.printf("LocalDate.of(2024, 03, 07) : %s\n", d2);
        System.out.printf("LocalTime.now() : %s\n", t1);
        System.out.printf("LocalTime.of(2, 33, 20) : %s\n", t2);

        LocalDateTime dt1 = LocalDate.now().atTime(LocalTime.MIDNIGHT);
        LocalDateTime dt2 = LocalDate.now().atTime(LocalTime.MAX);

        System.out.printf("LocalDate.now().atTime(LocalTime.MIDNIGHT) : %s\n", dt1);
        System.out.printf("LocalDate.now().atTime(LocalTime.MAX) : %s\n", dt2);
    }
}