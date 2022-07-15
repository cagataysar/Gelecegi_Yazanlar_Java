import java.util.HashSet;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        /*HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("İstanbul");
        hashSet.add("Ankara");
        hashSet.add("Bursa");
        hashSet.add("İstanbul");

        System.out.println(hashSet.size());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }*/

        HashSet<Calisan> hashSet = new HashSet<>();
        hashSet.add(new Calisan("1", "Ali"));
        hashSet.add(new Calisan("2", "Ahmet"));
        hashSet.add(new Calisan("3", "Mehmet"));
        hashSet.add(new Calisan("1", "Ali"));


        Iterator<Calisan> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Calisan calisan = iterator.next();
            System.out.println(calisan.hashCode());
        }
    }
}
