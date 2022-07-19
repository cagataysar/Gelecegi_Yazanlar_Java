import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("İstanbul");
        arrayList.add("Ankara");
        arrayList.add("Bursa");
        arrayList.add("Adana");
        arrayList.add("İzmir");

        arrayList.stream()
            .filter((s)->s.startsWith("İ"))
            .map((s)->s.toUpperCase()) // .map(String::toUpperCase)
            .sorted() // .sorted((s1,s2)->s1.compareTo(s2))
            .forEach(System.out::println);

        /*Stream<String> stream = arrayList.stream();
        Stream<String> stream2 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });
        Stream<String> stream3 = stream2.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        Stream<String> stream4 = stream3.sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        stream4.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/



    }
}
