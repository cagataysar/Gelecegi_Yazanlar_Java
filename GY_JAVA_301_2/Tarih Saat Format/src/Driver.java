import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Driver {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String kisa = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date);
        String orta = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date);
        String uzun = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date);
        String full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date);

        System.out.println(kisa);
        System.out.println(orta);
        System.out.println(uzun);
        System.out.println(full);

        String ozel = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(date);
        System.out.println(ozel);

        LocalTime time = LocalTime.now();
        kisa = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(time);
        orta = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(time);

        System.out.println(kisa);
        System.out.println(orta);


    }
}
