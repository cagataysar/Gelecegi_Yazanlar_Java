import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {

    public static void main(String[] args) {

        /*Matematik matematik = new Matematik() {
            @Override
            public void islem(double a, double b) {
                System.out.println(a + b);
            }
        };*/

        /*Matematik matematik = (x,y) -> System.out.println(x + y);
        matematik.islem(25, 20);

        Matematik matematik1 = (x,y) -> System.out.println(x - y);
        matematik1.islem(40,10);*/

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Bursa");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Kayseri");
        sehirler.add("Bolu");
        sehirler.add("Kars");
        sehirler.add("Batman");

        // Consumer
        //sehirler.forEach((s) -> System.out.println(s));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("K");
            }
        };

        Predicate<String> predicate1 = (s) -> s.startsWith("İ");

        for (int i = 0; i < sehirler.size(); i++) {
            String sehir = sehirler.get(i);
            if (predicate1.test(sehir)) System.out.println(sehir);
        }
    }
}
