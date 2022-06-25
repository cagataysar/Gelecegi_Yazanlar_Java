import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Birinci sayıyı girin: ");
            int a = scanner.nextInt();
            System.out.print("İkinci sayıyı girin: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Sonuç: " + result);
        }catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage()); // Alınan hatayı uygulamanın çalıştığı işletim sisteminin dilinde geri verir.
            System.out.println(e.getMessage()); // Direkt alınan hata hakkında bilgi verir.
            e.printStackTrace(); // Uygulamada hata ile karşılaşılan metot çağrımlarını bize bildirir.
            System.out.println("0'a bölünemez.");
        } catch (InputMismatchException e) {
            System.out.println("Lütfen bir sayı girin. ");
        } finally {
            scanner.close();
        }
        System.out.println("Uygulama kapandı.");
    }
}
