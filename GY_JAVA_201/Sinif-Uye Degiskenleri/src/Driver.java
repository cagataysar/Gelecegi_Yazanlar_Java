public class Driver {

    public static void main(String[] args) {

        Bisiklet bisiklet = new Bisiklet();
        bisiklet.hiz = 10;
        bisiklet.vites = 18;
        Bisiklet.bisikletSayisi = 1;
        bisiklet.bilgileriYazdır();

        System.out.println("----------------");

        Bisiklet bisiklet1 = new Bisiklet();
        bisiklet1.hiz = 20;
        bisiklet1.vites = 12;
        Bisiklet.bisikletSayisi = 2;
        bisiklet1.bilgileriYazdır();

        /*System.out.println(bisiklet.hiz);
        System.out.println(bisiklet.vites);*/
    }
}

