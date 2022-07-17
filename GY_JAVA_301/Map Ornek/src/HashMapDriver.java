import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDriver {

    public static void main(String[] args) {
        HashMap<Integer,Sehir> hashMap = new HashMap<>();
        hashMap.put(34, new Sehir("İstanbul", 20_000_000));
        hashMap.put(35, new Sehir("İzmir", 6_000_000));
        hashMap.put(6, new Sehir("Ankara", 10_000_000));

        System.out.println(hashMap.size());
        Sehir sehir = hashMap.get(35);
        System.out.println(sehir);

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " " + hashMap.get(key));
        }

    }
}
