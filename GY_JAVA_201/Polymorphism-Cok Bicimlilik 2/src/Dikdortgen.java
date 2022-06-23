public class Dikdortgen extends Sekil{

    private int genislik;
    private int yukseklik;

    public Dikdortgen(int g, int y) {
        genislik = g;
        yukseklik = y;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int g) {
        genislik = g;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int y) {
        yukseklik = y;
    }

    public void alan() {
        System.out.println("Dikdörtgenin Alanı: " + (genislik * yukseklik));
    }
}
