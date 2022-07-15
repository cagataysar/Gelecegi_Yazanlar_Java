import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

    public static void main(String[] args) {
        /*SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Ahmet");
        sortedSet.add("Mehmet");
        sortedSet.add("Ali");
        sortedSet.add("Göktuğ");
        sortedSet.add("Mahmut");

        Iterator<String> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }*/

        SortedSet<Ogrenci> sortedSet = new TreeSet<>();
        sortedSet.add(new Ogrenci(5, "Ali"));
        sortedSet.add(new Ogrenci(2, "Ahmet"));
        sortedSet.add(new Ogrenci(3, "Mehmet"));

        System.out.println(sortedSet.size());

        Iterator<Ogrenci> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            Ogrenci next = iterator.next();
            System.out.println(next);
        }
    }
}
