import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        File file = new File("output.dat");
        FileOutputStream fileOutputStream = null;
        Scanner scanner = new Scanner(System.in);
        try {
            fileOutputStream = new FileOutputStream(file);
            String line = null;
            while (!(line = scanner.nextLine()).equals("quit")) {
                fileOutputStream.write(line.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        }
    }
}
