import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\sario\\Desktop\\lorem.txt");
        if (file.exists()) {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                int c = 0;
                long now = System.currentTimeMillis();
                /*while ((c = fileReader.read()) != -1) {
                    System.out.print((char)c);
                }*/
                char[] buffer = new char[(int) file.length()];
                fileReader.read(buffer);
                System.out.println(new String(buffer));
                System.out.println();
                System.out.println(System.currentTimeMillis() - now);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else{
            System.out.println("Dosya bulunamadı.");
        }
    }
}
