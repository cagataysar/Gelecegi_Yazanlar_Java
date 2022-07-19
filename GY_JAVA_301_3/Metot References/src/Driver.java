import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(7);

        integers.forEach((i) -> System.out.println(i));

    }
}
