public class Driver {
    public static void main(String[] args) {

        Kisi kisi = new Kisi();
        kisi.setIsim("Tuğrul Çalışkan");

        System.out.println(kisi.getIsim());

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setIsim("Ali Can");
        ogrenci.setDers("Matematik");
        System.out.println(ogrenci.getIsim());
        System.out.println(ogrenci.getDers());

        UniversiteOgrencisi universiteOgrencisi = new UniversiteOgrencisi();
        universiteOgrencisi.setIsim("Mehmet Yıldız");
        universiteOgrencisi.setDers("Bilgisayar Temelleri");
        universiteOgrencisi.setKampus("AVCILAR");
        System.out.println(universiteOgrencisi.getIsim());
        System.out.println(universiteOgrencisi.getDers());
        System.out.println(universiteOgrencisi.getKampus());
        System.out.println("----------------");

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Ahmet Avcı");
        ogretmen.setOkul("X İlkokul");
        System.out.println(ogretmen.getIsim());
        System.out.println(ogretmen.getOkul());

        Doktor doktor = new Doktor();
        doktor.setIsim("Emre Aydın");
        doktor.setBrans("Nöroloji");
        System.out.println(doktor.getIsim());
        System.out.println(doktor.getBrans());
    }
}
