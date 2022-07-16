import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(10);

        integers.add(2,50);

        System.out.println("Eleman Sayısı: " + integers.size());

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------------------");
        System.out.println(integers.get(0));
        System.out.println(integers.get(integers.size() - 1));

        System.out.println("-------------------");

        integers.addFirst(33);
        System.out.println(integers.getFirst());

        integers.addLast(44);
        System.out.println(integers.getLast());


    }
}
