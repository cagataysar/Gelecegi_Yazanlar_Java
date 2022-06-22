public class Dikdortgen extends Sekil{

    private int uzunluk;
    private int yukseklik;

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int _uzunluk) {
        uzunluk = _uzunluk;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int _yukseklik) {
        yukseklik = _yukseklik;
    }

    public void alanHesapla() {
        System.out.println("Dikdörtgenin Alanı: " + (uzunluk * yukseklik));
    }
}
