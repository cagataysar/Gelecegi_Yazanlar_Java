import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        File file = new File("dictionary.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(file, true);
            String line = null;

            SortedMap<String, String > sortedMap = new TreeMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String[] strings = line.split(":");
                //System.out.println(strings[0]);
                //System.out.println(strings[1]);
                sortedMap.put(strings[0], strings[1]);
            }

            Scanner scanner = new Scanner(System.in);
            String input = null;
            System.out.print("Kelime: ");
            while (!(input = scanner.nextLine()).equals("exit")) {
                String value = sortedMap.get(input);
                if (value != null) System.out.println(value);
                else {
                    System.out.println("Kelime Bulunamadı! Eklemek İster misiniz? (E)(H)");
                    if (scanner.nextLine().equals("E")) {
                        System.out.println("Yeni Kelime: ");
                        String yeniKelime = scanner.nextLine();
                        fileWriter.write("\n");
                        fileWriter.write(input);
                        fileWriter.write(":");
                        fileWriter.write(yeniKelime);
                        fileWriter.flush();

                        sortedMap.put(input, yeniKelime);
                    }
                }
                System.out.print("Kelime: ");
            }

            /*System.out.println(sortedMap.size());

            Set<Map.Entry<String, String>> entrySet = sortedMap.entrySet();
            Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();
                System.out.println(next.getKey() + " " + next.getValue());
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) fileWriter.close();
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
