import java.time.DayOfWeek;
import java.time.Month;

public class Driver {
    public static void main(String[] args) {
        Aylar ay = Aylar.OCAK;
        System.out.println(ay);

        ay = Aylar.ARALIK;
        System.out.println(ay);

        Aylar[] values = Aylar.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday);

        Month feb = Month.FEBRUARY;
        System.out.println(feb);
    }
}
