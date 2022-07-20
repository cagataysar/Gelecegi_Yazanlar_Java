import java.util.Optional;

public class Driver {

    public static void main(String[] args) {
        /*Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String deger = "Merhaba";
        Optional<String> optional = Optional.of(deger);
        System.out.println(optional.isPresent());*/



        /*String s = null;
        // Optional<String> optional2 = optional.of(s); //BURADA HATA ALIYORUZ ÇÜNKÜ OPTIONAL'A NULL OLAN DEĞER VEREMEYİZ.
        Optional<String> optional3 = Optional.ofNullable(s);
        System.out.println(optional3.isPresent());*/

        String bosIsim = "Veli";
        String s = Optional.ofNullable(bosIsim).orElse("Ali");
        System.out.println(s);


    }
}
