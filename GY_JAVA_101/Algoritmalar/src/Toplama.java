import java.util.Scanner;

public class Toplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int input = 0;

        do {
            System.out.print("Bir sayı girin : ");
            input = scanner.nextInt();
            toplam += input;
        } while (input != 0);
        System.out.println("Girilen sayıların toplamı= " + toplam);



    }
}
