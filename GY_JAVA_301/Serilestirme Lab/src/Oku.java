import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Oku {

    public static void main(String[] args) {
        File file = new File("araba.txt");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Araba araba = (Araba) objectInputStream.readObject();
            System.out.println(araba);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
