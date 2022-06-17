import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(25));

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.toUpperCase());
    }
}
