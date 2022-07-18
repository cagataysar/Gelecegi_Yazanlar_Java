import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci(1, "Ali Can", 80));
        ogrenciler.add(new Ogrenci(2, "Seyhan Çalışkan", 90));
        ogrenciler.add(new Ogrenci(3, "Ertuğ Yılmaz", 50));
        ogrenciler.add(new Ogrenci(0, "Göktuğ Ortay", 70));

        ogrenciler.forEach((o) -> System.out.println(o));

        Collections.sort(ogrenciler, new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                return o1.getNumara() - o2.getNumara();
            }
        });
        System.out.println("------------------------------");
        ogrenciler.forEach((o) -> System.out.println(o));
    }
}
