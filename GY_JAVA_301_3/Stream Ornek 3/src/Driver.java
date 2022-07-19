import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {
        Stream.of(1,4,6,8,2)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test Filter");
                        return integer > 2;
                    }
                })
                .anyMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test Anymatch");
                        return integer == 5;
                    }
                });
                /*.forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println("Accept");
                        System.out.println(integer);
                    }
                });*/
    }
}
