public class Driver {

    public static void main(String[] args) {

        Kisi kisi = new Kisi("Ertuğrul");
        System.out.println(kisi.getIsim());

        Ogrenci ogrenci = new Ogrenci("Göktuğ",2);
        System.out.println(ogrenci.getIsim());
        System.out.println(ogrenci.getNumara());

    }
}
