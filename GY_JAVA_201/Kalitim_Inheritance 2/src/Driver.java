public class Driver {

    public static void main(String[] args) {

        NakliyeAraci nakliyeAraci = new NakliyeAraci();
        nakliyeAraci.setUretici("X Marka");
        nakliyeAraci.setYukKapasitesi(1000);

        Tir tir = new Tir();
        tir.setUretici("Y Marka");
        tir.setYukKapasitesi(2000);
        tir.setKonteynerSayisi(20);

    }
}
