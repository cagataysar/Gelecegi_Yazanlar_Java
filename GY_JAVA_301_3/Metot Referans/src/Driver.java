import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        /*ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(0);
        integers.add(6);

        // integers.forEach((s) -> System.out.println(s));

        integers.forEach(System.out::println);*/

        /*ArrayList<Bisiklet> arrayList = new ArrayList<>();
        arrayList.add(new Bisiklet("X Marka", 8));
        arrayList.add(new Bisiklet("Y Marka", 3));
        arrayList.add(new Bisiklet("Z Marka", 21));
        arrayList.add(new Bisiklet("Q Marka", 18));

        BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici();

        Collections.sort(arrayList, bisikletKarsilastirici::compare);

        //arrayList.forEach((b) -> System.out.println(b));
        arrayList.forEach(System.out::println);*/

        List<String> markalar = new ArrayList<>();
        markalar.add("X Marka");
        markalar.add("Y Marka");
        markalar.add("Z Marka");

        List<Bisiklet> collect = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}




















