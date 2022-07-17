import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList.size());

        /*for (int i = 0; i < 100; i++) {
            System.out.println(arrayList.get(i));
        }*/

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
}
