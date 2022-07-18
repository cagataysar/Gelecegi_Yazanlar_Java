import java.io.Serializable;

public class Urun implements Serializable {

    private int id;
    private String ad;
    private double fiyat;

    public Urun() {

    }
    public Urun(int id, String ad, double fiyat) {
        this.ad = ad;
        this.id = id;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Urun urun = (Urun) obj;
        return this.id == urun.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ürün Adı: " + ad + ", Fiyat: " + fiyat;
    }
}











