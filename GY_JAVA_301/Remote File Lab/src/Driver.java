import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.w3.org/TR/PNG/iso_8859-1.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            char[] buffer = new char[1024];

            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            //StringBuilder builder = new StringBuilder();

            int length = 0;
            while ((length = inputStreamReader.read(buffer)) != -1) {
                //builder.append(Arrays.copyOfRange(buffer, 0, length));
                fileOutputStream.write(new String(Arrays.copyOfRange(buffer,0,length)).getBytes());
            }
            //System.out.println(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
