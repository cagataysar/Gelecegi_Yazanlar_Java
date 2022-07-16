import java.util.Vector;

public class Driver {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(4);
        vector.add("Kedi");
        vector.add("Köpek");
        vector.add("Kaplan");
        vector.add("At");

        for (int i = 0; i < vector.size(); i++) {
            String string = vector.get(i);
            System.out.println((i) + " " + string);
        }

        System.out.println(vector.capacity());
    }
}
