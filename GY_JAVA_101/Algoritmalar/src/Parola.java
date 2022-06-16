import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "";

        do {
            System.out.print("Parola : ");
            password = scanner.nextLine();
        }while (!password.equals("1234"));
        System.out.println("Hoşgeldiniz");
    }
}
