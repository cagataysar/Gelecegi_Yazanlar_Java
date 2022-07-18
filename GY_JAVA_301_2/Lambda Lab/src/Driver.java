import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void yasaGoreListele(List<Kisi> kisiler, int yas) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getYas() >= yas) System.out.println(kisi);
        }
    }

    public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getCinsiyet().equals(cinsiyet)) System.out.println(kisi);
        }

    }

    public static void main(String[] args) {
        Kisi kisi1 = new Kisi("Ali Can", LocalDate.parse("1990-03-04"), "ali.can@example.com", Kisi.Cinsiyet.ERKEK);
        Kisi kisi2 = new Kisi("Seyhan Çalışkan", LocalDate.parse("1998-01-12"), "seyhan.caliskan@example.com", Kisi.Cinsiyet.KADIN);
        Kisi kisi3 = new Kisi("Tuğrul Yılmaz", LocalDate.parse("2013-07-04"), "tugrul.yilmaz@example.com", Kisi.Cinsiyet.ERKEK);

        ArrayList<Kisi> kisiler = new ArrayList<>();
        kisiler.add(kisi1);
        kisiler.add(kisi2);
        kisiler.add(kisi3);

        //cinsiyeteGoreFiltrele(kisiler,Kisi.Cinsiyet.ERKEK);
        yasaGoreListele(kisiler,30);

        /*System.out.println(kisi1);
        System.out.println(kisi2);
        System.out.println(kisi3);*/

    }
}
