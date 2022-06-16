import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println(userInput.toUpperCase());
        StringBuffer buffer = new StringBuffer();
        System.out.print("Adınız: ");
        buffer.append(scanner.nextLine());
        System.out.print("Soyadınız: ");
        buffer.append(scanner.nextLine());

        System.out.println(buffer.toString());
    }
}
