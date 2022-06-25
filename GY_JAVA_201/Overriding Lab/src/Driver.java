public class Driver {

    public static void main(String[] args) {

        Kisi kisi = new Kisi("1", "Ali");
        System.out.println(kisi.toString());

        Kisi kisi1 = new Kisi("1", "Mahmut");
        System.out.println(kisi1.toString());

        System.out.println(kisi == kisi1);
        System.out.println(kisi.equals(kisi1));
    }
}
