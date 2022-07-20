import java.util.*;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Ogrenci> arrayList = new ArrayList<>();
        arrayList.add(new Ogrenci(1,"Ali Can", 16));
        arrayList.add(new Ogrenci(2,"Tuğrul Çalışkan", 7));
        arrayList.add(new Ogrenci(3,"Zeynep Güler", 14));
        arrayList.add(new Ogrenci(4,"Seyhan Koşar", 7));

        /*List<Ogrenci> collect = arrayList.stream()
                .filter((o) -> o.getYas()>8)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);*/

        /*Map<Integer, List<Ogrenci>> gruplama = arrayList
                .stream()
                .collect(Collectors.groupingBy(o -> o.getYas()));

        Set<Integer> keySet = gruplama.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " " + gruplama.get(key));
        }*/

        /*double yasOrtalamasi = arrayList.stream()
                .collect(Collectors.averagingInt((o)->o.getYas()));
        System.out.println(yasOrtalamasi);*/

        IntSummaryStatistics statics = arrayList.stream()
                .collect(Collectors.summarizingInt((o) -> o.getYas()));
        System.out.println(statics);
    }
}
