import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setIsim("Tuğrul Çalışkan");
        int[] notlar = new int[5];
        notlar[0] = 90;
        notlar[1] = 70;
        notlar[2] = 80;
        notlar[3] = 95;
        notlar[4] = 100;
        ogrenci.setNotlar(notlar);

        Iterator<Integer> iterator = ogrenci.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
}
