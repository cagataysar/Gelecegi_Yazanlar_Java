import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize notu : ");
        int vizeNotu = scanner.nextInt();
        System.out.print("Final notu : ");
        int finalNotu = scanner.nextInt();

        float ortalama = (vizeNotu * 0.4f) + (finalNotu * 0.6f);
        if (ortalama >= 50 && finalNotu >= 50) {
            System.out.println("Tebrikler geçtiniz");
        } else {
            System.out.println("Başarısız!");
        }
    }
}
