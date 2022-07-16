import java.util.Iterator;
import java.util.LinkedList;

public class OgrenciDriver {

    public static void main(String[] args) {
        LinkedList<Ogrenci> linkedList = new LinkedList<>();
        linkedList.add(new Ogrenci(1,"Ali","Can"));
        linkedList.add(new Ogrenci(2,"Tuğrul", "Çalışkan"));
        linkedList.add(new Ogrenci(3, "Ertuğ", "Çalışkan"));

        Iterator<Ogrenci> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            System.out.println(ogrenci);
        }
        System.out.println("-------------------");

        linkedList.remove(2);

        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            System.out.println(ogrenci);
        }
    }
}
