import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int r = scanner.nextInt();

        float alan = (float) (Math.PI * Math.pow(r, 2));
        float cevre = (float) (2 * Math.PI * r);

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " +cevre);

    }
}
