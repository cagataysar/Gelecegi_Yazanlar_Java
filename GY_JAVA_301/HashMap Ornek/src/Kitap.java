import java.io.Serializable;
import java.util.Date;

public class Kitap implements Serializable {

    private String ad;
    private Date tarih;
    private String yazar;

    public Kitap() {

    }
    public Kitap(String ad, Date tarih, String yazar) {
        this.ad = ad;
        this.tarih = tarih;
        this.yazar = yazar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        return ad.hashCode() + tarih.hashCode() + yazar.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Kitap kitap = (Kitap) obj;
        return kitap.ad.equals(this.ad) && kitap.tarih.equals(this.tarih) && kitap.yazar.equals(this.yazar);
    }

    @Override
    public String toString() {
        return "Ad: " + ad + ", Yayın Tarihi: " + tarih + ", Yazar: " + yazar;
    }
}




















