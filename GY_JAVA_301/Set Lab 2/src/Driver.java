import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkmak için -1 giriniz!");
        LinkedHashSet<Integer> integers = new LinkedHashSet<Integer>();
        int i = 0;
        while ((i = scanner.nextInt()) != -1) {
            integers.add(i);
        }
        System.out.println("Sayı Adedi: " + integers.size());
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
