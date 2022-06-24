public class Kamyon extends YukTasimaAraci{

    private int konteynerSayisi;

    public Kamyon(String plaka, String marka, int yukKapasitesi, int konteynerSayisi) {
        super(plaka, marka, yukKapasitesi);
        this.konteynerSayisi = konteynerSayisi;
    }

    public int getKonteynerSayisi() {
        return konteynerSayisi;
    }

    public void setKonteynerSayisi(int konteynerSayisi) {
        this.konteynerSayisi = konteynerSayisi;
    }

    public void yazdir() {
        super.yazdir();
        System.out.println("Konteyner Sayısı: " + konteynerSayisi);
    }


}
