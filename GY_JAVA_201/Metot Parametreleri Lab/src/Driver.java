public class Driver {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.name = "Batu";
        ogrenci.age = 8;

        Driver driver = new Driver();
        driver.ogrenciBilgileri(ogrenci);

        System.out.println(ogrenci.name);
        System.out.println(ogrenci.age);
    }

    public void ogrenciBilgileri(Ogrenci ogrenci) {

        ogrenci.name = "Kemal";

        System.out.println(ogrenci.name);
        System.out.println(ogrenci.age);



    }
}
