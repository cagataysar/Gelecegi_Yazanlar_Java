import java.util.Iterator;
import java.util.TreeSet;

public class Driver {

    public static void main(String[] args) {
        /*TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Siyah");
        treeSet.add("Beyaz");
        treeSet.add("Mavi");
        treeSet.add("Siyah");

        System.out.println(treeSet.size());

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        TreeSet<Sehir> treeSet = new TreeSet<>();
        treeSet.add(new Sehir("34", "İstanbul"));
        treeSet.add(new Sehir("06", "Ankara"));
        treeSet.add(new Sehir("35", "İzmir"));
        treeSet.add(new Sehir("19", "Çorum"));

        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());

        System.out.println("---------");

        Iterator<Sehir> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Sehir next = iterator.next();
            System.out.println(next);
        }


    }
}
