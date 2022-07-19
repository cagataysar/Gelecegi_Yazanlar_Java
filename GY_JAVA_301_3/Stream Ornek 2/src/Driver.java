import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {
        /*IntStream.range(1,10) // First value inclusive, last value Exclusive
                .forEach(System.out::println);*/

        Arrays.stream(new int[] {2,3,5,6,7,4})
                .map((x)->x*2)
                .average()
                .ifPresent(System.out::println);

        int sum = IntStream.range(1, 101)
                .sum();

        System.out.println(sum);

        Stream.of("1","2","6","4")
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        IntStream.range(1,10)
                .mapToObj((i)->i+"a")
                .forEach(System.out::println);
    }
}
