import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Index değerini giriniz: ");
        int index = scanner.nextInt();
        if (index <= numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Yanlış index numarası!");
        }

        /*try {
            System.out.println(numbers[index]);
        }catch (Exception e) {
            System.out.println("Yanlış index numarası!");
        }finally {
            scanner.close();
        }*/
    }
}
