import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String ,Double>();
        hashMap.put("Bilgisayar", 2200.0);
        hashMap.put("Cep Telefonu", 1450.0);
        hashMap.put("Araba", 22500.0);

        System.out.println(hashMap.size());

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
            System.out.println(hashMap.get(key));
            System.out.println("---------------------");
        }

    }
}
