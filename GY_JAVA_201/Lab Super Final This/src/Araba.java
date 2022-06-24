public class Araba extends YolcuTasimaAraci{

    private int kapiSaiyisi;

    public Araba(String plaka, String marka, int kapasite, int kapiSayisi) {
        super(plaka, marka, kapasite);
        this.kapiSaiyisi = kapiSayisi;

    }

    public int getKapiSaiyisi() {
        return kapiSaiyisi;
    }

    public void setKapiSaiyisi(int kapiSaiyisi) {
        this.kapiSaiyisi = kapiSaiyisi;
    }

    public void yazdir() {
        super.yazdir();
        System.out.println("Kapı Sayısı: " + kapiSaiyisi);
    }
}
