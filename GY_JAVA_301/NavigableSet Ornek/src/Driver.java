import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(2);
        navigableSet.add(5);
        navigableSet.add(1);
        navigableSet.add(3);
        navigableSet.add(3);

        System.out.println("Size: " + navigableSet.size());

        Iterator<Integer> iterator = navigableSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        System.out.println(navigableSet.ceiling(4)); //Verdiğimz değer varsa onu yoksa daha büyüğünü döndürür.
        System.out.println(navigableSet.floor(3)); //Verdiğimz değer varsa onu yoksa daha küçüğünü döndürür.
        System.out.println(navigableSet.lower(3));
        System.out.println(navigableSet.higher(3));
        System.out.println("-------------");
        SortedSet<Integer> sortedSet = navigableSet.headSet(5, true); //true verirsek 5'i de dahil eder.
        Iterator<Integer> iterator2 = sortedSet.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
