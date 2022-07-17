import java.util.HashMap;

public class Driver {

    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String ,Double>();
        hashMap.put("Bilgisayar", 2200.0);
        hashMap.put("Cep Telefonu", 1450.0);
        hashMap.put("Araba", 22500.0);

        System.out.println(hashMap.size());

    }
}
