import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDriver {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.of(12, 45);
        System.out.println(localTime);

        LocalTime plus = LocalTime.parse("21:30").plus(1, ChronoUnit.HOURS);
        System.out.println(plus);
        System.out.println(plus.getHour());
        System.out.println(plus.getMinute());

        LocalTime time = LocalTime.parse("14:00");
        LocalTime time1 = LocalTime.parse("16:00");
        System.out.println(time.isAfter(time1));
        System.out.println(time.isBefore(time1));

    }
}
