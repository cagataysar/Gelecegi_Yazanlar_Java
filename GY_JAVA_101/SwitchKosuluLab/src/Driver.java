import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı: ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.print("2. Sayı: ");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.print("İşlem: ");
        char islem = scanner.nextLine().charAt(0);

        switch (islem) {
            case '+':
                System.out.println("Sonuç : " + (x+y));
                break;
            case '-':
                System.out.println("Sonuç : " + (x-y));
                break;
            case '*':
                System.out.println("Sonuç : " + (x*y)); // degub modda
                break;
            case '/':
                System.out.println("Sonuç : " + (x/y));
                break;
            default:
                System.out.println("Sadece dört işlem yapabilirsiniz!");
                break;
        }


    }
}
