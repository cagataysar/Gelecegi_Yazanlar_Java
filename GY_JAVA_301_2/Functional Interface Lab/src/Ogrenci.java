import java.io.Serializable;

public class Ogrenci implements Serializable {

    private int numara;
    private String ad;
    private int ortalama;

    public Ogrenci() {

    }

    public Ogrenci(int numara, String ad, int ortalama) {
        this.numara = numara;
        this.ad = ad;
        this.ortalama = ortalama;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(int ortalama) {
        this.ortalama = ortalama;
    }

    @Override
    public int hashCode() {
        return numara;
    }

    @Override
    public boolean equals(Object obj) {
        Ogrenci ogrenci = (Ogrenci) obj;
        return this.numara == ogrenci.numara;
    }

    @Override
    public String toString() {
        return "Numara: " + numara + ", Ad: " + ad + ", Not Ortalaması: " + ortalama;
    }
}
























