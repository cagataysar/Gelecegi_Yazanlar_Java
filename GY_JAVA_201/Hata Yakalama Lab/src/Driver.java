import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        //yaz();
        oku();
    }

    public static void oku() {
        File file = new File("read.me");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int c = 0;
            while ((c=fileReader.read())!= -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void yaz() {
        File file = new File("read.me");
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);
        try {
            fileWriter = new FileWriter(file);
            System.out.print("Bir yazı girin: ");
            fileWriter.write(scanner.nextLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            scanner.close();
        }
    }
}
