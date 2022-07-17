import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KitapDriver {

    public static void main(String[] args) {
        HashMap<Integer, Kitap> hashMap = new HashMap<>();
        hashMap.put(1, new Kitap("X", new Date(), "Ali Can"));
        hashMap.put(2, new Kitap("Y", new Date(), "Zeynep Güler"));
        hashMap.put(3, new Kitap("Z", new Date(), "Tuğrul Çalışkan"));

        System.out.println(hashMap.size());

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.print(key + " = ");
            System.out.println(hashMap.get(key));
            System.out.println("------------------");
        }
    }
}
