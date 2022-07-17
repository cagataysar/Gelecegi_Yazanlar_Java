import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);

        int x = 20;
        arrayList.add(x);

        int y = arrayList.get(1);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }
    }
}
