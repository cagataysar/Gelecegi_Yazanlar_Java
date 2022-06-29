import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        /*File file = new File("C:\\Users\\sario\\Desktop\\sample.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));

        File file1 = new File("C:\\Users\\sario\\Desktop\\deneme.txt");
            if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            if (file1.exists()) {
            boolean isDelete = file1.delete();
            System.out.println(isDelete);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu: ");
        String path = scanner.nextLine();

        File file = new File(path);
        String[] icerik = file.list();
        for (int i = 0; i < icerik.length; i++) {
            System.out.println(icerik[i]);
        }
        scanner.close();
    }
}
