import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Driver {

    public static void main(String[] args) {
        /*Supplier<Urun> supplier = new Supplier<Urun>() {
            @Override
            public Urun get() {
                Urun urun = new Urun(1, "Laptop", 1000.0);
                return urun;

            }
        };*/

        // Supplier<Urun> supplier = () -> new Urun(1,"Laptop", 1500.0);

        Supplier<List<Urun>> supplier = () -> {
            List<Urun> list = new ArrayList<>();
            list.add(new Urun(1, "Laptop", 1500));
            list.add(new Urun(2, "Cep Telefonu", 800));
            list.add(new Urun(3, "Klavye", 200));
            return list;
        };

        //System.out.println(supplier.get());
        supplier.get().forEach((u) -> System.out.println(u));
    }
}
