import java.util.*;

public class Driver {

    public static void doldur(SortedSet<Integer> integers, int sutunSayisi) {
        integers.clear();
        Random random = new Random();
        while (integers.size() < sutunSayisi) {
            int number = random.nextInt(49) + 1;
            integers.add(number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Sayısı: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun Sayısı: ");
        int sutunSayisi = scanner.nextInt();
        SortedSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i < satirSayisi; i++) {
            doldur(integers, sutunSayisi);
            Iterator<Integer> iterator = integers.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "\t\t");
            }
            System.out.println();
        }
    }
}
