import java.util.Scanner;

public class Faktoriel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin : ");
        int number = scanner.nextInt();

        int result = number;
        for (int i = number - 1; i > 0; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}
