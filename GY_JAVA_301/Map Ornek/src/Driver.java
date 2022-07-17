import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(34,"İstanbul");
        hashMap.put(35,"İzmir");
        hashMap.put(36,"Kars");

        System.out.println(hashMap.size());

        String s = hashMap.get(10);
        System.out.println(s);

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.print(key + ": ");
            String value = hashMap.get(key);
            System.out.println(value);
        }
    }
}
