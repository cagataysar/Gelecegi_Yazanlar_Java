import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(0);
        integers.add(6);

        integers.forEach((s) -> System.out.println(s));
    }
}
