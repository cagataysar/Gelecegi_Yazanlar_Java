import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sario\\Desktop\\lorem.txt");
        File outFile = new File("C:\\Users\\sario\\Desktop\\lorem_out.txt");
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                fileOutputStream = new FileOutputStream(outFile);
                int c = 0;
                while ((c = fileInputStream.read()) != -1) {
                    char ch = (char) c;
                    fileOutputStream.write(Character.toUpperCase(ch));

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } else {
            System.out.println("Dosya Bulunamadı!");
        }
    }
}
