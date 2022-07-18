import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDriver {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDateTime of = LocalDateTime.of(2020, 01, 23, 12, 22, 1);
        System.out.println(of);
    }
}
