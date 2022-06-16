import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        /*int x; //Tanımlama ifadesi
        x = 10; //Atama ifadesi
        x++;
        System.out.println(x++);
        System.out.println(x);

        System.out.println(--x);

        System.out.println(5%2);*/
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int i = scanner.nextInt();
        System.out.println(i % 2 == 0 ? "Çift sayı" : "Tek Sayı");*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen parolanızı giriniz : ");
        String password = scanner.nextLine();
        boolean isOk = password.equals("1234");
        System.out.println(isOk ? "Tebrikler giriş yaptınız." : "Parola Yanlış!");
    }
}
