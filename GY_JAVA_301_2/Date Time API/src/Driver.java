import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        /*LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate of = LocalDate.of(1995, 7, 27);
        System.out.println(of);

        LocalDate parse = LocalDate.parse("1990-06-23");
        System.out.println(parse);

        LocalDate plus = localDate.plus(1, ChronoUnit.DAYS);
        System.out.println(plus);

        LocalDate parse1 = LocalDate.parse("1995-07-27");
        System.out.println(parse1.getDayOfWeek());*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Tarihi: ");
        String line = scanner.nextLine();
        LocalDate dogumTarihi = LocalDate.parse(line);
        System.out.println("Doğum Tarihiniz: " + dogumTarihi);
        System.out.println("Yaşınız: " + (LocalDate.now().getYear() -dogumTarihi.getYear()));

    }
}




















